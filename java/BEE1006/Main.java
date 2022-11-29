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
            double C = input.nextDouble();
            A = (A*2)/10;
            B = (B*3)/10;
            C = (C*5)/10;
            double avg = (A+B+C);
            System.out.printf("MEDIA = %.1f%n",avg);
        } 
    }
}
