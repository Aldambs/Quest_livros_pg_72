package pg_72;

import java.util.Scanner;

public class Quest_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE DOIS NÚMEROS:");
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        if (num1 < num2) {
            System.out.println("O menor número é: " + num1);
        } else {
            if (num2 < num1) {
                System.out.println("O menor número é: " + num2);
            } else {
                if (num1 == num2) {
                    System.out.println("Os números são iguais!");
                }
            }
        }
    }

}
