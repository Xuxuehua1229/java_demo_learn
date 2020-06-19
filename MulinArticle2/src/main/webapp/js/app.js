/**
 * Created by JimLiu on 2017/4/8.
 */

var SERVER_DOMAIN = "@mlyjq.com";
//SERVER_DOMAIN = "@192.168.1.5";
var BOSH_SERVICE = "http://mlyjq.com/xmpp-httpbind/";
//BOSH_SERVICE = "http://127.0.0.1/xmpp-httpbind/";
var SERVER_URL = "http://mlyjq.com:8080/MulinArticle/";

SERVER_URL = "http://localhost:8080/MulinArticle/";

var imgExt = [".png", ".jpg", ".jpeg", ".gif", ".bmp"];//上传图片支持格式
var imgMaxSize = 10*1024*1024;//上传图片限制大小 2M
var imgMaxSize1 = 1*1024*1024;
var audioExt = [".ogg", ".mp3", ".wav", ".m4a"];//上传音频支持格式
var audioMaxSize = 300*1024*1024;//上传音频限制大小 10M

var videoExt = [".rmvb", ".rm", ".avi", ".wmv", ".mov", ".mp4", ".mid", ".swf", ".mpeg", ".mpg", ".flv", ".mkv", ".ogv", ".webm"];//上传视频支持格式
var videoMaxSize = 300*1024*1024;//上传视频限制大小 10M

var jid = localStorage.getItem("jid");//登录名
var userNick = "";//昵称
var ueId=0;
var pageSize = 15;//分页每页数量

//文章类型
var subjects = {
  		"STEAM":[{"code":101,"name":"STEM"},{"code":102,"name":"STEAM"},{"code":103,"name":"R-STEAM"}]
};

var favorites = {
   "睦邻教育":[{"value" : 1001,"name" : "学校教育","desc" : ""},
            {"value" : 1002,"name" : "职业教育","desc" : ""},
            {"value" : 1003,"name" : "家庭教育","desc" : ""},
            {"value" : 1004,"name" : "社区教育","desc" : ""},
            {"value" : 1005,"name" : "博雅教育","desc" : ""},
            {"value" : 1006,"name" : "其它教育","desc" : ""}],
    "睦邻健康":[{"value" : 2001,"name" : "运动保健","desc" : ""},
            {"value" : 2002,"name" : "疾病治疗","desc" : ""},
            {"value" : 2003,"name" : "家庭医生","desc" : ""},
            {"value" : 2004,"name" : "婴儿老人","desc" : ""},
            {"value" : 2005,"name" : "预防养生","desc" : ""},
            {"value" : 2006,"name" : "社区健康","desc" : ""}],
   "睦邻文化":[{ "value" : 3001,"name" : "科普科创","desc" : ""},
           {"value" : 3002,"name" : "文艺思哲","desc" : ""},
           {"value" : 3003,"name" : "经济法律","desc" : ""},
           {"value" : 3004,"name" : "创业发展","desc" : ""},
           {"value" : 3005,"name" : "和睦家庭","desc" : ""},
           {"value" : 3006,"name" : "文化活动","desc" : ""}],
   "睦邻一家亲生活":[{"value" : 4001,"name" : "娱乐购物","desc" : ""},
            {"value" : 4002,"name" : "餐饮旅游","desc" : ""},
            {"value" : 4003,"name" : "育儿养老","desc" : ""},
            {"value" : 4004,"name" : "家政房产","desc" : ""},
            {"value" : 4005,"name" : "保险理财","desc" : ""},
            {"value" : 4006,"name" : "装饰宠物","desc" : ""},
            {"value" : 4007,"name" : "汽车美丽","desc" : ""},
            {"value" : 4008,"name" : "动漫游戏","desc" : ""},
            {"value" : 4009,"name" : "生活服务","desc" : ""}],
   "睦邻一家亲社区":[{"value" : 5001,"name" : "机构组织","desc" : ""},
            {"value" : 5002,"name" : "业委物业","desc" : ""},
            {"value" : 5003,"name" : "义工社工","desc" : ""},
            {"value" : 5004,"name" : "社区办事","desc" : ""},
            {"value" : 5005,"name" : "社区管理","desc" : ""},
            {"value" : 5006,"name" : "公益关爱","desc" : ""}],
    "睦邻一家亲其它" :[{"value" : 60,"name" : "其它","desc" : ""}]
};

