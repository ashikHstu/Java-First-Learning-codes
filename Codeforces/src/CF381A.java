import java.util.Scanner;
public class CF381A {
    static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		n=sc.nextInt();
		int ar[]=new int[n+5];
		int left,right;
		left=0;
		right=n-1;
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int detector;
		int f,s;
		f=s=detector=0;
		while(left<=right)
		{
			if(detector%2==0)
			{
				if(ar[left]<ar[right])
				{
					f+=ar[right];
					right--;
				}
				else 
				{
					f+=ar[left];
					left++;
				}
			}
			else {
				if(ar[left]<ar[right])
				{
					s+=ar[right];
					right--;
				}
				else 
				{
					s+=ar[left];
					left++;
				}
			}
			detector++;
		}
		System.out.println(f+" "+s);

	}

}
