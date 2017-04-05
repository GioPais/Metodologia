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
	public void atackedByGrass(Grass grass) {
		// TODO Auto-generated method stub
		this.damage=this.damage+grass.atackdmg;
		System.out.println(grass.name+" atack "+ this.name);
	}

	@Override
	public void atackedByFire(Fire fire) {
		// TODO Auto-generated method stub
		this.damage=this.damage+fire.atackdmg*2;
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
