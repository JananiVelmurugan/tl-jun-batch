import com.training.primitivetypes.TypeDeclaration;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Arithmetic Calculator");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition is "+ (a + b));
		// 30
		// Addition is 30
		TypeDeclaration.add();
	}
	public static void add() {
		System.out.println("Adding");
		return;
	}

}
