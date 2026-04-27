<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<%
    List<Student> list = StudentDao.getAllStudents();
    request.setAttribute("list", list);
%>


<div class="container my-5">
    <h1 class="text-primary text-center mb-4">All Students</h1>

    <table class="table table-bordered table-hover">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Date of Birth</th>
                <th>Fee</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.email}</td>
                    <td>${s.dob}</td>
                    <td>${s.fee}</td>
                    <td>
                        <a href="StudentServlet?action=edit&id=${s.id}" class="btn btn-sm btn-primary">Edit</a>
                        <a href="StudentServlet?action=delete&id=${s.id}" class="btn btn-sm btn-danger"
                           onclick="return confirm('Are you sure you want to delete this student?');">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="footer.jsp" %>