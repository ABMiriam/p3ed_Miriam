/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawbank;

import java.util.Random;

/**
 *
 * @author miria
 */
public class cuentaBancaria {
   String IBAN;
   String titular;
   String tipoCuenta="";
   float saldo;
   float  movimientos[];
   int i=0;
   
    cuentaBancaria(){
    }
    cuentaBancaria (Persona p1){
        Random r = new Random();
        if (p1.esMayorEdad()==true){
        int d=0;
        this.titular=p1.nombre+" "+p1.apellido1+" "+p1.apellido2;
        this.IBAN="ES";
        for (int i=0; i<22; i++){
            d=r.nextInt(9);
            this.IBAN=this.IBAN+d;
        }
        movimientos = new float [20]; 
        if (p1.esJubilidado()){
            this.tipoCuenta="jubilado";
        }
        }
        else if (p1.esMayorEdad()==false){
            System.out.println ("ERROR. El titular debe ser mayor de edad");
        }
        
    }
//este es el metodo que imprime todos los datos    
    void imprimicion (){
   
        System.out.println ("El titular de la cuenta es: "+titular);
        System.out.println ("El núimero de cuenta es: "+IBAN);
        System.out.println ("Su saldo es de: "+saldo+"€");
        if (tipoCuenta.isEmpty()==false){System.out.println (tipoCuenta);}
    }

//y este metodo imprime todos los movimientos 
    void imprimicionMovimientos(){
        for (int i=0; i<20;i++){
            if (movimientos[i]!=0.0){
            System.out.println (movimientos[i]);
            }
        }
    }

//este metodo solo imprime el saldo de la cuenta
    void imprSaldo (){
        System.out.println ("Su saldo es: "+saldo+"€");
    }
    void ingresos (float ingreso){
        boolean volver=false;
        
        comprobarTresMil(ingreso);
        if (ingreso>0 && volver ==false){
            this.saldo=saldo+ingreso;
            arrayMovimientos(ingreso);
            volver=true;
            ingreso=0;
        }
    }
    void retirada (float retirada){
        boolean volver=false;
        
        comprobarTresMil(retirada);
        if (retirada>0 && volver ==false){
            if (saldo-retirada>-50){
                this.saldo=saldo-retirada;
                retirada=retirada-(retirada*2);
                arrayMovimientos (retirada);
                volver=true;
                retirada=0;
                
                if (saldo<0){
                    System.out.println ("AVISO: Saldo negativo.");
                }
            }
            else {
                System.out.println ("ERROR: operación NO ejecutada");
            }
        }
    }
    void arrayMovimientos (float movimiento){
        /*
        //La idea de este metodo es poder llamarlo desde ingresos y
        //tb desde retirada para que vaya actualizando el array
        //y poder tener acceso a todos los movimientos (como un histórico)
        */
         
        boolean terminar=false;
        
        
                if (terminar==false){
                    movimientos [i]=movimiento;
                    terminar=true;
                    i++;
                }
                
           
    }   
    void comprobarTresMil (float cantidad) {
        
        if (cantidad>=3000){
            System.out.println ("AVISO: notificar a Hacienda.");
        }
    
    }   
}
