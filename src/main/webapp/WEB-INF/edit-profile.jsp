<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Edit your information!" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/bootstrap.jsp" />
<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Edit your information information.</h1>
    <form action="/edit-profile" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input id="email" name="email" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="currentPassword">Current Password</label>
            <input id="currentPassword" name="password" class="form-control" type="password">
        </div>
        <div class="form-group">
            <label for="updatedPassword">New Password</label>
            <input id="updatedPassword" name="confirm_password" class="form-control" type="password">
        </div>
        <div class="form-group">
            <label for="confirm_password">Confirm New Password</label>
            <input id="confirm_password" name="confirm_password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block">
    </form>
</div>
</body>
</html>