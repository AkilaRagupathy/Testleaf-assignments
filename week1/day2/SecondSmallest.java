package week1.day2;

//import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] list= {23,45,67,32,89,22};
		int	first_small=list[0];
		int	second_small=list[1];
		
		if(first_small>second_small)
		{
			int t=second_small;
			second_small=first_small;
			first_small=t;
			
		}
		
		for(int i=2;i<list.length;i++)
		{
			int current_num=list[i];
			if(current_num<first_small)
			{
				first_small=current_num;
				
			}
			
			if(current_num>first_small && current_num<second_small)
			{
				second_small=current_num;
				
			}
			
		}
		System.out.println("The second smallest number is  "+second_small);
	}

}
