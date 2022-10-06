package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 34343, rev = 0;
		int palin=input;
		int remain;
		

		for (; input != 0;) {
			remain = input % 10;
			rev = rev * 10 + remain;
			input = input / 10;
		}

		if (palin == rev) {
			System.out.println("the no " + palin + " is a palindrome");
		} else {
			System.out.println("the no " + palin + " is not a palindrome");
		}

	}

}
