
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(10);
        int tentativas = 0;
         while ( tentativas <5) {
             System.out.println("Digite um número entre 0 e 10");
             int numeroDigitado = leitor.nextInt();
             tentativas++;

             if (numeroDigitado == numeroGerado){
                 System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                 break; // interrompe o loop do while
             } else if (numeroDigitado < numeroGerado) {
                 System.out.println("o número digitado é menor que o número gerado");
             } else {
                 System.out.println("o número digitado é maior que o número gerado");
             }
         }
         if (tentativas ==5){
             System.out.println("Você não conseguiu advinhar o número em 5 tentativas. o número era " + numeroGerado);
         }

        }

    }



