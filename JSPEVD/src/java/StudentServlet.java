/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import dao.StudentDao;
import entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            if ("delete".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                StudentDao.delete(id);
                response.sendRedirect("home.jsp");
            } else if ("edit".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                Student s = StudentDao.getById(id);
                request.setAttribute("student", s);
                request.getRequestDispatcher("home.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");

        try {
            if ("add".equals(action)) {
                Student s = new Student();
                s.setName(request.getParameter("name"));
                s.setEmail(request.getParameter("email"));
                s.setDob(request.getParameter("dob"));
                s.setFee(Double.parseDouble(request.getParameter("fee")));
               
                StudentDao.save(s);
                response.sendRedirect("home.jsp");
            } else if ("update".equals(action)) {
                Student s = new Student();
                s.setId(Integer.parseInt(request.getParameter("id")));
                s.setName(request.getParameter("name"));
                s.setEmail(request.getParameter("email"));
                s.setDob(request.getParameter("dob"));
                s.setFee(Double.parseDouble(request.getParameter("fee")));
               
              
                StudentDao.updateStudent(s);
                response.sendRedirect("home.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }


}
