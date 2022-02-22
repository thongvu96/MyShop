<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="x_title">
	<h2>List of products</h2>

	<div class="clearfix"></div>
</div>
<div class="x_content">
	<h4 style="color: red;">${msg}</h4>
<button type="button" class="btn btn-primary"
		onclick="location.href='${pageContext.request.contextPath}/admin/product/createProduct'">Add new products</button>
		<br><br>
	<table id="datatable-buttons" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Category</th>
				<th>Brand</th>
				<!-- <th>Target Customer</th> -->
				<!-- <th>Color</th> -->
				<th>Material</th>
				<!-- <th>Sole</th> -->
				<th>Description</th>
				<th>Price</th>
				<!-- <th>Sale</th>
				<th>Rating</th>
				<th>Sum Vote</th> -->
				<th>Action</th>
			</tr>
		</thead>


		<tbody>
			<c:forEach items="${listProduct}" var="product" varStatus="status">
				<tr>
					<td>${product.productId}</td>
					<td>${product.productName}</td>
					<td>${product.proCategory.categoryName}</td>
					<td>${product.proBrand.brandName}</td>
					<%-- <td>${product.targetCusName}</td>
					<td>${product.colorName}</td> --%>
					<td>${product.proMaterial.materialName}</td>
					<%-- <td>${product.soleName}</td> --%>
					<td>${product.productDes}</td>
					<td>${product.productPrice}</td>
					<%-- <td>${product.sale}</td>
					<td>${product.ratingDouble}</td>
					<td>${product.sumVote}</td> --%>
					<td><a
						href="${pageContext.request.contextPath}/admin/product/editProduct/${product.productId}"
						class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Edit
					</a> <a
						href="${pageContext.request.contextPath}/admin/product/deleteProduct/${product.productId}"
						class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i>
							Delete </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

