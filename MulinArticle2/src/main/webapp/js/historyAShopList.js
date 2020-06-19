//查询文章并在页面显示列表
function getReleaseArticleList(){
	$("table#history_article_table").find("tbody").empty();
	var data = {
			jid:jid
	};
	console.log("QueryReleaseShopServlet="+JSON.stringify(data));
	$.ajax({
		url : SERVER_URL+"QueryReleaseShopServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "json",
		success : function(x) {	
			console.log("QueryReleaseShopServlet1="+JSON.stringify(x));
			
				$("table#history_article_table").show();
				$("table#history_article_table").find("tbody").append("<tr><td colspan='2' class='split_line'></td></tr>");
				var data = x.data;
				for(var i=0;i<data.length;i++){
					var articleTitle = data[i].title;
					var activityID = data[i].activityID;
					var muactivityID = data[i].muactivityID;
					var $tr = $("<tr>");
					var title = "<td class='art_title_td'><a class='art_title' href='http://365linju.com/shopContent.html?articleId=" +
								activityID+"' target='_blank'>" + articleTitle + "</a></td>";
					
					$tr.append(title);
					var d = new Date(data[i].creationDate);
					$tr.append("<td>" + data[i].creationDate + "</td>");
					$("table#history_article_table").find("tbody").append($tr);
				};
			
					
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			
		},
		complete : function() {
			
		}
	});
};

$(function(){
	//查询文章并在页面显示列表
	getReleaseArticleList();
});
