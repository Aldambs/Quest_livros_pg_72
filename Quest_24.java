package pg_72;

import java.util.Scanner;

public class Quest_24 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int categ;
        String situac, classif;
        double preco, percA = 0, percI, novoP, valI;

        System.out.println("DIGITE O PREÇO DO PRODUTO:");
        preco = ler.nextDouble();
        System.out.println("DIGITE O CÓDIGO DA CATEGORIA DO PRODUTO(1-LIMPEZA, 2-ALIMENTAÇÃO, 3-VESTUÁRIO):");
        categ = ler.nextInt();
        System.out.println("DIGITE A SITUAÇÃO(R-NECESSITA DE REFRIGERAÇÃO E N-NÃO NECESSITA DE REFRIGERAÇÃO):");
        char situa = ler.next().charAt(0);

        if (preco <= 25) {
            if(categ == 1){
                percA = preco * 0.05;       
            }else{
                if(categ == 2){
                    percA = preco * 0.08;
                }else{
                    if(categ == 3){
                        percA = preco * 0.10;
                    }else{
                        System.out.println("O CÓDIGO DA CATEGORIA NÃO SE ENCONTRA NO SISTEMA!");
                    }      
                }               
            }
        }
        if (preco > 25) {
            if(categ == 1){
                percA = preco * 0.13;       
            }else{
                if(categ == 2){
                    percA = preco * 0.15;
                }else{
                    if(categ == 3){
                        percA = preco * 0.18;
                    }else{
                       System.out.println("O CÓDIGO DA CATEGORIA NÃO SE ENCONTRA NO SISTEMA!"); 
                    }       
                }
            }
        }
        novoP = preco + percA;
        System.out.println("O valor do aumento é: " +preco);
        System.out.println("O novo valor é: " +novoP);
        
        if(categ == 2 || situa == 'R'){
            valI = novoP * 0.05;
        }else{
            valI = novoP * 0.08;
        }
        System.out.println("O valor do imposto é: " +valI);
        
        if(novoP <= 50){
            System.out.println("BARATO");
        }else{
            if(novoP > 50 && novoP < 120){
                System.out.println("NORMAL");
            }else{
                if(novoP >= 120){
                    System.out.println("CARO");
                }
            }
        }
    }
}
