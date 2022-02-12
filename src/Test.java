import java.util.*;
class Test
{
    public static void main (String[] args) {

        Scanner s=new Scanner(System.in);
        LinkedList l=new LinkedList();
        int size=s.nextInt();
        for(int i=0;i<size;i++)
        {
            l.add(s.nextInt()*s.nextInt());
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(l.get(i));
        }

    }


}