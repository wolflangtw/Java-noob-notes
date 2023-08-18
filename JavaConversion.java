// 轉換

public class JavaConversion {
    public static void main(String[] args) {
        // 大小順序: double > float > long > int > short > byte

        // 小範圍轉大範圍
        byte x=3;
        int y=x;
        System.out.println(y);

        // 大範圍轉小範圍
        int a=3;
        byte b = (byte)a;
        System.out.println(y);

        // 字串轉數字
        String c = "34";
        int d = Integer.parseInt(c);
        System.out.println(d);

        String e = "3.14159";
        double f = Double.parseDouble(e);
        System.out.println(f);

        // 數字轉字串
        int g = 1234;
        String h = String.valueOf(g);
        System.out.println(h);

        long l = 99999999;
        String s = String.valueOf(l);
        System.out.println(s);

        float aa = 3.14159F;
        String bb = String.valueOf(aa);
        System.out.println(bb);
    }
}