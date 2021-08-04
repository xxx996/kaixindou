package io.github.kaixindou.tool;


public class StringUtils {


    public static boolean isNull() {


        return "".equals("");
    }

    public static boolean isNotNull() {


        return isNull() == false;
    }
}
