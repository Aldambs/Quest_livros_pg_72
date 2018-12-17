package pg_72;

import java.util.Scanner;

public class Quest_20 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        System.out.println("INFORME A IDADE DO NADADOR:");
        int id = ler.nextInt();
        
        if(id >= 5 && id <= 7){
            System.out.println("CATEGORIA INFANTIL!");
        }else{
            if(id >= 8 && id <= 10){
                System.out.println("CATEGORIA JUVENIL!");
            }else{
                if(id >= 11 && id <= 15){
                    System.out.println("CATEGORIA ADOLESCENTE!");
                }else{
                    if(id >= 16 && id <= 30){
                        System.out.println("CATEGORIA ADULTO!");
                    }else{
                        if(id > 30){
                            System.out.println("CATEGORIA SÊNIO!");
                        }
                    }
                }
            }
        }
    }
    
}
