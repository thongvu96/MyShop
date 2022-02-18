<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- menu profile quick info -->
<div class="profile clearfix">
	<div class="profile_info">
		<span>Welcome,</span>
		<h2>${name}</h2>
	</div>
</div>
<!-- /menu profile quick info -->
<br />
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
	<div class="menu_section">
		<ul class="nav side-menu">
			<li><a href="${pageContext.request.contextPath}/admin"><i
					class="fa fa-home"></i> Home </a></li>
			<li><a><i class="fa fa-clone"></i> Product <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/product">List of products</a></li>
					<li><a
						href="${pageContext.request.contextPath}/admin/category">List of categories</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/image">List of images</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/brand/listBrand" target="">List of brands</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/targetedCustomer" target="">List of target customers</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/productColor" target="">List of colors</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/material/listMaterial" target="">List of materials</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/shoeSole" target="">List of soles</a></li>
				</ul></li>
			<%-- <li><a><i class="fa fa-edit"></i> Category <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a
						href="${pageContext.request.contextPath}/admin/category">List of categories</a></li>
					<li><a
						href="${pageContext.request.contextPath}/admin/category/create">Add new categories</a></li>
				</ul></li> --%>
			<%-- <li><a><i class="fa fa-image"></i> Image <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/image">List of images</a></li>
					<li><a
						href="${pageContext.request.contextPath}/admin/image/create">Add new images</a></li>
				</ul></li> --%>
			<li><a><i class="fa fa-user"></i> User <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/user">List of users</a></li>
				</ul></li>
			<li><a><i class="fa fa-key"></i> Role <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/role">List of roles</a></li>
					<%-- <li><a
						href="${pageContext.request.contextPath}/admin/role/create">Thêm
							quyền</a></li> --%>
				</ul></li>
			<li><a><i class="fa fa-cart-plus"></i> Order <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/order">List of orders</a></li>
				</ul></li>
			<li><a><i class="fa fa-bar-chart"></i> Report <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/report" target="">Order statistics for the past 15 days</a></li>
				</ul></li>
			<li><a><i class="fa fa-users"></i> Customer <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/customer" target="">List of potential customers</a></li>
				</ul></li>
			<li><a><i class="fa fa-question-circle"></i> FAQs <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/faqs" target="">FAQs</a></li>
				</ul></li>
			<li><a><i class="fa fa-mobile-phone"></i> Contact <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/contact" target="">Contact</a></li>
				</ul></li>
			<li><a><i class="fa fa-key"></i> Privacy Policy <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/privacy" target="">Privacy Policy</a></li>
				</ul></li>
			<li><a><i class="fa fa-book"></i> Terms of Use <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/term" target="">Terms of Use</a></li>
				</ul></li>
			<%-- <li><a><i class="fa fa-exchange"></i> Size <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/admin/size/male" target="">Male</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/size/female" target="">Female</a></li>
				</ul>
			</li> --%>
			
		</ul>
	</div>

</div>
<!-- /menu footer buttons -->
<div class="sidebar-footer hidden-small">
	<a data-toggle="tooltip" data-placement="top" title="Logout"
		href="${pageContext.request.contextPath}/logout"> <span
		class="glyphicon glyphicon-off" aria-hidden="true"></span>
	</a>
</div>
<!-- /menu footer buttons -->