//上传图片
function uploadHeadImage(base64,extensionName){
    $.ajax({
        url:SERVER_URL+"uploadImageAction!uploadHeadImage.action",
        type:"POST",
        data:{
            "extensionName":extensionName,
            "fileFileName":base64
        },
        dataType:"json",
        crossDomain:true,
        success:function(x){
            console.log(x.url);
            var imagePash = SERVER_PASH + x.url;
            $('#img_thum').attr('src', imagePash);
        },
        error:function(XMLHttpRequest,textStatus,errorThrown){

        }
    });
}

function getTheme(themeId){
    var data = {
        "themeId":themeId,
    };
    $.ajax({
        url : SERVER_URL+"activityAction!getThemeDetails.action",
        type : "POST",
        data : data,
        crossDomain : true,
        dataType : "json",
        success : function(x) {
            console.log("getActivity_x:"+JSON.stringify(x));
            if(x){
                $("#type").val(x.type);
                $("#text").val(x.title);
                $("#desc").val(x.desc);
                $("#img_thum").attr("src",x.imgUrl);
            };
        },
        error : function(XMLHttpRequest, textStatus, errorThrown) {

        }
    });
}

$(function(){
	getThemeType("addTheme");
	getFavoritesList();
	var themeId = (new getUrlParam()).themeId;	
	
	var fileReader = new FileReader();
    var base64File = null; 
    var extensionName;
    var imgSrc = "";
    
    if(themeId){
    	var data = {
        	"themeId":themeId,
        	"jid":jid
        };
       
        $.ajax({
    		url : SERVER_URL+"QueryThemeContentServlet",
    		type : "POST",
    		data : data,
    		crossDomain : true,
    		dataType : "json",
    		success : function(x) {
    			var type = x.type;
    			$("#type").val(type);
    			if(type == 6){
    				$("#questionDiv").show();
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
    			
    			$("#text").val(x.title);
    			
    			var desc = x.desc;
    			if(desc){
    				$("#desc").val(desc);
    			}
    			
    			var question = x.question;
    			if(desc){
    				$("#question").val(question);
    			}
    			
    			var imgUrl = x.imgUrl;
    			if(imgUrl){
    				$("#img_thum").attr("src",imgUrl);
    			};
    			
    		},
    		error : function(XMLHttpRequest, textStatus, errorThrown) {
    			
    		},
    		complete : function() {
    			
    		}
    	});   
    }
    
    // 当文件输入框读取到文件时
    $('#audio_upload').on('change', function(){
    	errorMsg = "";
    	$(".errMsg").empty();
    	$('#img_thum').attr('src', '');
    	// 获取文件列表
        var fileList = $("#audio_upload")[0].files;        
        // 获取扩展名
        extensionName = fileList[0].name.split('.');
        extensionName = "." + extensionName[extensionName.length -1];            		
		if(imgExt.indexOf(extensionName.toLowerCase()) == -1){
			$("errMsg").html("图片格式错误！图片支持格式:png, jpg, jpeg, gif, bmp");
			errorMsg = "图片格式错误！图片支持格式:png, jpg, jpeg, gif, bmp";
			return;
		};
		var imgSize = fileList[0].size;
		if(imgSize > imgMaxSize){			
			$("errMsg").html("图片过大！图片大小限制2M");
			errorMsg = "图片过大！图片大小限制2M";
			return;
		};
        fileReader.onload = function(e){            
            // 获取文件的base64编码
        	imgSrc = e.target.result;            
            // 将读取 文件放置到一个img标签
            $('#img_thum').attr('src', imgSrc);   
            
            var fileList = null;
    		var _audio = $("#audio_upload").val();    		
    		
    		var date = new Date();
    		var fileName = date.getTime();		
    		var today="" + date.getFullYear() + ((date.getMonth()+1) < 10 ? ("0" + (date.getMonth()+1)) : (date.getMonth()+1)) + (date.getDate() < 10 ? ("0" + date.getDate()) : date.getDate());//插入日期
    		$("#dirName").val(today);
    		$("#fileName").val(fileName);
    		$("#uploadForm").submit();
    		$(".progressBar").show();
    		var interval = null;
    		
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
    					imgSrc = SERVER_URL + "upload/video/" + today + "/" + fileName + extensionName;
    					$(".progressBar").hide();    								
    				};
    			});
    		}, 500);		
        };
        
        fileReader.readAsDataURL(fileList[0]);
    });
    
    //兴趣标签选择
    $("#favorites1").on("change",function(){
    	$("#favorites2").empty();
    	var arr = favorites[$(this).val()];
    	for(var i=0;i<arr.length;i++){
			$(".favorites2").append("<option value='"+arr[i]["value"]+"'>"+arr[i]["name"]+"</option>");
		}
    });
    
    $("#type").on("change",function(){
    	if($(this).val() == 6){
    		$("#questionDiv").show();
    	}else{
    		$("#questionDiv").hide();
    	}
    	
    });
    
    $("#sumBtm").on("click",function(){
    	$("addThemeErr").html("");
    	var type = $("#type").val();
        if(!type){
            $("#addThemeErr").html("请选择主题类型！");
            $("#type").focus();
            return;
        }
        var title = $("#text").val().trim();
        if(!title){
            $("#addThemeErr").html("请输入主题！");
            $("#text").focus();
            return;
        }
        var data = {
            "jid":jid,
            "type":type,
            "title":title,
            "desc":$("#desc").val().trim(),
            "question":$("#question").val().trim(),
            "imgUrl":imgSrc,
            "favorites":$("#favorites2").val(),
            "themeId":themeId
        };
        $.ajax({
            url:SERVER_URL+"ThemeServlet",
            data:data,
            type:"POST",
            dataType:"json",
            crossDomain:true,
            success:function(x){
                loadMode("theme");                
            },
            error:function(XMLHttpRequest,textStatus,errorThrown){

            }
        });
    });    
})