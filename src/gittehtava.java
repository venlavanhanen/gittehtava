import harjoitus.Puhelin;

public class gittehtava {

	public static void main(String[] args) {
		Puhelin puhelin = new Puhelin();
    	puhelin.merkki = "iPhone";
    	puhelin.vari = "Musta";
    	puhelin.akunMaara = 40;
    	puhelin.tulostaTiedot();

	}

}
class Puhelin
{
	String merkki;
	String vari;
	int akunMaara;
	
	public void tulostaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("V�ri: " + vari);
		System.out.println("Akkua j�ljell�: " + akunMaara);
	}
	public void lahetaViesti()
	
	{
		System.out.println("Viesti l�hetetty.");
	}
	
	public void soita()
	{
		System.out.println("Soitetaan...");
	}
	
	
	
	
}

