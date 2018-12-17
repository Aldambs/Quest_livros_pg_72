package pg_72;

import java.util.Scanner;

public class Quest_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("====== MENU =====");
        System.out.println("1. Média\n"
                + "2. Diferença\n"
                + "3. Produto\n");
        int op = 0;
        System.out.println("Digite a opção:");
        op = ler.nextInt();

        if (op == 1) {
            System.out.println("Digite o primeiro número:");
            float num1 = ler.nextFloat();
            System.out.println("Digite o segundo número:");
            float num2 = ler.nextFloat();

            float media = (num1 + num2) / 2;
            System.out.println("A média é: " + media);
        }
        if (op == 2) {
            System.out.println("Digite o primeiro número:");
            float num1 = ler.nextFloat();
            System.out.println("Digite o segundo número:");
            float num2 = ler.nextFloat();

            float dif = num1 - num2;
            System.out.println("A diferença é: " + dif);
        }
        if (op == 3) {
            System.out.println("Digite o primeiro número:");
            float num1 = ler.nextFloat();
            System.out.println("Digite o segundo número:");
            float num2 = ler.nextFloat();

            float prod = num1 * num2;
            System.out.println("O produto é: " + prod);
        }
       
        if (op != 1 & op != 2 & op != 3 ) {
            System.out.println("Opçao inválida!");
        }
    }

}
    