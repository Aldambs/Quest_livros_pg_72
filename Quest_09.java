package pg_72;

import java.util.Scanner;

public class Quest_09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O SALDO MÉDIO:");
        double saldo = ler.nextDouble();
        double valorCRED = 0;
        
        if(saldo > 400){          
            valorCRED = (saldo + (saldo * 0.30)); 
            
        }
        if(saldo < 400 && saldo > 300){
            valorCRED =  (saldo + (saldo * 0.25));
            
        }
        if(saldo < 300 && saldo > 200){
            valorCRED = (saldo + (saldo * 0.20));
            
        }
        if(saldo <= 200){
            valorCRED = (saldo + (saldo * 0.10));
            
        } 
        System.out.println("Saldo médio: " +saldo);
        System.out.println("Valor de crédito: " +valorCRED);
    }   
}
