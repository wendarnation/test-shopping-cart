package es.iessoterohernandez.daw.endes.TestShoppingCart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestShoppingCart 
{
    
	private Product producto;
	private ShoppingCart carrito;
	
	@BeforeEach
    public void init() {
        producto = new Product("Coca-Cola", 1.00);
        carrito = new ShoppingCart();  
    }
	

	@Test
	public void TestCrearCarroVacio() {
		ShoppingCart carroPrueba = new ShoppingCart();
		assertEquals(0, carroPrueba.getItemCount());
		
	}
	
	@Test
    public void testCarroVacio() {
        assertEquals(0, carrito.getItemCount());
    }
	
	@Test
    public void testAñadirProducto() {
        carrito.addItem(producto);
        assertEquals(1, carrito.getItemCount());
    }
	
	@Test
    public void testBalanceAñadir() {
        carrito.addItem(producto);
        assertEquals(1.00, carrito.getBalance());  
    }
	
	@Test
    public void testQuitarProducto() {
		carrito.addItem(producto);
        try {
			carrito.removeItem(producto);
		} catch (ProductNotFoundException e) {
//			e.printStackTrace();
		}
        assertEquals(0, carrito.getItemCount());
    }
	
	@Test
    public void testQuitarProductoNoAñadido() {
        try {
			carrito.removeItem(producto);
			fail("No se ejecutado la excepción");
		} catch (ProductNotFoundException e) {
//			e.printStackTrace();
		}
    }
	
	
	
	
	
}
