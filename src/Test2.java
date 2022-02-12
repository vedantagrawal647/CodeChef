import java.util.Scanner;
class Test2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        String[] sar=new String[size];
        for(int i=0;i<size;i++)
        {

            int b=s.nextInt();
            int c=s.nextInt();
            String str=s.next();
            char[] arr=new char[b];
            for(int j=0;j<b;j++)
            {
                arr[j]=str.charAt(j);

            }
            int u=0;
            for(int j=0;j<b/2;j++)
            {
                if(arr[j]!=arr[b-1-j])
                {
                    u=u+1;
                }

            }


            if(u==c)
            {
                sar[i]="YES";

            }
            else
            {
                sar[i]="NO";
            }


        }

        for(int i=0;i<size;i++)
        {
            System.out.println(sar[i]);
        }


    }
}