package pg_72;

import java.util.Scanner;

public class Quest_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O CUSTO DE FÁBRICA:");
        double custoF = ler.nextDouble();
        double custoC;
        
        if(custoF <= 12.000){
            custoC = custoF + (custoF * 0.05);
            System.out.println("O custo a ser pago é: " +custoC);
        }
        if(custoF > 12.000 && custoF <= 25.000){
            custoC = custoF + (custoF * 0.10) + (custoF * 0.15);
            System.out.println("O custo a ser pago é: " +custoC);
        }
        if(custoF > 25.000){
            custoC = custoF + (custoF * 0.10) + (custoF * 0.15);
            System.out.println("O custo a ser pago é: " +custoC);
        }
    }   
}
