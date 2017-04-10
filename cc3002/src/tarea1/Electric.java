package tarea1;
/**
 * 
 * @author Giovanni Pais
 * 
 * Esta clase establece las caracteristicas de un pokemon del tipo electrico.
 * Se establecen sus metodos propios dependiendo de los atributos de clases.
 *
 */
public class Electric extends Pokemon implements Poke {

	public Electric(String n, int h, int ad) {
		
		super(n, h, "Electric", ad);
	}

	@Override
	public void atack(Poke p) {
		
		if (!this.knocketOut()){
			p.atackedByElectric(this);
		}
	}

	@Override
	public void atackedByElectric(Pokemon electric) {
		
		this.atackedRes(electric);
	}

	@Override
	public void atackedByGround(Pokemon ground) {
		
		this.atackedVul(ground);
	}



}
