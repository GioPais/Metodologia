package tarea1;

public class Pokemon {
	
	public String name; 
	public int hp;
	public int damage;
	public String type;
	public int atackdmg;
	
	public Pokemon(String n,int h, String t, int ad ){
		this.name=n;
		this.hp=h;
		this.damage=0;
		this.type=t;
		this.atackdmg=ad;
		System.out.println("Pokemon created!");
	}
	
	
	
	public void status(){
		System.out.println(this.name+" HP: "+this.hp+"   damage: "+this.damage);
	}
	
	public void heal(){
		this.damage=0;
	}
	
	public void atackedBy(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByElectric(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByFighting(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByFire(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByGrass(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByGround(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByNormal(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByPsychic(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedByWater(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	public void atackedRes(Pokemon e){
		this.damage=this.damage+e.atackdmg-20;
	}
	
	public void atackedVul(Pokemon e){
		this.damage=this.damage+e.atackdmg*2;
	}
}
