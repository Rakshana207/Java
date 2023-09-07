package java_course;

public class Road_Toll_main {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        Road_Toll rt1=new Road_Toll();
	        rt1.TireCnt=4;
	        rt1.type="SUV";
	        rt1.CalculateToll();
	        Road_Toll rt2=new Road_Toll("truck",6);
	        rt2.CalculateToll();
	    }

	}
