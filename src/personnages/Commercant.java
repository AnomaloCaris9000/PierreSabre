package personnages;



/**
 * Un commerçant et un humain aime le thé, qui se fait extorquer par des Yakuza et sauver par des Ronin. Une vie bien remplie en somme.
 * @author joachimazzi
 *
 */
public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * Vide les poches de notre pauvre commerçant, quelle injustice !
	 * @return les sous perdu du commerçant
	 */
	public int seFaireExtorquer() {
		/*
		 * Note TP : pour resoudre le problème de l'acces à l'attribu argent 
		 * dans les class fille de Humain j'ai supposé que les deux solution était
		 * 1 - mettre l'attribut en public
		 * 2 - mettre l'attribut en protected
		 * J'ai choisis la deuxième option car elle n'a pas l'effet secondaire 
		 * de donner l'acces des attribut à d'autre objet, ce dont nous n'avons pas
		 * l'utilitee.
		 * J'avais déjà mis la methode "parler" en protected (plutot qu'en private) parce que je soupçonnais
		 * que nous allions faire heriter la class Humain.
		 */
		parler("J'ai tout perdu, le monde est vraiment trop injuste");
		return perdreArgent(this.argent);
	}
	
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous ! Je te remercie genereux donateur !");
	}
	

}
