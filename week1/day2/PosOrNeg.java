package week1.day2;

public class PosOrNeg {
	
public void pos(int input)


{
	if (input>0)
	{
		System.out.println("the number is positive "+input);
	}
	else if(input==0)
	{
		System.out.println("the number is neither positive nor negtive  "+input);
	}
	else
	{
		System.out.println("the number is negative "+input);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PosOrNeg p=new PosOrNeg();
		p.pos(-4);

	}

}
