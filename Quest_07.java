package pg_72;

import java.util.Scanner;

public class Quest_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double sal_base, sal_reajustado;
        System.out.println("Digite o salário base do funcionário:");
        sal_base = ler.nextDouble();
        if(sal_base <= 500){
            sal_reajustado = sal_base + (sal_base * 0.3);
            System.out.println("O salário reajustado é: " + sal_reajustado);
        }else{
            System.out.println("O funcinário não merece ");
        }
    }
    
}
