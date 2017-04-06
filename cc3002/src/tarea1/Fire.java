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
	public void atackedByGrass(Grass grass) {
		
		this.atackedRes(grass);
		System.out.println(grass.name+" atack "+ this.name);
	}

	@Override
	public void atackedByFire(Fire fire) {
		
		this.atackedBy(fire);
		System.out.println(fire.name+" atack "+ this.name);
	}

	@Override
	public void atackedByWater(Water water) {
		
		this.atackedVul(water);
	}

	@Override
	public void atackedByElectric(Electric electric) {
		
		this.atackedBy(electric);
	}

	@Override
	public void atackedByGround(Ground ground) {
		
		this.atackedVul(ground);
	}

	@Override
	public void atackedByPsychic(Psychic psychic) {
		
		this.atackedBy(psychic);
	}

	@Override
	public void atackedByFighting(Fighting fighting) {
		
		this.atackedBy(fighting);
	}

	@Override
	public void atackedByNormal(Normal normal) {
		
		this.atackedBy(normal);
	}

}
