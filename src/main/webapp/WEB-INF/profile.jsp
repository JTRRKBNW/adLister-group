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
<jsp:include page="/WEB-INF/partials/bootstrap.jsp"/>
<div>
    <%--    <h1>Welcome, ${sessionScope.user.username}</h1>--%>
    <h1>Here are all of your ads!</h1>
</div>


<c:forEach var="userad" items="${userAds}">
<div class="card" style="width: 18rem;">
    <div class="card-body">
        <div class="col-md-6 row">
            <h6 class="card-subtitle mb-2 text-muted"><c:out value="${userad.title}"/></h6>
            <p class="card-text"><c:out value="${userad.description}"/></p>
        </div>
        <a href="#" class="card-link">Card link</a>
        <a href="#" class="card-link">Another link</a>
        <br>
        </c:forEach>
    </div>
</div>


</body>
</html>


