/*****
 * g2154622 Yuma Yoshida
 * 2022 4/7
 * 1から特定の数字まで出力していく。ただし、3の倍数は"Fizz"、5の倍数は"Buzz"、15の倍数は"FizzBuzz"とする
 * <<<<<<< HEAD
 *****/

public class FizzBuzz {
    void run(String[] args) {
        if (args.length == 0) { // コマンドライン引数がないとき
            this.fizzBuzz(10); // fizzBuzzメソッドに移動
        } else { // コマンドライン引数があるとき
            Integer num = Integer.valueOf(args[0]);
            this.fizzBuzz(num); // fizzBuzzメソッドに移動
        }
    }

    void fizzBuzz(Integer num) {
        for (Integer i = 1; i <= 15; i++) {
            if (i % 15 == 0) { // 3と5の両方で割れるとき
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // 3で割れるとき
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // 5で割れるとき
                System.out.println("Buzz");
            } else { // それ以外の数字のとき
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz num = new FizzBuzz();
        num.run(args);
    }
}
