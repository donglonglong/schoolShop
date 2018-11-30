package com.imooc.o2o.util;

public class PathUtil {

    public static String getImgBasePath(){
        String os =System.getProperty("os.name");
        String basePath ="";
        if(os.toLowerCase().startsWith("win")){
            basePath ="webapp/resources/images/productImg";
        }else {
            basePath ="/home/xiangze/image/"; //用于linux 这些服务器
        }
        return "";
    }
}
