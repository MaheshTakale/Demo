package ArrayOneDimensional;

import java.util.Iterator;

public class HWQ11duplicateelement {

	public static void main(String[] args) {
int[] a= {1,2,2,3,3,3,3};
for (int i = 0; i < a.length; i++)
{
	System.out.print(a[i]+" ");
}
int count=0;
for (int i = 0; i < a.length; i++)
{
	for (int j =i+1; j < a.length; j++)
	{
	if(a[i]==a[j])
	{
		count++;
	break;
	}
	
}
	}
System.out.println();
System.out.println(count);
int index=0;
int[] b=new int[a.length-count];
for (int i = 0; i < a.length; i++)
{
	int rank=1;
	for (int j = 0; j < i; j++)
	{
		if(a[i]==a[j])
			rank++;
	}
	if (rank==1)
	{
		b[index++]=a[i];
	}
}	
	for (int i = 0; i < b.length; i++)
	{
		System.out.print(b[i]+" ");
	}
}
}