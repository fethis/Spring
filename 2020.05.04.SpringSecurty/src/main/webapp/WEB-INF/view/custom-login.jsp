<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>Please sign in</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
  </head>
  <body>
     <div class="container">
		<f:form class="form-signin" method="post"
			action="${pageContext.request.contextPath}/authenticateTheUser">
			<h2 class="form-signin-heading">Giriş Yapınız</h2>
			<p>
				<label for="username" class="sr-only">Kullanıcı</label> <input
					type="text" id="username" name="username" class="form-control"
					placeholder="Kullanıcı" required autofocus>
			</p>
			<p>
				<label for="password" class="sr-only">Sifre</label> <input
					type="password" id="password" name="password" class="form-control"
					placeholder="Şifre" required>
			</p>
			<!-- <input name="_csrf" type="hidden" value="e66fd624-a43c-458f-8d74-0272c9259f1f" /> -->
			<button class="btn btn-lg btn-primary btn-block" type="submit">Bağlan</button>
		</f:form>
	</div>
</body></html>