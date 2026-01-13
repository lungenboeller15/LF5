//SE-C-51, Dalhoff

import java.util.Scanner;
public class Rabattsystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double bestellwert;


        bestellwert = sc.nextDouble();

        if (bestellwert > 0 && bestellwert <=100){
           bestellwert =  bestellwert*0.9;
            System.out.println("Sie erhalten 10% Rabatt, ihr Bestellwert liegt bei"+ bestellwert + "€.");
        }

        else if (bestellwert>100 && bestellwert<=500){
            bestellwert =  bestellwert*0.85;
            System.out.println("Sie erhalten 15% Rabatt, ihr Bestellwert liegt bei"+ bestellwert + "€.");
            }
        else if (bestellwert>500) {
            bestellwert = bestellwert * 0.80;
            System.out.println("Sie erhalten 20% Rabatt, ihr Bestellwert liegt bei" + bestellwert + "€.");
        }
        }
    }



