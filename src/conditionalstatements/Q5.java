package conditionalstatements;

public class Q5 {

    public static void main(String[] args) {
        
        int leapYear = 2024;

        if(leapYear % 4 == 0 || leapYear % 100 == 0 || leapYear % 400 == 0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
    
}
