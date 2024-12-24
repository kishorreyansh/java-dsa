package recursionbasicsadvanced;

public class FriendsPairingProblem {

    public static int friendsPairing(int n){

        if( n == 1 || n == 2){
            return n;
        }

        //Single Choice
        int singleChoice = friendsPairing(n-1);
         
        //Pairing
        int pairing = (n-1) * friendsPairing(n-2);

        int totalWays = singleChoice + pairing ;

        return totalWays;

    }

    public static void main(String[] args) {
        int n=4;
        System.out.println("Total Ways of Pairing: "+friendsPairing(n));
    }
    
}
