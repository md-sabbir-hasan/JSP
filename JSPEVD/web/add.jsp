<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-light text-center">
        <h1 class="jumborton">Add Student</h1>
    </div>
    <!--    start form-->
    <form action="StudentServlet"  method="post">
        <input type="hidden" name="action" value="add">
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Subject</label>
                <input type="text" class="form-control" id="email" name="email" placeholder="">
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Department</label>
                <input type="text" class="form-control" id="dob" name="dob" placeholder="">
             
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Marks</label>
                <input type="text" class="form-control" id="fee" name="fee" placeholder="">
            
            </div>        
        </div>

 

        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Save</button>

            </div>

            <div class="col-md-6">
                <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        </div>
    </form>

    <!--end form    -->
</div>


<%@include file="footer.jsp" %>