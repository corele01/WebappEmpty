package com.ola.webappEmpty.utils;

import javax.servlet.http.HttpServletRequest;

public class FileUtil {
    public static String getURI(HttpServletRequest request){
        return request.getSession().getServletContext().getRealPath("/");
    }
}
