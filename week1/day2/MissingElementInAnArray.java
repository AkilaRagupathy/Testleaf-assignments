package week1.day2;
import java.util.Arrays;
public class MissingElementInAnArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list= {1,2,3,4,7,6,8};
		
	Arrays.sort(list);
	
	System.out.println(Arrays.toString(list));
		for(int i=1;i<list.length;i++)
		{
			if(i!=list[i-1])
			{
				System.out.println(i);
				break;
			}
		}

	}

}
