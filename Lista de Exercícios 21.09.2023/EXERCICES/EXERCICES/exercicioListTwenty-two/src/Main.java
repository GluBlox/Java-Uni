// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Números múltiplos de 5 no intervalo de 1 a 500:");

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

        }
