package pg_72;

import java.util.Scanner;

public class Quest_02 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("DIGITE A PRIMEIRA NOTA: ");
       float nota1 = input.nextFloat();
       System.out.println("DIGITE A SEGUNDA NOTA: ");
       float nota2 = input.nextFloat();
       float media = (nota1 + nota2)/2;
       System.out.println("A MÉDIA É: " +media);
       
       if(media >= 0 & media < 4){
           System.out.println("REPROVADO!");
       }
       if(media >= 4 & media < 7){
           System.out.println("EXAME!");
       }
       if(media >= 7 & media <= 10){
           System.out.println("APROVADO!");
       }
    }
    
}
