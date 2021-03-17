<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<div>
<%--    <h1>Welcome, ${sessionScope.user.username}</h1>--%>
    <h1>Here are all of your ads!</h1>
</div>
<c:forEach var="userad" items="${userAds}">
    <div class="col-md-6">
        <h2><c:out value="${userad.title}"/></h2>
        <p><c:out value="${userad.description}"/></p>
    </div>
</c:forEach>


</body>
</html>


