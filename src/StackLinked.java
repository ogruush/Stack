import java.util.LinkedList;


public class StackLinked {
	
	private LinkedList<Integer> list1;
	private int top = -1;
	
	public StackLinked()
	{
		list1 = new LinkedList<Integer>();
	}
	
	public void push(int n)
	{
		list1.add(0, n);
		top++;
	}
	
	public int pop() throws EmptyStackException
	{
		if(top == -1)
		{
			throw new EmptyStackException("Stack is empty.");
		}
		else
		{
			int retVal = list1.remove(0);
			top--;
			return retVal;
		}
	}
	
	public int peek() throws EmptyStackException
	{
		if(top == -1)
		{
			throw new EmptyStackException("Stack is empty");
		}
		else
		{
			return list1.get(0);
		}
	}

}
