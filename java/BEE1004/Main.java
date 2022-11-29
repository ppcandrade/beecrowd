import java.util.Scanner;

class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int A = input.nextInt();
            int B = input.nextInt();
            int prod = A*B;
            System.out.println("PROD = "+prod);
        } 
    }
}
