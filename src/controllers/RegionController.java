/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDao;
import models.Region;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class RegionController {

    private RegionDao dao;

    public RegionController() {
        this.dao = new RegionDao();
    }

    public RegionController(RegionDao dao) {
        this.dao = dao;
    }

    public String create(String id, String name) {
 //       String message = "Failed to Create Region";
        //versi 1 panjang 
//        Region region=new Region();
//        int ids=Integer.parseInt(id);
//        region.setId(ids);
//        region.setName(name);
    
// Versi 2 lebih pendek dari diatas 
//        if (this.dao.createRegion(new Region(Integer.parseInt(id), name))) {
//            message  = "Success to Create Region";
//        }
        
//versi 3        lamda Expression lebih pendek dari versi 2
            return this.dao.createRegion(new Region(Integer.parseInt(id),name)) ?
                    "Failed to Create Region" : "Success to Create Region";
    }
    public String update(String id, String name){
        return this.dao.updateRegion(new Region(Integer.parseInt(id),name)) ?
                "Failed to Update data" : "Success to Update Data";
    }
    
    public String delete(String id){
        return this.dao.deleteRegion(new Region(Integer.parseInt(id)))?
                "Failed to Delete Data" : "Success to Delete Data";
    }
    
    public List<Region> getAll(){
        return this.dao.selectRegions();
    }
    public Region selectById(String id){
        return this.dao.selectById(Integer.parseInt(id));
    }
    public Region selectByName(String name){
        return this.dao.selectByName(name);
    }
    public List<Region> search(String key){
        return this.dao.searchRegion(key);
    }
}
