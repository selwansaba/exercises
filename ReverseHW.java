/**
 * Created by lenovo on 02/10/2021.
 */
public class ReverseHW {
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

    public void reverse() {

        int n=a.length-1;
        int i = 0;
       while (i <a.length/2 ) {
            int t= a[i];
            a[i] = a[n];
            a[n] = t;
            n--;
           i++;
            }
        }


    public static void main(String[] args) {
        ReverseHW x = new ReverseHW();
        x.print();
        x.reverse();
        x.print();
    }

}
