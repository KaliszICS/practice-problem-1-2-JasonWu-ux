public class PracticeProblem {

	public static void main(String args[]) {

	}
		public static boolean validIndex(int[] array, int index) {
		try {
			int value = array[index];
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}


	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
			return 0; 
			
		}
	}

	public static int safeConvertStringtoInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

}