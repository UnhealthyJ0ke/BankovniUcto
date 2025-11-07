package spsSiroky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte prosím vaše číslo účtu (třeba 123456/1234) :");
        String cislo = sc.next();
        System.out.println("Teď zadejte jméno držitele účtu");
        String jmeno = sc.next();
        BankovniUcto bU1 = new BankovniUcto(cislo,jmeno,0);
        System.out.println("A nakonec přejete si vložit, nebo vybrat?");
        System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
        int vyber = sc.nextInt();

 
        if(vyber == 1){
            System.out.println("Zadejte prosím částku kterou si přejete vložit:");
            int vlozCastku = sc.nextInt();
            bU1.setStavUctu(vlozCastku);
            bU1.getStavUctu();
            bU1.vypisInfo();
            System.out.println("A nakonec přejete si vložit, nebo vybrat?");
            System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
            int vyber2 = sc.nextInt();


            if(vyber2 == 1){
                System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                int vlozCastku2 = sc.nextInt();
                bU1.setStavUctu(vlozCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }

            } else if (vyber2 == 2) {
                System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                int vyberCastku2 = sc.nextInt();
                bU1.setStavUctu(vyberCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            } else if (vyber2 == 3) {
                System.out.println("OKI");
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            }else {
                System.out.println("Neplatný znak...");

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            }
        } else if (vyber == 2) {
            System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
            int vyberCastku = sc.nextInt();
            bU1.setStavUctu(vyberCastku);
            bU1.getStavUctu();
            bU1.vypisInfo();

            System.out.println("A nakonec přejete si vložit, nebo vybrat?");
            System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
            int vyber2 = sc.nextInt();


            if(vyber2 == 1){
                System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                int vlozCastku2 = sc.nextInt();
                bU1.setStavUctu(vlozCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            } else if (vyber2 == 2) {
                System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                int vyberCastku2 = sc.nextInt();
                bU1.setStavUctu(vyberCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            } else if (vyber2 == 3) {
                System.out.println("OKI");
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            }else {
                System.out.println("Neplatný znak...");

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            }
        } else if (vyber == 3) {
            System.out.println("OKI");
            bU1.getStavUctu();
            bU1.vypisInfo();

            System.out.println("A nakonec přejete si vložit, nebo vybrat?");
            System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
            int vyber2 = sc.nextInt();


            if(vyber2 == 1){
                System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                int vlozCastku2 = sc.nextInt();
                bU1.setStavUctu(vlozCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            } else if (vyber2 == 2) {
                System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                int vyberCastku2 = sc.nextInt();
                bU1.setStavUctu(vyberCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            } else if (vyber2 == 3) {
                System.out.println("OKI");
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            }else {
                System.out.println("Neplatný znak...");

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            }
        }else {
            System.out.println("Neplatný znak...");

            System.out.println("A nakonec přejete si vložit, nebo vybrat?");
            System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
            int vyber2 = sc.nextInt();


            if(vyber2 == 1){
                System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                int vlozCastku2 = sc.nextInt();
                bU1.setStavUctu(vlozCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            } else if (vyber2 == 2) {
                System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                int vyberCastku2 = sc.nextInt();
                bU1.setStavUctu(vyberCastku2);
                bU1.getStavUctu();
                bU1.vypisInfo();

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            } else if (vyber2 == 3) {
                System.out.println("OKI");
                bU1.getStavUctu();
                bU1.vypisInfo();
                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }

            }else {
                System.out.println("Neplatný znak...");

                System.out.println("A nakonec přejete si vložit, nebo vybrat?");
                System.out.println("1 pro vložit - 2 pro vybrat.   3 pro ukončit");
                int vyber3 = sc.nextInt();


                if(vyber3 == 1){
                    System.out.println("Zadejte prosím částku kterou si přejete vložit:");
                    int vlozCastku3 = sc.nextInt();
                    bU1.setStavUctu(vlozCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 2) {
                    System.out.println("Zadejte prosím částku, kterou si přejete vybrat:");
                    int vyberCastku3 = sc.nextInt();
                    bU1.setStavUctu(vyberCastku3);
                    bU1.getStavUctu();
                    bU1.vypisInfo();
                } else if (vyber3 == 3) {
                    System.out.println("OKI");
                    bU1.getStavUctu();
                    bU1.vypisInfo();

                }else {
                    System.out.println("Neplatný znak...");
                }
            }
        }
    }
}