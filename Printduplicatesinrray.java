package week1.day2;

public class Printduplicatesinrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //intialize array
		int[] arr=new int[] {1,2,3,4,2,7,8,8,3};
		System.out.println("duplicate elements in the givrn array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
		}
	}

}
}
