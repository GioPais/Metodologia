package tarea1;

/**
 * 
 * @author Giovanni Pais
 * 
 * Esta clase establece las caracteristicas de un pokemon del tipo fuego.
 * Se establecen sus metodos propios dependiendo de los atributos de clases.
 *
 */
public class Grass extends Pokemon implements Poke {

	/**
	 * Constructor de la clase. 
	 * Igual al constructor de clase padre pero con tipo fijo.
	 */
	public Grass(String n, int h, int ad) {
		super(n, h, "Grass", ad);
		
	}

	@Override
	public void atack(Poke p) {
		
		p.atackedByGrass(this);
		
	}

	@Override
	public void atackedByFire(Pokemon fire) {
		
		this.atackedVul(fire);
	}

	@Override
	public void atackedByWater(Pokemon water) {
		
		this.atackedRes(water);
	}


	@Override
	public void atackedByGround(Pokemon ground) {
		
		this.atackedRes(ground);
	}

		
}
