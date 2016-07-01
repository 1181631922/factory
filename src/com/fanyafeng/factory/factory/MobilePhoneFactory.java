package com.fanyafeng.factory.factory;

import com.fanyafeng.factory.mobilephone.HuaWei;
import com.fanyafeng.factory.mobilephone.Iphone;
import com.fanyafeng.factory.mobilephone.Mi;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class MobilePhoneFactory {

    public MobilePhone getMobilePhone(String mobilePhone) {
        switch (mobilePhone) {
            case "Iphone":
                return new Iphone();
            case "HuaWei":
                return new HuaWei();
            case "Mi":
                return new Mi();
            default:
                return null;
        }

    }
}
