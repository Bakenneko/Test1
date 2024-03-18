package Fibonacchi;


public class Main {
        public static int sumOfFibonacciNumbers(int n) {
            int sum = 0;
            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                sum += a; // Додаємо поточне число Фібоначчі до суми
                int nextFib = a + b;
                a = b;
                b = nextFib;
            }

            return sum;
        }

        public static void main(String[] args) {
            int n = 10;
            int result = sumOfFibonacciNumbers(n);
            System.out.println("Сума перших " + n + " чисел Фібоначчі: " + result);
        }
}