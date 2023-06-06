import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int km;
        double kmBasi = 2.20, toplam;

        System.out.print("mesafeyi giriniz (km cinsinden hesaplanacaktir) : ");
        km = scan.nextInt();

        toplam = 10 + (km * kmBasi); // taksimetre açılış ücreti 10 tl.

        if(toplam < 20) {
            toplam = 20;
        }

        System.out.println("taksimetre ucreti : "+toplam);





        }
    }
