<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light inline-block">
    <div>
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <form class="form-inline my-2 my-lg-0" action="/search">
            <label>
                <input class="form-control mr-sm-2" name="term" type="text" placeholder="search term">
            </label>
            <button>Search</button>
        </form>
        <ul class="nav navbar-nav navbar-right">
            <c:if test="${sessionScope.user == null}">
                <li><a href="/login">Login</a></li>
            </c:if>
            <c:if test="${sessionScope.user == null}">
                <li><a href="/register">Register</a></li>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <li><a href="/ads/create">Create A New Ad</a></li>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <li><a href="/features">Features</a></li>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <li><a href="/profile">Profile</a></li>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <li><a href="/edit-profile">Edit Profile</a></li>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <li><a href="/logout">Logout</a></li>
            </c:if>
        </ul>


    </div><!-- /.navbar-collapse -->
    <div>
    </div><!-- /.container-fluid -->
</nav>