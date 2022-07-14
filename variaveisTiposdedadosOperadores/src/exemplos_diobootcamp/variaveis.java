package exemplos_diobootcamp;

/** Classe de exemplo para o exercício da aula 1 de Variáveis , Tipos de Dados e Operadoes aritméticos   **/

public class variaveis {
    public static void main(String[] args) {

        int i;
        //int i; variaveis não podem ter o mesmo nome.
        int I;
        //int 1a; não pode começar com número.
        int _1a; /* não se deve fazer, não é uma boa pratica*/
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 30;

        final int j = 10;
        // j = 15; não se pode mudar o valor de uma variavel final.
        int asrn24678md;
        // int asrn246 78md; dar espaço dá erro.
        int asrn$24678_md = 10; /* não é uma boa pratica */
        // int asrn246%78_md = 10; caracteres especiais não são validos.

        asrn24678md = 100;
        asrn$24678_md = 10;

        int quantidadeProdutos = 30; /* boa pratica */
        // int QuatidadeProdutos;  não é uma boa pratica.
        final int NUMERO_TENTATIVA = 5;
        // final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        // int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn$24678_md);

        System.out.println(quantidadeProdutos);
        System.out.println(NUMERO_TENTATIVA);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
