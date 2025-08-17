// import java.util.*;
// public class PrimeOrNot {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n == 2){
//             System.out.println("n is prime");
//         }else{
//             boolean isprime = true;
//             for (int i = 2; i <=n-1; i++){
//                 if(n % i == 0){
//                     is prime = false;
//                 }
//             }
//             if(is prime){
//                 System.out.println("n is prime");
//             }else{

//                 System.out.println("n is not prime");
//             }
//         }
//     }
    
// }


import java.util.*;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

        sc.close();
    }
}
