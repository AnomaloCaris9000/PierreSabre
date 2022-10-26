package personnages;



/**
 * Membre de la mafia japonaise, le Yakuza a une reputation a tenir. 
 * Attention, il pourrait extorquer des marchants !
 * @author joachimazzi
 *
 */
public class Yakuza extends Humain {
	
	
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	
	/**
	 * Prendre tout l'argent d'un commercant et gagne 1 pt de reputation.
	 * @param victim
	 */
	public void extorquer(Commercant victim) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		parler(victim.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		int butin = victim.seFaireExtorquer();
		gagnerArgent(butin);
		parler(String.format("J'ai piqué les %d sous de %s, ce qui me fait %d sous dans ma poche. Hi! Hi!", butin, victim.getNom(), argent));
		reputation++;
	}
	
	
	public int perdre() {
		parler("J’ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonoré le clan de "+this.clan+".");
		reputation--;
		return perdreArgent(this.argent);
	}
	
	
	public void gagner(int gain) {
		parler(String.format("Ce ronin pensait vraiment battre %s du clan %s ? Je l'ai dépouillé de ses %d sous.", this.getNom(), clan, gain));
		gagnerArgent(gain);
		reputation++;
	}
	
	
	/**
	 * Une réputation, ça n'est pas privé ! tout le monde doit pouvoir la connaitre.
	 * @return la reputation du Yakuza
	 */
	public int getReputation() {
		return reputation;
	}
}
