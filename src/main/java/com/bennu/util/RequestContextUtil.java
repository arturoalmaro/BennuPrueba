/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author fabyo
 */
public class RequestContextUtil {
    
    private static final HttpServletRequest httpServletRequest;
    
    static{
        httpServletRequest=(HttpServletRequest)
                FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }
    
    
    public static String getContexPath(){
        return httpServletRequest.getContextPath();
    }
    
}
