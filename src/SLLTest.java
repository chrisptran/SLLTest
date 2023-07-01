import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class SLLTest {

	
	public SLL sll;
	@Before
	public void setUp() throws Exception {
		sll = new SLL();
	}

	@Test
	public void testHeadForNull() {
		assertNull(sll.head);
	}
	
	@Test
	public void testHeadforNode() {
		sll.add(10);
		assertNotNull(sll.head);
	}
	
	@Test
	public void testHeadNextValue() {
		sll.add(20);
		sll.add(30);
		assertTrue(sll.head.next.value == 30);
	}
	
	@Test
	public void testHeadAfterRemove() {
		sll.add(40);
		sll.add(50);
		sll.removeFront();
	}

}
