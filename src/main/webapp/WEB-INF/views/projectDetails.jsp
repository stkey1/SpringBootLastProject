<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="icon" type="image/png" href="<c:url value="/resources/static/img/logo.svg"/>"/>
    <link rel="preload" href="<c:url value="/resources/static/img/background.jpg"/>" as="image">
    <link href="<c:url value="/resources/static/css/style.css"/>" rel="stylesheet" type="text/css">
    <title> Burger Factory</title>
</head>

<body>

<header>
    <%--    <a class="logo" href="./home"><img src="<c:url value="/resources/static/img/nav-logo.svg"/>" alt="logo"></a>--%>
    <nav>
        <ul class="nav-links">
            <li><a href="./home">Home</a></li>
            <li><a href="https://github.com">GitHub</a></li>
            <li><a href="https://linkedln.com">linkedln</a></li>
        </ul>
    </nav>
</header>

<div class="center">
    <div class="form-container" id="project-details">
        <%--        <div class="project-details-img center">--%>
        <%--            <img class="logo" src="<c:url value="/resources/static/img/nav-logo.svg"/>" alt="logo">--%>
        <%--        </div>--%>
        <div class="project-details">
            Like is a web based links management system, built using Spring MVC, Spring Boot, Spring Security,
            Hibernate
            with PostgreSql, Spring Data JPA, JSP, and Maven to manage the dependencies.
            <h2>Features</h2>
            <hr>
            <h4>Customers can browse links, view details, and explore many other things.
                Customer can get points and purchase points for add links.
                There are also various features available
                for administrators. The application is essentially separated into two roles-</h4>
            <h3>Customer:</h3>
            <ul>
                <li>Login</li>
                <li>Registration</li>
                <li>Profile view and modify</li>
                <li>Browse and search links</li>
                <li>Add links</li>
                <li>Get Points for purchase</li>
            </ul>
            <h3>Administrator:</h3>
            <ul>
                <li>Manage user roles</li>
                <li>Add, remove, and disable users</li>
                <li>View user and links list</li>
                <li>Manage links</li>
            </ul>
            <h2>Tools</h2>
            <hr>
            <h4>Tools and technologies used to develop the project-</h4>
            <ul>
                <li>Java, JSP, HTML, CSS, JavaScript & jQuery</li>
                <li><b>Frameworks: </b>Spring MVC, Spring Boot, Spring Security & Hibernate</li>
                <li><b>Database: </b>PostgreSql</li>
                <li><b>Server: </b>Apache Tomcat</li>
                <li><b>IDE: </b>IntelliJ IDEA</li>
            </ul>
        </div>
    </div>
</div>

</body>

<footer class="footer">
    <p>Copyright &copy 2023 by <a href="https://github.com/stkey1">Java Development Team</a>. All Rights Reserved.</p>
</footer>

</html>
