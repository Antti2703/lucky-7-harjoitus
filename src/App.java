import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int raha = 5;
        int n1;
        int n2;
        int n3;   

            System.out.println("Lucky 7 pelikone");

            while (raha > 0)
            {
                System.out.println ("Rahaa on " +raha +"€ ");
                System.out.println("Paina Enter, jos haluat pelata kierroksen tai e jos et halua pelata");
                String vastaus= sc.nextLine();
                if (vastaus.equalsIgnoreCase("e"))
                {
                    System.out.println("Peli loppui Rahasi " + raha+ "€ ");
                    System.out.println("Kiitos pelaamisesta!");
                    break;
                }
            raha--;
            n1 = r.nextInt(10)+1;
            n2 = r.nextInt(10)+1;
            n3 = r.nextInt(10)+1;
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);

            if (n1==7||n2==7||n3==7) {
                System.out.println("Voitit Pelin !");
                raha +=10;
            }

            if (n1!=7 && n2!=7 && n3!=7) {
                System.out.println("Hävisit pelin");
            }
            } 
            }
            }
    
