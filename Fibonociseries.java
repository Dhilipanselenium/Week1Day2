package week1.day1;

public class Fibonociseries {

	public static void main(String[] args) {
	int firstNum=0,secNum=1,sum,range=8;
	System.out.println(firstNum+secNum);
	for(int i=1;i<range;i++)
	{
		sum=firstNum+secNum;
		System.out.println(""+sum);
		firstNum=secNum;
		secNum=sum;
	}
    

}
}
