<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<c:import url="/resources/templates/CustomerHeader.jsp"/>
    <script>
        function fetchLinks(destination) {
            if (destination === 'welcome') {
                window.location.href = 'welcome';
            } else if (destination == 'culture'){
                window.location.href = 'culture'
            } else if (destination == 'history'){
                window.location.href = 'history'
            } else if (destination == 'art'){
                window.location.href = 'art'
            }
        }
    </script>
<div class="link-container">
    <h1>Select Your Favourite Link Category!</h1>
    <h2 class="category-title" id="category-title">
        Category:
        <label onclick="fetchLinks('welcome')">TRAVEL</label>
        <label onclick="fetchLinks('history')" >HISTORY</label>
        <label onclick="fetchLinks('art')" >ART</label>
        <label onclick="fetchLinks('culture')" >CULTURE</label>
    </h2>
    <table id="link-table"></table>
</div>

<script src="<c:url value="/resources/static/js/Home.js"/>"></script>
