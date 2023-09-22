package special_classes;
import java.util.*;

public class Scanner_input {
	static Scanner input =new Scanner(System.in);
    public static void main(String[] args)

    {

        String Y=input.nextLine();
        String temp="";
        for(int i=0;i<Y.length();i++)
        {
            temp=Y.charAt(i)+temp;
        }
        System.out.println(temp);
        System.out.println(Y);

    }

}
