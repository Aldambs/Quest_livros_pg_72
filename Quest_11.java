package pg_72;

import java.util.Scanner;

public class Quest_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O SALÁRIO DO FUNCIONÁRIO:");
        double salFun = ler.nextDouble();
        double aumento = 0, novoS = 0;
        
        if(salFun <= 300){
            aumento = salFun * 0.15;
            novoS = salFun + aumento;
        }
        if(salFun >= 300 && salFun < 600){
            aumento = salFun * 0.10;
            novoS = salFun + aumento;
        }
        if(salFun >= 600 && salFun <= 900){
            aumento = salFun * 0.05;
            novoS = salFun + aumento;
        }
        if(salFun > 900){
            aumento = salFun * 0;
            novoS = salFun + aumento;
        }
        System.out.println("O valor do aumento é: " +aumento);
        System.out.println("O novo salário é: " +novoS);
    } 
    
}
