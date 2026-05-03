
package dao;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Emp;
import util.DbUtil;


public class EmpDao {
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    
        public static int saveEmp(Emp e) {
        int status = 0;
        sql = "insert into emp(name, email, salary, joinDate) values(?,?,?,?)";

      
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setDouble(3, e.getSalary());
            ps.setString(4, e.getJoinDate());

            status = ps.executeUpdate();

            ps.close();
            DbUtil.getCon().close();
            
            System.out.println("------------------------");
        } catch (SQLException ex) {
            System.getLogger(EmpDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return status;


    }
        
        public static List<Emp> getAllEmp() {
            List<Emp> emps = new ArrayList<>();
        sql = "select * from emp";

      
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
             rs = ps.executeQuery();

            while (rs.next()) {
                Emp e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary"),
                        rs.getString("joinDate")
                );

                emps.add(e);

            }

            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            System.getLogger(EmpDao.class.getName()).log(Level.ERROR, (String) null, ex);
        }


      

        return emps;
    
        }
        
        
        public static void deleteEmp(int id) {
        sql = "delete from emp where id= ?";

        
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
             ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            DbUtil.getCon().close();
        } catch (SQLException ex) {
            System.getLogger(EmpDao.class.getName()).log(Level.ERROR, (String) null, ex);
        }
        }
        
        public static Emp getById(int id) {
            Emp e = null;
        sql = "select * from emp where id=?";

      
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
             ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
               e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary"),
                        rs.getString("joinDate")
                        
                );
            }

            rs.close();
            ps.close();
            DbUtil.getCon().close();
        } catch (SQLException ex) {
            System.getLogger(EmpDao.class.getName()).log(Level.ERROR, (String) null, ex);
        }
             return e;
        }
        
        public static int updateEmp(Emp e) {
        int status = 0;
        sql = "update emp set name= ?, email=?, salary= ?, joinDate= ? where id=?";

        
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
             ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setDouble(3, e.getSalary());
            ps.setString(4, e.getJoinDate());

            status = ps.executeUpdate();

            ps.close();
            DbUtil.getCon().close();
        } catch (SQLException ex) {
            System.getLogger(EmpDao.class.getName()).log(Level.ERROR, (String) null, ex);
        }
        return status;
        }
    
}
