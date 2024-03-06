import java.util.Scanner;

public class FibonacciSequence {

    public void FibonacciMainMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (isInFibonacciSequence(num)) {

            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }


    public boolean isInFibonacciSequence(int num){
        int a = 0;
        int b = 1;

        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == num;
    }


}
