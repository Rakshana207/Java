package special_classes;
import java.util.*;

public class Scanner_input {
	static Scanner input =new Scanner(System.in);
    public static void main(String[] args)

    {

        String y=input.nextLine();
        String temp="";
        for(int i=0;i<y.length();i++)
        {
            temp=y.charAt(i)+temp;
        }
        System.out.println(temp);
        System.out.println(y);

    }

}
