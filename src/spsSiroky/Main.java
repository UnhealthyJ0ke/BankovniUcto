package spsSiroky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte prosím vaše číslo účtu (třeba 123456/1234) :");
        String cislo = sc.next();
        System.out.println("Teď zadejte jméno držitele účtu");
        String jmeno = sc.next();
        System.out.println("A nakonec přejete si vložit, nebo vybrat?");
        System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
        int vyber = sc.nextInt();

        BankovniUcto bU1 = new BankovniUcto(cislo,jmeno,0);
        if(vyber == 1){
            System.out.println("Zadejte prosím částku kterou si přejete vložit:");
            int vlozCastku = sc.nextInt();
            bU1.setStavUctu(vlozCastku);
            bU1.getStavUctu();
            bU1.vypisInfo();
        } else if (vyber == 2) {
            System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
            int vyberCastku = sc.nextInt();
            bU1.setStavUctu(vyberCastku);
            bU1.getStavUctu();
            bU1.vypisInfo();
        } else if (vyber == 3) {
            System.out.println("OKI");
            bU1.getStavUctu();
            bU1.vypisInfo();
        }else {
            System.out.println("Neplatný znak...");
        }
    }
}