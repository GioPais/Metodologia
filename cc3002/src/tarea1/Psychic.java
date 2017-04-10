package tarea1;


/**
 * 
 * @author Giovanni Pais
 * 
 * Esta clase establece las caracteristicas de un pokemon del tipo psiquico.
 * Se establecen sus metodos propios dependiendo de los atributos de clases.
 *
 */
public class Psychic extends Pokemon implements Poke {

	public Psychic(String n, int h, int ad) {
		super(n, h, "Psychic", ad);
	}

	@Override
	public void atack(Poke p) {
		
		if(!this.knocketOut()){
			p.atackedByPsychic(this);
		}
	}

	
	@Override
	public void atackedByPsychic(Pokemon psychic) {
		
		this.atackedVul(psychic);
	}

}
