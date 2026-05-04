<jsp:useBean class="model.employee"  id="e" />
<%@page  import="dao.EmployeeDao" %>
<jsp:setProperty  name="e" property="*" />

<%
        
        int result=EmployeeDao.save(e);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>