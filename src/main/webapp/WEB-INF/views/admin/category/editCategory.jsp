<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="x_title">
	<h2>Edit Category</h2>

	<div class="clearfix"></div>
</div>
<div class="x_content">
	<h4 style="color: red;">${msg}</h4>
	<!-- start form for validation -->
	<form:form id="demo-form" modelAttribute="categoryVO"
		action="${pageContext.request.contextPath}/admin/category/editCategory"
		method="post" data-parsley-validate="">
		<form:input type="text" path="categoryId" placeholder="" hidden="hidden"/>
		<label for="categoryName">Category Name * :</label>
		<form:input type="text" id="categoryName" path="categoryName" class="form-control" name="categoryName"
			required="required" />
		<br>
		<label for="categoryDes">Description :</label>
		<form:textarea id="categoryDes" path="categoryDes" required="required" class="form-control"
			name="categoryDes" data-parsley-trigger="keyup"
			data-parsley-minlength="20" data-parsley-maxlength="5000"
			data-parsley-minlength-message="Come on! You need to enter at least a 20 caracters long comment.."
			data-parsley-validation-threshold="10"></form:textarea>
		<br />
		<%-- <label for="heard">Target Customer *:</label>
		<form:select id="heard" path="tcId" class="form-control" required="required">
			<form:option value="" label="Choose" />
			<form:options items="${tcList}" />
		</form:select>
		<br> --%>
		<div class="form-group">
			<div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
				<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/admin/category/listCategory'">Cancel</button>
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</div>
	</form:form>
	<!-- end form for validations -->

</div>