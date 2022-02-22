<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="x_title">
	<h2>Create Product</h2>

	<div class="clearfix"></div>
</div>
<div class="x_content">
	<h4 style="color: red;">${msg}</h4>
	<!-- start form for validation -->
	<form:form id="demo-form" modelAttribute="productVO"
		action="${pageContext.request.contextPath}/admin/product/createProduct"
		method="post" data-parsley-validate="">
		<label for="productName">Product Name * :</label>
		<form:input type="text" id="productName" path="productName" class="form-control" name="productName"
			required="required" />
		<br>
		<label for="proCategory">Category *:</label>
		<form:select id="proCategory" path="proCategory" class="form-control" required="required">
			<form:option value="" label="Choose" />
			<form:options items="${mapCategory}" />
		</form:select>
		<br>
		<label for="proBrand">Brand *:</label>
		<form:select id="proBrand" path="proBrand" class="form-control" required="required">
			<form:option value="" label="Choose" />
			<form:options items="${mapBrand}" />
		</form:select>
		<br>
		<%-- <label for="heard">Target Customer *:</label>
		<form:select id="heard" path="targetCusId" class="form-control" required="required">
			<form:option value="" label="Choose" />
			<form:options items="${tcList}" />
		</form:select>
		<br>
		<label for="heard">Color *:</label>
		<form:select id="heard" path="colorId" class="form-control" required="required">
			<form:option value="" label="Choose" />
			<form:options items="${colorList}" />
		</form:select>
		<br> --%>
		<label for="proMaterial">Material *:</label>
		<form:select id="proMaterial" path="proMaterial" class="form-control" required="required">
			<form:option value="" label="Choose" />
			<form:options items="${mapMaterial}" />
		</form:select>
		<br>
		<%-- <label for="heard">Sole *:</label>
		<form:select id="heard" path="soleId" class="form-control" required="required">
			<form:option value="" label="Choose" />
			<form:options items="${soleList}" />
		</form:select>
		<br> --%>
		<label for="productDes">Description :</label>
		<form:textarea id="productDes" path="productDes" required="required" class="form-control"
			name="productDes" data-parsley-trigger="keyup"
			data-parsley-minlength="20" data-parsley-maxlength="5000"
			data-parsley-minlength-message="Come on! You need to enter at least a 20 caracters long comment.."
			data-parsley-validation-threshold="10"></form:textarea>
		<br>
		<label for="productPrice">Price * :</label>
		<form:input type="number" id="productPrice" path="productPrice" class="form-control" name="productPrice"
			required="required" />
		<br>
		<%-- <label for="price">Sale * :</label>
		<form:input type="number" id="sale" path="saleDouble" class="form-control" name="sale"
			required="required" step="any" pattern="[0-9]*[.]?[0-9]+" />
		<br>
		<label for="price">Rating * :</label>
		<form:input type="number" id="rating" path="ratingDouble" class="form-control" name="rating"
			required="required" />
		<br> --%>
		<div class="form-group">
			<div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
				<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/admin/product/listProduct'">Cancel</button>
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</div>
	</form:form>
	<!-- end form for validations -->

</div>