package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list= { 0, 1, 1, 2, 3, 5, 8, 13};
		int first_num=list[0];
		int second_num=list[1];
	
		
		for(int i=0;i<list.length;i++)
		{
			int sum=first_num+second_num;
			System.out.println(first_num);
			first_num=second_num;
			second_num=sum;
			System.out.println(second_num);
		}
		

	}

}
