package tarea1;

/**
 * 
 * @author Giovanni Pais
 * 
 * Clase padre de todos los tipos de pokemon donde se establecen los parametros y metodos principales
 *  que todo tipo de pokemon debe tener
 *
 */
public class Pokemon {
	
	public String name; 
	public int hp;
	public int damage;
	public String type;
	public int atackdmg;
	/**
	 * Constructor de la clase donde se dan atributos a los pokemon.
	 * @param n es el nombre del pokemon
	 * @param h es la vida del pokemon
	 * @param t	corresponde al tipo del pokemon
	 * @param ad corresponde al daño el pokemon (atack damage)
	 */
	public Pokemon(String n,int h, String t, int ad ){
		this.name=n;
		this.hp=h;
		this.damage=0;
		this.type=t;
		this.atackdmg=ad;
	}
	
	
	/**
	 * Revisa si el daño del pokemon supera la vida, es decir si esta fuera de combate.
	 * 
	 * @return true si el pokemon esta fuera de combate
	 */
	public boolean knocketOut(){
		if(this.damage >this.hp){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Regresa el daño del pokemon a 0.
	 */
	public void heal(){
		this.damage=0;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo electrico.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByElectric(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo lucha.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByFighting(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo fuego.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByFire(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo planta.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByGrass(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo tierra.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByGround(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo normal.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByNormal(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo psiquico.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByPsychic(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo agua.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedByWater(Pokemon e){
		this.damage=this.damage+e.atackdmg;
	}
	
	/**
	 * Modifica el daño del pokemon para el caso que el se tiene resistencia al tipo de atacante
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedRes(Pokemon e){
		this.damage=this.damage+e.atackdmg-20;
		if (this.damage<0){this.damage=0;}
	}
	
	/**
	 * Modifica el daño del pokemon para el caso que el se tiene vulnerabilidad al tipo de atacante
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	public void atackedVul(Pokemon e){
		this.damage=this.damage+e.atackdmg*2;
	}
}
