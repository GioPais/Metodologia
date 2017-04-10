package tarea1;

/**
 * 
 * @author Giovanni Pais
 * 
 * Esta clase establece las caracteristicas de un pokemon del tipo normal.
 * Se establecen sus metodos propios dependiendo de los atributos de clases.
 *
 */
public class Normal extends Pokemon implements Poke {

	/**
	 * Constructor de la clase. 
	 * Igual al constructor de clase padre pero con tipo fijo.
	 */
	public Normal(String n, int h, int ad) {
		super(n, h, "Normal", ad);
	}

	@Override
	public void atack(Poke p) {
		
		if(!this.knocketOut()){
			p.atackedByNormal(this);
		}
	}

	@Override
	public void atackedByPsychic(Pokemon psychic) {
		
		this.atackedRes(psychic);
	}

	@Override
	public void atackedByFighting(Pokemon fighting) {
		
		this.atackedVul(fighting);
	}

	
}
