package personnages;

public class Samourail extends Ronin {
	
	private String nomSeigneur;

	public Samourail(String nomSeigneur, String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		this.nomSeigneur = nomSeigneur;
	}
	
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur "+nomSeigneur);
	}
	
	
	public void boire(String nomBoisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + nomBoisson + ".");
	}

}
