public class SumCalculator {

    public int sum(int number) {
        if (number<=0){
            throw new IllegalArgumentException("Число повинно бути більше нуля");
        }
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        return result;
    }
}
