package tarea1;

public class Normal extends Pokemon implements Poke {

	public Normal(String n, int h, int ad) {
		super(n, h, "Normal", ad);
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByNormal(this);
	}

	@Override
	public void atackedByPsychic(Pokemon psychic) {
		
		this.atackedRes(psychic);
	}

	@Override
	public void atackedByFighting(Pokemon fighting) {
		
		this.atackedVul(fighting);
	}

	
}
