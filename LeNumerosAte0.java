import java.util.Scanner;

public class LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite seus numeros, 0 encerra: ");
        int soma = 0;
        int div = 0;
        // int media = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            soma = soma + n;
            div = div + 1;
            System.out.print("proximo: ");
            n = scanner.nextInt();
            
        }
        System.out.println("media dos valores: " + soma);
        if (div == 0 ) {
            System.out.println("soma dos valores: " + soma);
        }
        else{
        double media = (double)soma / div;
        System.out.println("media dos valores: " + media);        
        }

        scanner.close();
    }
}
