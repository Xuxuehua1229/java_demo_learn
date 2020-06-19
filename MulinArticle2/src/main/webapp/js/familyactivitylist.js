var n=1;

var dataLen;

var data = {
		jid:jid,
		pageNum:n,
		title:"",
		roomId:"",
		createDateFrom:"",
		createDateTo:"",
		type:2
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
		url : SERVER_URL+"QueryFamilyActivityServlet",
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
				$("table#history_article_table").find("tbody").append("<tr><td colspan='6' class='split_line'></td></tr>");
				var data = x.data;
				for(var i=0;i<data.length;i++){
					var articleTitle = data[i].title;
					if(articleTitle.indexOf("img") != -1){
						var pos = articleTitle.lastIndexOf(">")+1;
						articleTitle = articleTitle.substring(pos);
						var regS1 = new RegExp("&nbsp;", "g");
						articleTitle = articleTitle.replace(regS1, "");
					}
					var activityID = data[i].activityID;
					var muactivityID = data[i].muactivityID;
					var subjectID = data[i].subjectID;
					var isArt = data[i].sequence;					
					var $tr = $("<tr>");
					var title = "<td class='art_title_td'><a class='art_title' href='http://365linju.com/articleContent.html?type=2&articleId=" +
								activityID+"&muactivityID="+muactivityID+"' target='_blank'>" + articleTitle + "</a></td>";
					var edit = "<td><a class='editBtn' href='#/editArticle?type=2&familyactivity=1&editArticleId="+activityID+"&muactivityID="+muactivityID+"'>编辑</a></td>";
					var subjectName = "";
					var subsubjectName = "";
					
					$tr.append(title);
					
					
					
					var name = data[i].familyName;
					var roomName = data[i].familyNick;
					var masterName = data[i].familyMasterName;
					var masterNickName = data[i].familyMasterNick;
					var str = "D1";
					if(name.indexOf("_2") != -1){
						str = "D2";
					}
					var str1 = roomName.substr(-2);	
					var index = roomName.indexOf(str1);
					var str2 = roomName.substring(0,index);
					if(str2 == masterName){
						if(masterNickName){
							roomName = masterNickName + str;
						}else{
							roomName = masterName + str;
						}
					};
					$tr.append("<td>" + roomName + "的家" + "</td>");
					
					var d = new Date(data[i].creationDate);
					$tr.append("<td>" + data[i].creationDate + "</td>");
					$tr.append(edit);
					$tr.append("<td><a class='delBtn' articleTitle='" + articleTitle + "' activityID='" + activityID + "' muactivityID='" + muactivityID + "'>删除</a></td>");
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
	$("aside").css("height","870");
	//获取房间列表
	getFamilyRoomList('historyArticleList');
	//查询文章并在页面显示列表
	getReleaseArticleList();	
	
	//查询按钮
	$("button.queryBtn").on("click",function(){
		var title = $("input.article_title").val();
		var roomId = $("#roomListByHistory").val();
		var createDateFrom = $("input.create_date_from").val();
		var createDateTo = $("input.create_date_to").val();
		if(createDateFrom){
			createDateFrom = $("input.create_date_from").val()+ " 00:00:00";
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
		var delMuactivityID = $(this).attr("muactivityID");
		delBox(delTitle,delActivityID,delMuactivityID);
		this.blur();
	});
	
	//编辑按钮
	$("#history_article_table").find("tbody").on("click","a.editBtn",function(){
		loadMode("editArticle");
	});
});

