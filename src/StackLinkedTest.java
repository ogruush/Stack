import static org.junit.Assert.*;

import org.junit.Test;


public class StackLinkedTest {

	@Test
	public void test_push() throws EmptyStackException {
		StackLinked list1 = new StackLinked();
		
		list1.push(100);
		list1.push(200);
		
		int thetopnumber=list1.pop();
		int expectednumber=200;	
		assertEquals("should be equals 200", expectednumber, thetopnumber);
		
		thetopnumber=list1.pop();
	    expectednumber=100;	
		assertEquals("should be equals 100", expectednumber, thetopnumber);
		
	}
	
	@Test(expected=EmptyStackException.class)
	public void test_pop_empty_stack() throws EmptyStackException{
		StackLinked list1 = new StackLinked();
		
		list1.pop();
	}
	
	@Test(expected=EmptyStackException.class)
	public void test_peek_empty_stack() throws EmptyStackException{
		StackLinked list1 = new StackLinked();
		
		list1.peek();
		
	}
	
	@Test
	public void test_peek() throws EmptyStackException{
		StackLinked list1 = new StackLinked();
		
		list1.push(100);
		list1.push(200);
		list1.push(300);
		list1.push(400);
		list1.push(500);
		
		int thetopnumber = list1.peek();
		int expectednumber = 500;
		assertEquals("should be equals 500", expectednumber, thetopnumber);
		
	}

}
