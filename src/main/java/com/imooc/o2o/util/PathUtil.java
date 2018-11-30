package com.imooc.o2o.util;

public class PathUtil {

    private static  String seperator =System.getProperty("file.seperator");

    public static String getImgBasePath(){
        String os =System.getProperty("os.name");  //获取操作系统名称
        String basePath ="";
        if(os.toLowerCase().startsWith("win")){
            basePath ="webapp/resources/images/productImg";
        }else {
            basePath ="/home/xiangze/image/"; //用于linux 这些服务器
        }
        basePath =basePath.replace("/",seperator );// 针对linux是反斜杠的路径
        return basePath;
    }

    /**
     * 依据不同需求返回项目子路径
     * @param shopId
     * @return
     */
    public static String  getShopImagePath(long shopId){
        String imagePath ="/upload/item/shop/"+shopId +"/";
        return imagePath.replace("/",seperator );
    }

}
