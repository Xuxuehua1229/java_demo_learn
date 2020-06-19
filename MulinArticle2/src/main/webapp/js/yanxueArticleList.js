var n=1;

var dataLen;

var data = {
		jid:jid,
		pageNum:n,
		title:"",
		onlyMyTheme:0,
		themeId:""
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
		url : SERVER_URL+"QueryYanxueServlet",
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
					var activityID = data[i].activityID;
					var muactivityID = data[i].muactivityID;
					var articleTitle = data[i].title;
					var nick = data[i].naturalName;
					var username = data[i].name;
					if(!nick){
						nick = username;
					}
					var $tr = $("<tr>");
					var title = "<td class='art_title_td'><a class='art_title' href='http://365linju.com/articleContent.html?theme=yanxue&type=2&articleId=" +
								activityID+"&muactivityID="+muactivityID+"' target='_blank'>" + articleTitle + "</a></td>";
					$tr.append(title);
					$tr.append("<td>" + nick + "</td>");
					$tr.append("<td>" + data[i].creationDate + "</td>");
					if(jid == username){
						var edit = "<td><a class='editBtn' href='#/editArticle?theme=yanxue&type=2&editArticleId="+activityID+"&muactivityID="+muactivityID+
								   "&themeId="+themeId+"&title="+encodeURI(data[i].title)+"&desc="+encodeURI(data[i].themeDesc)+"&question="+
								   encodeURI(data[i].question)+"&imgUrl="+data[i].imgUrl+"''>编辑</a></td>";						
						$tr.append(edit);
						$tr.append("<td><a class='delBtn' articleTitle='" + articleTitle + "' activityID='" + activityID + "' muactivityID='" + muactivityID + "'>删除</a></td>");
								
					}							
					
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

function delBox(delTitle,delActivityID,delMuactivityID){		
	//调用模态层
	var m_layer=modal();
	
	var l_box=document.createElement('div');
	l_box.className="oConfirm";
	l_box.innerHTML="<h4>您确定要删除文章 《" + delTitle + "》 吗？</h4>"+
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
				activityID:delActivityID,
				muactivityID:delMuactivityID,
				delDate:current,
				type:2
		};		
		$.ajax({
			url : SERVER_URL+"DelArticleServlet",
			type : "POST",
			data : data,
			crossDomain : true,
			dataType : "text",
			success : function(x) {
				dataLen--;
				getReleaseArticleList();
				document.body.removeChild(l_box);
				document.body.removeChild(m_layer);
				$("h2#listErr").html("文章 《" + title + "》 已删除");				
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				
			},
			complete : function() {
				
			}
		});
	};
};

$(function(){	
	var themeId = (new getUrlParam()).themeId;
	data.themeId = themeId;
	/*var title = decodeURI((new getUrlParam()).title);
	var desc = decodeURI((new getUrlParam()).desc);
	var question = decodeURI((new getUrlParam()).question);
	var imgUrl = (new getUrlParam()).imgUrl;
	
	if(imgUrl && imgUrl != "null"){
		$("#themeImg").attr("src",imgUrl);
	}else{
		$("#imgBox").hide();
	}
	
	$(".yanxueBox h2").html(title);
	

	if(desc && imgUrl != "null"){
		$("#desc .descContent").html(desc);
	}else{
		$("#desc").hide();
	}
	
	if(question && imgUrl != "null"){
		$("#question .descContent").html(question);
	}else{
		$("#question").hide();
	}*/
	console.log("themeId="+themeId);
	if(themeId){
		console.log("themeId1");
		var data1 = {
        	"themeId":themeId,
        	"jid":jid
        };
       
        $.ajax({
    		url : SERVER_URL+"QueryThemeContentServlet",
    		type : "POST",
    		data : data1,
    		crossDomain : true,
    		dataType : "json",
    		success : function(x) {
    			var imgUrl = x.imgUrl;
    			var title = x.title;
    			var desc = x.desc;
    			var question = x.question;
    			if(imgUrl && imgUrl != "null"){
    				$("#themeImg").attr("src",imgUrl);
    			}else{
    				$("#imgBox").hide();
    			}
    			
    			$(".yanxueBox h2").html(title);    			

    			if(desc && desc != "null"){
    				$("#desc .descContent").html(desc);
    			}else{
    				$("#desc").hide();
    			}
    			
    			if(question && question != "null"){
    				$("#question .descContent").html(question);
    			}else{
    				$("#question").hide();
    			}
    		},
    		error : function(XMLHttpRequest, textStatus, errorThrown) {
    			
    		},
    		complete : function() {
    			
    		}
    	});   
    }
	
	
	//查询主题并在页面显示列表
	getReleaseArticleList();	
	
	//查询按钮
	$("button.queryBtn").on("click",function(){
		var title = $("input.article_title").val();	
		var type = $("#themeType").val();	
		
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
	
	//删除按钮
	$("#history_article_table").find("tbody").on("click","a.delBtn",function(){
		var delTitle = $(this).attr("articleTitle");
		var delActivityID = $(this).attr("activityID");	
		var delMuactivityID = $(this).attr("muactivityID");
		delBox(delTitle,delActivityID,delMuactivityID);
		this.blur();
	});
	
	//编辑按钮
	$("#history_article_table").find("tbody").on("click","a.editBtn",function(){
		loadMode("editArticle");
	});
	
	//增加按钮
	$("a#addtheme").on("click",function(){
		var str = "type=yanxue&themeId="+themeId;
		$(this).attr("href","#/newArticle?"+str);
		$("html").scrollTop(0);
		loadModeHasParam("newArticle",str);		
    });
});

