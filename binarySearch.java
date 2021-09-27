package Array;

public class binarySearch {

	public static void main(String[] args) 
	{
int [] a= {6,7,8,9,11,13,14,15,16};
int start=0;
int num=18;
int end=a.length-1;
int min;
while (start<=end)
{ 
	min=(start+end)/2;

	if(a[min]==num) 
	{
	System.out.println("present at index "+min);
	break;
	}
	else if(num>a[min])
		start=min+1;
	else 
		end=min-1;
	if(start>end)
		System.out.println("not found");
}
System.out.println();
	}

}
