import java.util.*;
class Test1
{
    public static void main (String[] args) {

        Scanner s=new Scanner(System.in);
        LinkedList l=new LinkedList();
        int size=s.nextInt();
        for(int i=0;i<size;i++)
        {
            int c=s.nextInt();
            float d=0.143f *(float)c;
            float g=1f;
            for(int j=1;j<=c;j++)
            {
                g=g*d;
            }
            l.add(Math.round(g));


        }
        for(int i=0;i<size;i++)
        {
            System.out.println(l.get(i));
        }
    }


}