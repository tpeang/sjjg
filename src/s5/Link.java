package s5;

public class Link {
	
	public long dDate;
	public Link next;
	
	public Link(long dd){
		dDate = dd;
	}
	
	public void displayLink(){
		System.out.println(dDate + " ");
	}
}
