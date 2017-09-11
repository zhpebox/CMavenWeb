package com.peng.test;

import com.thrift.test.User;

import java.io.*;
import java.util.Properties;

public class CommonUtil {

    /**
     * 加载读取配置文件
     * @return
     * @throws Exception
     */
    public static Properties initProp() throws Exception {
        Properties prop = new Properties();
        File file = new File(System.getProperty("user.dir").replaceAll("\\\\", "/"));
        InputStream in;
        if (file.exists()) {
            in = new BufferedInputStream(new FileInputStream(file));
            System.out.println("加载外部配置文件！" + System.getProperty("user.dir"));
            System.out.println();
        } else {
            in = ClassLoader.getSystemResourceAsStream("conf.properties");
            System.out.println("加载内部配置文件");
        }
        prop.load(in);
        return prop;
    }
}

