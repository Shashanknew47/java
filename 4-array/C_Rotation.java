import javax.swing.text.AbstractDocument.LeafElement;

public class C_Rotation {

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};

        int temp = A[0];

        for (int i=0; i<A.length-1; i++) {

                A[i] = A[i+1];

        }

        A[A.length -1] = temp;

        for (int x:A) {
            System.out.println(x);
        }


    }

}
