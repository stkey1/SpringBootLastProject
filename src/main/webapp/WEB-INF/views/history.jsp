<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<c:import url="/resources/templates/CustomerHeader.jsp"/>

<!DOCTYPE html>
<html>
<head>
    <title>Ana Sayfa</title>
    <style>
        body {
            font-size: 16px;
        }

        .grid-container {
            display: grid;
            grid-template-columns: 1fr 1fr;
            grid-gap: 20px;
        }

        .link-container {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .link-container form {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100%;
        }

        .link-container form input[type="submit"] {
            margin-bottom: 10px;
            padding: 10px;
            font-size: 18px;
        }

        iframe {
            width: 100%;
            height: 100%;
            border: none;
        }
    </style>
</head>
<body>
    <div class="grid-container">
        <div class="link-container">
            <h2>Linkler</h2>
            <form action="showLinks.jsp" target="icerik">
                <c:forEach var="link" items="${links}">
                    <input type="submit" name="link" value="${link}">
                </c:forEach>
            </form>
        </div>
        <div>
            <iframe name="icerik"></iframe>
        </div>
    </div>
</body>
</html>


<script src="<c:url value="/resources/static/js/Home.js"/>"></script>