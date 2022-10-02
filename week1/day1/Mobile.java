package week1.day1;

public class Mobile
{
  
	public void makeCall() {
		String mobilemodel="SM-M31";
	    float mobileweight=1.2f;
	  System.out.println("My mobile model is: "+mobilemodel);
	  System.out.println("My mobile weight is: "+mobileweight);
  }
  public void sendMsg(){
	  boolean fullcharged=true;
	  int mobilecost=20000;
	  System.out.println("charge is full  "+fullcharged);
	  System.out.println("Mobile cos  "+mobilecost);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mobile m=new Mobile();
	m.makeCall();
	m.sendMsg();
		
		
			}

}
