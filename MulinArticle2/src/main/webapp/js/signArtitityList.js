var n=1;

var dataLen;

var data = {
		pageNum:n,
		username:"",
		nickname:"",
		signtype:"",
		muactivityID:"",
		title:"",
		sequence:0,
		mark1:"",
		mark2:"",
		mark3:"",
		mark4:"",
		mark5:""
};

//分页
function getPageNum(dataSize){
	var pageNums = Math.ceil(dataSize/pageSize);
	$("#pageNum").empty();
    for(var i=0;i<pageNums;i++){
        var $preLi=$("<li>");
        var $nextLi=$("<li>");
        var $li=$("<li>");
        if(pageNums>1 && i==0){
            $preLi.append("<a>&laquo;</a>").appendTo($("#pageNum"));
            
        };
        $li.append("<a>"+(i+1)+"</a>").appendTo($("#pageNum"));
        if(i==data.pageNum-1){
            $li.addClass("active");
        };
        if(pageNums>1 && i==pageNums-1){
            $nextLi.append("<a>&raquo;</a>").appendTo($("#pageNum"));
            
        };
    };
};

//查询文章并在页面显示列表
function getReleaseArticleList(){
	$("table#history_article_table").find("tbody").empty();
	if(dataLen && Math.ceil(dataLen/pageSize) < data.pageNum){
		data.pageNum--;
	};
	var arr = [];
	var mark1 = "";
	var mark2 = "";
	var mark3 = "";
	var mark4 = "";
	var mark5 = "";
	if(data.sequence){
		arr = data.sequence.split("_");		
		mark1 = data.mark1;
		mark2 = data.mark2;
		mark3 = data.mark3;
		mark4 = data.mark4;
		mark5 = data.mark5;
	}
	
	$.ajax({
		url : SERVER_URL+"QuerySignInfoServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "json",
		success : function(x) {	
			
			var dataLen = x.countNum;
			if(!dataLen){
				$("h2#listErr").html("没有查找到相关内容！");				
			}else{
				$("table#history_article_table").show();
				$("table#history_article_table").find("tbody").append("<tr><td colspan='8' class='split_line'></td></tr>");
				var data = x.data;
				for(var i=0;i<data.length;i++){
					var signtype = data[i].issignup;
					var signText = "审核通过";
					if(signtype == 2){
						signText = "等待审核";
					}else if(signtype == 3){
						signText = "审核未通过";
					}
					
					var $tr = $("<tr>");
					$tr.append("<td class='detailIcon' userinfoId='" + data[i].userinfoId + "'><div id='detailBtn_" + data[i].userinfoId + "' class='right'></div></td>");
					
					if(signtype == 1){
						$tr.append("<input type='checkbox' issignup='"+signtype+"' name='signCheckBox' value='" + data[i].userinfoId + "' disabled />");
					}else{
						$tr.append("<input type='checkbox' issignup='"+signtype+"' name='signCheckBox' value='" + data[i].userinfoId + "' />");
					}					
					
					$tr.append("<td><a class='agrBtn' id='agrBtn_"+data[i].userinfoId+"' issignup='"+data[i].issignup+"' onclick=\"updatetype('"+data[i].userinfoId+"','1',this)\" >同意</a></td>");
					$tr.append("<td><a class='noagrBtn' id='noagrBtn_"+data[i].userinfoId+"' issignup='"+data[i].issignup+"' onclick=\"updatetype('"+data[i].userinfoId+"','3',this)\" >拒绝</a></td>");					
					$tr.append("<td>" + data[i].username + "</td>");
					$tr.append("<td>" + data[i].nickname + "</td>");
					$tr.append("<td id='signText_"+data[i].userinfoId+"'>" + signText + "</td>");
					$tr.append("<td>" + data[i].signDate + "</td>");					
					
					$("table#history_article_table").find("tbody").append($tr);
					
					if(arr.length > 0){
						var str = "<tr><td colspan='8'><div class='detailBox hide' id='detailBox_" + data[i].userinfoId + "'>";
						
						for(var j=1;j<arr.length;j++){		
							switch(arr[j]){
								case "1":str += "<div class='detailinfo'><div class='detailinfotext'>姓名:</div><div class='detailinfovalue'>" + data[i].name + "</div></div>";
										 break;
								case "2":str += "<div class='detailinfo'><div class='detailinfotext'>年龄:</div><div class='detailinfovalue'>" + data[i].age + "</div></div>";
								 		 break;
								case "3":str += "<div class='detailinfo'><div class='detailinfotext'>性别:</div><div class='detailinfovalue'>" + data[i].sex + "</div></div>";
								 		 break;
								case "4":str += "<div class='detailinfo'><div class='detailinfotext'>邮箱:</div><div class='detailinfovalue'>" + data[i].mail + "</div></div>";
								 		 break;
								case "5":str += "<div class='detailinfo'><div class='detailinfotext'>手机:</div><div class='detailinfovalue'>" + data[i].tel + "</div></div>";
								 		 break;
								case "6":str += "<div class='detailinfo'><div class='detailinfotext'>公司:</div><div class='detailinfovalue'>" + data[i].company + "</div></div>";
								 		 break;
								case "7":str += "<div class='detailinfo'><div class='detailinfotext'>参加活动人数:</div><div class='detailinfovalue'>" + data[i].joinnum + "</div></div>";
										 break;
								case "8":str += "<div class='detailinfo'><div class='detailinfotext'>孩子年龄:</div><div class='detailinfovalue'>" + data[i].childage + "</div></div>";
										 break;
								case "9":str += "<div class='detailinfo'><div class='detailinfotext'>孩子性别:</div><div class='detailinfovalue'>" + data[i].childsex + "</div></div>";
										 break;
								case "mark1":str += "<div class='detailinfo'><div class='detailinfotext'>"+mark1+":</div><div class='detailinfovalue'>"+data[i].mark1+"</div></div>";
										 break;
								case "mark2":str += "<div class='detailinfo'><div class='detailinfotext'>"+mark2+":</div><div class='detailinfovalue'>"+data[i].mark2+"</div></div>";
								 		 break;
								case "mark3":str += "<div class='detailinfo'><div class='detailinfotext'>"+mark3+":</div><div class='detailinfovalue'>"+data[i].mark3+"</div></div>";
								 		 break;
								case "mark4":str += "<div class='detailinfo'><div class='detailinfotext'>"+mark4+":</div><div class='detailinfovalue'>"+data[i].mark4+"</div></div>";
								 		 break;
								case "mark5":str += "<div class='detailinfo'><div class='detailinfotext'>"+mark5+":</div><div class='detailinfovalue'>"+data[i].mark5+"</div></div>";
								 		 break;
							}
						}
						
						str += "</div></td></tr>";
						$("table#history_article_table").find("tbody").append(str);
					}
					
				};
			};
			if(dataLen > pageSize){
				getPageNum(dataLen);
			}else{
				$("#pageNum").empty();
			};			
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

function getTitle(){
	var title =  decodeURI((new getUrlParam()).title);
	var activityID = (new getUrlParam()).editArticleId;
	var muactivityID = (new getUrlParam()).muactivityID;
	var sequence = (new getUrlParam()).sequence;
	var mark1 = decodeURI((new getUrlParam()).mark1);
	var mark2 = decodeURI((new getUrlParam()).mark2);
	var mark3 = decodeURI((new getUrlParam()).mark3);
	var mark4 = decodeURI((new getUrlParam()).mark4);
	var mark5 = decodeURI((new getUrlParam()).mark5);	
	
	$("#activityTitle").html(title);
	data.muactivityID = muactivityID;
	data.title = title;
	data.sequence = sequence;
	data.mark1 = mark1;
	data.mark2 = mark2;
	data.mark3 = mark3;
	data.mark4 = mark4;
	data.mark5 = mark5;
	
}

function updatetype(userinfoId,currentType,e){
	if($(e).attr("issignup") == currentType){
		return false;
	}
	
	var data = {
			userinfoId:userinfoId,
			issignup:currentType
	};		
	$.ajax({
		url : SERVER_URL+"UpdateSignTypeServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "text",
		success : function(x) {
			
			//if(x){
				$("#agrBtn_"+userinfoId).attr("issignup",currentType);
				$("#noagrBtn_"+userinfoId).attr("issignup",currentType);
				$("input[value='"+userinfoId+"']").attr("issignup",currentType);
				if(currentType == 1){					
					$("#signText_"+userinfoId).html("审核通过");
					$("input[value='"+userinfoId+"']").attr("disabled","disabled").prop("checked",false);
				}else if(currentType == 3){					
					$("#signText_"+userinfoId).html("审核未通过");
					$("input[value='"+userinfoId+"']").removeAttr("disabled").prop("checked",false);
				}
			//}else{
			//	showErrMsg("由于网络问题操作失败，请稍后再试！");
			//}		
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			showErrMsg("由于网络问题操作失败，请稍后再试！");
		},
		complete : function() {
			
		}
	});
}

function printBox(){		
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="oConfirm1";
	
	var str = "<h4>请勾选要打印的内容</h4><h4 class='errMsg' id='printErr'></h4>";
	
	str += "<div class='cbox clearfix'>" +
	    		"<div class='printBox'>" +
					"<input type='checkbox' id='mulinid' name='printCheckBox' value='1' />" +
	                "<label for='mulinid'>睦邻号</label>" +
                "</div>" +
                "<div class='printBox'>" +
					"<input type='checkbox' id='mulinnick' name='printCheckBox' value='2' />" +
	                "<label for='mulinnick'>睦邻昵称</label>" +
	            "</div>";      
	    	
	var arr = [];
	var mark1 = "";
	var mark2 = "";
	var mark3 = "";
	var mark4 = "";
	var mark5 = "";
	if(data.sequence){
		arr = data.sequence.split("_");		
		mark1 = data.mark1;
		mark2 = data.mark2;
		mark3 = data.mark3;
		mark4 = data.mark4;
		mark5 = data.mark5;
	}
	
	for(var j=1;j<arr.length;j++){		
		switch(arr[j]){
			case "1":str += "<div class='printBox'>" +
								"<input type='checkbox' id='realname' name='printCheckBox' value='3' />" +
					            "<label for='realname'>姓名</label>" +
					        "</div>";  
					 break;
			case "2":str += "<div class='printBox'>" +
								"<input type='checkbox' id='age' name='printCheckBox' value='4' />" +
					            "<label for='age'>年龄</label>" +
					        "</div>";
			 		 break;
			case "3":str += "<div class='printBox'>" +
								"<input type='checkbox' id='sex' name='printCheckBox' value='5' />" +
					            "<label for='sex'>性别</label>" +
					        "</div>";
			 		 break;
			case "4":str += "<div class='printBox'>" +
								"<input type='checkbox' id='mail' name='printCheckBox' value='6' />" +
					            "<label for='mail'>邮箱</label>" +
					        "</div>";
			 		 break;
			case "5":str += "<div class='printBox'>" +
								"<input type='checkbox' id='tel' name='printCheckBox' value='7' />" +
					            "<label for='tel'>手机</label>" +
					        "</div>";
			 		 break;
			case "6":str += "<div class='printBox'>" +
								"<input type='checkbox' id='company' name='printCheckBox' value='8' />" +
					            "<label for='company'>公司</label>" +
					        "</div>";
			 		 break;
			case "7":str += "<div class='printBox'>" +
								"<input type='checkbox' id='joinnum' name='printCheckBox' value='9' />" +
					            "<label for='joinnum'>参加活动人数</label>" +
					        "</div>";
					 break;
			case "8":str += "<div class='printBox'>" +
								"<input type='checkbox' id='childage' name='printCheckBox' value='10' />" +
					            "<label for='childage'>孩子年龄</label>" +
					        "</div>";
					 break;
			case "9":str += "<div class='printBox'>" +
								"<input type='checkbox' id='childsex' name='printCheckBox' value='11' />" +
					            "<label for='childsex'>孩子性别</label>" +
					        "</div>";
					 break;
			case "mark1":str += "<div class='printBox'>" +
									"<input type='checkbox' id='mark1' name='printCheckBox' value='12' />" +
						            "<label for='mark1'>"+mark1+"</label>" +
						        "</div>";
					 break;
			case "mark2":str += "<div class='printBox'>" +
									"<input type='checkbox' id='mark2' name='printCheckBox' value='13' />" +
						            "<label for='mark2'>"+mark2+"</label>" +
						        "</div>";
			 		 break;
			case "mark3":str += "<div class='printBox'>" +
									"<input type='checkbox' id='mark3' name='printCheckBox' value='14' />" +
						            "<label for='mark3'>"+mark3+"</label>" +
						        "</div>";
			 		 break;
			case "mark4":str += "<div class='printBox'>" +
									"<input type='checkbox' id='mark4' name='printCheckBox' value='15' />" +
						            "<label for='mark4'>"+mark4+"</label>" +
						        "</div>";
			 		 break;
			case "mark5":str += "<div class='printBox'>" +
									"<input type='checkbox' id='mark5' name='printCheckBox' value='16' />" +
						            "<label for='mark5'>"+mark5+"</label>" +
						        "</div>";
			 		 break;
		}
	}
	
	str += "</div><p class='clearfix'><a class='sureBtn'>确定</a><a class='cancelBtn'>取消</a></p><a class='closeBtn' href='javascript:;'>×</a>";
	
	l_box.innerHTML=str;
	
	document.body.appendChild(l_box);
	//居中显示
	showCenter(l_box);		
	
	var closeBtn=l_box.getElementsByClassName('closeBtn')[0];
	var cancelBtn=l_box.getElementsByClassName('cancelBtn')[0];
	var sureBtn=l_box.getElementsByClassName('sureBtn')[0];
	
	closeBtn.onclick=function(){
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};
	
	cancelBtn.onclick=function(){
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};
	
	sureBtn.onclick=function(){
		var printItem = 0;
		$("input[name='printCheckBox']:checked").each(function(){
			printItem += "_" + $(this).val();
		});
		
		if(!printItem){
			$("#printErr").html("请勾选要打印的内容");
			return false;
		}
		
		var str = "http://365linju.com/printUserInfo.html?muactivityID="+data.muactivityID+
				  "&printItem="+printItem+"&mark1="+encodeURI(mark1)+"&mark2="+encodeURI(mark2)+
				  "&mark3="+encodeURI(mark3)+"&mark4="+encodeURI(mark4)+"&mark5="+encodeURI(mark5)+
				  "&title="+encodeURI(data.title); 
		
		$(this).attr({"href":str,"target":"_blank"});
		
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};
};

$(function(){
	$("aside").css("height","870");
	//获取标题栏
	getTitle();

	//查询报名用户列表
	getReleaseArticleList();	
	
		
	//查询按钮
	$("button.queryBtn").on("click",function(){
		var username = $("input#username").val().trim();
		var nickname = $("input#nickname").val().trim();
		var signtype = $("select#signtype").val().trim();
		
		data.username = username;
		data.nickname = nickname;
		data.signtype = signtype;		
		
		$("h2#listErr").html("");	
		$("table#history_article_table").find("tbody").empty();
		$("table#history_article_table").hide();
		//查询文章并在页面显示列表
		getReleaseArticleList();
	});
	
	//分页
	$("#pageNum").on("click","li",function(){		
		$('#selectAll').prop("checked",false);
		var len= $("#pageNum").find("li").length;
        var index=$(this).index();
        switch(index){
            case 0: n--;
                    if(n<1) n=1;
                    data.pageNum = n;
                    getReleaseArticleList();
                    break;
            case len-1: n++;
                        if(n>=len-1) n=len-2;
                        data.pageNum = n;
                        getReleaseArticleList();
                        break;
            default:n=index;
    			    data.pageNum = n;
    			    getReleaseArticleList();
                     
        };
        $(this).addClass("active").siblings("li").removeClass("active");
    });
	
	//三角图标点击
	$("#history_article_table").find("tbody").on("click",".detailIcon",function(){	
		$(this).find("div").toggleClass("right");
		$(this).find("div").toggleClass("bottom");
		var userinfoId = $(this).attr("userinfoId");
		$("#detailBox_"+userinfoId).toggleClass("hide");
	});
	
	//全选复选框
	$("#history_article_table").find("thead").on("change","#selectAll",function(){	
		if($(this).is(":checked") == true){
			//$('input[name="signCheckBox"]').prop("checked",true);
			$('input[name="signCheckBox"]').each(function(){
				if(!$(this).attr("disabled")){
					$(this).prop("checked",true);					
				}
			});
        }else{
        	$('input[name="signCheckBox"]').prop("checked",false);
        }
	});
	
	//全选同意按钮
	$("#history_article_table").find("thead").on("click","#agreeBtn",function(){		
		$('input[name="signCheckBox"]').each(function(){
			if($(this).is(":checked") == true){
				updatetype($(this).val(),1,this);
			}			
		});       
	});
	
	//打印
	$(".printBtn").on("click",function(){		
		this.blur();
		printBox();		
	});	
	
});

