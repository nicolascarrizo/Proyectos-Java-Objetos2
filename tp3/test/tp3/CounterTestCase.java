package tp3;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class CounterTestCase {

	private Counter counter;
	
		
	@BeforeEach
	public void setUp(){
		
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(4);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
			
			
		}
	
	@Test
	public void testEvenNumbers() {
		
	
		int amount = counter.getEvenOccurrences();
		assertEquals(amount, 2);
		
	}
	
}
