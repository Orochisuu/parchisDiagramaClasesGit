/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Jugador {

	private String nombre;
	private Tablero tablero;
	
	private Ficha ficha;
	
	public Jugador(String nombre, Tablero tablero,Ficha ficha) {
		
		this.nombre = nombre;
		this.tablero = tablero;
		this.ficha =ficha;
		
	}
	
	public void tirarDado(Dado d) {
		
		d.tirar();
		
	}
	
	public int consultarDado(Dado d) {
		
		return d.mostrarTirada();
		
	}
	
	public int consultarTablero() {
		
		int[] casillas = tablero.consultarCasillas();
		
		int posicion = 0;
		
		for (int i = 0; i<tablero.consultarNumCasillas(); i++) {
			
			if (casillas[i]== 1) {
				
				posicion = i;
				break;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public void moverFicha(int css) {
		
		ficha.mover(css);
		
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
}
