/**
 * Created by JimLiu on 2017/4/8.
 */

var articleType = {
		type:"",
		code:0,
		activityID:"",//临时大文章ID
		activityReleaseID:"",//发布大文章ID
		articleMobileId:"",//动态表ID
		headImg:"",
		isArt:0
};

//输入验证
function checkArticle(ue){
	$("#articleErr").empty();
	var articleTitle = $("input#edit_article_title").val();
	var hasContent = ue.hasContents();
	if(articleType.isArt == "2"){
		console.log("ganwuArticleId="+articleType.isArt);
		str = "请选择要发布的家庭！";
		if(!$("#roomList").val()){
			$("#articleErr").html(str);
			showErrMsg(str);
			return false;
		};
	}
	if(!articleTitle){
		$("#articleErr").html("请输入文章标题！");
		showErrMsg("请输入文章标题！");
		return false;
	};
	if(!hasContent){
		$("#articleErr").html("请输入文章内容！");
		showErrMsg("请输入文章内容！");
		return false;
	};
	if(articleType.isArt == 1){
		var signStartDate = $("input#signStartDate").val();
		var signEndDate = $("input#signEndDate").val();
		
		var startDate = $("input#startDate").val();
		var startHour = $("#startHour").val();
		var startMin = $("#startMin").val();
		var endDate = $("input#endDate").val();
		var endHour = $("input#endHour").val();
		var endMin = $("input#endMin").val();
		
		var artAddr = $("input#artAddr").val();
		var artNum = $("input#artNum").val();
		var oDate = new Date();
		oDate.setHours(0);
		oDate.setMinutes(0);
		oDate.setSeconds(0);
		oDate = oDate.getTime();
		var oDate1 = new Date(signStartDate).getTime();		
		
		/*if(signStartDate.length > 10){
			$("#articleErr").html("请正确输入活动报名开始日期！");
			showErrMsg("请正确输入活动报名开始日期！");
			return false;
		};*/
		
		if(!signEndDate){
			$("#articleErr").html("请输入活动报名截止日期！");
			showErrMsg("请输入活动报名截止日期！");
			return false;
		};

        /*oDate1 = new Date(signEndDate).getTime();

        if(signEndDate.length > 10){
            $("#articleErr").html("请正确输入活动报名截止日期！");
            showErrMsg("请正确输入活动报名截止日期！");
            return false;
        };

        if(signStartDate > signEndDate){
            $("#articleErr").html("活动报名截止日期不能小于活动报名开始日期！");
            showErrMsg("活动报名截止日期不能小于活动报名开始日期！");
            return false;
        };*/
	
		if(!startDate){
			$("#articleErr").html("请输入活动开始日期！");
			showErrMsg("请输入活动开始日期！");
			return false;
		};
		
		var oDate1 = new Date(startDate).getTime();		
		
		if(startDate.length > 10){
			$("#articleErr").html("请正确输入活动开始日期！");
			showErrMsg("请正确输入活动开始日期！");
			return false;
		};
		
		if(!endDate){
			$("#articleErr").html("请输入活动结束日期！");
			showErrMsg("请输入活动结束日期！");
			return false;
		};
		
		oDate1 = new Date(endDate).getTime();		
		
		if(endDate.length > 10){
			$("#articleErr").html("请正确输入活动结束日期！");
			showErrMsg("请正确输入活动结束日期！");
			return false;
		};
		
		if(startDate > endDate){
			$("#articleErr").html("活动结束日期不能小于开始日期！");
			showErrMsg("活动结束日期不能小于开始日期！");
			return false;
		};
		
		if(!artAddr){
			$("#articleErr").html("请输入活动地点！");
			showErrMsg("请输入活动地点！");
			return false;
		};
		
		if(artNum.indexOf(".") > -1){
			$("#articleErr").html("参加活动人数请输入整数！");
			showErrMsg("参加活动人数请输入整数！");
			return false;
		};
	}
	
	return true;
};

