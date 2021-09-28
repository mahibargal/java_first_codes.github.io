

public class greatest_among_three {
    public static void main (String[] args){


        //greatest among three numbers

        int n1=4;
        int n2=6;
        int n3=1;

        if (n1>n2 && n1>n3)
        {
            System.out.println(n1);
        }else
        if (n2>n1 && n2>n3)
        {
            System.out.println(n2);
        }else
        if (n3>n1 && n3>n2)
        {
            System.out.println(n3);
        }

    }
}
