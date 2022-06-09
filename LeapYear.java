/*****
 * g2154622 Yuma Yoshida
 * 2022 4/7
 * 入力した年が閏年かどうかを判断する
 *****/

public class LeapYear {
    public static void main(String[] args) {
        Integer year = 2016;
        Boolean leapyear = false;

        if ((year % 4 == 0) && (year % 100 != 0)) { // 4で割り切りて100でも割り切れるなら閏年
            leapyear = true;
        } else if (year % 400 == 0) { // 400で割り切れたら閏年
            leapyear = true;
        }

        if (leapyear) { // leapyearがtrueなら閏年
            System.out.printf("%d年は閏年です。%n", year);
        } else { // leapyearがfalseなら閏年ではない
            System.out.printf("%d年は閏年ではありません。%n", year);
        }
    }
}

// shibata
