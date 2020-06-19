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

$(function(){
	var SERVER_URL = "http://mlyjq.com:8080/MulinArticle/";
	var articleId = (new getUrlParam()).articleId;
	var type = (new getUrlParam()).type;
	var data = {
			articleId:articleId,
			type:type
	}
	$.ajax({
		url : SERVER_URL+"QueryReleaseArticleContentServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "json",
		success : function(x) {		
			$("article#art_content").find("h1#title").html(x.title);
			$("article#art_content").find("span.author").html(x.name);
			$("article#art_content").find("span.cdate").html(x.creationDate);
			if(!x.audioURL){
				$("#headImg").css("height",0);
			}else{
				$("#headImg").html("<img src='" + x.audioURL + "' />");
			};
			$("article#art_content").find("p#content").html(x.context);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
});