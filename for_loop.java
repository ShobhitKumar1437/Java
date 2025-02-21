public class for_loop {
    public static void main(String[] args) {
        // Print Square pattern
        // for(int i=1; i<=4; i++){
        //     System.out.println("****");
        // }



        // Print reverse of A number
        // int n = 99801;
        // while(n>0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n/10; // n/=10;
        //}



        // Print reverse the Given number 
        int n = 10899;
        int rev = 0;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10)+lastDigit;
            n=n/10;
        }
        System.out.print(rev);
    }
}




