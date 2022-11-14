package personnages;


/**
 * Un humain est caractérisé par son nom, 
 * sa boisson favorite (de type String), 
 * et la quantité d’argent qu’il possède (de type int). 
 * Tous les attributs de la classe Humain sont privés. 
 * Pour manipuler les attributs, un humain propose des 
 * accesseurs en lecture (méthodes get) sur les 
 * attributs nom et argent.
 * @author joachimazzi
 */
public class Humain {
	
	
	protected static final int NB_MEMO = 30;

	
    private String nom;
    private String boissonFav;
    protected int argent; // cet attribut était privé
    protected int nbConnaissance; 
    protected Humain[] memoire;
    
    
    /**
     * @param nom
     * @param boissonFav
     * @param argent
     */
    public Humain(String nom, String boissonFav, int argent) {
        this.nom = nom;
        this.boissonFav = boissonFav;
        this.argent = argent;
        this.nbConnaissance = 0;
        this.memoire = new Humain[NB_MEMO]; 
    }


    /**
     * Affiche un message dis par l'humain
     * @param message
     */
    protected void parler(String message) {
        // J'ai fais le choix d'utliser cette methode "avancée car elle fait gagner en lisibilité
        message = String.format("(%s) - %s", nom, message);
        System.out.println(message);
    } 
    /*
    Note TP : Cette methode est protected car 
    elle ne sera utilisé que par cette class.
    */ 


    /**
     * Petite presentation
     */
    public void direBonjour() {
        parler(
            String.format("Bonjour ! Je m'appelle %s et j'aime boire du %s.", nom, boissonFav)
        );
    }


    /**
     * L'humain boit un bon verre de sa boisson favorite
     */
    public void boire() {
        parler("Mmmm, un bon verre de "+boissonFav+"... ! GLOUPS !");
    }


    /**
     * @param bien que l'humain achete
     * @param prix auquel il l'achete
     */
    public void acheter(String bien, int prix) {
        if (prix<=argent) {
            parler(
            String.format(
                "J'ai %d sous en poche. Je vais pouvoir m'offrir une %s à %d sous.", argent, bien, prix
                )
            );
            perdreArgent(prix);
        } else {
            parler(
            String.format(
                "J'ai n'ai plus que %d sous en poche. Je ne peut même pas m'acheter un %s à %d sous.", argent, bien, prix
                )
            );
        }
    }
    
    
    public void faireConnaissance(Humain other) {
    	this.direBonjour();
    	other.repondre(this);
    	this.memoriser(other);
    }
    

    protected void memoriser(Humain other) {
    	memoire[nbConnaissance%NB_MEMO] = other;
    	nbConnaissance++;
    }
    
    
    public int getNbConnaissance() {
    	if(nbConnaissance>NB_MEMO) return NB_MEMO;
    	else return nbConnaissance;
    }
    
    
    protected void repondre(Humain other) {
    	this.direBonjour();
    	this.memoriser(other);
    }
    
    
    public void listerConnaissance() {
    	String rep = "";
    	for(int i = 0; i < getNbConnaissance(); i++) {
    		rep += memoire[i].getNom()+((i == getNbConnaissance()-1)?"":", ");
    	}
    	this.parler("Je connais beaucoups de monde dont "+rep);
    	
    }


    /**
     * @param gain ce que l'humain va gagner
     */
    protected void gagnerArgent(int gain)
    {
        argent += gain;
    }


    /**
     * @param perte
     * @return les sous perdu
     */
    protected int perdreArgent(int perte) {
        argent -= perte;
        return perte;
    }


    /**
     * Comment s'appelle l'humain ?
     * @return nom
     */
    public String getNom() {
        return nom;
    }


    /**
     * Est-il à l'aise financièrement ?
     * @return son capital
     */
    public int getArgent() {
        return argent;
    }
}