//存储大文章
function saveArticle(ue,type){//type为保存类型 1:草稿箱 2:发布
	var articleTitle = $("input#edit_article_title").val();
	var text = "";
	if(articleType.code){
		text = $("textarea#target").val();
	};
	var roomId = $("#roomList").val() || articleType.roomId;;
	var roomName = $("#roomList").find("option:selected").text().trim();
	var articleContent = ue.getContent();
	var content = ue.getContentTxt();
	var reqInfo = "0";
	$("input[name='artCheckBox']:checked").each(function(){
		reqInfo += "_" + $(this).val();
	});
	if($("#mark1").val().trim()){
		reqInfo += "_mark1";
	}
	
	if($("#mark2").val().trim()){
		reqInfo += "_mark2";
	}
	
	if($("#mark3").val().trim()){
		reqInfo += "_mark3";
	}
	
	if($("#mark4").val().trim()){
		reqInfo += "_mark4";
	}
	
	if($("#mark5").val().trim()){
		reqInfo += "_mark5";
	}
	localStorage.setItem("articleTitle", articleTitle);
	localStorage.setItem("articleContent", articleContent);
	var current = new Date().Format("yyyy-MM-dd HH:mm:ss");
	
	var comment = "<div style=\"background:#FAFAFA;overflow:hidden;margin-top:8px;vertical-align:middle;\">" +
	  "<a class=\"button-grouped ys_article\"><img class=\"cont_log\" src=\"images/content.svg\"/></a>" +
	  "<div class=\"content_title\">" + articleTitle + "</div>|<div></div>|<div class=\"U45_bd_article\">" +
	  "<div id=\"#U45_text_0\" class=\"text_content\">" + articleContent + "</div></div></div>" +
	  "<div class=\"ring_mes\" onclick=U27_showBlog(\"" + roomId + "\",\"" + articleContent + "\")>" + 
	  articleContent + "的圈</div>";
	var data = {
		username:jid,
		creationDate:current,
		title:articleTitle,
		context:articleContent,
		//comment:comment,
		text:text,
		roomId:roomId,
		roomName:roomName,
		type:type,
		subjectID:articleType.code,
		sequence:"",
		headImg:articleType.headImg,
		mark10:articleType.themeId,
		actType:articleType.isArt
	};
	if(articleType.isArt == 1){
		data.favorite = $('#favorites2').val();
		data.signtype = $('input[name="artRadioBox"]:checked').val();
		data.sequence = reqInfo;
		data.startDate = $("input#startDate").val() + " " + $("#startHour").val() + ":" + $("#startMin").val();
		data.endDate = $("input#endDate").val() + " " + $("#endHour").val() + ":" + $("#endMin").val();
		data.artAddr = $("input#artAddr").val();
		data.artNum = $("input#artNum").val() || 1;
		data.mark1 = $("input#mark1").val();
		data.mark2 = $("input#mark2").val();
		data.mark3 = $("input#mark3").val();
		data.mark4 = $("input#mark4").val();
		data.mark5 = $("input#mark5").val();
		data.mark7 = "";
        data.mark8 = $("input#signEndDate").val() + " " + $("#endsignHour").val() + ":" + $("#endsignMin").val();
	}else if(articleType.isArt == 2){
		data.mark9 = data.roomId;
		data.roomId = -1;		
	}else if(articleType.isArt == 6){ //活动总结感悟
		data.ganwuArticleId = articleType.ganwuArticleId;		
	}
	
	$.ajax({
		url : SERVER_URL+"SaveArticleServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "text",
		success : function(x) {			
			if(type == 1){
				activityID = x;
				$("#articleErr").html("保存成功，可进入草稿箱查看！");
				showErrMsg("保存成功，可进入草稿箱查看！");
			}else if(type == 2){
				activityReleaseID = x;				
			};			
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

//更新大文章
function updateArticle(ue,type){//type为保存类型 1:草稿箱 2:发布
	console.log("updateArticle=");
	var articleTitle = $("input#edit_article_title").val();
	var text = "";
	if(articleType.code){
		text = $("textarea#target").val();
	};
	var roomId = $("#roomList").val() || articleType.roomId;;
	var roomName = $("#roomList").find("option:selected").text().trim();
	var articleContent = ue.getContent();
	var content = ue.getContentTxt();
	localStorage.setItem("articleTitle", articleTitle);
	localStorage.setItem("articleContent", articleContent);
	var reqInfo = "0";
	$("input[name='artCheckBox']:checked").each(function(){
		reqInfo += "_" + $(this).val();
	});
	if($("#mark1").val().trim()){
		reqInfo += "_mark1";
	}
	
	if($("#mark2").val().trim()){
		reqInfo += "_mark2";
	}
	
	if($("#mark3").val().trim()){
		reqInfo += "_mark3";
	}
	
	if($("#mark4").val().trim()){
		reqInfo += "_mark4";
	}
	
	if($("#mark5").val().trim()){
		reqInfo += "_mark5";
	}
	var _activityID = articleType.activityID; 
	if(type == 2){
		_activityID = articleType.activityReleaseID; 
	};
	var current = new Date().Format("yyyy-MM-dd HH:mm:ss");
	
	var comment = "<div style=\"background:#FAFAFA;overflow:hidden;margin-top:8px;vertical-align:middle;\">" +
	  "<a class=\"button-grouped ys_article\"><img class=\"cont_log\" src=\"images/content.svg\"/></a>" +
	  "<div class=\"content_title\">" + articleTitle + "</div>|<div></div>|<div class=\"U45_bd_article\">" +
	  "<div id=\"#U45_text_0\" class=\"text_content\">" + articleContent + "</div></div></div>" +
	  "<div class=\"ring_mes\" onclick=U27_showBlog(\"" + roomId + "\",\"" + roomName + "\")>" + 
	  roomName + "的圈</div>";
	var data = {
		updateDate:current,
		title:articleTitle,
		context:articleContent,
		//comment:comment,
		text:text,
		activityID:_activityID,
		articleMobileId:articleType.articleMobileId,
		roomId:roomId,
		roomName:roomName,
		type:type,
		subjectID:articleType.code,
		sequence:"",
		headImg:articleType.headImg
	};
	if(articleType.isArt == 1){
		data.favorite = $('#favorites2').val();
		data.signtype = $('input[name="artRadioBox"]:checked').val();
		data.sequence = reqInfo;
		data.startDate = $("input#startDate").val() + " " + $("#startHour").val() + ":" + $("#startMin").val();
		data.endDate = $("input#endDate").val() + " " + $("#endHour").val() + ":" + $("#endMin").val();
		data.artAddr = $("input#artAddr").val();
		data.artNum = $("input#artNum").val() || 1;
		data.mark1 = $("input#mark1").val();
		data.mark2 = $("input#mark2").val();
		data.mark3 = $("input#mark3").val();
		data.mark4 = $("input#mark4").val();
		data.mark5 = $("input#mark5").val();
		data.mark7 = "";
        data.mark8 = $("input#signEndDate").val() + " " + $("#endsignHour").val() + ":" + $("#endsignMin").val();
	}else if(articleType.isArt == 2){
		data.mark9 = data.roomId;
		data.roomId = -1;		
	}else if(articleType.isArt == 6){ //活动总结感悟
		data.ganwuArticleId = articleType.ganwuArticleId;		
	}
	
	
	
	$.ajax({
		url : SERVER_URL+"UpdateArticleServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "text",
		success : function(x) {
			if(type == 1){
				$("#articleErr").html("保存成功，可进入草稿箱查看！");
				showErrMsg("保存成功，可进入草稿箱查看！");
			};		
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

//发布文章时，将临时表内文章的type更改为2
function updateArticleStatus(){
	var data = {
		activityID:articleType.activityID,
		type:3
	};
	$.ajax({
		url : SERVER_URL+"UpdateArticleServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "text",
		success : function(x) {			
				
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

//插入链接
function insertLinkBox(ue){
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="insertLinkBox";
	l_box.innerHTML="<div class='title'>插入链接</div>"+
					"<table>" +
						"<tr>" +
				             "<td colspan='2'>" +
				                 "<div class='errMsg'></div>" +				                 
				             "</td>" +
				        "</tr>" +
				        "<tr>" +
				            "<td><label for='text'>文本内容：</label></td>" +
				            "<td><input class='txt' id='text' type='text' /></td>" +
				        "</tr>" +
				        "<tr>" +
				            "<td><label for='href'>链接地址：</label></td>" +
				            "<td><input class='txt' id='href' type='text' /></td>" +
				        "</tr>" +				        
				        "<tr>" +
				             "<td colspan='2'>" +
				                 "<label for='target'>是否在新窗口打开：</label>" +
				                 "<input id='target' type='checkbox'/>" +
				             "</td>" +
				        "</tr>" +
				    "</table>" +
				    "<p><input type='button' class='sureBtn' value='确定'><a class='cancelBtn'>取消</a></p>"+
					"<a class='closeBtn' href='javascript:;'>×</a>";

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
		$("div.insertLinkBox").find("div.errMsg").empty();
		var title = $("div.insertLinkBox").find("input#text").val();
		var href = $("div.insertLinkBox").find("input#href").val();
		if(!title){
			$("div.insertLinkBox").find("div.errMsg").html("请输入文本内容！");
			return;
		};
		if(!href){
			$("div.insertLinkBox").find("div.errMsg").html("请输入链接地址！");
			return;
		};		
		
		$(this).attr("disabled", true);
		
		if(href.indexOf("http://") == -1  && href.indexOf("https://") == -1){
			href = "http://" + href;
		};
		var linkHtml = "<a href='"+ href +"' style='font-size: 16px;'";
		if($('input#target').get(0).checked){
			linkHtml += "target='_blank'";
		};
		linkHtml += ">" + title + "</a>";
		ue.execCommand('insertHtml',linkHtml);
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};
};

//插入图片
function insertImgBox1(ue,$imgBox){

	var errorMsg;
	var isCover = 1;
	if(!$imgBox){
		isCover = 0;
	};
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="insertLinkBox insertImgBox";
	l_box.innerHTML="<div class='title'>插入图片</div>"+						
					"<table>" +
						"<tr>" +
				             "<td colspan='2'>" +
				                 "<div class='errMsg'></div>" +				                 
				             "</td>" +
				        "</tr>" +
				        "<tr>" +
				            "<td><label for='img_upload'>请选择一个图片：</label></td>" +
				        "</tr>" +	
				        "<tr>" +
				            "<td><input class='txt' id='img_upload' type='file' accept='image/*' /></td>" +
				        "</tr>" +
				        "<tr>" +
				            "<td><label for='img_thum'>图片预览：</label></td>" +
				        "</tr>" +
				        "<tr>" +
				            "<td><img id='img_thum' src='' /></td>" +
				        "</tr>" +
				    "</table>" +
				    "<p><input type='button' class='sureBtn' value='确定'><a class='cancelBtn'>取消</a></p>"+
					"<a class='closeBtn' href='javascript:;'>×</a>";

	document.body.appendChild(l_box);
	//居中显示
	showCenter(l_box);
	
	var closeBtn=l_box.getElementsByClassName('closeBtn')[0];
	var cancelBtn=l_box.getElementsByClassName('cancelBtn')[0];
	var sureBtn=l_box.getElementsByClassName('sureBtn')[0];
	
	// 实例化文件输入框的读取对象
  var fileReader = new FileReader();
  var base64File = null; 
  var extensionName;
  
  // 当文件输入框读取到文件时
  $('#img_upload').on('change', function(){
  	errorMsg = "";
  	$("div.insertImgBox").find("div.errMsg").empty();
  	$('#img_thum').attr('src', '');
  	$(".insertImgBox").css("height",200);
  	showCenter(l_box);
  	// 获取文件列表
      var fileList = $("#img_upload")[0].files;        
      // 获取扩展名
      extensionName = fileList[0].name.split('.');
      extensionName = "." + extensionName[extensionName.length -1];            		
		if(imgExt.indexOf(extensionName.toLowerCase()) == -1){
			$("div.insertImgBox").find("div.errMsg").html("图片格式错误！图片支持格式:png, jpg, jpeg, gif, bmp");
			errorMsg = "图片格式错误！图片支持格式:png, jpg, jpeg, gif, bmp";
			return;
		};
		var imgSize = fileList[0].size;
		if(imgSize > imgMaxSize){			
			$("div.insertImgBox").find("div.errMsg").html("图片过大！图片大小限制2M");
			errorMsg = "图片过大！图片大小限制2M";
			return;
		};
      fileReader.onload = function(e){            
          // 获取文件的base64编码
          var base64 = e.target.result;            
          // 将读取 文件放置到一个img标签
          $('#img_thum').attr('src', base64);
          base64File = encodeURIComponent(base64.split(',')[1]);
          // 当文件加载完成后进行压缩
          var img = $('#img_thum')[0];            
          img.onload = function(){
          	var imgH = $('#img_thum').height();
          	$(".insertImgBox").css("height",200+imgH);
          	showCenter(l_box);            	
          };
      };
      
      fileReader.readAsDataURL(fileList[0]);
    });
  
  
	
	closeBtn.onclick=function(){
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};
	
	cancelBtn.onclick=function(){
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};
	
	sureBtn.onclick=function(){	
		$("div.insertImgBox").find("div.errMsg").empty();
		var _img = $("div.insertImgBox").find("input#img_upload").val();
		if(!_img){
			$("div.insertImgBox").find("div.errMsg").html("请选择一个图片！");
			return;
		};
		if(errorMsg){
			$("div.insertImgBox").find("div.errMsg").html(errorMsg);
			return;
		};
		
		$(this).attr("disabled", true);
		
		var data = {
			ext:extensionName,
			file:base64File,
			loginName:jid,
			isCover:isCover
		};
		
		$.ajax({
			url : SERVER_URL+"Base64UploadServlet",
			type : "POST",
			data : data,
			crossDomain : true,
			dataType : "text",
			success : function(x) {			
				var imgSrc = SERVER_URL + x;
				var linkHtml = "<p><img src='" + imgSrc + "' /></p>";
				if(!$imgBox){
					ue.execCommand('insertHtml',linkHtml);					
				}else{
					$imgBox.html("<img src='" + imgSrc + "' />");
					articleType.headImg = imgSrc;
				};
				document.body.removeChild(l_box);
				document.body.removeChild(m_layer);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				console.log("图片上传失败" + textStatus);
			},
			complete : function() {
				
			}
		});		
	};
};

//插入图片
function insertImgBox(ue,$imgBox){
	var errorMsg;
	var isCover = 1;
	if(!$imgBox){
		isCover = 0;
	};
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="insertLinkBox insertAudioBox";
	l_box.innerHTML="<div class='title'>插入图片</div>"+	
						"<form action='" + SERVER_URL + "uploadServlet' enctype='multipart/form-data' method='post' id='uploadForm' target='ajaxUpload'>" +
							"<table>" +
								"<tr>" +
						             "<td colspan='2'>" +
						                 "<div class='errMsg'></div>" +				                 
						             "</td>" +
						        "</tr>" +
						        "<tr>" +
						            "<td><label for='audio_upload'>请选择一个图片：</label></td>" +
						        "</tr>" +	
						        "<tr>" +
						            "<td>" +
						            	"<input id='dirName' name='dirName' type='hidden' />" +
						            	"<input id='fileName' name='fileName' type='hidden' />" +
						            	"<input class='txt' id='audio_upload' name='audio_upload' type='file' accept='image/*' />" +
					            	"</td>" +
						        "</tr>" +
						        "<tr>" +
						            "<td><label for='img_thum'>图片预览：</label></td>" +
						        "</tr>" +
						        "<tr>" +
						            "<td><img id='img_thum' src='' /></td>" +
						        "</tr>" +
						        "<tr'>" +
						        	"<td>" +
							        	"<div class='progressBar'>" +
							        		"<div class='progressText'></div>" +
								        	"<div class='uploaded'></div>" +
								        "</div>" +	
						        	"</td>" +
						        "</tr>" +				        
						    "</table>" +
						    "<p><input type='button' class='sureBtn' value='确定'><a class='cancelBtn'>取消</a></p>"+
					    "<form>" +
						"<a class='closeBtn' href='javascript:;'>×</a>";

	document.body.appendChild(l_box);
	//居中显示
	showCenter(l_box);
	
	var closeBtn=l_box.getElementsByClassName('closeBtn')[0];
	var cancelBtn=l_box.getElementsByClassName('cancelBtn')[0];
	var sureBtn=l_box.getElementsByClassName('sureBtn')[0];
	var uploadBtn=l_box.getElementsByClassName('uploadBtn')[0];
	var fileReader = new FileReader();
	
	// 实例化文件输入框的读取对象
  var extensionName;
  
  // 当文件输入框读取到文件时
  $('#audio_upload').on('change', function(){
  	$("div.insertAudioBox").find("div.errMsg").empty();
  	errorMsg = "";    	
  	// 获取文件列表
      var fileList = $("#audio_upload")[0].files;        
      // 获取扩展名
      extensionName = fileList[0].name.split('.');
      extensionName = "." + extensionName[extensionName.length -1];            		
		if(imgExt.indexOf(extensionName.toLowerCase()) == -1){
			$("div.insertAudioBox").find("div.errMsg").html("图片格式错误！图片支持格式:png, jpg, jpeg, gif, bmp");
			errorMsg = "图片格式错误！图片支持格式:png, jpg, jpeg, gif, bmp";
			return;
		};
		var imgSize = fileList[0].size;
		if(imgSize > audioMaxSize){			
			$("div.insertAudioBox").find("div.errMsg").html("图片过大！图片大小限制"+(audioMaxSize/1024/1024)+"M");
			errorMsg = "图片过大！图片大小限制"+(audioMaxSize/1024/1024)+"M";
			return;
		};    
		
		fileReader.onload = function(e){            
          // 获取文件的base64编码
          var base64 = e.target.result;            
          // 将读取 文件放置到一个img标签
          $('#img_thum').attr('src', base64);
          base64File = encodeURIComponent(base64.split(',')[1]);
          // 当文件加载完成后进行压缩
          var img = $('#img_thum')[0];            
          img.onload = function(){
          	var imgH = $('#img_thum').height();
          	$(".insertAudioBox").css("height",220+imgH);
          	showCenter(l_box);            	
          };
      };
      
      fileReader.readAsDataURL(fileList[0]);
  });
	
  var interval;
  
	closeBtn.onclick=function(){
		clearInterval(interval);
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);		
	};
	
	cancelBtn.onclick=function(){
		clearInterval(interval);
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);		
	};	
	
	sureBtn.onclick=function(){	
		$("div.insertAudioBox").find("div.errMsg").empty();
		var fileList = null;
		var _audio = $("div.insertAudioBox").find("input#audio_upload").val();
		
		if(!_audio){
			$("div.insertAudioBox").find("div.errMsg").html("请选择一个图片！");
			return;
		};
		if(errorMsg){
			$("div.insertAudioBox").find("div.errMsg").html(errorMsg);
			return;
		};
		
		$(this).attr("disabled", true);
		// 获取文件列表
      fileList = $("#audio_upload")[0].files;        
      // 获取扩展名
      extensionName = fileList[0].name.split('.');
      extensionName = "." + extensionName[extensionName.length -1];
		var date = new Date();
		var fileName = date.getTime();		
		var today="" + date.getFullYear() + ((date.getMonth()+1) < 10 ? ("0" + (date.getMonth()+1)) : (date.getMonth()+1)) + (date.getDate() < 10 ? ("0" + date.getDate()) : date.getDate());//插入日期
		$("#dirName").val(today);
		$("#fileName").val(fileName);
		$("#uploadForm").submit();
		$(".progressBar").show();
		
		interval = setInterval(function(){		
			$.getJSON(SERVER_URL + "ProgressServlet", function (json) {
				var bytesRead = json.pBytesRead;
				var contentLength = json.pContentLength;
				var percent = Math.floor((bytesRead / contentLength) * 100) + "%";
				$(".progressText").html(percent);
				$(".uploaded").css("width", percent);
				if(bytesRead >= contentLength){
					clearInterval(interval);
					$(".progressText").html("100%");
					$(".uploaded").css("width","100%");
					var imgSrc = SERVER_URL + "upload/video/" + today + "/" + fileName + extensionName;
					
					var linkHtml = "<p><img src='" + imgSrc + "' /></p>";
					if(!$imgBox){
						ue.execCommand('insertHtml',linkHtml);					
					}else{
						$imgBox.html("<img src='" + imgSrc + "' />");
						articleType.headImg = imgSrc;
					};
					
					document.body.removeChild(l_box);
					document.body.removeChild(m_layer);					
				};
			});
		}, 500);
	};
};

//插入音频
function insertAudioBox(ue){
	var errorMsg;
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="insertLinkBox insertAudioBox";
	l_box.innerHTML="<div class='title'>插入音频</div>"+	
					"<form action='" + SERVER_URL + "uploadServlet' enctype='multipart/form-data' method='post' id='uploadForm' target='ajaxUpload'>" +
						"<table>" +
							"<tr>" +
					             "<td colspan='2'>" +
					                 "<div class='errMsg'></div>" +				                 
					             "</td>" +
					        "</tr>" +
					        "<tr>" +
					            "<td><label for='audio_upload'>请选择一个音频：</label></td>" +
					        "</tr>" +	
					        "<tr>" +
					            "<td>" +
					            	"<input id='dirName' name='dirName' type='hidden' />" +
					            	"<input id='fileName' name='fileName' type='hidden' />" +
					            	"<input class='txt' id='audio_upload' name='audio_upload' type='file' accept='audio/*' />" +
				            	"</td>" +
					        "</tr>" +
					        "<tr'>" +
					        	"<td>" +
						        	"<div class='progressBar'>" +
						        		"<div class='progressText'></div>" +
							        	"<div class='uploaded'></div>" +
							        "</div>" +	
					        	"</td>" +
					        "</tr>" +				        
					    "</table>" +
					    "<p><input type='button' class='sureBtn' value='确定'><a class='cancelBtn'>取消</a></p>"+
				    "<form>" +
					"<a class='closeBtn' href='javascript:;'>×</a>";

	document.body.appendChild(l_box);
	//居中显示
	showCenter(l_box);
	
	var closeBtn=l_box.getElementsByClassName('closeBtn')[0];
	var cancelBtn=l_box.getElementsByClassName('cancelBtn')[0];
	var sureBtn=l_box.getElementsByClassName('sureBtn')[0];
	var uploadBtn=l_box.getElementsByClassName('uploadBtn')[0];
	
	// 实例化文件输入框的读取对象
    var extensionName;
  
    // 当文件输入框读取到文件时
    $('#audio_upload').on('change', function(){
  	$("div.insertAudioBox").find("div.errMsg").empty();
  	errorMsg = "";    	
  	// 获取文件列表
      var fileList = $("#audio_upload")[0].files;        
      // 获取扩展名
      extensionName = fileList[0].name.split('.');
      extensionName = "." + extensionName[extensionName.length -1];            		
		if(audioExt.indexOf(extensionName.toLowerCase()) == -1){
			$("div.insertAudioBox").find("div.errMsg").html("音频格式错误！音频支持格式:ogg, mp3, wav");
			errorMsg = "音频格式错误！音频支持格式:ogg, mp3, wav";
			return;
		};
		var imgSize = fileList[0].size;
		if(imgSize > audioMaxSize){			
			$("div.insertAudioBox").find("div.errMsg").html("音频过大！音频大小限制10M");
			errorMsg = "音频过大！音频大小限制10M";
			return;
		};        
    });
	
    var interval;
  
	closeBtn.onclick=function(){
		clearInterval(interval);
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);		
	};
	
	cancelBtn.onclick=function(){
		clearInterval(interval);
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);		
	};	
	
	sureBtn.onclick=function(){	
		$("div.insertAudioBox").find("div.errMsg").empty();
		var _audio = $("div.insertAudioBox").find("input#audio_upload").val();
		if(!_audio){
			$("div.insertAudioBox").find("div.errMsg").html("请选择一个音频！");
			return;
		};
		if(errorMsg){
			$("div.insertAudioBox").find("div.errMsg").html(errorMsg);
			return;
		};
		
		$(this).attr("disabled", true);
		// 获取文件列表
      var fileList = $("#audio_upload")[0].files;        
      // 获取扩展名
      extensionName = fileList[0].name.split('.');
      extensionName = "." + extensionName[extensionName.length -1];
		var date = new Date();
		var fileName = date.getTime();		
		var today="" + date.getFullYear() + ((date.getMonth()+1) < 10 ? ("0" + (date.getMonth()+1)) : (date.getMonth()+1)) + (date.getDate() < 10 ? ("0" + date.getDate()) : date.getDate());//插入日期
		$("#dirName").val(today);
		$("#fileName").val(fileName);
		$("#uploadForm").submit();
		$(".progressBar").show();
		
		interval = setInterval(function(){		
			$.getJSON(SERVER_URL + "ProgressServlet", function (json) {
				var bytesRead = json.pBytesRead;
				var contentLength = json.pContentLength;
				var percent = Math.floor((bytesRead / contentLength) * 100) + "%";
				$(".progressText").html(percent);
				$(".uploaded").css("width", percent);
				if(bytesRead >= contentLength){
					clearInterval(interval);
					$(".progressText").html("100%");
					$(".uploaded").css("width","100%");
					var audioSrc = SERVER_URL + "upload/video/" + today + "/" + fileName + extensionName;
					var linkHtml = "<p><audio src='" + audioSrc + "' controls />您的浏览器版本太低喽！请升级至IE9以上！</audio>";
					
					ue.execCommand('insertHtml',linkHtml);
					document.body.removeChild(l_box);
					document.body.removeChild(m_layer);					
				};
			});
		}, 500);
	};
};

//插入视频
function insertVideoBox(ue){
	var errorMsg;
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="insertLinkBox insertAudioBox";
	l_box.innerHTML="<div class='title'>插入视频</div>"+	
					"<form action='" + SERVER_URL + "uploadServlet' enctype='multipart/form-data' method='post' id='uploadForm' target='ajaxUpload'>" +
						"<table>" +
							"<tr>" +
					             "<td colspan='2'>" +
					                 "<div class='errMsg'></div>" +				                 
					             "</td>" +
					        "</tr>" +
					        "<tr>" +
					            "<td><label for='audio_upload'>请选择一个视频：</label></td>" +
					        "</tr>" +	
					        "<tr>" +
					            "<td>" +
					            	"<input id='dirName' name='dirName' type='hidden' />" +
					            	"<input id='fileName' name='fileName' type='hidden' />" +
					            	"<input class='txt' id='audio_upload' name='audio_upload' type='file' accept='video/*' />" +
				            	"</td>" +
					        "</tr>" +
					        "<tr'>" +
					        	"<td>" +
						        	"<div class='progressBar'>" +
						        		"<div class='progressText'></div>" +
							        	"<div class='uploaded'></div>" +
							        "</div>" +	
					        	"</td>" +
					        "</tr>" +				        
					    "</table>" +
					    "<p><input type='button' class='sureBtn' value='确定'><a class='cancelBtn'>取消</a></p>"+
				    "<form>" +
					"<a class='closeBtn' href='javascript:;'>×</a>";

	document.body.appendChild(l_box);
	//居中显示
	showCenter(l_box);
	
	var closeBtn=l_box.getElementsByClassName('closeBtn')[0];
	var cancelBtn=l_box.getElementsByClassName('cancelBtn')[0];
	var sureBtn=l_box.getElementsByClassName('sureBtn')[0];
	var uploadBtn=l_box.getElementsByClassName('uploadBtn')[0];
	
	// 实例化文件输入框的读取对象
	var extensionName;
	
	// 当文件输入框读取到文件时
	$('#audio_upload').on('change', function(){
		$("div.insertAudioBox").find("div.errMsg").empty();
		errorMsg = "";    	
		// 获取文件列表
	    var fileList = $("#audio_upload")[0].files;        
	    // 获取扩展名
	    extensionName = fileList[0].name.split('.');
	    extensionName = "." + extensionName[extensionName.length -1];            		
			if(videoExt.indexOf(extensionName.toLowerCase()) == -1){
				$("div.insertAudioBox").find("div.errMsg").html("视频格式错误！视频支持格式:rmvb, rm, avi, wmv, mov, mp4, mid, swf, mpeg, mpg, flv, mkv, ogv, webm");
				errorMsg = "视频格式错误！视频支持格式:rmvb, rm, avi, wmv, mov, mp4, mid, swf, mpeg, mpg, flv, mkv, ogv, webm";
				return;
			};
			var imgSize = fileList[0].size;
			if(imgSize > videoMaxSize){			
				$("div.insertAudioBox").find("div.errMsg").html("视频过大！视频大小限制10M");
				errorMsg = "视频过大！视频大小限制10M";
				return;
			};        
	});
	
	var interval;
	
	closeBtn.onclick=function(){
		clearInterval(interval);
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};
	
	cancelBtn.onclick=function(){
		clearInterval(interval);
		document.body.removeChild(l_box);
		document.body.removeChild(m_layer);
	};	
	
	sureBtn.onclick=function(){	
		$("div.insertAudioBox").find("div.errMsg").empty();
		var _audio = $("div.insertAudioBox").find("input#audio_upload").val();
		if(!_audio){
			$("div.insertAudioBox").find("div.errMsg").html("请选择一个视频！");
			return;
		};
		if(errorMsg){
			$("div.insertAudioBox").find("div.errMsg").html(errorMsg);
			return;
		};
		
		$(this).attr("disabled", true);
		// 获取文件列表
      var fileList = $("#audio_upload")[0].files;        
      // 获取扩展名
      extensionName = fileList[0].name.split('.');
      extensionName = "." + extensionName[extensionName.length -1];
		var date = new Date();
		var fileName = date.getTime();		
		var today="" + date.getFullYear() + ((date.getMonth()+1) < 10 ? ("0" + (date.getMonth()+1)) : (date.getMonth()+1)) + (date.getDate() < 10 ? ("0" + date.getDate()) : date.getDate());//插入日期
		$("#dirName").val(today);
		$("#fileName").val(fileName);
		$("#uploadForm").submit();
		$(".progressBar").show();
		
		interval = setInterval(function(){		
			$.getJSON(SERVER_URL + "ProgressServlet", function (json) {
				var bytesRead = json.pBytesRead;
				var contentLength = json.pContentLength;
				var percent = Math.floor((bytesRead / contentLength) * 100) + "%";
				$(".progressText").html(percent);
				$(".uploaded").css("width", percent);
				if(bytesRead >= contentLength){
					clearInterval(interval);
					$(".progressText").html("100%");
					$(".uploaded").css("width","100%");
					var audioSrc = SERVER_URL + "upload/video/" + today + "/" + fileName + extensionName;
					var videoImageSrc = SERVER_URL + "upload/image/video_" + today + "/" + fileName + ".jpg";
					console.log("videoImageSrc1111:"+videoImageSrc);
					var linkHtml = "<video src='" + audioSrc + "' width='360' height='280' controls poster='"+videoImageSrc+"'>" +
									"您的浏览器版本太低喽！请升级至IE9以上！" +
									"</video>";
					
					ue.execCommand('insertHtml',linkHtml);
					document.body.removeChild(l_box);
					document.body.removeChild(m_layer);
				};
			});
		}, 500);
	};
};

$(function(){
	//获取房间列表
	var editArticleId = (new getUrlParam()).editArticleId;
	var type = (new getUrlParam()).type;
	var subject = (new getUrlParam()).subject;
	
	var activity = (new getUrlParam()).activity;
	var familyactivity = (new getUrlParam()).familyactivity;
	var theme = (new getUrlParam()).theme;
	var themeId = (new getUrlParam()).themeId;
	var title = decodeURI((new getUrlParam()).title);
	var desc = decodeURI((new getUrlParam()).desc);
	var question = decodeURI((new getUrlParam()).question);
	var imgUrl = (new getUrlParam()).imgUrl;
	var ganwu = (new getUrlParam()).ganwu;
	var ganwuArticleId = (new getUrlParam()).zongJieActivityID;
	var roomId = (new getUrlParam()).roomId;
	console.log("ganwu="+ganwu);
	if(activity){
		$(".articleQuan .roomSel").html("请选择要发布的圈：");
		getAdminRoomList();		
		getFavoritesList();
		articleType.isArt = "1";
		
		$(".artDiv").show();
	}else if(familyactivity){
		$(".articleQuan .roomSel").html("请选择要发布的家庭：");
		getFamilyRoomList('editArticle');	
		articleType.isArt = "2";
	}else if(theme){
		$(".articleQuan").hide();		
		articleType.isArt = "3";
		articleType.themeId = themeId;
		articleType.title = title;
		articleType.desc = desc;
		articleType.question = question;
		articleType.imgUrl = imgUrl;
	}else if(ganwu){
		$(".articleQuan").hide();		
		$(".articleQuan").hide();	
		articleType.isArt = "6";
		articleType.ganwuArticleId = ganwuArticleId;
		articleType.roomId = roomId;
	}else{
		$(".articleQuan .roomSel").html("请选择要发布的圈：");
		getRoomList('editArticle');
		articleType.isArt = "0";
	}
	
	
	getSubject("editArticle",subject);
	
	articleType.type = type;
	if(type == 1){
		articleType.activityID = editArticleId;
	}else if(type == 2){
		articleType.activityReleaseID = editArticleId;
		articleType.articleMobileId = (new getUrlParam()).muactivityID;
	};	
	$("div.editArtCls").empty();
	ueId++;
	var editorDiv = "<div id='editArt" + ueId + "' style='width:100%;'></div>";
	$("div.editArtCls").append(editorDiv);
	var sectionHeight = $("section.edit_article_section").height();
	var editHeight = sectionHeight - 300;
	var editArt = "editArt" + ueId;
	//加载编辑器插件
	var ue;
	setTimeout(function(){
		ue = UE.getEditor(editArt);
	},500);
	
	
    var ue = UE.getEditor(editArt);
    
    var data = {
    		articleId:editArticleId,
    		type:type,
    		isArt:articleType.isArt
    };
    
    if(theme){
		data.theme = theme;
	}
   
    $.ajax({
		url : SERVER_URL+"QueryReleaseArticleContentServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "json",
		success : function(x) {	
			
			var code = x.subjectID;
			var art = x.sequence;
			var artList=[];
			if(art){
				artList = art.split("_");
				for(var i=1;i<=artList.length;i++){
					
					$("input[name='artCheckBox']").eq(artList[i]-1).prop('checked',true);
				}
			}
			if(code){
				articleType.code = code;
				code = code + "";
				var subjectCode = code.substr(0,1);
				var subsubjectCode = code.substr(2);
				$(".subject").eq(subjectCode-1).addClass("active");
				$(".subsubject").eq(subsubjectCode-1).addClass("active");
				$("#target").val(x.text);
			};
			if(x.audioURL){
				$(".edit_article_section .jfmbox").html("<img src='" + x.audioURL + "' />");
				articleType.headImg = x.audioURL;
			};
			if(x.signtype){
				$("input[name='artRadioBox'][value='" + x.signtype + "']").prop('checked', true);
			}
			var favorite = x.favorite;
			if(favorite){
				var index=1;
				var favorite1 = favorite.substring(0,1);
				for(var key in favorites){
					if(index == favorite1){
						$("#favorites1").val(key);
						var arr = favorites[key];
						for(var i=0;i<arr.length;i++){
							$(".favorites2").append("<option value='"+arr[i]["value"]+"'>"+arr[i]["name"]+"</option>");
						}
						setTimeout(function(){
							$("#favorites2").val(favorite);
						},50);
					}
					index++;
				}
			}
			
			$("#edit_article_title").val(x.title);
			
			$("#startDate").val(x.startDate.substring(0,10));
			$("#endDate").val(x.endDate.substring(0,10));
            $("#signEndDate").val(x.mark8.substring(0,10));
            if(x.mark8.length >= 16){
                $("#endsignHour").val(x.mark8.substring(11,13));
                $("#endsignMin").val(x.mark8.substring(14,16));
            }else{
                $("#endsignHour").val("00");
                $("#endsignMin").val("00");
            }
			if(x.startDate.length >= 16){
				$("#startHour").val(x.startDate.substring(11,13));
				$("#startMin").val(x.startDate.substring(14,16));
			}else{
				$("#startHour").val("00");
				$("#startMin").val("00");
			}
			if(x.endDate.length >= 16){
				$("#endHour").val(x.endDate.substring(11,13));
				$("#endMin").val(x.endDate.substring(14,16));
			}else{
				$("#endHour").val("00");
				$("#endMin").val("00");
			}
			
			$("#artAddr").val(x.addr);
			$("#artNum").val(x.joinnum);
			$("#mark1").val(x.mark1);
			$("#mark2").val(x.mark2);
			$("#mark3").val(x.mark3);
			$("#mark4").val(x.mark4);
			$("#mark5").val(x.mark5);
			/*$("#signStartDate").val(x.mark7);
			$("#signEndDate").val(x.mark8);*/
			
			setTimeout(function(){
				if(x.roomID){
					$("#roomList").val(x.roomID);
				}				
				ue.setContent(x.context);		
			},500);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});   
    //选择专题
    $(".subsubjects").on("click",".subsubject",function(){
    	$(this).addClass("active").siblings("a").removeClass("active");
    	articleType.code = $(this).attr("code");
    });	 
    
  //插入封面
    $(".edit_article_section").on("click",".jfmbox",function(){
    	var $imgBox = $(this);
    	insertImgBox(ue,$imgBox);
    });
    
    //预览
    $("a#preview").on("click",function(){
    	if(checkArticle(ue)){
    		var preType = 1;
    		if(articleType.type){
    			preType = articleType.type;
    		};
    		/*if(activityID){
    			updateArticle(ue,preType)
    		}else{
    			saveArticle(ue,preType);
    		};*/
    		var articleTitle = $("input#edit_article_title").val();
    		var articleContent = ue.getContent();
    		var target = "";
    		if(articleType.code){
    			target = $("textarea#target").val();
    		};
    		sessionStorage.setItem("articleTitle", articleTitle);
    		sessionStorage.setItem("headImg", articleType.headImg);
    		sessionStorage.setItem("articleContent", articleContent);
    		sessionStorage.setItem("target", target);
    		$(this).attr({"href":"http://365linju.com/previewTemp.html","target":"_blank"});
    	};    	
    });
    //保存为草稿
    $("a#save_temp").on("click",function(){
    	if(checkArticle(ue)){
    		articleType.type = 1;
    		if(articleType.activityID){
    			updateArticle(ue,1);
    		}else{
    			saveArticle(ue,1);
    		};
    	};    	
    }); 
    //发布
    $("a#save").on("click",function(){
    	if(checkArticle(ue)){
    		if(!$("#roomList").val() && !articleType.themeId && !articleType.ganwuArticleId){
    			console.log("ganwuArticleId="+articleType.ganwuArticleId);
    			var str = "请选择要发布的圈！";
        		if(articleType.isArt = "2"){
        			str = "请选择要发布的家庭！";
        		}
    			$("#articleErr").html(str);
    			showErrMsg(str);    			
    			return false;
    		};
    		articleType.type = 2;
    		if(articleType.activityReleaseID){
    			updateArticle(ue,2);    			
    		}else{
    			saveArticle(ue,2);    			
    		};
    		if(articleType.activityID){
				updateArticleStatus();
    		}; 
    		if(articleType.isArt == "2"){
				loadMode("familyactivitylist");
		    	$("a#familyactivitylist").addClass("active").parent("li").siblings("li").find("a").removeClass("active");
			}else if(articleType.isArt == "3"){
				var str = "themeId="+articleType.themeId;
				loadModeHasParam("yanxueArticleList",str);		
			}else{
				loadMode("historyArticleList"); 
	    		$("a#history_article").addClass("active").parent("li").siblings("li").find("a").removeClass("active");
			}    		
    	};     	
    }); 
    
    //插入链接
    $("a#insert_link").on("click",function(){
    	insertLinkBox(ue);
		this.blur();
    });
    
    //插入图片
    $("a#insert_img").on("click",function(){
    	insertImgBox(ue);
		this.blur();
    });
    
    //插入音频
    $("a#insert_audio").on("click",function(){
    	insertAudioBox(ue);
		this.blur();
    });
    
    //插入视频
    $("a#insert_video").on("click",function(){
    	insertVideoBox(ue);
		this.blur();
    });
    
    $("#favorites1").on("change",function(){
    	$("#favorites2").empty();
    	var arr = favorites[$(this).val()];
    	for(var i=0;i<arr.length;i++){
			$(".favorites2").append("<option value='"+arr[i]["value"]+"'>"+arr[i]["name"]+"</option>");
		}
    });
});
