package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java2";
        String deco = DecoUtil2.deco(s);
        Test test = new Test();
        Test2 test2 = new Test2();
        // 클래스에 있는 값을 직접 바꿔줌.
        test.a = 20;
        test2.b = 30;
        int test3 = new Test().c;
        int test4 = new Test().a;
        test.c = 40;
        System.out.println(test.a);
        System.out.println(test2.b);
        System.out.println(test.c);
        System.out.println("before : " + s + ", after : " + deco);
    }

    //static 은 static 끼리만 사용할 수 있다.
    static class Test{
        int a = 10;
        private int c = 30;
        // 객체를 생성하지 않으면 호출이 되지 않는다.
    }


}

