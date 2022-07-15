package exemplos;
/**Classe de exemplo para o exercício da aula 1 de Operadores lógicos e relacionais, Controle de fluxo e Blocos**/
public class OprdRelacionais {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cricrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1596L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2" +(i1 == i2));
        System.out.println("i1 != i2" + (i1 != i2));
        System.out.println("i1 > i2" + (i1 > i2));
        System.out.println("i1 <= i2" + (i1 <= i2));

        System.out.println("f1 == f2" + (f1 == f2));
        //System.out.println(s1 >= s2); não podem ser aplicados em todo tipo de dado.
        //System.out.println(s1 < s2);


    }
}
