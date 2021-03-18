<%--
  Created by IntelliJ IDEA.
  User: chief
  Date: 3/16/21
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Detailed View of Ad #${id}" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here is the additional information you requested.</h1>


    <div class="col-md-6">
        <h2>${displayAd.id} -- ${displayAd.title} </h2>
        <p>${displayAd.description}</p>
        <p>Posted by: ${displayUser.username}. Email: ${displayUser.email}</p>

        <c:if test="${isOwner}">
        <button type="button" class="btn btn-primary">Edit</button>
        <button type="submit" formmethod="post" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
            Delete

            </c:if>

        </button>




    </div>
</div>
</body>
</html>