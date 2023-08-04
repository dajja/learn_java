package arraypack;

import java.util.Scanner;

public class Arrayin {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Nhap 1 tu bat ki : ");
        String ki_tu = scanner.nextLine();
        System.out.println("chu do la : " + ki_tu);
        scanner.close();
    }
}
