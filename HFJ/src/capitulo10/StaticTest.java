package capitulo10;

public class StaticTest extends StaticSuper{

    static int rand;

    static{
        rand = (int) (Math.random()*6);
        System.out.println("static block " + rand);
    }
    StaticTest(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTest st = new StaticTest();
    }
}
