package s5;
class Link1{
	public int iData;
	public double dData;
	public Link1 next;
	public Link1(int id, double dd){
		iData = id;
		dData = dd;
	}
	public void displayLink(){
		System.out.print("{" + iData +", " + dData+"} ");
	}
}

public class LinkList {
	private Link1 first;
	
	public LinkList (){
		first = null; // no items on list yet
	}
	public boolean isEmpty(){
		return first==null;
	}
	public void insertFirst(int id, double dd){
		Link1 newLink = new Link1(id, dd);
		newLink.next = first;
		first = newLink;
	}
	public Link1 deleteFirst(){
		Link1 temp = first;
		first = first.next;
		return temp;
	}
	public void displayList(){
		System.out.println("List (first-->last): ");
		Link1 current = first;
		while(current!=null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList theList = new LinkList();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.displayList();
		while(!theList.isEmpty()){
			Link1 aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList();
	}

}
