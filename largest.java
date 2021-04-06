class largest
{
public static void main(String[] args)
{
int []arr={23,45,67,88,99};
int max=arr[0];
for (int i=0;i<arr.length;i++)
{
if (arr[i]>max)
max=arr[i];
}
System.out.println("largest element in given array:"+max);
}
}