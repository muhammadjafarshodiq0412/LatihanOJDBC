/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeesDao;
import java.sql.Date;
import models.Employees;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class EmployeesController {

    private EmployeesDao employeesDaoo;

    public EmployeesController() {
        this.employeesDaoo = new EmployeesDao();
    }

    public EmployeesController(EmployeesDao employeesDaoo) {
        this.employeesDaoo = employeesDaoo;
    }

    public String create(String first,String last, String email,String phone,Date hire, String job_id, int salary
            , int commision , int manager_id, int department, int id) {
        return employeesDaoo.createCountry(new Employees(first, last,  email, phone, hire,  job_id,  salary
            ,  commision ,  manager_id,  department,  id))
                ? "Failed to Create Country" : "Success to Create Country";
    }
//
//    public String update(String name, String region_id, String id) {
//        return countryDao.updateCountry(new Country(name, new Region(Integer.parseInt(region_id)), id))
//                ? "Failed to Update Country" : "Success to Update Country";
//    }
//
//    public String delete(String id) {
//        return countryDao.deleteCountry(new Country(id))
//                ? "Failed to Delete Data" : "Success to Delete Data";
//    }

    public List<Employees> getAll() {
        return employeesDaoo.selectCountries();
    }
//
//    public Country selectById(String id) {
//        return this.countryDao.selectById(id);
//    }
//
//    public List<Country> search(String key) {
//        return this.countryDao.searchCountry(key);
//    }

}
