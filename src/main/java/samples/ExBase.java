package samples;
public class ExBase extends Base {

public ExBase() {
System.out.println("ExBase");
}

public void doSome(int num) {
this.doSome(0);
System.out.println("The num is " + num);
}

public static void doSome2() {
System.out.println("StaticExBase");
}

public static void main(String[] arg) {
ExBase ex = new ExBase();
ex.doSome(0);
ex.doSome(2);
}
}
