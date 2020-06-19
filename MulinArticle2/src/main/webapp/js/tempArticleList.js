var n=1;

var dataLen;

var data = {
		jid:jid,
		pageNum:n,
		title:"",
		roomId:"",
		createDateFrom:"",
		createDateTo:"",
		type:1
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
		url : SERVER_URL+"QueryReleaseArticleServlet",
		type : "POST",
		data : data,
		crossDomain : true,
		dataType : "json",
		success : function(x) {			
			dataLen = x.countNum;			
			if(!dataLen){
				$("h2#listErr").html("没有查找到相关内容！");		
			}else{				
				$("table#history_article_table").show();
				$("table#history_article_table").find("tbody").append("<tr><td colspan='6' class='split_line'></td></tr>");
				var data = x.data;
				for(var i=0;i<data.length;i++){
					var articleTitle = data[i].title;
					var activityID = data[i].activityID;
					var subjectID = data[i].subjectID;
					var isArt = data[i].sequence;
					var actType = data[i].actType;
					var zongJieActivityID = data[i].zongJieActivityID;
					
					var $tr = $("<tr>");
					var title = "<td class='art_title_td'><a class='art_title' href='http://365linju.com/articleContent.html?type=1&theme="+data[i].themeId+"&articleId=" + 
								activityID + "' target='_blank'>"+articleTitle+"</a></td>";
					var edit = "<td><a class='editBtn' href='#/editArticle?type=1&theme="+data[i].themeId+"&themeId="+data[i].themeId+"&editArticleId="+activityID+"'>编辑</a></td>";
					var subjectName = "";
					var subsubjectName = "";
					if(subjectID){
						var subjectCode = (subjectID+"").substr(0,1);
						var subsubjectCode = (subjectID+"").substr(2);
						switch(subjectCode){
							case '1':subjectName = "STEAM";
									break;									
						};
						subsubjectName = subjectName + "-" + subjects[subjectName][subsubjectCode-1]["name"];	
						title = "<td class='art_title_td'><a class='art_title' href='http://365linju.com/articleContent.html?type=1&articleId=" + 
								activityID + "&subject="+subjectName+"' target='_blank'>"+articleTitle+"</a></td>";
						edit = "<td><a class='editBtn' href='#/editArticle?type=1&editArticleId="+activityID+"&subject="+subjectName+"'>编辑</a></td>";
					};	
					if(isArt){
						title = "<td class='art_title_td'><a class='art_title' href='http://365linju.com/articleContent.html?type=1&articleId=" + 
								activityID + "&activity=1' target='_blank'>"+articleTitle+"</a></td>";
						edit = "<td><a class='editBtn' href='#/editArticle?type=1&editArticleId="+activityID+"&activity=1'>编辑</a></td>";
					};
					if(actType == 6){
						edit = "<td><a class='editBtn' href='#/editArticle?type=1&editArticleId="+activityID+"&zongJieActivityID="+
						zongJieActivityID+"&roomId="+data[i].roomID+"&ganwu=1'>编辑</a></td>";						
					}
					$tr.append(title);
					$tr.append("<td>" + subsubjectName + "</td>");
					var roomName = data[i].naturalName;
					if(!roomName){
						roomName = data[i].name;
					};
					if(!roomName){
						roomName = "";
					}else{
						roomName = roomName + "的圈"
					};
					$tr.append("<td>" + roomName + "</td>");
					var d = new Date(data[i].creationDate);
					$tr.append("<td>" + data[i].creationDate + "</td>");
					$tr.append(edit);
					$tr.append("<td><a class='delBtn' articleTitle='" + articleTitle + "' activityID='" + activityID + "'>删除</a></td>");
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


//删除文章
function delBox(delTitle,delActivityID){		
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
				delDate:current,
				type:1
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
	$("aside").css("height","870");
	//获取房间列表
	getRoomList('tempArticleList');
	//查询文章并在页面显示列表
	getReleaseArticleList();	
	
	//查询按钮
	$("button.queryBtn").on("click",function(){
		var title = $("input.article_title").val();
		var roomId = $("#roomListByHistory").val();
		var createDateFrom = $("input.create_date_from").val();
		var createDateTo = $("input.create_date_to").val();
		if(createDateFrom){
			createDateFrom = $("input.create_date_from").val()+" 00:00:00";
		};
		if(createDateTo){
			createDateTo = $("input.create_date_to").val()+" 23:59:59";
		};
		if(createDateFrom && createDateTo){
			if(createDateTo < createDateFrom){
				$("h2#listErr").html("发布日期：结束日期不能小于开始日期！");
				return;
			};			
		};
		data.title = title;
		data.roomId = roomId;
		data.createDateFrom = createDateFrom;
		data.createDateTo = createDateTo;
		
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
		delBox(delTitle,delActivityID);
		this.blur();
	});
	
	//编辑按钮
	$("#history_article_table").find("tbody").on("click","a.editBtn",function(){
		loadMode("editArticle");
	});
});

