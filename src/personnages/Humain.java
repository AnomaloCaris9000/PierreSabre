package personnages;


/**
 * Un humain est caractérisé par son nom, 
 * sa boisson favorite (de type String), 
 * et la quantité d’argent qu’il possède (de type int). 
 * Tous les attributs de la classe Humain sont privés. 
 * Pour manipuler les attributs, un humain propose des 
 * accesseurs en lecture (méthodes get) sur les 
 * attributs nom et argent.
 */
public class Humain {

    private String nom;
    private String boissonFav;
    private int argent;
    
    
    /**
     * @param nom
     * @param boissonFav
     * @param argent
     */
    public Humain(String nom, String boissonFav, int argent) {
        this.nom = nom;
        this.boissonFav = boissonFav;
        this.argent = argent;
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
            perdreArent(prix);
        } else {
            parler(
            String.format(
                "J'ai n'ai plus que %d sous en poche. Je ne peut même pas m'acheter un %s à %d sous.", argent, bien, prix
                )
            );
        }
    }


    /**
     * @param gain ce que l'humain va gagner
     */
    public void gagnerArgent(int gain)
    {
        argent += gain;
    }


    /**
     * @param perte ce que l'humain va perdre
     */
    public void perdreArent(int perte) {
        argent -= perte;
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
