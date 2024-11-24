package com.example.app_streaming;

public class U {

    public static final String BASE_URL = "http://10.0.2.2:44382/api/Users";

    public static String checkNull (String value){
        if (value.equals("null")) {

            return "vazio";
        }
        else{
            return value;
        }
    }
}
