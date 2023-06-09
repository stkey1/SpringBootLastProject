<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<c:import url="/resources/templates/AdminHeader.jsp"/>

<div class="add-user-form">
    <form:form id="add-link-form" method="POST" action="add-link-action" modelAttribute="link">
        <h2 class="admin-form-title">Add links</h2>
        <fieldset>
            <div>
                <div>
                    <label class="form-label" for="category">Category</label>
                    <form:select class="form-input-box" id="category" path="category">
                        <form:option value="Link 1">TRAVEL</form:option>
                        <form:option value="Link 2">TRAVEL</form:option>
                        <form:option value="Link 3">TRAVEL</form:option>
                        <form:option value="Link 4">TRAVEL</form:option>
                        <form:option value="Link 5">TRAVEL</form:option>
                        <form:option value="Link 6">TRAVEL</form:option>
                        <form:option value="Link 7">TRAVEL</form:option>
                        <form:option value="Link 8">Sides</form:option>
                    </form:select>
                </div>
                <div>
                    <label class="form-label" for="link-name">link Name</label>
                    <form:input class="form-input-box" id="link-name" maxlength="30"
                                placeholder="Enter link name here" type="text" path="title"/>
                </div>
                <div>
                    <label class="form-label" for="price">Price</label>
                    <form:input class="form-input-box" id="price" maxlength="5"
                                placeholder="Enter price here" type="text" path="price"/>
                </div>
                <div>
                    <label class="form-label" for="description">Description</label>
                    <form:textarea id="description" name="description" class="link-description"
                                   placeholder="Enter link description here" rows="4" path="description"/>
                </div>
            </div>
        </fieldset>
        <p id="admin-prompt"></p>
        <div class="center">
            <input id="form-submit" type="submit" class="button" value="Add link">
        </div>
    </form:form>
</div>

<script src="<c:url value="/resources/static/js/Logic.js"/>"></script>
<script src="<c:url value="/resources/static/js/AddLink.js"/>"></script>
