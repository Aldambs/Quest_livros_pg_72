/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg_72;

import java.util.Scanner;

/**
 *
 * @author SONIA
 */
public class Quest_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O SALÁRIO DO FUNCIONÁRIO:");
        double salFun = ler.nextDouble();
        double valorR = 0;
        
        if(salFun <= 350){
            valorR = (salFun + 100) - 0.07;
        }
        if(salFun > 350 && salFun <= 600){
            valorR = (salFun + 75) - 0.07;
        }
        if(salFun > 600 && salFun <= 900){
            valorR = (salFun + 50) - 0.07;
        }
        if(salFun > 900){
            valorR = (salFun + 35) - 0.07;
        }
        System.out.println("O VALOR A RECEBER É: " +valorR);
    }  
}
