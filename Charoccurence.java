package week1.day2;

public class Charoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="welcom to chennai";
    int count=0;
    int strlen=str.length();
    for(int i=0;i<strlen;i++)
    {
    	if(str.charAt(i)=='e')
    	{
    		count++;
    	}
    	System.out.println("occurence of e:"+count);
    }
	}

}
