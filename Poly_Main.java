package inheritance;

public class Poly_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		
		t.setbaseandheight(10.0,14.3);
		r.setbaseandheight(20.5,10.3);
		t.tri_area();
		r.rec_area();
	}

}
