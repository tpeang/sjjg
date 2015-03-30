package s5;
//Ë«¶ËÁ´±í
class Link2 {
	public  Link2 next;
	public Long dData;
	public Link2(long dd){
		dData = dd;
	}
	public void displayLink(){
		System.out.print(dData + " ");
	}
}
public class FirstLastList {
	private Link2 first;
	private Link2 last;
	public FirstLastList(){
		first = null;
		last = null;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public void insertFirst(long value){
		Link2 newLink = new Link2(value);
		if(isEmpty()){
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	public void insertLast(long value){
		Link2 newLink = new Link2(value);
		if(isEmpty()){
			first = newLink;
		}else{
			last.next = newLink;
		}
		last = newLink;
	}
	public long deleteFirst(){
		long temp = first.dData;
		if(first.next == null){
			last = null;
		}
		first = first.next;
		return temp;
	}
	public void displayList(){
		System.out.print("list (first-->first): ");
		Link2 current = first ;
		while(current != null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLastList theList = new FirstLastList();
		
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertFirst(11);
		theList.insertFirst(33);
		theList.insertFirst(55);
		theList.displayList();
		
		theList.deleteFirst();
		theList.deleteFirst();
		theList.deleteFirst();
		theList.displayList();
	
	}

}
