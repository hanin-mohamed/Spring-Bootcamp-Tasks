<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 12/26/2024
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Registration</title>
    <!-- Link to custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

</head>
<body class="bg-light">
<div class="container mt-5">
<div class="row justify-content-center">
<div class="col-md-6">
<h2 class="text-center mb-4">Registration Form</h2>
<form:form action="registerForm" modelAttribute="empModel" class="p-4 border rounded bg-white shadow-sm">

    <!-- Username Input -->
    <div class="form-group mb-3">
    <label> Username</label>
    <form:input type="text" placeholder="Enter Username" path="name" class="form-control" />
    <form:errors path="name" cssClass="alert-danger"/>
    </div>


    <!-- email Input -->
    <div class="form-group mb-3">
    <label>Email address</label>
    <form:input type="text" placeholder="email" path="email" class="form-control" />
    <form:errors path="email" cssClass="alert-danger"/>
    </div>

    <!-- email Input -->
    <div class="form-group mb-3">
        <label> Password</label>
        <form:input type="password" placeholder="password" path="password" class="form-control" />
        <form:errors path="password" cssClass="alert-danger"/>
    </div>

    <div class="form-group mb-3">
        <label>Confirm Password</label>
        <form:input type="password" placeholder="confirm password" path="confirmPass" class="form-control" />
        <form:errors path="confirmPass" cssClass="alert-danger"/>
    </div>

    <div class="form-group">
        <input type="submit" class="btn btn-danger btn-block" />
    </div>

</form:form>
</div>
</div>
</div>
</body>
</html>
