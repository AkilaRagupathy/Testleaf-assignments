package week1.day2;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input;
input=11;
boolean p=true;

for(int i=2;i<=input;i++) 
{
	
	if (input%i ==0)
			{
		p=false;
	    break;
			}
	
	   }
if(p)
	
	System.out.println("is a prime no");
	
else 
	System.out.println("the number "+input+" is not a prime number");


	}

}