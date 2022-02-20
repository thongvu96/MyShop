<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="x_title">
	<h2>List of categories</h2>

	<div class="clearfix"></div>
</div>

<div class="x_content">
<h4 style="color: red;">${msg}</h4>
	<button type="button" class="btn btn-primary"
		onclick="location.href='${pageContext.request.contextPath}/admin/category/createCategory'">Add new categories</button>
		<br><br>
	<table id="datatable-buttons" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Category Id</th>
				<th>Category Name</th>
				<th>Description</th>
				<!-- <th>Target Customer</th> -->
				<th>Action</th>
			</tr>
		</thead>


		<tbody>
			<c:forEach items="${listCategory}" var="category" varStatus="status">
				<tr>
					<td>${category.categoryId}</td>
					<td>${category.categoryName}</td>
					<td>${category.categoryDes}</td>
					<%-- <td>${category.tcName}</td> --%>
					<td><a
						href="${pageContext.request.contextPath}/admin/category/editCategory/${category.categoryId}"
						class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Edit
					</a> <a
						href="${pageContext.request.contextPath}/admin/category/deleteCategory/${category.categoryId}"
						class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i>
							Delete </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

