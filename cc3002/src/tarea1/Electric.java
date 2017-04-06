package tarea1;

public class Electric extends Pokemon implements Poke {

	public Electric(String n, int h, int ad) {
		
		super(n, h, "Electric", ad);
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByElectric(this);
		
	}

	@Override
	public void atackedByElectric(Pokemon electric) {
		
		this.atackedRes(electric);
	}

	@Override
	public void atackedByGround(Pokemon ground) {
		
		this.atackedVul(ground);
	}



}
