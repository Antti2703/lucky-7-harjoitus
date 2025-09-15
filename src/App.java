import java.util.Random;
// import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Random r = new Random();
        int n1;
        int n2;
        int n3;
        //Kokeillaan

            System.out.println("Arvotaan numerot");
            n1 = r.nextInt(10)+1;
            n2 = r.nextInt(10)+1;
            n3 = r.nextInt(10)+1;
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);

            if (n1==7||n2==7||n3==7) {
                System.out.println("Voitit Pelin !");
            }

            if (n1!=7 && n2!=7 && n3!=7) {
                System.out.println("Hävisit pelin");
            }

            }
            } 
    
