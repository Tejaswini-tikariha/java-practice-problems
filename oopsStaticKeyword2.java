public class oopsStaticKeyword2 {

    static {
        System.out.println("in Block 1");
    }
    static {
        System.out.println("in Block 2");
    }

    public static void main(String[] args) {

        oopsStaticKeyword objO = new oopsStaticKeyword();
        oopsStaticKeyword.A objA = objO.new A();

        oopsStaticKeyword.B objB = new oopsStaticKeyword.B();

        System.out.println("inside main");
    }

    static {
        System.out.println("in Block 3");
    }
}
