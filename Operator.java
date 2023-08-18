// 運行符號

public class Operator {
    public static void main(String[] args) {
        // 直接運算
        int x = 1+2;
        System.out.println(x);
        // 指定運算
        int a = 5;
        a+=2;
        System.out.println(a);
        // 比較運算
        boolean b = 3>5;
        System.out.println(b);
        // 單元運算
        int c = 4;
        c++;
        System.out.println(c);

        boolean d = !true;
        System.out.println(d);
        // 邏輯運算
        boolean e = true&&false;
        System.out.println(e);
        boolean f = false || true;
        System.out.println(f);
    }
}