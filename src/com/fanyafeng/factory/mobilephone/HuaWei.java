package com.fanyafeng.factory.mobilephone;

import com.fanyafeng.factory.factory.MobilePhone;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class HuaWei implements MobilePhone{
    @Override
    public void create() {
        System.out.println("手机名称:华为");
        System.out.println("--系统:ios");
        System.out.println("--材料:塑料+金属");
        System.out.println("--UI:EUI");
        System.out.println("--存储:内部,外部");
    }
}
