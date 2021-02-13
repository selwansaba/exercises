/**
 * Created by lenovo on 02/11/2021.
 */
public class Backup {
    int[] a = {1,2,3,4,5};
    int []b =new int[a.length]; ;
  public void print() {
    System.out.print("[");
    for (int i = 0; i < b.length; i++) {
        if (i == b.length - 1)
            System.out.print(b[i]);
        else
            System.out.print(b[i] + ",");
    }
    System.out.println("]");
}
  public void backup(){
      for (int i = 0; i <b.length ; i++) {
          b[i] = a[i];
      }
  }

    public static void main(String[] args) {
        Backup x= new Backup();
        x.print();
        x.backup();
        x.print();
    }
}