import java.util.Arrays;

/**
 * Created by lenovo on 02/25/2021.
 */
public class Reverse<E> {

    public void reverse(E a[])
    {
        int n=a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            E t= a[i];
            a[i] = a[n];
            a[n] = t;
            n--;
        }
    }

    public static void main(String[] args) {
        Reverse<Integer>a1 =new Reverse<>();
        Integer a[]={11,12,13,14,15};
        Reverse<String>a2 =new Reverse<>();
       String b[]={"sss","rrr","www"};
        a1.reverse(a);
       a2.reverse(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}