package pg_72;

import java.util.Scanner;

public class Quest_22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE A IDADE:");
        int id = ler.nextInt();
        System.out.println("DIGITE O PESO:");
        double peso = ler.nextDouble();

        if (id < 20) {
            if (peso <= 60) {
                System.out.println("GRUPO DE RISCO 9!");
            }
            if (peso > 60 && peso <= 90) {
                System.out.println("GRUPO DE RISCO 8!");
            }
            if (peso > 90) {
                System.out.println("GRUPO DE RISCO 7!");
            }
        } else {
            if (id >= 20 && id <= 50) {
                if (peso <= 60) {
                    System.out.println("GRUPO DE RISCO 6!");
                }
                if (peso > 60 && peso <= 90) {
                    System.out.println("GRUPO DE RISCO 5!");
                }
                if (peso > 90) {
                    System.out.println("GRUPO DE RISCO 4!");
                }
            }else{
                if (id > 50) {
                    if (peso <= 60) {
                        System.out.println("GRUPO DE RISCO 3!");
                    }
                    if (peso > 60 && peso <= 90) {
                        System.out.println("GRUPO DE RISCO 2!");
                    }
                    if (peso > 90) {
                        System.out.println("GRUPO DE RISCO 1!");
                    }
                }
            }
        }
    }
}
