package exercises.example11_10;

import exercises.example11_8.TestVersionSimple;
import exercises.example11_9.UsableVNO;

public class TestVersionUsable extends TestVersionSimple {
    public static void main(String[] args) {
        (new TestVersionUsable()).test();
    }
    protected Object makeVersion(int a, int b, int c) {
        return new UsableVNO(a, b, c);
    }
}
