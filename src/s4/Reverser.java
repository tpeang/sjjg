package s4;

public class Reverser {
	private String input;
	private String output;

	public Reverser(String input) {
		this.input = input;
	}

	public String doRev() {
		int stackSize = input.length();
		StackX theStack = new StackX(stackSize);
		for (int j = 0; j < stackSize; j++) {
			char c = input.charAt(j);
			theStack.push(c);
		}
		output = "";
		while (!theStack.isEmpty()) {
			char c = theStack.pop();
			output = output + c;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output;
		Reverser rev = new Reverser("ksfa;fj");
		output = rev.doRev();
		System.out.println(output);
		System.out.println(output);
	}

}
