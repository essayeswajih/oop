package fr.epsi.b3.conduite;

public class Vehicule {
    private String marque;
    private int vitesse;

    public Vehicule(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public void accelerer(float deltaVitesse) throws IllegalArgumentException {
        try {
	        if (deltaVitesse < 0) {
	            throw new IllegalArgumentException("deltaVitesse est négative !!");
	        }
	        this.vitesse += deltaVitesse;
	        if (this.vitesse < 0) {
	            throw new VitesseNegativeException("Vitesse est négative !!");
	        }
        } catch (IllegalArgumentException | VitesseNegativeException e) {
        	System.out.println(e);
        }
    }

    public void decelerer(float deltaVitesse) throws IllegalArgumentException {
        if (deltaVitesse < 0) {
            throw new IllegalArgumentException("deltaVitesse est négative !!");
        }
        
        if (this.vitesse < deltaVitesse) {
            throw new VitesseNegativeException("Vitesse est négative !!");
        }
        this.vitesse -= deltaVitesse;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public String getMarque() {
        return this.marque;
    }

    @Override
    public String toString() {
        return this.marque + " " + this.vitesse;
    }

}
