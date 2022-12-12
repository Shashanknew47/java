import java.lang.*;

class A_Array {
    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        int B[] = new int[5];
        int C[];

        B[2] = 3;
        System.out.println("B = " + B);

        C = new int[3];

        System.out.println(A);
        System.out.println(A[2]);
        System.out.println(A.length);

        System.out.println("-----------------------");

        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }


    System.out.println("---for each loop in array------");

        for (int x:A){
            System.out.println(x);
        }

        System.out.println(A.toString().charAt(4));

    }
}
