public class prac {

    static void check(String first_arg,int ...var_args){

        System.out.println(first_arg);
        for (int x:var_args) {
            System.out.println(x);
        }
    }


    public static void main(String[] args) {
         check("first_success");

         check("second",1,23,34);
    }

}
