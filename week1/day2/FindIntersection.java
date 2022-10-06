package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstarr = { 3, 2, 11, 4, 6, 7, 9 };
		int[] secarr = { 1, 2, 8, 4, 9, 7, 11 };
		

		for (int i = 0; i < firstarr.length; i++) {
			for (int j = 0; j < secarr.length; j++) {
				if (firstarr[i] == secarr[j]) {

					System.out.println(firstarr[i]);
				}
			}
		}

	}

}
