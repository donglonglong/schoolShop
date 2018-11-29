package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("shopDap")
public interface ShopDao {



    /**
     * 分页查询店铺，可输入
     * @param shopCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition,
                             @Param("rowIndex") int rowIndex,
                             @Param("pageSize") int pageSize);


    /**
     * 返回queryShopList总数
     * @param shopCondition
     * @return
     */
    int queryShopCount(@Param("shopCondition") Shop shopCondition);

    /**
     * 通过employee id 查询店铺
     * @param employeeId
     * @return
     */
    List<Shop> queryByEmployeeId(long employeeId);

    /**
     * 通过owner id 查询店铺
     * @param shopId
     * @return
     */
    Shop queryByShopId(long shopId);

    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 更细店铺信息
     * @param shop
     * @return
     */
    int  updateShop(Shop shop);


    /**
     * 删除店铺（初版，只支持删除尚没有发布商品的店铺）
     * @param shopName
     * @return
     */
    int deleteShopByName(String shopName);

}
