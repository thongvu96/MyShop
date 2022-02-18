<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="x_title">
	<h2>Edit brand</h2>

	<div class="clearfix"></div>
</div>
<div class="x_content">
	<h4 style="color: red;">${msg}</h4>
	<!-- start form for validation -->
	<form:form id="demo-form" modelAttribute="brandVO"
		action="${pageContext.request.contextPath}/admin/brand/editBrand"
		method="post" data-parsley-validate="">
		<form:input type="text" path="brandId" placeholder="" hidden="hidden"/>
		<label for="brandName">Brand Name * :</label>
		<form:input type="text" id="fullname" path="brandName" class="form-control" name="brandName"
			required="required" />
		<br>
		<div class="form-group">
			<div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
				<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/admin/brand/listBrand'">Cancel</button>
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</div>
	</form:form>
	<!-- end form for validations -->

</div>