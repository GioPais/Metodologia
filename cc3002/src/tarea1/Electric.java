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
	public void atackedByGrass(Grass grass) {
		
		this.atackedBy(grass);
		
	}

	@Override
	public void atackedByFire(Fire fire) {
		
		this.atackedBy(fire);
	}

	@Override
	public void atackedByWater(Water water) {
		
		this.atackedBy(water);
	}

	@Override
	public void atackedByElectric(Electric electric) {
		
		this.damage=this.damage+electric.atackdmg-20;
	}

	@Override
	public void atackedByGround(Ground ground) {
		
		this.damage=this.damage+ground.atackdmg*2;
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
