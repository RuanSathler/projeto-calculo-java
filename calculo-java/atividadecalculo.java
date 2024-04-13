
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("óla, bem-vindo");
        System.out.println("iniciando a soma, insira a nota dos dois alunos");

        Scanner ler = new Scanner(System.in);

        int aluno1;
        int aluno2;

        aluno1 = ler.nextInt();
        aluno2 = ler.nextInt();
        
        int soma;
        soma = aluno1+aluno2;

        System.out.println("resultado"+soma);
        System.out.println("sucesso, vamos para a próxima etapa");
        System.out.println("insira a base e altura do triangulo");

        float base, altura;
        base = ler.nextFloat();
        altura = ler.nextFloat();

        float resultado;
        resultado = base*altura;

        System.out.println("resultado"+resultado);
        System.out.println("sucesso, vamos para a próxima etapa");
        System.out.println("insira os números para sa subtração");

        int numero1, numero2;
        numero1 = ler.nextInt();
        numero2 = ler.nextInt();

        int subtracao;
        subtracao = numero1-numero2;

        System.out.println("resultado"+subtracao);
        System.out.println("sucesso, vamos para a próxima etapa");
        System.out.println("insira os números para a divisão");

        int div1, div2;
        div1 = ler.nextInt();
        div2 = ler.nextInt();

        int divisao;
        divisao = div1/div2;

        System.out.println("resultado"+divisao);
        System.out.println("sucesso, todas as etapas do codigo foram conlcuidas, encerrando codigo");


    }
    
}
