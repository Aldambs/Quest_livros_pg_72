package pg_72;

import java.util.Scanner;

public class Quest_01 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("DIGITE A PRIMEIRA NOTA:");
        float nota1 = input.nextFloat();
        System.out.println("DIGITE A SEGUNDA NOTA:");
        float nota2 = input.nextFloat();
        System.out.println("DIGITE A TERCEIRA NOTA:");
        float nota3 = input.nextFloat();
        System.out.println("DIGITE A QUARTA NOTA:");
        float nota4 = input.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A MÉDIA É: " +media);
        
        if(media >= 7){
            System.out.println("APROVADO!");
        }else{
            System.out.println("REPROVADO!");
        }
    }
    
}
