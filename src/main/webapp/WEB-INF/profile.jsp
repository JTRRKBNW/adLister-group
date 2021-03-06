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
                <div>
                <h6 class="card-subtitle mb-2 text-muted"><c:out value="${userad.title}"/></h6>

                <p class="card-text"><c:out value="${userad.description}"/></p>
                    </div>
                <form action="/updateAdServlet" method="post">
                    <div class="form-group">
                        <br>
                        <label for="Id">Update Ad</label>
                        <input id="Id" name="Id" class="form-control" hidden type="text"  value="${userad.id}">
                        <label for="title">update title</label>
                        <input id="title" name="title" class="form-control"  type="text"  value="${userad.title}">
                        <label for="descript">update description</label>
                        <input id="descript" name="descript" class="form-control"  type="text"  value="${userad.description}">
                    </div>

                    <input type="submit" class="btn btn-block btn-primary">

                </form>
            </div>
            <br>
              <form action="/profile" method="post">
                                <div class="form-group">
                                    <br>

                                    <input id="adId" name="adId" class="form-control" hidden type="text"  value="${userad.id}">
                                </div>

                                <input id ="delete" type="submit" value="Delete" class="btn btn-block btn-danger">

                            </form>
        </div>
<%--        <button type="submit" class="btn btn-danger" id="${}">--%>
<%--            <label for ="submit">Delete--%>
<%--            </label>--%>
<%--            <input type="submit" id ="submit"class="btn btn-block btn-primary">--%>

    </div>

</c:forEach>

</body>
</html>


