<%@ page import="entity.Student" %>
<%@include file="header.jsp" %>

<%
    Student s = (Student) request.getAttribute("student");
%>


<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Edit Student</h1>
    </div>
    <!--    start form-->
    <form action="StudentServlet"  method="post">
        
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="<%= s.getId() %>">
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" name="name" value="<%= s.getName() %>" required>
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Email</label>
               <input type="email" class="form-control" name="email" value="<%= s.getEmail() %>" required>
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Date of Birth</label>
                <input type="date" class="form-control" name="dob" value="<%= s.getDob() %>" required>
             
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Fee</label>
                <input type="text" class="form-control" name="fee" value="<%= s.getFee() %>" required>
            
            </div>        
        </div>

 

        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Update</button>

            </div>

            <div class="col-md-6">
                <a href="home.jsp" class="btn btn-secondary w-100">Cancel</a>

            </div>
        </div>
    </form>

    <!--end form    -->
</div>
                
                <%@include file="footer.jsp" %>