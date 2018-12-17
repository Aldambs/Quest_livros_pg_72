package pg_72;

import java.util.Scanner;

public class Quest_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("DIGITE O PREÇO DO PRODUTO:");
        double preco = ler.nextDouble();
        double novoPre = 0;
        
        if(preco <= 50){
            novoPre = preco + (preco * 0.05);
        }
        if(preco > 50 & preco <= 100){
            novoPre = preco + (preco * 0.10);
        }
        if(preco > 100){
            novoPre = preco + (preco * 0.15);
        }
        System.out.println("NOVO PREÇO: " +novoPre);
        
        if(novoPre <= 80){
            System.out.println("BARATO");
        }
        if(novoPre >= 80 && novoPre <= 120){
            System.out.println("NORMAL");
        }
        if(novoPre >= 120 && novoPre <= 200){
            System.out.println("CARO");
        }
        if(novoPre > 200){
            System.out.println("MUITO CARO");
        }
    }
    
}
