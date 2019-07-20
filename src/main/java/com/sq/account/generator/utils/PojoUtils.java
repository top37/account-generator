package com.sq.account.generator.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PojoUtils {

    /*jdk >= 1.7*/
    @SuppressWarnings("unchecked")
    public static <T> T deepCopy(T srcObj) {
        T targetObj = null;
        try
                (
                        ByteArrayInputStream bais = new ByteArrayInputStream(deepCopyRepo(srcObj, new ByteArrayOutputStream()).toByteArray());
                        ObjectInputStream ois = new ObjectInputStream(bais)
                )
        {
            targetObj = (T) ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return targetObj;
    }
    public static ByteArrayOutputStream deepCopyRepo(Object obj,ByteArrayOutputStream baos) throws Exception {
        try
                (
                        ObjectOutputStream oos = new ObjectOutputStream(baos)
                )
        {
            oos.writeObject(obj);
        }
        return baos;
    }
}
