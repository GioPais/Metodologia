package tarea1;


/**
 * 
 * @author Giovanni Pais
 * 
 * Esta clase establece las caracteristicas de un pokemon del tipo agua.
 * Se establecen sus metodos propios dependiendo de los atributos de clases.
 *
 */
public class Water extends Pokemon implements Poke {

	/**
	 * Constructor de la clase. 
	 * Igual al constructor de clase padre pero con tipo fijo.
	 */
	public Water(String n, int h, int ad) {
		super(n, h, "Water", ad);
	}

	@Override
	public void atack(Poke p) {
		
		if(!this.knocketOut()){
			p.atackedByWater(this);
		}
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
