package tarea1;

public class Fighting extends Pokemon implements Poke{

	public Fighting(String n, int h, int ad) {
		super(n, h, "Fighting", ad);
	}

	@Override
	public void atack(Poke p) {
		p.atackedByFighting(this);
		
	}

	

	@Override
	public void atackedByGround(Pokemon ground) {
	
		this.atackedRes(ground);
	}

	@Override
	public void atackedByPsychic(Pokemon psychic) {
		
		this.atackedVul(psychic);
	}

	
}
