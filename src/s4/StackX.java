package s4;

public class StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	public StackX(int maxSize){
		this.maxSize = maxSize;
		stackArray = new char[maxSize];
		top = -1;
		
		
	}
	public void push(char value){
		stackArray[++top]=value;
	}
	public char pop (){
		return stackArray[top--];
	}
	public char peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean full(){
		return top == maxSize-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackX theStack = new StackX(10);
		theStack.push('a');
		theStack.push('b');
		theStack.push('d');
		theStack.push('c');
		System.out.println(theStack.peek());
		while(!theStack.isEmpty()){
			char value = theStack.pop();
			System.out.print(value+" ");
			
		}
		System.out.println("");
		
		
	}

}
