package day8;

public class PrimeNumber2{
    private int num;

    public PrimeNumber2(int num) {
        this.num = num;
    }

    public boolean isPrime() {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
