package com.automationPractice.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();
    static {

        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties.load(input);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }
}