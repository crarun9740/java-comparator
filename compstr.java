public class compstr {
    public static void main(String[] args) {
        String name1="arun";
        String name2="arun";

        //1 s1 > s2 :+ve value
        //2 s2 == s1: 0
        //3 s1 < s2 :-ve value
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal ");
        }
    }

}
