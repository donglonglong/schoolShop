package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

import java.util.List;

public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    List<Shop> select();

}
