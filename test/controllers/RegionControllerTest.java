/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
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
public class RegionControllerTest {
    
    public RegionControllerTest() {
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
     * Test of create method, of class RegionController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String id = "7";
        String name = "Latin";
        RegionController instance = new RegionController();
        String expResult = "Success to Create Region";
        String result = instance.create(id, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RegionController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String id = "7";
        String name = "Amerika Latin";
        RegionController instance = new RegionController();
        String expResult = "Success to Update Data";
        String result = instance.update(id, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RegionController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "7";
        RegionController instance = new RegionController();
        String expResult = "Success to Delete Data";
        String result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class RegionController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        RegionController instance = new RegionController();
        List<Region> expResult = new ArrayList<Region>();
        List<Region> result = instance.getAll();
        assertEquals(expResult.contains(this), result.contains(this));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of selectById method, of class RegionController.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        String id = "7";
        RegionController instance = new RegionController();
        Region expResult = new Region("7");
        Region result = instance.selectById(id);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByName method, of class RegionController.
     */
    @Test
    public void testSelectByName() {
        System.out.println("selectByName");
        String name = "Asia";
        RegionController instance = new RegionController();
        Region expResult = new Region("Asia");
        Region result = instance.selectByName(name);
        assertEquals(expResult.getName(), result.getName());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class RegionController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String key = "";
        RegionController instance = new RegionController();
        List<Region> expResult = new ArrayList<Region>();
        List<Region> result = instance.search(key);
        assertEquals(expResult.contains(key), result.contains(key));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
