import java.util.*;

class Demo {
    public static void main(String[] args) {
        System.out.println(getPrimes(10));
    }
    public static ArrayList<Integer> getPrimes(int n) {

        for(int i=2;i<=n;i++){
            if(isPrime(i) && isPrime(n-i) && (i < n-i)){
                return new ArrayList<>(Arrays.asList(i,n-i));
            }
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }

    static boolean isPrime(int i) {
        for (int j = 2; j * j <= i; j++) {
            if(i%j==0) return false;
        }
        return true;
    }
}
