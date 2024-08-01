import java.util.Scanner;
public class lengthandending
{
    public static void main(String[] args) 

    {
        Scanner sc = new Scanner(System.in);      
        int n = 10;         
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
              if(k==n-i)
              System.out.print(n-i+" ");
              else
              System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}