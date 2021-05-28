package com.rodrigonogueira;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sorteio {
    private int numeroDigitado, numeroGerado, contador;
    Random gerador = new Random();
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    //String para mudar a cor dos textos
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_RESET = "\u001B[0m";


    public void menuJogo() throws InterruptedException {
        System.out.println(ANSI_PURPLE + "            ---- ADIVINHE O NÚMERO -----");
        System.out.println("Bem-Vindo ao nosso jogo!");
        System.out.print("Vamosa começar? Quantos números deseja embaralhar?:");
        setNumeroGerado(scanner.nextInt());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Certo... Aguarde um momento enquanto estou gerando um número!");
        for (int x = 0; x < 5; x++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("\nPronto! Já estou com o número aqui... Tenta adivinhar qual é :) ");
        TimeUnit.SECONDS.sleep(3);


    }

    public boolean estrutura() throws InterruptedException {

        System.out.print(ANSI_PURPLE + "\nTente um número:");
        setNumeroDigitado(scanner.nextInt());

        if (getNumeroDigitado() == getNumeroGerado()) {

            System.out.println(ANSI_GREEN + "parabéns! Você acertou o número" );
            System.out.println("Foram:"+contador+" Tentativas até você acerta.");
            System.out.println("Deseja Recomeçar o Jogo?\n1 - Sim\n2- Não "+ ANSI_RESET);
            int resposta = scanner.nextInt();
            if ((resposta == 1)) {
                lista.clear();
                menuJogo();
            } else {

                System.out.println(ANSI_GREEN +"Obrigado por jogar! Até a próxima");
                return false;
            }

        } else {
            if (getNumeroGerado() > getNumeroDigitado()) {
                System.out.println(ANSI_RED + "Número Errado! Não desista. O número gerado é SUPERIOR que:" + getNumeroDigitado() + ANSI_RESET);
                contador++;
                lista.add(getNumeroDigitado());
                System.out.print("Números já digitados:");
                for (Integer list : lista){
                    System.out.print(" "+list+" ");
                }
            } else {
                System.out.println(ANSI_RED + "Número Errado! Não desista. O número gerado é INFERIOR que:" + getNumeroDigitado() + ANSI_RESET);
                contador++;
                lista.add(getNumeroDigitado());
                System.out.print("Números já digitados:");
                for (Integer list : lista){
                    System.out.print(" "+list+" ");
                }

            }


        }
        return true;

    }

    public int getNumeroDigitado() {
        return numeroDigitado;
    }

    public void setNumeroDigitado(int numeroDigitado) {
        this.numeroDigitado = numeroDigitado;
    }

    public void setNumeroGerado(int qtdnumeros) {
        this.numeroGerado = gerador.nextInt(qtdnumeros);
    }

    public int getNumeroGerado() {
        return numeroGerado;
    }

}