package s3;
//—°‘Ò≈≈–Ú
public class ArraySel {
	private long[] a;
	private int nElems;
	public ArraySel(int max){
		a = new long[max];
		nElems = 0;
	}
	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	public void display(){
		for(int j = 0; j< nElems; j++){
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	public void SelectionSort(){
		int in, out, min;
		for(out=0;out<nElems-1;out++){
			min = out;
			for(in=out+1;in<nElems;in++){
				if(a[in]<a[min]){
					min = in;
				}
			
			}
			swap(min,out);
		}
	}

	private void swap(int x, int y) {
		long temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySel arr = new ArraySel(100);
		arr.insert(33);
		arr.insert(44);
		arr.insert(22);
		arr.insert(11);
		arr.insert(77);
		arr.display();
		System.out.print("\nbubbleSort:");
		arr.SelectionSort();
		arr.display();
	}

}
