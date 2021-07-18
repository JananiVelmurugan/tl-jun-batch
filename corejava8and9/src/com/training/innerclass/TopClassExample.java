package com.training.innerclass;

public class TopClassExample {

	public TopClassExample() {

		Runnable runn = new Runnable() {

			@Override
			public void run() {
				System.out.println("run");

			}
		};
		Thread thread = new Thread(runn);
		thread.start();
	}

	public void count(int i) {
		int j;
		class MetInnerClass {
			public MetInnerClass() {
//				i++;
//				System.out.println(i);
//				j++;
//				System.out.println(j);
			}
		}
//		i++;
//		j++;
		MetInnerClass metInner = new MetInnerClass();
	}

	public static class StaticInner {
		public static void main(String[] args) {
			System.out.println("Static Inner");
		}
	}

	class InnerClass {
		void print() {

		}

//		public static void main(String[] args) {
//
//		}

	}

	public static void main(String[] args) {

		// InnerClass obj = new InnerClass();

		TopClassExample outer = new TopClassExample();
		InnerClass innerCls = outer.new InnerClass();
		innerCls.print();

		StaticInner staticInner = new StaticInner();
		System.out.println("Top Class");
	}

}

class SubClass extends TopClassExample {

	public static void main(String[] args) {
		TopClassExample obj = new SubClass();
		InnerClass innerClass = obj.new InnerClass();
		innerClass.print();

	}
}
