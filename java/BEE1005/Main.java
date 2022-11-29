import java.util.Locale;
import java.util.Scanner;

class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner input = new Scanner(System.in)) {
            double A = input.nextDouble();
            double B = input.nextDouble();
            A = (A*3.5)/11;
            B = (B*7.5)/11;
            double avg = (A+B);
            System.out.printf("MEDIA = %.5f%n",avg);
        } 
    }
}
