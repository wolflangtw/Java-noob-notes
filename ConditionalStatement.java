// 判斷式
import java.util.Scanner;

public class ConditionalStatement{
    public static void main(String[] args) {
        // 標諄輸入
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數: ");
        int x = s.nextInt();
        System.out.println(x*10);

        // if 判斷式
        Scanner a = new Scanner(System.in);
        System.out.println("你想要領多少錢?");
        int money=a.nextInt();
        if(money > 10000) {
            System.out.println("失敗");
        } else if(money <= 100){
            System.out.println("錢太少了");
        } else {
            System.out.println("成功");
        }
        // switch 判斷式
        System.out.println("你的名字: ");
        Scanner b = new Scanner(System.in);
        String c = b.next();
        switch (c) {
            case "wolf":
                System.out.println("你成功了!");
                break;
            case "cat":
                System.out.println("你成功了!");
                break;
            default:
                System.out.println("WHO ARE YOU!");
                break;
        }
    }
}