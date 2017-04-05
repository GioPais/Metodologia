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

}
