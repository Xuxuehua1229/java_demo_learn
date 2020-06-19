var n=1;

var dataLen;

var data = {
		jid:jid,
		pageNum:n,
		title:"",
		type:6,
		themetype:"yanxue",
		onlyMyTheme:0
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
		url : SERVER_URL+"QueryTheme",
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
				$("table#history_article_table").find("tbody").append("<tr><td colspan='5' class='split_line'></td></tr>");
				var data = x.data;
				for(var i=0;i<data.length;i++){
					var themeId = data[i].themeId;
					var title = data[i].title;	
					var $tr = $("<tr>");
					var author = data[i].username;
					if(data[i].usernick){
						author = data[i].usernick;
					}
					var desc = data[i].desc;
					if(!desc || desc == "null"){
						desc = "";
					}
					var question = data[i].question;
					if(!question || question == "null"){
						question = "";
					}
					var str = "<td class='art_title_td'><a class='art_title' href='#/yanxueArticleList?themeId="+themeId+"&title="+encodeURI(title)+
							  "&desc="+encodeURI(data[i].desc)+"&question="+encodeURI(data[i].question)+"&imgUrl="+data[i].imgUrl+"'>" + title + "</a></td>";
					$tr.append(str);
					$tr.append("<td>" + author + "</td>");
					$tr.append("<td>" + data[i].creationDate + "</td>");
					$tr.append("<td>" + desc || "" + "</td>");
					$tr.append("<td>" + question || "" + "</td>");								
					
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
	//获取房间列表
	//查询文章并在页面显示列表
	getReleaseArticleList();	
	
	//查询按钮
	$("button.queryBtn").on("click",function(){
		var title = $("input.article_title").val();
		
		data.title = title;
		if($("#mytheme").prop("checked")){
			data.onlyMyTheme = 1;
		}else{
			data.onlyMyTheme = 0;
		}
		
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
	
	$("#history_article_table").on("click",".art_title",function(){		
		loadMode("yanxueArticleList");		
	})
});

