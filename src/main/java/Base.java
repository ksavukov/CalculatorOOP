import java.util.Scanner;
import java.io.*;
import Operations.*;


public class Base {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        float f = scanner.nextFloat();
        System.out.println("Введите второе число");
        float fs = scanner.nextFloat();

        System.out.println("Выберите операцию: ");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        System.out.println("5 - Выход");
        int operation = scanner.nextInt();

        interOperations Oper = new allOperations();

        if (operation == 1) {
            System.out.printf("%.4f", Oper.sum(f, fs));
        } else if (operation == 2) {
            System.out.printf("%.4f", Oper.min(f, fs));
        } else if (operation == 3) {
            System.out.printf("%.4f", Oper.division(f, fs));
        } else if (operation == 4) {
            System.out.printf("%.4f", Oper.multiplication(f, fs));
        }
        else {
            System.exit(0);

        }
    }
}
