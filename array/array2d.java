public class array2d {

    public static void main(String[] args) {

        int A[][] = new int [3][4];
        int B[][] = {{1,2},{3,3},{4,5}};

        int C[][];      // []C[] or [][]C is also acceptable
        C = new int[3][2];

        int[]E, F[];   // here we have 1 one dimentional arrray E and F is two dimentional array

        E = new int[3];
        // F = new int[2][4];

        int [] G,H,I,J ;  //These all are single dimentional array

        for (int i = 0; i < B.length; i++) {


             for (int k = 0; k < B[0].length; k++) {

                System.out.println(B[i][k]);

             }

        }


        System.out.println("===== two dimention array in for each loop======");

        for (int x[]:B) {
            for (int y:x) {
                System.out.println(y);
            }
        }


    }

    

}
