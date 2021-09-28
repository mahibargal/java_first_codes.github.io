

public class count_digits {
    public static void main (String[] args) {

        int num=1234589;
        int count=0;

        if(num==0){

            System.out.println(0);
        }else
        {
            for (int j=num; j>0; j=j/10)

                if(num>0){

                    count++;
                }
            System.out.println(count);
        }


    }
}

