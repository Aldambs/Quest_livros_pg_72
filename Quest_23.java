package pg_72;

import java.util.Scanner;

public class Quest_23 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("DIGITE O CÓDIGO:");
        int cod = ler.nextInt();
        System.out.println("DIGITE A QUANTIDADE DE PRODUTO:");
        int qtd = ler.nextInt();
        double  precoT = 0, desc = 0, precoF = 0;
        
        if(cod >= 1 && cod <= 10){
            precoT = qtd * 10;
            if(precoT <= 250){
                desc = (precoT * 5)/100;
                precoF = precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = (precoT * 10)/100;
                precoF = precoT - desc;
            }
            if(precoT > 500){
                desc = (precoT * 15)/100;
                precoF = precoT - desc;
            }
        }
        if(cod >= 11 && cod <= 20){
            precoT = qtd * 15;
            if(precoT <= 250){
                desc = (precoT * 5)/100;
                precoF = precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = (precoT * 10)/100;
                precoF = precoT - desc;
            }
            if(precoT > 500){
                desc = (precoT * 15)/100;
                precoF = precoT - desc;
            }        
        }
        if(cod >= 21 && cod <= 30){
            precoT = qtd * 20;
            if(precoT <= 250){
                desc = (precoT * 5)/100;
                precoF = precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = (precoT * 10)/100;
                precoF = precoT - desc;
            }
            if(precoT > 500){
                desc = (precoT * 15)/100;
                precoF = precoT - desc;
            }        
        }
        if(cod >= 31 && cod <= 40){
            precoT = qtd * 30;
            if(precoT <= 250){
                desc = (precoT * 5)/100;
                precoF = precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = (precoT * 10)/100;
                precoF = precoT - desc;
            }
            if(precoT > 500){
                desc = (precoT * 15)/100;
                precoF = precoT - desc;
            }        
        }
        System.out.println("O preço total é: R$ " +precoT);
        System.out.println("O valor do desconto é: R$ " +desc);
        System.out.println("O preço final é: R$ " +precoF);
    }    
}
