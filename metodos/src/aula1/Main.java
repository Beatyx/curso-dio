package aula1;

public class Main {
    public static void main(String[] args) {

        //Operações Matemáticas
        System.out.println("Exercício calculadora");
        operacoesmat.soma(3, 6);
        operacoesmat.subtracao(9, 1.8);
        operacoesmat.multiplicaca(7, 8);
        operacoesmat.divisao(5, 2.5);

        //Mensagem das horas do dia
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);



    }
}
