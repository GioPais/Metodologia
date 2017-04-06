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
	public void atackedByGrass(Grass grass) {
		// TODO Auto-generated method stub
		this.atackedBy(grass);
		
	}

	@Override
	public void atackedByFire(Fire fire) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atackedByWater(Water water) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atackedByElectric(Electric electric) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atackedByGround(Ground ground) {
		// TODO Auto-generated method stub
		this.damage=this.damage+ground.atackdmg-20;
	}

	@Override
	public void atackedByPsychic(Psychic psychic) {
		// TODO Auto-generated method stub
		this.damage=this.damage+psychic.atackdmg*20;
	}

	@Override
	public void atackedByFighting(Fighting fighting) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atackedByNormal(Normal normal) {
		// TODO Auto-generated method stub
		
	}

}
