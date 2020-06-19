
$(function(){
	var articleTitle = sessionStorage.getItem("articleTitle");
	var headImg = sessionStorage.getItem("headImg");
	var articleContent = sessionStorage.getItem("articleContent");
	var target = sessionStorage.getItem("target");
	$("h1#title").html(articleTitle);
	$("p#content").html(articleContent);
	if(!headImg){
		$("#preHeadImg").css("height",0);
	}else{
		$("#preHeadImg").html("<img src='" + headImg + "' />");
	};
	if(target){
		$("p#targets").html("<div>目标：</div><textarea id='target' disabled='disabled'>"+target+"</textarea>");
		$("p#content").html("<div>正文：</div><div class='text'>"+articleContent+"</div>");
		var oTextarea = document.getElementById("target");
	    var oTextareaHeight = oTextarea.scrollHeight;
	    $("#target").css("height",oTextareaHeight);
	};
	
	
});