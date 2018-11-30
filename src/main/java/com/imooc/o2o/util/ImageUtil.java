package com.imooc.o2o.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


import net.coobird.thumbnailator.Thumbnails;

import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;



public class ImageUtil {


   private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath(); //获得当前执行的线程
   private static  final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
   private static  final Random r = new Random();//定义随机

    public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) {
        String realFileName = FileUtil.getRandomFileName();
        String extension = getFileExtension(thumbnail);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(FileUtil.getImgBasePath() + relativeAddr);
        try {
            Thumbnails.of(thumbnail.getInputStream()).size(200, 200).outputQuality(0.25f).toFile(dest);
        } catch (IOException e) {
            throw new RuntimeException("创建缩略图失败：" + e.toString());
        }
        return relativeAddr;
    }


    public static String generateNormalImg(CommonsMultipartFile thumbnail, String targetAddr) {
        String realFileName = FileUtil.getRandomFileName();
        String extension = getFileExtension(thumbnail);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(FileUtil.getImgBasePath() + relativeAddr);
        try {
            Thumbnails.of(thumbnail.getInputStream()).size(337, 640).outputQuality(0.5f).toFile(dest);
        } catch (IOException e) {
            throw new RuntimeException("创建缩略图失败：" + e.toString());
        }
        return relativeAddr;
    }

    public static List<String> generateNormalImgs(List<CommonsMultipartFile> imgs, String targetAddr) {
        int count = 0;
        List<String> relativeAddrList = new ArrayList<String>();
        if (imgs != null && imgs.size() > 0) {
            makeDirPath(targetAddr);
            for (CommonsMultipartFile img : imgs) {
                String realFileName = FileUtil.getRandomFileName();
                String extension = getFileExtension(img);
                String relativeAddr = targetAddr + realFileName + count + extension;
                File dest = new File(FileUtil.getImgBasePath() + relativeAddr);
                count++;
                try {
                    Thumbnails.of(img.getInputStream()).size(600, 300).outputQuality(0.5f).toFile(dest);
                } catch (IOException e) {
                    throw new RuntimeException("创建图片失败：" + e.toString());
                }
                relativeAddrList.add(relativeAddr);
            }
        }
        return relativeAddrList;
    }


    /**
     * 创建目标路径所涉及的目录，即 home work  xiangze 这三个文件夹自动创建
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = FileUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {  //判断文件夹是否存在
            dirPath.mkdirs();  //如果不存在继续创建文件夹
        }
    }



    /**
     * 获取输入文件流的扩展名
     * @param cFile
     * @return
     */
    private static String getFileExtension(CommonsMultipartFile cFile) {
        String originalFileName = cFile.getOriginalFilename();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }


    public static void main(String[] args) throws IOException {
        /**
         * 改变小黄人图片大小，加上水印，图片进行压缩
         */
        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath(); //获得当前执行的线程
        Thumbnails.of(new File("D:/JavaTest/o2o/src/main/webapp/resources/images/xiaohuangren.jpg"))
                .size(200,200 ).watermark(Positions.BOTTOM_RIGHT,
                ImageIO.read(new File(basePath+"/watermark.jpg")),0.9f).outputQuality(0.8f)
                .toFile("D:/JavaTest/o2o/src/main/webapp/resources/images/xiaohuangrenNew.jpg");

    }
}
