package com.fanyafeng.factory;

import com.fanyafeng.factory.factory.MobilePhone;
import com.fanyafeng.factory.factory.MobilePhoneFactory;
import com.fanyafeng.factory.mobilephone.HuaWei;
import com.fanyafeng.factory.mobilephone.Iphone;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class Main {
    public static void main(String[] args) {
        MobilePhoneFactory mobilePhoneFactory=new MobilePhoneFactory();
        MobilePhone iphone=mobilePhoneFactory.getMobilePhone("Iphone");
        iphone.create();
        MobilePhone huawei=mobilePhoneFactory.getMobilePhone("HuaWei");
        huawei.create();
        MobilePhone mi=mobilePhoneFactory.getMobilePhone("Mi");
        mi.create();
    }
}
