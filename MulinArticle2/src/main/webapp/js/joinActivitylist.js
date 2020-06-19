var n=1;

var dataLen;

var data = {
		jid:jid,
		pageNum:n,
		title:"",
		roomId:"",
		createDateFrom:"",
		createDateTo:""
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
	$.ajax({
		url : SERVER_URL+"QueryJoinActivityServlet",
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
				$("table#history_article_table").find("tbody").append("<tr><td colspan='7' class='split_line'></td></tr>");
				var data = x.data;
				for(var i=0;i<data.length;i++){
					var articleTitle = data[i].title;
					var activityID = data[i].activityID;
					var muactivityID = data[i].muactivityID;
								
					var $tr = $("<tr>");
					var title = "<td class='art_title_td'><a class='art_title' href='http://365linju.com/articleContent.html?type=2&articleId=" +
								activityID+"&muactivityID="+muactivityID+"&activity=1' target='_blank'>" + articleTitle + "</a></td>";
					$tr.append(title);					
					$tr.append("<td>" + data[i].endDate + "</td>");
					var edit = "<td><a class='editBtn' href='#/newArticle?type=ganwu&ganwuArticleId="+activityID+"&roomId="+data[i].roomID+"'>发表总结感悟</a></td>";
					$tr.append(edit);
					$("table#history_article_table").find("tbody").append($tr);
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

$(function(){
	$("aside").css("height","870");
	//查询文章并在页面显示列表
	getReleaseArticleList();	
	
	//查询按钮
	$("button.queryBtn").on("click",function(){
		var title = $("input.article_title").val();		
		
		data.title = title;		
		
		$("h2#listErr").html("");	
		$("table#history_article_table").find("tbody").empty();
		$("table#history_article_table").hide();
		//查询文章并在页面显示列表
		getReleaseArticleList();
	});
	
	//分页
	$("#pageNum").on("click","li",function(){		
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
	
	//编辑按钮
	$("#history_article_table").find("tbody").on("click","a.editBtn",function(){
		loadMode("newArticle");
	});
		
});

