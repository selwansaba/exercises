import java.sql.Array;
import java.util.Arrays;

/**
 * Created by lenovo on 02/11/2021.
 */
public class Remove {
    int[] a = {1,2,3,4,5};

    public void print() {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1)
                System.out.print(a[i]);
            else
                System.out.print(a[i] + ",");
        }
        System.out.println("]");
    }

    public void remove(int []arr,int index) {
        if (index>=0 && index<a.length) {

            int i= index;
            while (i < a.length-1) {
             arr[i]=arr[i+1];
                i++;
            }
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        Remove x = new Remove();
        x.print();
        x.remove(x.a,2);
        //x.print();
        System.out.println(Arrays.toString(x.a));
    }
}
