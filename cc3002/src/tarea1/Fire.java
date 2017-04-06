package tarea1;

public class Fire extends Pokemon implements Poke {

	public Fire(String n, int h, int ad) {
		super(n, h, "Fire", ad);
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByFire(this);
		
	}

	@Override
	public void atackedByGrass(Pokemon grass) {
		
		this.atackedRes(grass);
	}


	@Override
	public void atackedByWater(Pokemon water) {
		
		this.atackedVul(water);
	}


	@Override
	public void atackedByGround(Pokemon ground) {
		
		this.atackedVul(ground);
	}


}
