package java_course;

public class Road_Toll {
	String type="";
	int TireCnt;

	public void CalculateToll()
	{
		if(TireCnt==2)
		{
			System.out.println("Your Toll Amount is 0");
		}
		else if (TireCnt==4)
		{
			System.out.println("Your Toll Amount is 10");
		}
		else if(TireCnt>4)
		{
			System.out.println("Your Toll Amount is 20");
		}
		else
		{
			System.out.println("Incorrect Tire Count ");
		}    
	}
	public Road_Toll()
	{

	}
	public Road_Toll(String ype,int Tcnt)
	{
		this.type=ype;
		this.TireCnt=Tcnt;
	}

}

