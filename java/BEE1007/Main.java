import java.util.Scanner;

class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double A = input.nextInt();
            double B = input.nextInt();
            double C = input.nextInt();
            double D = input.nextInt();
            double diff =  (A * B - C * D);
            System.out.printf("DIFERENCA = %.0f%n",diff);

        } 
    }
}
