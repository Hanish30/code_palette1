
import java.util.*;
import java.lang.*;
import java.io.*;
class FindElement
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine().trim());
            int  a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(br.readLine().trim());
            }
            int element=find(a,n);
            System.out.println("ans : "+element);
        }

    }
    static int find(int arr[],int n)
    {//O(1) time
        if(n==0||n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return arr[0];
        }
        int res=0;
        for(int i=2;i<n;i++)
        {
            if(arr[i]==arr[i-2])
            {
                res=arr[i];
                break;
            }
            else{
                res=arr[1];
                break;
            }
        }
        return res;
    }
}