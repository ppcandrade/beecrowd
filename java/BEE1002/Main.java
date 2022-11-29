import java.util.Locale;
import java.util.Scanner;

class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner input = new Scanner(System.in)) {
            double raio = input.nextDouble();
            double π = 3.14159;
            double area = π*Math.pow(raio, 2);
            System.out.printf("A=%.4f%n",area);
        } 
    }
}
