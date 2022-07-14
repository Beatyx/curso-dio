package exemplos_diobootcamp;

/** Classe de exemplo para o exercício da aula 2 de Variáveis , Tipos de Dados e Operadoes aritméticos**/

public class tiposdedados {

    public static void main(String[] args) {

     /** Números inteiros **/
     byte b1 = 10;
     byte b2 = 20;

     short s1 = 20000;
     // short s2=  40000; ultrapassando o limite suportado pelo short.

     // int i1 = -100000000000; mesmo caso do short.
     int i2 = 28500;

    // long l1 = 1000000000000000000; esse dado precisa de L no final para ser indentificado como long.
    long l2 = 17388372989378278L;

    /** Números reais **/
    // float f1 = 4.5; a linguagem java indeficado esse número como double com a falta de f no final do número.
    float f2 = 10.68F;

    double d1 = 56.69;
    double d2 = 99.769D;

    /** Dados textuais **/
    char c1 = 'W';
    // char c2 = 'Tw'; char só pode um único caracter
    char c3 = '\u0057';

    String st1 = "fulano";
    String st2 = "Cicrano";
    String st3 = "ag dgb se et t KJJK&¨% 66713";

    //String dt1 = "09/12/1964"; não é bom se fazer essa forma.

    boolean bo1 = true;
    boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
