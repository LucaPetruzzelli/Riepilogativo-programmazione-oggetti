
public class SuccoArancia extends Arancia {
	
	private String confezione, colore;
	private double calorie100ml, prezzo;
	
	public SuccoArancia() {
		super();
		confezione="plastica";
		colore="arancio";
		calorie100ml=75;
		prezzo=2;
	}
	
	public SuccoArancia(String varieta, String origine, int calibro, double prezzokg, double vitc, String confezione, String colore, double calorie100ml, double prezzo) {
		super(varieta, origine, calibro, prezzokg, vitc);
		this.confezione=confezione;
		this.colore=colore;
		this.calorie100ml=calorie100ml;
		this.prezzo=prezzo;
	}
	
	public void modificaPrezzo() {
		if (confezione=="vetro" ) {
			prezzo=prezzo+prezzo*0.15;
		} else if (confezione=="plastica") {
			prezzo=prezzo-prezzo*0.03;
		}
	}
	
	public double determinaIva() {
		double iva;
		if (prezzo>2) {
			iva=prezzo*0.1;
		} else if (1<=prezzo>2) {
			iva=prezzo*0.04;
		} else {
			iva=0;
		}
		return iva;
	}
	
	public String determinaImprontaEcologica(boolean coltivazioneBiologica, boolean km0) {
		String improntaEcologica;
		coltivazioneBiologica=true;
		km0=true;
		if(coltivazioneBiologica && km0==true) {
			improntaEcologica="bassa";
		} else if (coltivazioneBiologica || km0==true) {
			improntaEcologica="media";
		} else {
			improntaEcologica="bassa";
		}
		return improntaEcologica;
	}
	
	public String getConfezione() {
		return confezione;
	}
	
	public void setConfezione(String confezione) {
		this.confezione=confezione;
	}

}
