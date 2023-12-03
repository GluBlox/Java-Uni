import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tabela de Equivalência de Fahrenheit para Celsius");
        System.out.println("-----------------------------------------------");
        System.out.println("Fahrenheit  |  Celsius");
        System.out.println("------------------------");

        for (int fahrenheit = 50; fahrenheit <= 70; fahrenheit++) {
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.printf("%-11d |  %.2f%n", fahrenheit, celsius);
        }
    }
}
