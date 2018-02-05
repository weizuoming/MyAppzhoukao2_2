package com.example.hello.myweizuoming20171021.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by 韦作铭 on 2017/10/21.
 */

public class StringUtil {
    public static String streamToString(InputStream inputStream, String charset) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,charset);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = null;
            StringBuilder builder = new StringBuilder();
            while ((s = bufferedReader.readLine()) != null){
                builder.append(s);
            }

            bufferedReader.close();
            return builder.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return  null;
    }
}
