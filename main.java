
public class main {
	
	public static void main(String[] args) {
		SuccoArancia i=new SuccoArancia();
	
	System.out.println("La varietà è " +i.getVarieta());
	System.out.println("L'arancia viene da " + i.getOrigine());
	System.out.println("Il calibro è " +i.getCalibro());
	System.out.println("Il prezzo al kg è " +i.getPrezzokg());
	System.out.println("La vitamina c presente è " +i.getVitc());
	System.out.println("La confezione è di " +i.getVarieta());
	
	System.out.println("Il prezzo del succo modificato è di " i.modificaPrezzo() +"€");
	System.out.println("L'iva è pari a " +i.determinaIva());
	System.out.println("L'impronta ecologica è " +i.determinaImprontaEcologica());
	
	SuccoArancia i2=new SuccoArancia("rossa", "Puglia", 12, 9, 24, "carta", "giallo", 56, 1);
	
	if (i.determinaImprontaEcologica()>=i2.determinaImprontaEcologica) {
		System.out.println("Il primo succo ha un'impronta ecologica maggiore o uguale al secondo");
	} else {
		System.out.println("Il primo succo ha un'impronta ecologica minore al secondo");
	}
}

	
}