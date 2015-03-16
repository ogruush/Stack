
public class StackArray {
	private int[] arr;
	private int top=-1;
	
	public StackArray(int size)
	{
		arr = new int[size];
	}
	
	public void push(int n) throws StackOverflowException
	{
		top++;
		if(top<arr.length)
			arr[top] = n;
		else
		{
		//todo: we have to throw error if the stack is full 
			top--;
			throw new StackOverflowException("Stack is full.");
		}
	}
	
	public int pop() throws EmptyStackException
	{
		if(top == -1)
		{
			throw new EmptyStackException("Stack is empty.");
		}
		else
		{
			int retVal = arr[top];
			top--;
			return retVal;
		}
	}
	
	public int peek() throws EmptyStackException
	{
		if(top == -1)
		{
			throw new EmptyStackException("Stack is empty.");
		}
		else
		{
			return arr[top];
		}
	}

}
