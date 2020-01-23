package number;

public class NumberOfEvenAndOddDigit {

    public static void numberOfEvenAndOdd(int num){
        int even = 0 , odd = 0;
        int r;
        while(num != 0){
            r = num % 10;
            if(r%2 ==0)
                even++;
            else
                odd++;
            num = num / 10;
        }
        System.out.println("even : " + even + " Odd : " + odd);

    }

    public static void main(String[] args) {
        numberOfEvenAndOdd(93456344);
    }

}
