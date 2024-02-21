/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_9_contrusctores;

/**
 *
 * @author invitado
 */
public class CuentaBancaria {
    private double saldo;
    private int noCuenta;
    private String cliente;
    
    //Constructor default
     public CuentaBancaria(){
         noCuenta = 0;
         cliente = "Sin cliente";
         saldo = 1000000;
     }       
    
    //get y set
    public int getNoCuenta(){
        return noCuenta;
    }
    public void setNoCuenta(int cuenta){
        noCuenta = cuenta;
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String nomCliente){
        cliente = nomCliente;
    }
    public double getSaldo(){
        return saldo;
    }
    public void retirar(double monto){
        if(saldo >= monto)//hay que tener dinero
            saldo = saldo - monto;
    }
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
        
     
}
