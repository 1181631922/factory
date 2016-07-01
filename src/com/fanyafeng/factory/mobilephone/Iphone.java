package com.fanyafeng.factory.mobilephone;

import com.fanyafeng.factory.factory.MobilePhone;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class Iphone implements MobilePhone {

    @Override
    public void create() {
        System.out.println("手机名称:苹果");
        System.out.println("--系统:ios");
        System.out.println("--材料:塑料+金属");
        System.out.println("--屏幕:视网膜屏");
    }
}
