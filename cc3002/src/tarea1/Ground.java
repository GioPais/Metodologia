package tarea1;


/**
 * 
 * @author Giovanni Pais
 * 
 * Esta clase establece las caracteristicas de un pokemon del tipo tierra.
 * Se establecen sus metodos propios dependiendo de los atributos de clases.
 *
 */
public class Ground extends Pokemon implements Poke {

	/**
	 * Constructor de la clase. 
	 * Igual al constructor de clase padre pero con tipo fijo.
	 */
	public Ground(String n, int h, int ad) {
		super(n, h, "Ground", ad);
	}

	@Override
	public void atack(Poke p) {
		
		if(!this.knocketOut()){
			p.atackedByGround(this);
		}
	}

	@Override
	public void atackedByGrass(Pokemon grass) {
	
		this.atackedVul(grass);
	}


	@Override
	public void atackedByWater(Pokemon water) {
		
		this.atackedVul(water);
	}

	@Override
	public void atackedByElectric(Pokemon electric) {
		
		this.atackedRes(electric);
	}

	@Override
	public void atackedByNormal(Pokemon normal) {
		
		this.atackedRes(normal);
	}

}
