package com.tsps.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: luxinnan
 * @Date: 2020/5/4 16:40
 * @Discription:
 * @Modified:
 */
public class MD5Util {
    public static String toMD5(String str) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        return new BigInteger(1, md.digest()).toString(16);
    }
}
