/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import tools.Connections;
import java.util.List;
import models.Employees;

/**
 *
 * @author ASUS
 */
public class EmployeesDao {

    Connection connection;

    public EmployeesDao() {
        this.connection = new Connections().getConnection();
    }

    public List<Employees> selectCountries() {
        List<Employees> employeeses = new ArrayList<>();
        String query = "Select * from employees";
//        String query = "Select"
//                + " c.country_id,c.country_name,r.region_name,r.region_id "
//                + "from "
//                + " countries c "
//                + "JOIN"
//                + " regions r "
//                + "ON"
//                + " c.region_id = r.region_id "
//                + "order by 1";

        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employees employees = new Employees();
                employees.setId(rs.getInt(1));
                employees.setFirst_name(rs.getString(2));
                employees.setLast_name(rs.getString(3));
                employees.setEmail(rs.getString(4));
                employees.setPhone(rs.getString(5));
                employees.setHire(rs.getDate(6));
                employees.setJob_id(rs.getString(7));
                employees.setSalary(rs.getInt(8));
                employees.setCommission(rs.getInt(9));
                employees.setManager(rs.getInt(10));
                employees.setDepart(rs.getInt(11));
                employeeses.add(employees);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeeses;
    }

    public boolean createCountry(Employees employees) {
        boolean result = false;
        String query = "Insert into employees(first_name , last_name , email , phone_number , hire_date ,"
                + "job_id , salary , commission_pct , manager_id , department_id ,"
                + "employee_id) "
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        return execute(query, employees);
    }

//    public boolean updateCountry(Country country) {
//        boolean result = false;
//        String query = "Update countries set country_name = ? , region_id= ? "
//                + "where country_id = ? ";
//        return execute(query, country);
//    }
//
//    public boolean deleteCountry(Country country) {
//        boolean result = false;
//        String query = "Delete from countries where country_id= ?";
//        return execute(query, country);
//    }
//
//    public List<Country> searchCountry(String key) {
//        List<Country> country = new ArrayList<>();
//        String query = "select * from countries where country_id like ?"
//                + " OR lower(country_name) like ? ";
//        try {
//            PreparedStatement ps = this.connection.prepareStatement(query);
//            ps.setString(1, "%" + key + "%");
//            ps.setString(2, "%" + key + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) { //next itu untuk looping selanjutnya (karna yg di next adlh rs.next dan rs itu
//                Country country1 = new Country();
//                country1.setId(rs.getString(1)); // 1 itu untuk Column Index
//                country1.setName(rs.getString("country_name")); //ini panggil nama column
//                country1.setRegion(new Region(rs.getInt("region_id"), rs.getString("region_name")));
//                country.add(country1); //add itu untuk list
//            }
//
//        } catch (Exception e) {
//        }
//
//        return country;
//
//    }
//
//    public Country selectById(String id) {
//        Country country = new Country();
//        String query = "select * from countries where country_id = ?";
//        try {
//            PreparedStatement ps = this.connection.prepareStatement(query);
//            ps.setString(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                country.setId(rs.getString(1));
//                country.setName(rs.getString("country_name"));
//                country.setRegion(new Region(rs.getInt("region_id")));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return country;
//    }

    private boolean execute(String query, Employees employees) {
        boolean result = false;
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            if (employees.getFirst_name() == null) {
                ps.setInt(1, employees.getId());
            } else {
                ps.setString(1, employees.getFirst_name());
                ps.setString(2, employees.getLast_name());
                ps.setString(3, employees.getEmail());
                ps.setString(4, employees.getPhone());
                ps.setDate(5, employees.getHire());
                ps.setString(6, employees.getJob_id());
                ps.setInt(7, employees.getSalary());
                ps.setInt(8, employees.getCommission());
                ps.setInt(9, employees.getManager());
                ps.setInt(10, employees.getDepart());
                ps.setInt(11, employees.getId());
            }
            ps.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
