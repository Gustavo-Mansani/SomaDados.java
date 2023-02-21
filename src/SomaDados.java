import java.util.Scanner;
public class SomaDados {
    int dadosPorgrupo;
    int totalGrupos;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de dados por grupo: ");
        int dadosPorgrupo = scanner.nextInt();

        System.out.println("Digite o total de grupos: ");
        int totalGrupos = scanner.nextInt();

        int somaTotal = 0;

        for(int i = 1; i <= totalGrupos; i++) {
            int somaGrupo = 0;

            System.out.println("Grupo" + i + ":");
            for (int j = 1; j<= dadosPorgrupo; j++) {
                System.out.println("Digite o valor do dado" + j + ": ");

                int somaDados = scanner.nextInt();
                somaGrupo += somaDados;
            }
            somaTotal += somaGrupo;
            System.out.println("Soma dos grupos: " + somaGrupo + "\n");
        }

        System.out.println("soma total: " + somaTotal);

    }
}