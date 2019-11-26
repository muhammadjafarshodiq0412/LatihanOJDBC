/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Country;
import models.Region;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class CountryControllerTest {
    
    public CountryControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class CountryController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String name = "Karawang";
        String region_id = "1";
        String id = "ZK";
        CountryController instance = new CountryController();      
        String expResult = "Success to Create Country";
        String result = instance.create(name, region_id, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CountryController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String name = "Jakarta";
        String region_id = "3";
        String id = "ZZ";
        CountryController instance = new CountryController();
        String expResult = "Success to Update Country";
        String result = instance.update(name, region_id, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CountryController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "ZZ";
        CountryController instance = new CountryController();
        String expResult = "Success to Delete Data";
        String result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class CountryController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CountryController instance = new CountryController();
        List<Country> expResult = new ArrayList<Country>();
        List<Country> result = instance.getAll();
        assertEquals(expResult.contains(this), result.contains(this));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of selectById method, of class CountryController.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        String id = "ZW";
        CountryController instance = new CountryController();
        Country expResult = new Country("ZW");
        Country result = instance.selectById(id);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class CountryController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String key = "Jakarta";
        CountryController instance = new CountryController();
        List<Country> expResult = new ArrayList<Country>();
        List<Country> result = instance.search(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
