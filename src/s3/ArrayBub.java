package s3;
//√∞≈›≈≈–Ú
public class ArrayBub {
	private long[] a;
	private int nElems;

	public ArrayBub(int max) {
		a = new long[max];
		nElems =0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for (int j = 0; j< nElems;j++) {
			System.out.print(a[j]+ " ");
		}
	}

	public void bubbleSort() {
		int in, out;
		for (out = nElems - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
				if (a[in] > a[in + 1]) {
					swap(in, in + 1);
				}
			}

		}
	}

	private void swap(int x, int y) {
		long temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void main(String[] args) {
		ArrayBub arr = new ArrayBub(100);
		arr.insert(33);
		arr.insert(44);
		arr.insert(22);
		arr.insert(11);
		arr.insert(77);
		arr.display();
		System.out.println("\nbubbleSort:");
		arr.bubbleSort();
		arr.display();
	}
}
