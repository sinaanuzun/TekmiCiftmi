import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;

        System.out.print("Lütfen Bir Sayı Girin: ");

        Scanner giris = new Scanner(System.in);
        sayi = giris.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Çift Sayı Girdiniz..");
        }
        else {
            System.out.println("Tek Sayı Girdiniz..");
        }
    }
}