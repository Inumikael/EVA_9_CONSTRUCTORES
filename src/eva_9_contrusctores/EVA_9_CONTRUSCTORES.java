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
public class EVA_9_CONTRUSCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("cliente " + cuenta.getCliente());
        System.out.println("cuenta: " + cuenta.getNoCuenta());
        System.out.println("saldo " + cuenta.getSaldo());
    }
    
}
