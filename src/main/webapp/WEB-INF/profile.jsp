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
<%--                <form action="/profile" method="post">--%>
<%--                    <label>--%>
<%--                    <input  class="form-control" id="adId" type="text" v>--%>
<%--                </label>--%>
            </div>
            <br>
              <form action="/profile" method="post">
                                <div class="form-group">
                                    <br>
                                    <label for="adId">delete ad</label>
                                    <input id="adId" name="adId" class="form-control" type="text" value="${userad.id}">
                                </div>

                                <input type="submit" class="btn btn-block btn-primary">
                            </form>
        </div>
<%--        <button type="submit" class="btn btn-danger" id="${}">--%>
<%--            <label for ="submit">Delete--%>
<%--            </label>--%>
<%--            <input type="submit" id ="submit"class="btn btn-block btn-primary">--%>
        <a href="#" class="card-link">Another link</a>
    </div>

</c:forEach>

</body>
</html>


