/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrias;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author miria
 */
public class FiguraGeometric {
    String color="";
    String relleno="";
    String rellenado="";
    String fechadecreacion;
    
    
    FiguraGeometric(){
        Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
           // System.out.println(objDate);       
        String strDateFormat = "hh:mm:ss (a) dd-MMM-yyyy"; // El formato de fecha está especificado  
        SimpleDateFormat obj = new SimpleDateFormat(strDateFormat);
        this.fechadecreacion=obj.format(objDate);
    }
    //esta clase es nueva y la estoy desarrollando yo, en mi rama.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getRellenado() {
        return rellenado;
    }

    public void setRellenado(String rellenado) {
        this.rellenado = rellenado;
    }

    public String getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(String fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }
    
    public void Imprimir(){
    
        System.out.println (fechadecreacion);
        if (color.isEmpty()==false){System.out.println (color);}
        if (relleno.isEmpty()==false){System.out.println (relleno);}
        if (rellenado.isEmpty()==false){System.out.println (rellenado);}
    }
}