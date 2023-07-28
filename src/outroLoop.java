import java.util.Scanner;

public class outroLoop {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) { // WHILE Enquanto a condição dentro do () for verdadeira, ele vai continuar trabalhando
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

            System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);
        }


    }

