package com.imooc.o2o.exception;

public class ShopOperationException extends RuntimeException{
    //接受错误的信息

    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String msg){
        super(msg);
    }
}
