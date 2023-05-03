<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<c:import url="/resources/templates/CustomerHeader.jsp"/>

<div class="link-container">
    <h1>Order Your Favourite Foods!</h1>
    <h2 class="category-title" id="category-title">
        Category:
        <label onclick="" >Burger</label>
        <label onclick="" >Pizza</label>
        <label onclick="" >Drinks</label>
        <label onclick="" >Coffee</label>
        <label onclick="" >Desert</label>
        <label onclick="" >Sides</label>
    </h2>
    <table id="foods-table"></table>
</div>

<script src="<c:url value="/resources/static/js/FoodBox.js"/>"></script>
<script src="<c:url value="/resources/static/js/Home.js"/>"></script>
<c:import url="/resources/templates/Footer.jsp"/>