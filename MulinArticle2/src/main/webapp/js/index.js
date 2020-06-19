var code;
var SERVER_URL = "http://mlyjq.com:8080/MulinArticle/";
//SERVER_URL = "http://localhost:8080/MulinArticle/";

//构建验证码
function createValidCode(){
	code = "";
	var codeLength=6;
	var codeChars = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
	                 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
	                 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
	for(var i=0;i<codeLength;i++){
		var num = Math.floor(Math.random()*62);
		code += codeChars[num];
	};
	$("#checkCode").html(code);
};

//页面中心显示
function showCenter(obj){
	obj.style.display="block";
	function center(){
		var screenW=document.documentElement.clientWidth;
		var screenH=document.documentElement.clientHeight;
		obj.style.left=(screenW-obj.offsetWidth)/2+'px';
		obj.style.top=(screenH-obj.offsetHeight)/2+'px';
	};
	center();

	window.onresize=function(){
		center();
	};
};

$(function(){
	var uuid;
	$.ajax({
		url : SERVER_URL + "GetQrCodeServlet",
		type : "POST",
		crossDomain : true,
		dataType : "json",
		success : function(x) {
			uuid = x.uuid;
			$("#QrCodeImg").attr("src", x.qrCodeImg);
			//开始验证登录
			validateLogin();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
	
	function validateLogin(){
		var data = {
			uuid:uuid
		};
		$.ajax({
			url : SERVER_URL + "LongConnectionCheckServlet",
			type : "POST",
			data : data,
			crossDomain : true,
			dataType : "json",
			success : function(x) {
				if(JSON.stringify(x) == "{}"){
					validateLogin();
				}else{
					localStorage.setItem("jid",x.username);
		        	$("#jid").val("");
		        	$("#password").val("");
		        	location.href = "home.html";
				};
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				
			},
			complete : function() {
				
			}
		});
	}
	
	var loginBox = document.getElementById("login_box");
	//showCenter(loginBox);
	createValidCode();
	$("#changeCode").on("click",function(){
		createValidCode();
	});
	var SERVER_DOMAIN = "@mlyjq.com";
	var BOSH_SERVICE = "http://mlyjq.com/xmpp-httpbind/";
	//BOSH_SERVICE = "http://127.0.0.1/xmpp-httpbind/";
	
	$("#loginBtn").on("click",function(){
		$("p#loginErr").empty();
	    var $jid = $("#jid").val();
	    var $password = $("#password").val();
	    var $vaildCode = $("#vaildCode").val();
	    //验证登录
	    if(!$jid){
	    	$("p#loginErr").html("请输入账号！");
	    	return;
	    };
	    if(!$password){
	    	$("p#loginErr").html("请输入密码！");
	    	return;
	    };
	    if(!$vaildCode){
        	$("p#loginErr").html("请输入验证码！");
        	return;
        };
        if($vaildCode.toUpperCase() != code.toUpperCase()){
        	$("p#loginErr").html("验证码输入有误！");
        	return;
        };

	    
	    var domain_jid = $jid + SERVER_DOMAIN;    
	       
	    //建立XMPP连接
	    var conn = new Strophe.Connection(BOSH_SERVICE);        
	    conn.connect(domain_jid,$password,function(status){
	    	if(status == Strophe.Status.CONNECTED){
	        	localStorage.setItem("jid",$jid);
	        	$("#jid").val("");
	        	$("#password").val("");
	        	location.href = "home.html";
	        	//location.href = "http://mlyjq.com:8080/MulinArticle/home.html";
	        }else if(status == Strophe.Status.DISCONNECTED){
	        	console.log("账号:"+$jid+"失去连接！");    	
	        }else if(status == Strophe.Status.CONNFAIL){
	        	$("p#loginErr").html("服务器连接失败，请稍候再试！");         	
	        }else if(status == Strophe.Status.AUTHFAIL){
	        	console.log("账号或密码错误！");
	        	$("p#loginErr").html("账号或密码错误！");
	        	$("#jid").val("");
	        	$("#password").val("");
	        };        
	    });	
	});
});

