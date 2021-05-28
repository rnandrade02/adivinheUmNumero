package com.rodrigonogueira;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sorteio {
    private int numeroDigitado,numeroGerado,contador;
    Random gerador = new Random();
    ArrayList lista = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    //String para mudar a cor dos textos
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_PURPLE = "\u001B[35m";



    public void menuJogo() throws InterruptedException {
        System.out.println(ANSI_PURPLE+"            ---- ADIVINHE O NÚMERO -----");
        System.out.println("Bem-Vindo ao nosso jogo!");
        System.out.print("Vamosa começar? Quantos números deseja embaralhar?:");
        setNumeroGerado(scanner.nextInt());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Certo... Aguarde um momento enquanto estou gerando um número!");
        for(int x=0;x<5;x++){
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }

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
}
