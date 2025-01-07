package practice;

public class StringExample {

    public static void main(String[] args) {
        
        String s1 = "kishor";
        String s4 = "kishor";
        String s2 = new String("reyansh");
        String s3 = s1 + " " + s2;

        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);
        System.out.println(s3.charAt(0));

        // for(int i=0; i<s3.length(); i++){
        //     System.out.println("Each Character: "+s3.charAt(i));
        // }

        System.out.println(s1.length());

        // String name="noon";

        // for(int i=0; i<name.length()/2;i++){
        //     if(name.charAt(i) != name.charAt(name.length()-1-i)){
        //         System.out.println("Not Palindrome");
        //     }
        //     else{
        //         System.out.println("Palindrome");
        //     }
        // }
    }
    
}
