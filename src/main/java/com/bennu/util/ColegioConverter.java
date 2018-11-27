/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.util;

import com.bennu.controller.ColegiosController;
import com.bennu.entities.Colegio;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author fabyo
 */
@FacesConverter(value = "colegioConverter")
public class ColegioConverter implements Converter{
    
    @Override
    public Object getAsObject(FacesContext ctx, UIComponent uiComponent, String s) {
        ValueExpression vex = ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(),"#{colegioC}", ColegiosController.class);
        ColegiosController c = (ColegiosController)vex.getValue(ctx.getELContext());
        return c.getColegio(Integer.valueOf(s));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object colegio) {
        return ((Colegio)colegio).getId().toString();
    }

    
}
