package dio.br.exercicios.arrays;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoates = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantidadeConsoates++;
            }

            count++;

        }while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes ) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }

        System.out.println("Quantidades de consoantes: " + quantidadeConsoates);

    }
}
