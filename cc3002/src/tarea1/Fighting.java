package tarea1;


/**
 * 
 * @author Giovanni Pais
 * 
 * Esta clase establece las caracteristicas de un pokemon del tipo pelea.
 * Se establecen sus metodos propios dependiendo de los atributos de clases.
 *
 */
public class Fighting extends Pokemon implements Poke{

	/**
	 * Constructor de la clase. 
	 * Igual al constructor de clase padre pero con tipo fijo.
	 */
	public Fighting(String n, int h, int ad) {
		super(n, h, "Fighting", ad);
	}

	@Override
	public void atack(Poke p) {
		
		if(!this.knocketOut()){
			p.atackedByFighting(this);
		}
	}

	

	@Override
	public void atackedByGround(Pokemon ground) {
	
		this.atackedRes(ground);
	}

	@Override
	public void atackedByPsychic(Pokemon psychic) {
		
		this.atackedVul(psychic);
	}

	
}
