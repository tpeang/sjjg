package s4;

public class Queue {
	private int maxSize;
	private long[] queArray;
	private int font, rear, nItems;
	public Queue(int s){
		maxSize = s;
		queArray = new long[maxSize];
		font = 0;
		rear = -1;
		nItems = 0;
	}
	public void  insert(long value){
		if(rear==maxSize-1)
			rear = -1;
		queArray[++rear]=value;
		nItems++;
		
	}
	
	public long remove(){
		long temp = queArray[font++];
		if(font == maxSize){
			font =0;
		}
		nItems--;
		return temp;
	}
	
	public long peekFront(){
		return queArray[font];
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems ==maxSize;
	}
	public int size(){
		return nItems;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue theQueue = new Queue(5);
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
		theQueue.remove();
		theQueue.remove();
		theQueue.remove();
		
		theQueue.insert(50);
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		while(!theQueue.isEmpty()){
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.print(" ");
	}

}
