package pg_72;

import java.util.Scanner;

public class Quest_21 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("INFORME O CÓDIGO DE ORIGEM:");
        int cod = ler.nextInt();

        if (cod == 1) {
            System.out.println("INFORME O PREÇO DO PRODUTO:");
            double preco = ler.nextDouble();
            System.out.println("A procedência é SUL");
        } else 
            if (cod == 2) {
                System.out.println("INFORME O PREÇO DO PRODUTO:");
                double preco = ler.nextDouble();
                System.out.println("A procedência é NORTE");
            }else{
                if(cod == 3){
                    System.out.println("INFORME O PREÇO DO PRODUTO:");
                    double preco = ler.nextDouble();
                    System.out.println("A procedência é LESTE");
                }else{
                    if(cod == 4){
                        System.out.println("INFORME O PREÇO DO PRODUTO:");
                        double preco = ler.nextDouble();
                        System.out.println("A procedência é OESTE");
                    }else{
                        if(cod == 5 || cod == 6){
                            System.out.println("INFORME O PREÇO DO PRODUTO:");
                            double preco = ler.nextDouble();
                            System.out.println("A procedência é NORDESTE");
                        }else{
                            if(cod == 7 || cod == 8 || cod == 9){
                                System.out.println("INFORME O PREÇO DO PRODUTO:");
                                double preco = ler.nextDouble();
                                System.out.println("A procedência é SUDESTE");
                            }else{
                                if(cod >= 10 && cod <= 20){
                                    System.out.println("INFORME O PREÇO DO PRODUTO:");
                                    double preco = ler.nextDouble();
                                    System.out.println("A procedência é CENTRO OESTE");
                                }else{
                                    if(cod >= 21 && cod <= 30){
                                        System.out.println("INFORME O PREÇO DO PRODUTO:");
                                        double preco = ler.nextDouble();
                                        System.out.println("A procedência é NORDESTE");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }

    }
