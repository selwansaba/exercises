import java.sql.Array;
import java.util.Arrays;

/**
 * Created by lenovo on 02/25/2021.
 */
public class Merge<E> {


    public void megers(E []a1,E []a2)
    {
        int first =a1.length ;
        int second=a2.length ;
        int x= a1.length+a2.length ;
        E[] result= (E[]) new Object[x];

        System.arraycopy(a1,0,result,0,first);
        System.arraycopy(a2,0,result,first,second);
        System.out.println(Arrays.toString(result));
    }


    public static void main(String[] args) {
        Integer a[]={11,12,13,14,15};
        Integer b[]={11,12,13,14,15};
        String c[]={"sss","rrr","www"};
        String d []={"sss","rrr","www"};
        Merge<Integer> ss=new Merge<>();
        Merge<String> aa=new Merge<>();
        ss.megers(a,b);
        aa.megers(c,d);

    }
}
