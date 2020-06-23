public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(1));
    }
    public static int getLargestPrime(int number){
        if (number <0) return -1;
        int numMinus = number;
        while (numMinus > 0){
            int theRem = number % numMinus;
            if (theRem ==0){
                // Are you Prime?
                int remMinus = numMinus -1;
                while (remMinus > 0){
                    int remMinusRem = numMinus % remMinus;
                    if (remMinus > 1 && remMinusRem == 0){
                        break;
                    } else if (remMinus == 1 && remMinusRem ==0) {
                        return numMinus;
                    }
                    remMinus --;
                }
            }
            numMinus --;
        }
        return -1;
    }
}
