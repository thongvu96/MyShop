<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="x_title">
	<h2>List of brands</h2>

	<div class="clearfix"></div>
</div>

<div class="x_content">
<h4 style="color: red;">${msg}</h4>
	<button type="button" class="btn btn-primary"
		onclick="location.href='${pageContext.request.contextPath}/admin/brand/createBrand'">Add new Brand</button>
		<br><br>
	<table id="datatable-buttons" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Brand Id</th>
				<th>Brand Name</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${listBrand}" var="brand" varStatus="status">
				<tr>
					<td>${brand.brandId}</td>
					<td>${brand.brandName}</td>
					<td><a
						href="${pageContext.request.contextPath}/admin/brand/editBrand/${brand.brandId}"
						class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Edit
					</a> <a
						href="${pageContext.request.contextPath}/admin/brand/deleteBrand/${brand.brandId}"
						class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i>
							Delete </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