var themeType = {
    "5" : "课程",
    "6" : "研学",
	"7" : "创作"
}

//获取兴趣标签
function getFavoritesList(page){
	var index=0;
	for(var key in favorites){
		$(".favorites1").append("<option value='"+key+"'>"+key+"</option>");
		if(index == 0){
			var arr = favorites[key];
			for(var i=0;i<arr.length;i++){
				$(".favorites2").append("<option value='"+arr[i]["value"]+"'>"+arr[i]["name"]+"</option>");
			}
		}
		index++;
	}
}

//获取主题
function getThemeType(page){
	if(page == 'themeList'){
		$(".themeType").append("<option value=''>全部</option>");	
	}else if(page == 'addTheme'){
		$(".themeType").append("<option value=''>请选择一个主题类型</option>");	
	}
	
	for(var key in themeType){
		$(".themeType").append("<option value='"+key+"'>"+themeType[key]+"</option>");		
	}
}


//加载JS
function loadModeJs(mode){
    $.ajax({
        url:"js/"+mode+".js",
        dataType:"script"
    });
};

//创建页面路由
function loadMode(mode){
	
	$.ajax({
        url:mode+".html",
        success:function(data){
        	$("#main").html(data);
            //loadModeJs(mode);
        }
    });
};

//创建带参数页面路由
function loadModeHasParam(mode,param){

  $.ajax({
      url:mode+".html?"+param,
      success:function(data){
      	$("#main").html(data);
          //loadModeJs(mode);
      }
  });
};

//获得URL参数
function getUrlParam(){
  var url=location.href;
  var startIndex=url.indexOf("?");
  var str=url.slice(startIndex+1);
  var params=str.split("&");
  for(var i=0;i<params.length;i++){
      startIndex=params[i].indexOf("=");
      if(startIndex!=-1){
          this[params[i].slice(0,startIndex)]=params[i].slice(startIndex+1);
      };
  };
};

