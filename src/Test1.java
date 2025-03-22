//import
import java.util.Scanner;
import java.util.Random;

//テストクラス
public class Test1 {
    //足し算
    public static String add(String a, String b) {
        //ローカル変数
        int add1;
        int add2;
        int r;
        String answer = "";

        try {
            //文字列を数値に
            add1 = Integer.parseInt(a);
            add2 = Integer.parseInt(b);

            //とりあえず計算する
            answer = String.valueOf(add1 + add2);

            //ちょっと乱数作る
            Random rand = new Random();
            r = rand.nextInt();

            //やっぱり答えを乱数にする
            answer = String.valueOf(r);

        } catch (NumberFormatException e) {
            //数字を入れなかった罰
            e.printStackTrace();
        }

        //答えを返そう
        return answer;
    }

    //メインメソッド
    public static void main(String[] args) {
        //入力
        Scanner sc = new Scanner(System.in);

        //数値１
        System.out.print("add1 -> ");
        String input1 = sc.nextLine();

        //数値２
        System.out.print("add2 -> ");
        String input2 = sc.nextLine();

        //答え
        String output = add(input1, input2);
        System.out.println(input1 + " + " + input2 + " = " + output);
    }
}
