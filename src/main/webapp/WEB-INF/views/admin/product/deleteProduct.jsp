<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="x_title">
	<h2>Delete Product</h2>

	<div class="clearfix"></div>
</div>
<div class="x_content">
	<h4 style="color: red;">${msg}</h4>
	<!-- start form for validation -->
	<form:form id="demo-form" modelAttribute="productVO"
		action="${pageContext.request.contextPath}/admin/product/deleteProduct"
		method="post" data-parsley-validate="">
		<form:input type="text" path="productId" placeholder="" hidden="hidden"/>
		<label for="productName">Product Name * :</label>
		<form:input type="text" id="productName" path="productName" class="form-control" name="productName"
			required="required" readonly="true"/>
		<br>
		<label for="categoryName">Category *:</label>
		<form:input type="text" id="categoryName" path="proCategory.categoryName" class="form-control" name="categoryName"
			required="required" readonly="true"/>
		<br>
		<label for="brandName">Brand *:</label>
		<form:input type="text" id="brandName" path="proBrand.brandName" class="form-control" name="brandName"
			required="required" readonly="true"/>
		<br>
		<%-- <label for="heard">Target Customer *:</label>
		<form:input type="text" id="categoryName" path="targetCusName" class="form-control" name="categoryName"
			required="required" readonly="true"/>
		<br>
		<label for="heard">Color *:</label>
		<form:input type="text" id="categoryName" path="colorName" class="form-control" name="categoryName"
			required="required" readonly="true"/>
		<br> --%>
		<label for="materialName">Material *:</label>
		<form:input type="text" id="materialName" path="proMaterial.materialName" class="form-control" name="materialName"
			required="required" readonly="true"/>
		<br>
		<%-- <label for="heard">Sole *:</label>
		<form:input type="text" id="categoryName" path="soleName" class="form-control" name="categoryName"
			required="required" readonly="true"/>
		<br> --%>
		<label for="productDes">Description :</label>
		<form:textarea id="productDes" path="productDes" required="required" class="form-control"
			name="productDes" data-parsley-trigger="keyup"
			data-parsley-minlength="20" data-parsley-maxlength="5000"
			data-parsley-minlength-message="Come on! You need to enter at least a 20 caracters long comment.."
			data-parsley-validation-threshold="10" readonly="true"></form:textarea>
		<br>
		<label for="productPrice">Price * :</label>
		<form:input type="number" id="productPrice" path="productPrice" class="form-control" name="productPrice"
			required="required" readonly="true"/>
		<br>
		<%-- <label for="price">Sale * :</label>
		<form:input type="number" id="sale" path="saleDouble" class="form-control" name="sale"
			required="required" step="any" pattern="[0-9]*[.]?[0-9]+" readonly="true"/>
		<br>
		<label for="price">Rating * :</label>
		<form:input type="number" id="rating" path="ratingDouble" class="form-control" name="rating"
			required="required" readonly="true"/>
		<br>
		<label for="price">Sum Vote :</label>
		<form:input type="number" id="vote" path="sumVote" class="form-control" name="sumVote"
			required="required" readonly="true"/>
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