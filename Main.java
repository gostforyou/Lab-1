import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим данные
        System.out.println("Введите длины отрезков A, B и C:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        // Проверка можно ли сделать треугольник
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            System.out.println("Из сторон можно сделать треугольник");
            // Определяем вид
            if((A == B) && (B == C) && (A == C)) {
                System.out.println("Треугольнниик равносторонний");
            } else if (A == B || B == C || A == C) {
                System.out.println("Треугольник равнобедренный");
            }
            int max = Math.max(A, Math.max(B, C));
            int sumOfSquares = A * A + B * B + C * C - max * max;
            if (max * max == sumOfSquares) {
                System.out.println("Треугольник прямоугольный");
            } else if (!(A == B || B == C || A == C)) {
                System.out.println("Треугольник разносторонний");
            }
        } else {
            System.out.println("Из сторон нельзя сделать треугольник");
        }
        scanner.close();    
    }
}
