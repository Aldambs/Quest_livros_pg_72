package pg_72;

import java.util.Scanner;

public class Quest_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário atual:");
        double salario = ler.nextDouble();
        double salReajust;
        if(salario < 300 || salario > 300){
            salReajust = salario + (salario * 0.35);
        }else{
            salReajust = salario + (salario * 0.15);
        }
        System.out.println("O salário reajustado é: " +salReajust);
    }
}
