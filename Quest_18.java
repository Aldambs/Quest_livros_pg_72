package pg_72;

import java.util.Scanner;

public class Quest_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("DIGITE A IDADE DA PESSOA:");
        int id = ler.nextInt();
        
        if(id >= 18){
            System.out.println("JÁ É DE MAIOR!");
        }else{
            System.out.println("NÃO É DE MAIOR!");           
        }
    }
    
}
