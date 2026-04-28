<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.employee"%>
<%@page import="dao.EmployeeDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<%
    List<employee> list = EmployeeDao.getAllEmployee();
    request.setAttribute("list", list);
%>

<div class="container my-5">
    <h1 class="text-primary text-center mb-4">All Employee</h1>

    <table class="table table-bordered table-hover">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Mobile</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="e">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.name}</td>
                    <td>${e.mobile}</td>
                    <td>${e.salary}</td>
                    <td>
                        <a href="editEmoloyeeForm.jsp?id=${e.id}" class="btn btn-sm btn-primary">Edit</a>
                        <a href="deleteEmployee.jsp?id=${e.id}" class="btn btn-sm btn-danger"
                           onclick="return confirm('Are you sure you want to delete this student?');">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="footer.jsp" %>