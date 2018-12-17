package pg_72;

import java.util.Scanner;

public class Quest_15 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("INFORME O TIPO DE INVESTIMENTO:\n"
                 + "1. POUPANÇA\n"
                 + "2. FUNDOS DE RENDA\n");
         double tipInv = ler.nextDouble();     
         double valorC = 0, valorIn;
         
         if(tipInv == 1){
             System.out.println("DIGITE O VALOR DO INVESTIMENTO:");
             valorIn = ler.nextDouble();
             valorC = valorIn + ((valorIn * 3)/100); 
         }
         if(tipInv == 2){
              System.out.println("DIGITE O VALOR DO INVESTIMENTO:");
              valorIn = ler.nextDouble();
              valorC = valorIn + ((valorIn * 4)/100);
         }else{
             if(tipInv != 1 && tipInv != 2){
                 System.out.println("OPÇÃO INVÁLIDA!");
            }
        }        
         System.out.println("O VALOR CORRIGIDO É:\n" +valorC);
    }
    
}
