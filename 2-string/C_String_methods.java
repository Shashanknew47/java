/* Important String_methods
!--  length   (len)
!-- toLowerCase, toUpperCase
!-- trim
!-- substring(int begin, int end)     |(like slicing)
!-- startswith, endswith
!-- charAt  (will give that which character at a specific index)
!-- indexOf(string,index)   (will give the index number of a specific character from left, index is from where the
!--                                            search should begin. if charater not found then will return -1)

!-- equals ( is just like "==" operator in Python String)
!-- equalsIngnoreCase   (will check equality irrespective of cases)

!-- contians ("in" in Python)
!-- concat

 */


class C_String_methods {
        public static void main(String[] args) {
            String str = new String("        java_course    ");
            str = str.toUpperCase();
            System.out.println(str);

            str = str.trim();
            System.out.println(str.toLowerCase());

            String replace_str = str.replace('J', 'P');
            System.out.println(replace_str);

            String slice_str = str.substring(2,9);
            System.out.println(slice_str);

            System.out.printf("This is %2$s and %1$s course\n",str,replace_str);

            char character = str.charAt(5);
            System.out.println(character);

            int i = str.indexOf('A',2);
            System.out.println(i);

            String mix = str.concat(" " + slice_str);
            System.out.println(mix);

            System.out.println(str.contains("JAVA"));

            String new_str = "Programmer@gmail.com";
            int start = new_str.indexOf("@");
            int end = new_str.indexOf(".");

            String domain = new_str.substring(start + 1, end);
            System.out.println("domain: " + domain);

            String username = new_str.substring(0,start);
            System.out.println("username:" + username);

        }
}
