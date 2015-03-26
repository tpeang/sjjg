package s5;
class Link {
	
	public long dDate;
	public Link next;
	
	public Link(long dd){
		dDate = dd;
	}
	
	public void displayLink(){
		System.out.println(dDate + " ");
	}
}
public class SortedList {
	private Link first;
	
	public SortedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insert(long key){
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;
		while(current != null && current.dDate > key){
			previous = current;
			current = current.next;
		}
		if(current == null){
			first = newLink;
		}else{
			previous.next = newLink;
			
		}
		newLink.next = current;
	}
	
	public Link remove(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		System.out.print("List (first-->last):");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
 
}