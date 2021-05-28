package com.rodrigonogueira;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Sorteio sorteio = new Sorteio();

        //String para mudar a cor dos textos
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_PURPLE = "\u001B[35m";
        boolean iniciarjogo = true;
        sorteio.menuJogo();
        sorteio.setNumeroDigitado(scanner.nextInt());
        while (iniciarjogo){

        }

    }
}
