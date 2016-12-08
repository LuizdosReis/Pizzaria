/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.univali.kob.poo.pizzaria.io;

import java.util.Scanner;

/**
 *
 * @author Marcello Thiry
 */
public class ConsoleRead {

    /**
     * Abre um arquivo para leitura diretamente do console (System.in)
     *
     */
    private static Scanner in = new Scanner(System.in);

    /**
     * Lê uma linha do console
     *
     * @param caption Texto que identifica o que estÃ¡ sendo solicitado
     * (rÃ³tulo)
     * @return uma string com a linha lida
     */
    public static String readLine(String caption) {
        System.out.println(caption);
        String linha = in.nextLine();
        return linha;
    }

    /**
     * Lê uma string do console
     *
     * @param caption Texto que identifica o que estÃ¡ sendo solicitado
     * (rÃ³tulo)
     * @return uma string com a linha lida
     */
    public static String readlnString(String caption) {
        System.out.println(caption);
        String palavra = in.next();
        return palavra;
    }

    /**
     * Lê um int do console
     *
     * @param caption Texto que identifica o que estÃ¡ sendo solicitado
     * (rÃ³tulo)
     * @return um int a partir da conversÃ£o da linha lida
     */
    public static int readlnInt(String caption) {
        System.out.println(caption);
        int inteiro = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        return inteiro;
    }

    /**
     * Lê um float do console
     *
     * @param caption Texto que identifica o que estÃ¡ sendo solicitado
     * (rÃ³tulo)
     * @return um float a partir da conversÃ£o da linha lida
     */
    public static float readlnFloat(String caption) {
        System.out.println(caption);
        float real = in.nextFloat();
        return real;
    }

    /**
     * Aguarda até que um ENTER seja teclado no console
     *
     */
    public static void waitEnter() {
        in.next();
    }
}
