

public class largesr_of_n_numbers {

    public static void main (String[] args){

        //largest among n numbers

        int n1=6;
        int n2=9;
        int n3=7;
        int n4=2;

        int arr[] = new int[0] ;

        int highest=0;

        for (int i = 0; i<4; i++)
        {
            if (arr[i]>highest)
            {
                highest=arr[i];
            }
        }
        int i = 0;
        System.out.println(arr[i]);


    }
}
