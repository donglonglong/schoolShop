package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;

import java.util.List;
public interface AreaDao {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    int  insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);


}
