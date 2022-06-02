/*****
 * g2154622 Yuma Yoshida
 * 2022 4/7
 * 1から特定の数字まで出力していく。ただし、3の倍数は"Fizz"、5の倍数は"Buzz"、15の倍数は"FizzBuzz"とする
 *****/

public class FizzBuzz {
    void run(String[] args) {
        if (args.length == 0) {
            this.fizzBuzz(10);
        } else {
            Integer num = Integer.valueOf(args[0]);
            this.fizzBuzz(num);
        }
    }

    void fizzBuzz(Integer num) {
        for (Integer i = 1; i <= 15; i++) {
            if (i % 15 == 0) { // 3と5の両方で割れる時
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // 3で割れる時
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // 5で割れる時
                System.out.println("Buzz");
            } else { // それ以外の数字の時
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz num = new FizzBuzz();
        num.run(args);
    }
}
