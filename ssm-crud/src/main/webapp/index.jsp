<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工列表</title>
<%
   pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<!-- 
   web 路径：
     不以 / 开始的相对路径，找资源，以当前资源的路径为基础，经常容易出问题
     以 / 开始的相对路径， 找资源，以服务器的路径为标准（http://localhost:3306）：需要加上项目名
         http://localhost:8080/crud  ===> request.getContextPath()
 -->
<!-- 引入 Jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- 员工添加的模态框 -->
	<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">员工添加</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label for="empName_add_input" class="col-sm-2 control-label">empName</label>
							<div class="col-sm-10">
								<input type="text" name="empName" class="form-control" id="empName_add_input"
									placeholder="empName">
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="email_add_input" class="col-sm-2 control-label">email</label>
							<div class="col-sm-10">
								<input type="text" name="email" class="form-control" id="email_add_input"
									placeholder="email">
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">gender</label>
							<div class="col-sm-10">
								<label class="radio-inline">
								  <input type="radio" name="gender" id="gender1_add_input" value="M" checked="checked"> 男
								</label>
								<label class="radio-inline">
								  <input type="radio" name="gender" id="gender2_add_input" value="W"> 女
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">deptName</label>
							<div class="col-sm-4">
								<select class="form-control" name="dId">
									
								</select>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="emp_save_btn">保存</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 搭建显示页面 -->
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>SSM-CRUD</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary" id="emp_add_modal">新增</button>
				<button class="btn btn-danger">删除</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emps_table">
					<thead>
						<tr>
							<th>#</th>
							<th>empName</th>
							<th>gender</th>
							<th>email</th>
							<th>deptName</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>

					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6" id="page_info_area"></div>
			<div class="col-md-6" id="page_nav_area"></div>
		</div>
	</div>
	<script type="text/javascript">
	   var totalRecode;
	   // 1.页面加载完成后，直接发送ajax请求，获取分页数据
	   $(function(){
		   to_page(1);
	   });
	   
	   function to_page(pn){
		   $.ajax({
			   url:"${APP_PATH}/emps",
			   data:"pn=" + pn,
			   type:"get",
			   success:function(result){
				   console.log(result);
				   build_emps_tabel(result);
				   //解析显示分页信息
				   build_page_info(result);
				   //解析显示分页条
				   build_page_nav(result);
			   }
		   });
	   }
	   
	   function build_emps_tabel(result){
		   $("#emps_table tbody").empty();
		   var emps = result.extend.pageInfo.list;
		   $.each(emps,function(i,f){
			   var empId = $("<td></td>").append(f.empId);
			   var empNameId = $("<td></td>").append(f.empName);
			   var genderId = $("<td></td>").append(f.gender == "M" ? "男":"女");
			   var emailId = $("<td></td>").append(f.email);
			   var deptNameId = $("<td></td>").append(f.department.deptName);
			   var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm")
			                 .append($("<span></span>").addClass("glyphicon glyphicon-pencil"))
			                 .append("编辑");
			   var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm")
			                 .append($("<span></span>").addClass("glyphicon glyphicon-trash"))
			                 .append("删除");
			   var btnTd = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
			   $("<tr></tr>").append(empId)
			                 .append(empNameId)
			                 .append(genderId)
			                 .append(emailId)
			                 .append(deptNameId)
			                 .append(btnTd)
			                 .appendTo("#emps_table tbody");
		   });
		   
	   }
	   
	   //解析显示分页信息
	   function build_page_info(result){
		   $("#page_info_area").empty();
		   $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总共"
				     +result.extend.pageInfo.pages+"页,总共"
				     +result.extend.pageInfo.total+"记录");
		   totalRecode = result.extend.pageInfo.total;
	   }
	   //解析显示分页条
	   function build_page_nav(result){
		   $("#page_nav_area").empty();
		   var ul = $("<ul></ul>").addClass("pagination");
		   var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
		   var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
		   if(!result.extend.pageInfo.hasPreviousPage){
			   firstPageLi.addClass("disabled");
			   prePageLi.addClass("disabled");
		   }else{
			   firstPageLi.click(function(){
				   to_page(1);
			   });
			   prePageLi.click(function(){
				   to_page(result.extend.pageInfo.pageNum - 1);
			   });
			   
		   }
		   
		   var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
		   var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
		   if(!result.extend.pageInfo.hasNextPage){
			   nextPageLi.addClass("disabled");
			   lastPageLi.addClass("disabled");
		   }else{
			   nextPageLi.click(function(){
				   to_page(result.extend.pageInfo.pageNum + 1);
			   });
			   lastPageLi.click(function(){
				   to_page(result.extend.pageInfo.pages);
			   });
		   }
		   ul.append(firstPageLi).append(prePageLi);
		   $.each(result.extend.pageInfo.navigatepageNums,function(i,page_num){
			   var numLi = $("<li></li>").append($("<a></a>").append(page_num).attr("href","#"));
			   if(result.extend.pageInfo.pageNum == page_num){
				   numLi.addClass("active");
			   }
			   numLi.click(function(){
				   to_page(page_num);
			   });
			   ul.append(numLi);
		   });
		   ul.append(nextPageLi).append(lastPageLi);
		   var navEle = $("<nav></nav>").append(ul);
		   navEle.appendTo("#page_nav_area");
	   }
	   
	   //清空表单样式和提示信息
	   function reset_form(ele){
		   $(ele)[0].reset();
		   //清空表单样式
		   $(ele).find("*").removeClass("has-error has-success");
		   $(ele).find(".help-block").text("");
	   }
	   
	   //点击新增按钮弹出模态框
	   $("#emp_add_modal").click(function(){
		   //每次新增用户时重置操作（用户信息与提示信息）
		   reset_form("#empAddModal form");
		   //获取部门信息并显示在下拉框里
		   getDepts();
		   //弹出模态框
		   $("#empAddModal").modal({
			   backdrop:"static"
		   });
	   });
	   
	   //部门信息的获取
	   function getDepts(){
		   $.ajax({
			   url:"${APP_PATH}/getAllDeptInfo",
			   type:"GET",
			   success:function(x){
				   console.log("getDepts111:"+JSON.stringify(x));
				   $.each(x.extend.departments,function(){
					   var optionEle = $("<option></option>").append(this.deptName).attr("value",this.deptId);
					   optionEle.appendTo("#empAddModal select");
				   });
			   }
		   });
	   }
	   
	   function validate_add_form(){
		   var empName = $("#empName_add_input").val();
		   var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
		   if(!regName.test(empName)){
			   //alert("用户名可以2-5位中文和6-16位数字和英文的组合");
			   show_vaildate_msg("#empName_add_input","error","用户名须2-5位中文和6-16位数字和英文的组合");
			   return false;
		   }else{
			   show_vaildate_msg("#empName_add_input","success","");
		   }
		   
		   //校验邮箱
		   var email = $("#email_add_input").val();
		   var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
		   if(!regEmail.test(email)){
			   //alert("邮箱格式不正确！");
			   show_vaildate_msg("#email_add_input","error","邮箱格式不正确！");
			   /* $("#email_add_input").parent().addClass("has-error");
			   $("#email_add_input").next("span").text("邮箱格式不正确！"); */
			   return false;
		   }else{
			   show_vaildate_msg("#email_add_input","success","");
			   /* $("#email_add_input").parent().addClass("has-success");
			   $("#email_add_input").next("span").text(""); */
		   }
		   return true;
	   }
	   
	   //显示校验的提示信息
	   function show_vaildate_msg(ele,status,msg){
		   console.log(msg);
		   //清除当前元素的校验状态
		   $(ele).parent().removeClass("has-success has-error");
		   $(ele).next("span").text("");
		   if("success" == status){
			   $(ele).parent().addClass("has-success");
			   $(ele).next("span").text(msg);
		   }else if("error" == status){
			   $(ele).parent().addClass("has-error");
			   $(ele).next("span").text(msg);
		   }
	   }
	   
	   //判断用户名是否已经存在
	   $("#empName_add_input").change(function(){
		    var empName = $(this).text();
		    $.ajax({
		    	url:"${APP_PATH}/checkUser",
		    	data:"empName"+empName,
		    	type:"POST",
		    	success:function(x){
		    		console.log(JSON.stringify(x));
		    		if(x.code == 100){
		    			show_vaildate_msg("#empName_add_input","success","用户名可用");
		    			$("#emp_save_btn").attr("ajax-va","success");
		    		}else{
		    			show_vaildate_msg("#empName_add_input","error",x.extend.validate_empName_msg);
		    			$("#emp_save_btn").attr("ajax-va","error");
		    		}
		    	}
		    })
	   });
	   
	   //保存用户信息
	   $("#emp_save_btn").click(function(){
		   
		   if(!validate_add_form()){
			   return false;
		   }
		   
		   if($("#emp_save_btn").attr("ajax-va") == "error"){
			   return false;
		   }
		   
		   $.ajax({
			  url:"${APP_PATH}/insertDeptInfo",
			  data:$("#empAddModal form").serialize(),
			  type:"POST",
			  success:function(result){
				  $("#empAddModal").modal("hide");
				  to_page(totalRecode); 
			  }
		   });
	   });
	   
	</script>
</body>
</html>