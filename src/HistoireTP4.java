import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;


public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whisky", 40, "Warsong");
		Ronin roro = new Ronin("Roro", "shoshu", 60);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		yaku.direBonjour();
		yaku.extorquer(marco);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
	}
	
	public static void testHumain() {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
	}
	
	
	public static void testCommercant() {
		
	}
	
	
	public static void testYakuza() {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whisky", 40, "Warsong");
		Commercant marco = new Commercant("Marco", 15);
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
	
	public static void testRonin() {
		Commercant marco = new Commercant("Marco", 15);
		Ronin roro = new Ronin("Roro", "shoshu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}
	
	
	public static void testDuel() {
		Ronin roro = new Ronin("Roro", "shoshu", 60);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whisky", 40, "Warsong");
		roro.provoquer(yaku);
	}

}
