/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import dao.EmpDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Emp;

/**
 *
 * @author User
 */
@WebServlet(name = "EmpServlet", urlPatterns = {"/EmpServlet"})
public class EmpServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmpServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmpServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            EmpDao.deleteEmp(Integer.parseInt(request.getParameter("id")));
            response.sendRedirect("allemp.jsp");
        } else if ("edit".equals(action)) {

            Emp e = EmpDao.getById(Integer.parseInt(request.getParameter("id")));
            request.setAttribute("emp", e);
            request.getRequestDispatcher("editemp.jsp").forward(request, response);
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {

            Emp emp = new Emp();
            
            emp.setName(request.getParameter("name"));
            emp.setEmail(request.getParameter("email"));
            emp.setSalary(Double.parseDouble(request.getParameter("salary")));
            emp.setJoinDate(request.getParameter("joinDate"));
            
            System.out.println("name "+ emp.getName());
            
            EmpDao.saveEmp(emp);

            response.sendRedirect("allemp.jsp");
        } else if ("update".equals(action)) {

            Emp emp = new Emp();
            emp.setName(request.getParameter("name"));
            emp.setEmail(request.getParameter("email"));
            emp.setSalary(Double.parseDouble(request.getParameter("salary")));
            emp.setJoinDate(request.getParameter("joinDate"));
            emp.setId(Integer.parseInt(request.getParameter("id")));

            EmpDao.updateEmp(emp);
            response.sendRedirect("allemp.jsp");

        }

    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
