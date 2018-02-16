package nz.co.kevorld.utils;

import java.util.HashMap;
import java.util.Map;

public class EnumUtil{

    private static Map<Object, Integer> enumMapper = new HashMap<>();

    public static <T> Integer EnumTypeCounter(T enumType){

        Integer count;

        if (enumMapper.get(enumType) == null){
            count = 1;
        } else {
            count = enumMapper.get(enumType) + 1;
        }

        enumMapper.put(enumType, count);

        return Boolean.valueOf(System.getProperty("enable.enum.counter"))? count : 1;
    }
}