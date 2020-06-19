var n=1;

var dataLen;

var data = {
		jid:jid,
		pageNum:n,
		title:"",
		type:""
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
					$tr.append("<td class='art_title_td'>" + title + "</td>");
					$tr.append("<td>" + themeType[data[i].type] + "</td>");
					$tr.append("<td>" + data[i].creationDate + "</td>");
					$tr.append("<td><a class='editBtn' href='#/addtheme?themeId="+themeId+"'>编辑</a></td>");
					$tr.append("<td><a class='delBtn' themeID='" + themeId + "' title='" + title + "'>删除</a></td>");					
					
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

function delBox(delTitle,themeId){		
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="oConfirm";
	l_box.innerHTML="<h4>您确定要删除主题 《" + delTitle + "》 吗？</h4>"+
					"<p><a class='sureBtn'>确定</a><a class='cancelBtn'>取消</a></p>"+
					'<a class="closeBtn" href="javascript:;">×</a>';
	
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
		var title = delTitle;
		var current = new Date().Format("yyyy-MM-dd HH:mm:ss");
		var data = {
				jid:jid,
				themeId:themeId
		};		
		$.ajax({
			url : SERVER_URL+"DelThemeServlet",
			type : "POST",
			data : data,
			crossDomain : true,
			dataType : "text",
			success : function(x) {
				dataLen--;
				getReleaseArticleList();
				document.body.removeChild(l_box);
				document.body.removeChild(m_layer);
				$("h2#listErr").html("主题 《" + title + "》 已删除");				
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				
			},
			complete : function() {
				
			}
		});
	};
};

$(function(){
	$("aside").css("height","870");
	//获取主题类型
	getThemeType("themeList");
	//查询主题并在页面显示列表
	getReleaseArticleList();	
	
	//查询按钮
	$("button.queryBtn").on("click",function(){
		var title = $("input.article_title").val();	
		var type = $("#themeType").val();	
		
		data.title = title;
		data.type = type;		
		
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
	
	//删除按钮
	$("#history_article_table").find("tbody").on("click","a.delBtn",function(){
		var delTitle = $(this).attr("title");
		var themeId = $(this).attr("themeId");	
		delBox(delTitle,themeId);
		this.blur();
	});
	
	//编辑按钮
	$("#history_article_table").find("tbody").on("click","a.editBtn",function(){
		loadMode("addtheme");
	});
	
	//增加按钮
	$("a#addtheme").on("click",function(){
    	loadMode("addtheme");
    });
});

