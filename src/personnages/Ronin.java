package personnages;



/**
 * Le Ronin a de l'honneur lui. Il donne aux commerçants sans attendre en retour. 
 * @author joachimazzi
 *
 */
public class Ronin extends Humain {
	
	
	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * Donne 10% de son argent à un commerçant
	 * @param beneficiaire
	 */
	public void donner(Commercant beneficiaire) {
		parler(beneficiaire.getNom()+", prend ces 6 sous.");
		int don = argent/10;
		perdreArgent(don);
		beneficiaire.recevoir(don);
	}
	
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé, vermine, tu vas payer por ce que tu as fait à ce pauvre marchand !");
		if (this.getForce()>=adversaire.getReputation()) {
			parler("Je t'ai eu, petit yakuza !");
			gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coups");
			adversaire.gagner(this.perdreArgent(argent));
			honneur--;
		}
	}
	
	
	/**
	 * On mesure la force d'un Ronin à son honneur.
	 * @return force
	 */
	public int getForce() {
		return 2*honneur;
	}
	// cette methode n'était pas essentiel, je l'ai ajoutée par soucis de lisibilité.

}
