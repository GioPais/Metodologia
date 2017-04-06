package tarea1;

public class Fire extends Pokemon implements Poke {

	public Fire(String n, int h, int ad) {
		super(n, h, "Fire", ad);
	}

	@Override
	public void atack(Poke p) {
		// TODO Auto-generated method stub
		p.atackedByFire(this);
		
	}

	@Override
	public void atackedByGrass(Grass grass) {
		// TODO Auto-generated method stub
		this.damage=this.damage+grass.atackdmg-20;
		System.out.println(grass.name+" atack "+ this.name);
	}

	@Override
	public void atackedByFire(Fire fire) {
		// TODO Auto-generated method stub
		this.damage=this.damage+fire.atackdmg;
		System.out.println(fire.name+" atack "+ this.name);
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
		
	}

	@Override
	public void atackedByPsychic(Psychic psychic) {
		// TODO Auto-generated method stub
		
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