package tarea1;

public class Water extends Pokemon implements Poke {

	public Water(String n, int h, int ad) {
		super(n, h, "Water", ad);
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByWater(this);
	}

	@Override
	public void atackedByGrass(Pokemon grass) {
		
		this.atackedVul(grass);
	}

	@Override
	public void atackedByFire(Pokemon fire) {
		
		this.atackedRes(fire);
	}


	@Override
	public void atackedByElectric(Pokemon electric) {
		
		this.atackedVul(electric);
	}


}
