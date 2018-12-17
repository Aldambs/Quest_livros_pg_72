package pg_72;

import java.util.Scanner;

public class Quest_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);       
        System.out.println("DIGITE TRÊS NÚMEROS:");
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        int num3 = ler.nextInt();
        int local;
        if(num1 > num2){
            local = num1;
        }else{
            local = num2;
        }
        if(local > num3){
            System.out.println("O NÚMERO MAIOE É: " +local);
        }else{
            System.out.println("O NÚMERO MAIOR É: " +num3);
        }
    }   
}
