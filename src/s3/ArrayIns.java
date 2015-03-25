package s3;

public class ArrayIns {
	private long[] a;
	private int nElems;
	public ArrayIns(int max){
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
	public void InsertionSort(){
		int in, out;
		for(out=1;out<nElems;out++){
			long temp = a[out];
			in = out;
			while(in>0&&a[in-1]>=temp){
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayIns arr = new ArrayIns(100);
		arr.insert(33);
		arr.insert(44);
		arr.insert(22);
		arr.insert(11);
		arr.insert(77);
		arr.display();
		System.out.print("InsertionSort:");
		arr.InsertionSort();
		arr.display();
	}

}
