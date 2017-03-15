package com.wenky.srpingboot.learning;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * Created by ZhongWenjian on 2017/3/15.
 */
public class Test {

    public static void main(String[] args) throws Exception{
        String password = "spring";
        String[] arr = ConfigTools.genKeyPair(512);
        System.out.println("privateKey:" + arr[0]);
        System.out.println("publicKey:" + arr[1]);
        System.out.println("password:" +ConfigTools.encrypt(arr[0], password));
    }
}
