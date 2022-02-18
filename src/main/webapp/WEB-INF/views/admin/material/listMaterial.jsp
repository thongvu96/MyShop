<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="x_title">
	<h2>List of Materials</h2>

	<div class="clearfix"></div>
</div>

<div class="x_content">
<h4 style="color: red;">${msg}</h4>
	<button type="button" class="btn btn-primary"
		onclick="location.href='${pageContext.request.contextPath}/admin/material/createMaterial'">Add new Material</button>
		<br><br>
	<table id="datatable-buttons" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Material Id</th>
				<th>Material Name</th>
				<th>Action</th>
			</tr>
		</thead>


		<tbody>
			<c:forEach items="${listMaterial}" var="material" varStatus="status">
				<tr>
					<td>${material.materialId}</td>
					<td>${material.materialName}</td>
					<td><a
						href="${pageContext.request.contextPath}/admin/material/editMaterial/${material.materialId}"
						class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Edit
					</a> <a
						href="${pageContext.request.contextPath}/admin/material/deleteMaterial/${material.materialId}"
						class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i>
							Delete </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

