package pg_72;

import java.util.Scanner;

public class Quest_16 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O CÓDIGO DO PRODUTO:");
        int cod = ler.nextInt();
        System.out.println("DIGITE O PREÇO ATUAL DO PRODUTO:");
        double precoA = ler.nextDouble();
        double desc = 0, novoP = 0;
        
        if(precoA <= 30){
            desc = precoA * 0.0;
            novoP = precoA - desc;
        }
        if(precoA > 30 & precoA <= 100){
            desc = precoA * 0.10;
            novoP = precoA - desc;        
        }
        if(precoA > 100){
            desc = precoA * 0.15;
            novoP = precoA - desc;
        }
        System.out.println("O PREÇO ATUAL É: " +precoA);
        System.out.println("VALOR DO DESCONTO É: " +desc);
        System.out.println("NOVO PREÇO É: " +novoP);
    }
    
}
