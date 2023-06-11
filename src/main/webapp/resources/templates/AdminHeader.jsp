<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8">
    <link rel="icon" type="image/png" href="<c:url value="/resources/static/img/logo.jpg"/>"/>
    <link rel="preload" href="<c:url value="/resources/static/img/background.jpg"/>" as="image">
    <link href="<c:url value="/resources/static/css/style.css"/>" rel="stylesheet" type="text/css">
    <script src="<c:url value="/resources/static/js/jquery-3.6.0.min.js"/>"></script>
    <script src="<c:url value="/resources/static/js/jquery.validate.js"/>"></script>
    <title>Burger Factory</title>
</head>
<body>

<header>
    <%--    <a class="logo" href="./dashboard"><img src="<c:url value="/resources/static/img/nav-logo.jpg"/>" alt="logo"></a>--%>
    <nav>
        <ul class="nav-links">

            <sec:authorize access="isAnonymous()">
                <li><a href="./home">Home</a></li>
                <li><a href="<c:url value="/login"/>">Log In</a></li>
                <li><a href="./register">Register</a></li>
            </sec:authorize>

            <sec:authorize access="hasRole('ADMIN')">
                <li><a href="./home">Home</a></li>
                <li><a href="./dashboard">Admin Panel</a></li>
                <li><a href="./profile">View Profile</a></li>
                <li><a href="<c:url value="/logout"/>">Log Out</a></li>
                <li class="username"><a href="./profile">
                    <sec:authentication property="principal.username"/></a></li>
            </sec:authorize>

            <li><a class="project-details" href="./project-details">Project Details</a></li>
        </ul>
    </nav>
</header>