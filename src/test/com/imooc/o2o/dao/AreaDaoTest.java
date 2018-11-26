package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testqueryArea(){
        List<Area> areaList = areaDao.queryArea();
        assertEquals(5, areaList.size());
    }

    @Test
    public void insertArea(){
        Area area = new Area();
        area.setAreaName("区域1");
        area.setAreaDesc("区域1");
        area.setPriority(1);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1, effectedNum);
    }

    @Test
    public void testupdateArea(){
        Area area = new Area();
        area.setAreaId(7);
        area.setAreaName("ceshi1");
        area.setAreaDesc("ceshi介绍");
        area.setPriority(2);
        area.setLastEditTime(new Date());
        int affectedNum = areaDao.updateArea(area);
        assertEquals(1, affectedNum);
    }

    @Test
    public void deleteArea(){
        Area area = new Area();
        area.setAreaId(8);
        int affectedNum = areaDao.deleteArea(area.getAreaId());
        assertEquals(1, affectedNum);
    }



}
