<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<c:import url="/resources/templates/AdminHeader.jsp"/>

<div class="manage-user-container">
    <form id="register-form" method="POST">
        <h2 class="admin-form-title">Manage Links</h2>
        <div class="table-wrapper">
            <table id="links-table">
                <tr>
                    <th>LinkID</th>
                    <th>Category</th>
                    <th>Title</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
            </table>
        </div>
    </form>
</div>

<script src="<c:url value="/resources/static/js/ManageLink.js"/>"></script>
