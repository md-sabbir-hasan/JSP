<jsp:useBean class="model.employee"  id="e" />
<%@page  import="dao.EmployeeDao" %>
<jsp:setProperty  name="e" property="*" />

<%
        
      EmployeeDao.delete(e.getId());
       
      response.sendRedirect("index.jsp");
    
           


%>
