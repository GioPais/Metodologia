package tarea1;


public class Grass extends Pokemon implements Poke {

	public Grass(String n, int h, int ad) {
		super(n, h, "Grass", ad);
		
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByGrass(this);
		
	}

	@Override
	public void atackedByFire(Pokemon fire) {
		
		this.atackedVul(fire);
	}

	@Override
	public void atackedByWater(Pokemon water) {
		
		this.atackedRes(water);
	}


	@Override
	public void atackedByGround(Pokemon ground) {
		
		this.atackedRes(ground);
	}

		
}
