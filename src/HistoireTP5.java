import personnages.*;


public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourail akimoto = new Samourail("Miyamoto", "Akimoto", "saké", 80);
		/*
		System.out.println("Le marchant Marco rencontre le ronin");
		marco.faireConnaissance(roro); // roro
		System.out.println("Le marchant Marco rencontre le yakuza");
		marco.faireConnaissance(yaku); // 
		System.out.println("Le marchant Marco rencontre un autre marchant");
		marco.faireConnaissance(chonin);
		System.out.println("Le marchant Marco rencontre un autre marchant");
		marco.faireConnaissance(kumi);
		
		roro.listerConnaissance();
		yaku.listerConnaissance();
		marco.listerConnaissance();
		 */
		
		akimoto.faireConnaissance(marco);
		akimoto.boire("the");
		
		
		
	}
}
