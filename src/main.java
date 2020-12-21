public class main {
    public static void main(String[] args) {
        byte a = -10;
        short b = 10140;
        int c = 849;
        long d = 140000;
        float i = (float) 15.10;
        double f = -20.132;
        char l = '*';
        boolean h = true;

        System.out.println(sum(i,i,i,i));
        System.out.println(aaa(9,2));
        bbb(-5);
        ccc(10);
        ddd("Дарья");
    }
    public static  float sum(Float...numb){

        float f = numb[0]*(numb[1]+(numb[2]/numb[3]));
        return(f);

    };
    public static boolean aaa(Integer...a) {

        if (10 <= a[0]+a[1] && a[0]+a[1]<=20)
            return (true);
        else
            return (false);
    }
    public static void bbb(Integer a) {
        if (0<=a)
        System.out.println("Положительное");
        else
        System.out.println("Отрицательное");
}
    public static boolean ccc(Integer a) {
        if (0>=a)
            return (true);
        else
            return (false);
    }
    public static void ddd(String a) {
        System.out.println("Привет, " + a + "!");
    }
}

