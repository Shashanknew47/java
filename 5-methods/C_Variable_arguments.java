
public class C_Variable_arguments {

    // ... variable arguments are just like *args in Python. Here it converted into consolidated array

    static void show(char initial,int ...A)
        {
            System.out.println(initial);
            for (int x:A) {
                System.out.println(x);
            }
        }

    public static void main(String[] args) {

        show('A');

        System.out.println("-------**----------");
        show('B',20,30);
        System.out.println("-------**----------");

        System.out.println("Here we can pass a array also which will be treaded just like * arguments");

        show('@',new int[] {1000,2000,3000});

    }

}