//格式化时间
Date.prototype.Format = function (fmt) { //author: meizz 
    var o = {
    	"M+": this.getMonth() + 1, //月份 
        "d+": this.getDate(), //日 
        "H+": this.getHours(), //小时 
        "m+": this.getMinutes(), //分 
        "s+": this.getSeconds(), //秒 
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
        "S": this.getMilliseconds() //毫秒 
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

//页面中心显示
function showCenter(obj){
	obj.style.display="block";
	function center(){
		var screenW=document.documentElement.clientWidth;
		var screenH=document.documentElement.clientHeight;
		var scrollTop=document.documentElement.scrollTop;
		obj.style.left=(screenW-obj.offsetWidth)/2+'px';
		obj.style.top=(scrollTop + (screenH-obj.offsetHeight)/2)+'px';
	};
	center();
	
	window.onresize=function(){
		center();
	};
};

//模态层
function modal(opacity){
	
	var oDiv=document.createElement('div');
	oDiv.className="modal";
	document.body.appendChild(oDiv);
	if(opacity){
		oDiv.style.background="none";
	}
	return oDiv; //模态层对象
};

function showErrMsg(msg){
	var m_layer=modal();
	var msg_box=document.createElement('div');
	msg_box.className="errMsg1";
	msg_box.innerHTML= 	"<div class='errtitle'>提示</div>" +
						"<div class='errtext'>" + msg + "</div>" +
						"<a class='sureBtn'>我知道了</a>";
	document.body.appendChild(msg_box);
	showCenter(msg_box);
	var sureBtn=msg_box.getElementsByClassName('sureBtn')[0];
	
	sureBtn.onclick=function(){
		document.body.removeChild(msg_box);
		document.body.removeChild(m_layer);
	};
}



//获取房间列表
function getRoomList(page){
	$(".roomList").empty();
	switch(page){
		case 'newArticle':$(".roomList").append("<option value=''></option>");
				break;
		case 'editArticle':$(".roomList").append("<option value=''></option>");
				break;
		case 'historyArticleList':$(".roomList").append("<option value=''>全部</option>");
				break;
		case 'tempArticleList':$(".roomList").append("<option value=''>全部</option>");
				break;
	}
	$.ajax({
		url : SERVER_URL+"QueryRoomsServlet",
		type : "POST",
		data : {jid:jid+SERVER_DOMAIN},
		crossDomain : true,
		dataType : "json",
		success : function(x) {			
			for(var i=0;i<x.length;i++){
				var roomName = x[i].naturalName;
				if(roomName == "我建的圈" || roomName == "参加的圈"){
					$(".roomList").append("<option class='optionTitle' disabled='disabled' value='" + x[i].roomID + "'>" + roomName + "</option>");
					continue;
				};				
				if(!roomName){
					roomName = x[i].name;
				};
				$(".roomList").append("<option class='optionContent' value='" + x[i].roomID + "'>" + "&nbsp;&nbsp;&nbsp;&nbsp;" + roomName + "的圈" + "</option>");
			};
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

//获取家庭房间列表
function getFamilyRoomList(page){
	if(page == 'newArticle' || page == 'editArticle'){
		$(".roomList").empty();
	}else{
		$(".roomList1").empty();
	}
	
	switch(page){
		case 'newArticle':$(".roomList").append("<option value=''></option>");
				break;
		case 'editArticle':$(".roomList").append("<option value=''></option>");
				break;
		case 'historyArticleList':$(".roomList1").append("<option value=''>全部</option>");
				break;
		case 'tempArticleList':$(".roomList1").append("<option value=''>全部</option>");
				break;
	}
	$.ajax({
		url : SERVER_URL+"QueryFamilyRoomsServlet",
		type : "POST",
		data : {jid:jid},
		crossDomain : true,
		dataType : "json",
		success : function(x) {			
			for(var i=0;i<x.length;i++){
				var name = x[i].name;
				var roomName = x[i].nickName;
				var masterName = x[i].masterName;
				var masterNickName = x[i].masterNickName;
				var str = "D1";
				if(name.indexOf("_2") != -1){
					str = "D2";
				}
				var str1 = roomName.substr(-2);	
				var index = roomName.indexOf(str1);
				var str2 = roomName.substring(0,index);
				if(str2 == masterName){
					if(masterNickName){
						roomName = masterNickName + str;
					}else{
						roomName = masterName + str;
					}
				};
				if(page == 'newArticle' || page == 'editArticle'){
					$(".roomList").append("<option class='optionContent' value='" + name + "'>" + "&nbsp;&nbsp;&nbsp;&nbsp;" + roomName + "的家" + "</option>");
				}else{
					$(".roomList1").append("<option class='optionContent' value='" + name + "'>" + "&nbsp;&nbsp;&nbsp;&nbsp;" + roomName + "的家" + "</option>");
				}
			};
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

//获取管理房间列表
function getAdminRoomList(page){
	$(".roomList").empty();	
	if(page){
		$(".roomList").append("<option value=''>全部</option>");
	}
	$.ajax({
		url : SERVER_URL+"QueryAdminRoomsServlet",
		type : "POST",
		data : {jid:jid+SERVER_DOMAIN},
		crossDomain : true,
		dataType : "json",
		success : function(x) {			
			for(var i=0;i<x.length;i++){
				var roomName = x[i].naturalName;
				if(roomName == "我建的圈" || roomName == "参加的圈"){
					$(".roomList").append("<option class='optionTitle' disabled='disabled' value='" + x[i].roomID + "'>" + roomName + "</option>");
					continue;
				};				
				if(!roomName){
					roomName = x[i].name;
				};
				$(".roomList").append("<option class='optionContent' value='" + x[i].roomID + "'>" + "&nbsp;&nbsp;&nbsp;&nbsp;" + roomName + "的圈" + "</option>");
			};
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

//文章专题
function getSubject(page,subject){
	$(".subjects").empty();
	$(".subsubjects").empty();
	var html="";
	var subHtml = "";
	
	if(subject){
		$(".subjectsDiv").css("margin","10px 0");
		var firstArr = subjects[subject];
		for(var i=0;i<firstArr.length;i++){
			subHtml += "<a class='subsubject' code='" + firstArr[i]["code"] + "'>" + firstArr[i]["name"] + "</a>";
		};
		$(".subsubjects").html(subHtml);
		if(page == "newArticle"){
			$(".subsubject").eq(0).addClass("active");
		};
	}else{
		$(".subjectsDiv").empty();
	};
};

$(function(){	
    sessionStorage.setItem("isLoad",true);
	$.ajax({
		url : SERVER_URL+"UserInfoServlet",
		type : "POST",
		data : {jid:jid},
		crossDomain : true,
		dataType : "json",
		success : function(x) {			
			userNick = x.userNick;	   
			$("span#userNick").html(userNick);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
    
    //默认家庭文章编辑页面
	loadMode("newArticle");
    
    //退出按钮
    $("a#loginOut").on("click",function(){
    	localStorage.clear();
    	sessionStorage.clear();
    	location.href = "http://365linju.com/login.html";
    });
    
    //主题页面
    $("a#theme").on("click",function(){
    	loadMode("theme");
    	$(".nav").removeClass("active");
    	$(this).addClass("active");
    	$(".menu").find("a").removeClass("active");
    });
    
    //研学页面
    $("a#yanxue").on("click",function(){
    	loadMode("yanxueList");
    	$(".nav").removeClass("active");
    	$(this).addClass("active");
    	$(".menu").find("a").removeClass("active");
    });
    
    //课程页面
    $("a#kecheng").on("click",function(){
    	loadModeHasParam("newArticle","type='theme'");
    	$(".nav").removeClass("active");
    	$(this).addClass("active");
    	$(".menu").find("a").removeClass("active");
    });
    
    //创作页面
    $("a#chuangzuo").on("click",function(){
    	loadModeHasParam("newArticle","type='theme'");
    	$(".nav").removeClass("active");
    	$(this).addClass("active");
    	$(".menu").find("a").removeClass("active");
    });
    
    //家庭征文页面
    $("a#familyactivity").on("click",function(){
    	loadModeHasParam("newArticle","type='familyactivity'");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //家庭征文列表页面
    $("a#familyactivitylist").on("click",function(){
    	loadMode("familyactivitylist");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //新文章编辑页面
    $("a#new_article").on("click",function(){
    	loadMode("newArticle");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //添加steam页面
    $("a#new_steam").on("click",function(){
    	loadMode("newArticle");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //添加活动页面
    $("a#activity").on("click",function(){
    	loadModeHasParam("newArticle","type='activity'");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //发布活动列表页面
    $("a#activitylist").on("click",function(){
    	loadMode("activitylist");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //参加活动列表页面
    $("a#joinActivitylist").on("click",function(){
    	loadMode("joinActivitylist");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //历史文章页面
    $("a#history_article").on("click",function(){
    	loadMode("historyArticleList");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //历史商品发布页面
    $("a#history_shop").on("click",function(){
    	loadMode("historyShopList");
    	$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
    	$(".nav").find("a").removeClass("active");
    });
    
    //草稿箱页面
	$("a#temp_article").on("click",function(){
		loadMode("tempArticleList");
		$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
		$(".nav").find("a").removeClass("active");
	});
	//草稿箱页面(家庭征文)
	$("a#temp_familyactivity").on("click",function(){
		loadMode("tempFamilyArticleList");
		$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active");
		$(".nav").find("a").removeClass("active");
	});
});

