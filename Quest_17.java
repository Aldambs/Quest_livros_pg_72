package pg_72;

import java.util.Scanner;

public class Quest_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE A SENHA:");
        int senha = ler.nextInt();
        
        if(senha == 4531){
            System.out.println("ACESSO PERMITIDO!");
        }else{
            System.out.println("ACESSO NEGADO!");
        }
    }
    
}
