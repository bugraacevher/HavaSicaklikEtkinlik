package Giris;

import java.util.Scanner;

public class HavaSicaklikEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.printf("Sicaklik degerini giriniz : ");
        sicaklik = input.nextInt();
        if (sicaklik <= 5){
            System.out.printf("Kayak");
        } else if (sicaklik>5 && sicaklik<=15) {
            System.out.println("Sinema");
        } else if (sicaklik>10 && sicaklik<=25) {
            System.out.println("Piknik");
        } else if (sicaklik>25) {
            System.out.println("Yuzme");
        }
    }
}
