<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Đăng nhập</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath}/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link
	href="${pageContext.request.contextPath}/vendors/nprogress/nprogress.css"
	rel="stylesheet">
<!-- Animate.css -->
<link
	href="${pageContext.request.contextPath}/vendors/animate.css/animate.min.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="${pageContext.request.contextPath}/build/css/custom.min.css"
	rel="stylesheet">
</head>

<body class="login">
	<div>
		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">
					<form method="POST" action="${pageContext.request.contextPath}/login" class="form-signin">
						<h1>Đăng nhập</h1>
						<span
								style="color: red;">${error}</span>
						<div class="form-group ${error != null ? 'has-error' : ''}">
							<input type="text" name="email" class="form-control"
								placeholder="Email" required="required" />
						</div>
						<div>
							<input type="password" name="password" class="form-control"
								placeholder="Mật khẩu" required="required" /> 
						</div>

						<div>
							<button class="btn btn-default submit" type="submit">Đăng
								nhập</button>
							<!-- <a class="btn btn-default submit" href="index.html" type="submit">Log in</a> -->
							<a class="reset_pass" href="${pageContext.request.contextPath}/forgotPass">Quên mật khẩu?</a>
						</div>

						<div class="clearfix"></div>

						<div class="separator">
							<p class="change_link">
								Chưa có tài khoản? <a href="${pageContext.request.contextPath}/registration" class="to_register">
									Tạo tài khoản </a>
							</p>

							<div class="clearfix"></div>
							<br />

							<div>
								<h1>
									<i class="fa fa-paw"></i> Zenda Shop!
								</h1>
								<p>©2019 Đã đăng kí bản quyền</p>
							</div>
						</div>
					</form>
				</section>
			</div>
		</div>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</html>
