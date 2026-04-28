package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.employee;
import util.Dbutil;

public class EmployeeDao {

    static Dbutil util = new Dbutil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int save(employee e) {
        int status = 0;
        sql = "insert into employee (name, mobile, salary) values(?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getMobile());
            ps.setDouble(3, e.getSalary());

            status = ps.executeUpdate();
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static void delete(int id) {
        sql = "delete from employee where id= ?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<employee> getAllEmployee() {
        List<employee> employee = new ArrayList<>();
        sql = "select * from employee";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                employee e = new employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("mobile"),
                        rs.getDouble("salary")
                );

                employee.add(e);

            }

            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employee;
    }

    public static int updateEmployee(employee e) {
        int status = 0;
        sql = "update employee set name= ?, mobile= ?, salary= ? where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getMobile());

            ps.setDouble(3, e.getSalary());
            ps.setInt(4, e.getId());

            status = ps.executeUpdate();

            System.out.println(status);

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static employee getById(int id) {
        employee e = null;
        sql = "select * from employee where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                e = new employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("mobile"),
                        rs.getDouble("salary")
                );
            }

            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

}
