package tarea1;

/**
 * 
 * @author Giovanni Pais
 * 
 * Interfaz que establece para todos los tipos de pokemon los metodos que deben poseer para lograr
 *  los efectos correctos de combate entre tipos de pokemon.
 *
 */
public interface Poke {
	
	/**
	 * 
	 * metodo que indica el ataque de un pokemon a otro para asi llamar al metodo adecuado
	 * segun el tipo de pokemon con el que se combate.
	 * Se verifica si el pokemon no esta fuera de combate para realizar la accion.
	 */
	void atack (Poke p);
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo planta.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByGrass (Pokemon grass);
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo fuego.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByFire (Pokemon fire);
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo agua.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByWater (Pokemon water);
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo electrico.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByElectric (Pokemon electric);
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo tierra.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByGround (Pokemon ground);
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo psiquico.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByPsychic (Pokemon psychic);
	
	/**
	 * Modifica el daño del pokemon para un ataque de tipo pelea.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByFighting (Pokemon fighting);
	/**
	 * Modifica el daño del pokemon para un ataque de tipo normal.
	 * 
	 * @param e pokemon que ataca al pokemon que llama el metodo.
	 */
	void atackedByNormal (Pokemon normal);
	
}
