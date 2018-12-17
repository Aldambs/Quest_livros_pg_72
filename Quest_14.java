package pg_72;

import java.util.Scanner;

public class Quest_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O SALÁRIO DO FUNCIONÁRIO:");
        double salFun = ler.nextDouble();
        double novoSal = 0;
        
        if(salFun <= 300){
            novoSal = salFun + (salFun * 0.50);
        }
        if(salFun > 300 && salFun <= 500){
            novoSal = salFun + (salFun * 0.40);
        }
        if(salFun > 500 && salFun <= 700){
            novoSal = salFun + (salFun * 0.30);
        }
        if(salFun > 700 && salFun <= 800){
           novoSal = salFun + (salFun * 0.20);
        }
        if(salFun > 800 && salFun <= 1000){
           novoSal = salFun + (salFun * 0.10);
        }
        if(salFun > 1000){
           novoSal = salFun + (salFun * 0.05);
        }
        System.out.println("O NOVO SALÁRIO É: " +novoSal);
    }
    
}
