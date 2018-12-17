package pg_72;

import java.util.Scanner;

public class Quest_25 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O NÚMERO DE HORAS EXTRAS:");
        double hE = ler.nextDouble();
        System.out.println("DIGITE O NÚMERO DE HORAS FALTA:");
        double hF = ler.nextDouble();
        double valorP, H;
        H = hE - 2/3 * (hF);
        if(H > 2.400){
            System.out.println("O valor do prêmio é: " +H+ " R$500");
        }else{
            if(H > 1800 && H <= 2400){
                System.out.println("O valor do prêmio é: " +H+ " R$400"); 
            }else{
                if(H > 1200 && H < 1800){
                    System.out.println("O valor do prêmio é: " +H+ " R$300");
                }else{
                    if(H > 600 && H <= 1200){
                        System.out.println("O valor do prêmio é: " +H+ " R$200");
                    }else{
                        if(H < 600){
                            System.out.println("O valor do prêmio é: " +H+ " R$100");
                        }
                    }
                }
            }
        }
    }
    
}
