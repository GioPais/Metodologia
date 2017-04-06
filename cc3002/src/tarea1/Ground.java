package tarea1;

public class Ground extends Pokemon implements Poke {

	public Ground(String n, int h, int ad) {
		super(n, h, "Ground", ad);
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByGround(this);
	}

	@Override
	public void atackedByGrass(Pokemon grass) {
	
		this.atackedVul(grass);
	}


	@Override
	public void atackedByWater(Pokemon water) {
		
		this.atackedVul(water);
	}

	@Override
	public void atackedByElectric(Pokemon electric) {
		
		this.atackedRes(electric);
	}

	@Override
	public void atackedByNormal(Pokemon normal) {
		
		this.atackedRes(normal);
	}

}
