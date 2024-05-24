package parchisClasesPruebasUnits;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

public class TableroTest {
	static Tablero mitablero;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mitablero= new Tablero();
	}

	
	@Test
	public void testCambiarficha() {
		for(int i=0;i<21;i++) {
		try {
		
			mitablero.cambiarFicha(i, i+1);
			assertFalse(mitablero.consultarCasillas()[i]);
			assertTrue(mitablero.consultarCasillas()[i+1]);
		}
		
		catch(Exception e){
			System.out.println("Ha habido un error en la posicion " + i);
		}
		
	}

}
}