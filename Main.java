package fr.epsi.b3.conduite;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println("xxxxxxxxxxxxxxxxxxx");
        Vehicule BMW = new Vehicule("BMW", 0);
        System.out.println(BMW);
        BMW.getMarque();
        BMW.accelerer(120);
        System.out.println("Vitesse après accélération : " + BMW.getVitesse());
        try {
            BMW.decelerer(150);
        } catch (IllegalArgumentException | VitesseNegativeException e) {
        	System.out.println(e);
        }
        System.out.println("Vitesse après décélération : " + BMW.getVitesse());
    }
}
