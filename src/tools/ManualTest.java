/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import daos.RegionDao;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 *
 * @author ASUS
 */
public class ManualTest {

    public static void main(String[] args) {
        Connections connections = new Connections();

        System.out.println(connections.getConnection());

        RegionDao regionDao = new RegionDao();
        List<Region> regions = new ArrayList<>();

        Region region = new Region();
//        System.out.println(regionDao.createRegion(new Region(10, "Ipul")));
        //regionDao.deleteRegion(6); //function deleteRegion delete di class RegionDao
//         regionDao.updateRegion(6, "Surabaya"); //function updateRegion update di class RegionDao

//        List<Region> regionss = new ArrayList<>();
//        regionss = regionDao.searchRegion("ame");

//        regions = regionDao.selectRegions();
//        Region region = new Region();
//        region = regionDao.selectById(2);
//        System.out.println(region.getId() + " " + region.getName());
//
//        for (Region r : regions) { //ini foreach
//            System.out.println(r.getId() + " " + r.getName());
//        }
//         ini pakai controller
        RegionController regionController = new RegionController();
        System.out.println(regionController.create("11", "Andi"));
//        System.out.println(regionController.delete("9"));
//menampilkan data versi 1
        for (Region region1 : regionController.getAll()) {
            System.out.println(region1.getId() + " " + region1.getName());
        }
//menampilkan data versi 2
//        regionController.getAll().forEach((region1) -> {
//            System.out.println(region1.getId() + " " + region1.getName());
//        });

    }
}
