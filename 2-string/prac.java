public class prac {

    public static void main(String[] args) {
        int i = 5;
        double f = 1.667778;
        String s = " my course";

        System.out.printf("this is the practice %1$d  and  %2$.2f sting \n",i,f);

        String cs = s.toUpperCase().trim();
        System.out.println(cs.substring(3));

        int b  = cs.indexOf('R');
        System.out.println(b);

        boolean bs = cs.contains("R");
        System.out.println(bs);

        System.out.println(cs.concat(" Python"));


    }

}
