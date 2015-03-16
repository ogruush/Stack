import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CORBA.portable.ApplicationException;


public class StackArrayTest {

	@Test
	public void test_push() throws EmptyStackException, StackOverflowException {
		StackArray arr = new StackArray(5);
		
		arr.push(100);
		arr.push(200);
		
		int thetopnumber=arr.pop();
		int expectednumber=200;	
		assertEquals("should be equals 200", expectednumber, thetopnumber);
		
		thetopnumber=arr.pop();
	    expectednumber=100;	
		assertEquals("should be equals 100", expectednumber, thetopnumber);
	}
	
	@Test(expected=StackOverflowException.class)
	public void test_push_overflow() throws StackOverflowException {
		StackArray arr = new StackArray(5);
		
		arr.push(100);
		arr.push(200);
		arr.push(300);
		arr.push(400);
		arr.push(500);
		arr.push(600);
	}
	
	@Test(expected=EmptyStackException.class)
	public void test_pop_empty_stack() throws EmptyStackException {
		StackArray arr = new StackArray(5);
		
		arr.pop();
	}
	
	@Test(expected=EmptyStackException.class)
	public void test_peek_empty_stack() throws EmptyStackException {
		StackArray arr = new StackArray(5);
		
		arr.peek();
	}
	
	@Test
	public void test_peek() throws EmptyStackException, StackOverflowException
	{
		StackArray arr = new StackArray(5);
		
		arr.push(100);
		arr.push(200);
		arr.push(300);
		arr.push(400);
		arr.push(500); 
		
		int thetopnumber = arr.peek();
		int expectednumber = 500;
		
		assertEquals("should be equals 500", expectednumber, thetopnumber);
		
	}
}
