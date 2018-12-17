package pg_72;

import java.util.Scanner;

public class Quest_19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE A ALTURA DA PESSOA:");
        double alt = ler.nextDouble();
        System.out.println("DIGITE O SEXO DA PESSOA(M/H):");
        String sexo = ler.next();
        double peso = 0;
        
        if(sexo.equalsIgnoreCase("M")){
            peso = (62.1 * alt) - 44.7;
        }else{
            if(sexo.equalsIgnoreCase("H")){
                peso = (72.7 * alt) - 58;
            }else{
                System.out.println("SEXO INVÁLIDO!");
            }
        }
        System.out.println("PESO IDEAL É: " +peso);
         
    }
    
}
