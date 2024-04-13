
    import java.util.Scanner;
    class Main {
        public static void main(String[] args) {

                System.out.println("inicinando teste");
                try (Scanner ler = new Scanner(System.in)) {
                    int variavel1;
                    float variavel2;
                    double variavel3;
                    String variavel4;
                    char variavel5;

                    variavel1 = ler.nextInt();
                    variavel2 = ler.nextFloat();
                    variavel3 = ler.nextDouble();
                    variavel4 = ler.next();
                    variavel5 = ler.next().charAt(0);
        
        
                    System.out.println(variavel1);
                    System.out.println(variavel2);
                    System.out.println(variavel3);
                    System.out.println(variavel4);
                    System.out.println(variavel5);
                }
                    System.out.println("sucesso finalizando teste");
        
        }
    }