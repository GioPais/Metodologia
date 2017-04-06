package tarea1;

public class Psychic extends Pokemon implements Poke {

	public Psychic(String n, int h, int ad) {
		super(n, h, "Psychic", ad);
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByPsychic(this);
	}

	
	@Override
	public void atackedByPsychic(Pokemon psychic) {
		
		this.atackedVul(psychic);
	}

}
