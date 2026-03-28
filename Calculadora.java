import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== CALCULADORA EDUARDA CASTRO ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.println("Escolha:");

            opcao = sc.nexInt();

            if (opcao >= 1 && opcao <=4){
                System.out.printkn("Digite o primeiro número:");
                double a = sc.nextDouble();

                System.out.println("Digite o segundo número:");
                double b = sc.nextDouble();

                switch (opcao){
                    case 1:
                        System.out.println("Resultado: " + (a+b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (a-b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (a*b));
                        break;
                    case 4:
                        if (b !=0){
                            System.out.println("Resultado: " + (a/b));
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                }
            }

        } while (opcao != 0);

        System.out.println("Encerrando...");
        sc.close();
    }
}