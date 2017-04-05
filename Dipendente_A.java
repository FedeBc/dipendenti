package Prova_eclipse;

public class Dipendente_A extends Dipendenti {
	private int malattia;

	public Dipendente_A(String m, float s, float ext) {
		super(m, s, ext);
		malattia = 0;

	}

	public int prendiMalattia(int gg) {
		malattia = malattia + gg;
		return malattia;
	}

	public float paga(int ore) {
		float p = super.paga(ore);

		if (malattia == 0)
		{
			return p;
		} else {
			float res = p - (malattia * 15);
			return res;
		}

	}

	public void stampaMalattia() {
		System.out.println(malattia);
	}

}
