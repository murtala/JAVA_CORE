package exercises.ch6_4;

class Light { /* ... */ }

class TubeLight extends Light { /* ... */ }

public class OverloadResolution {
    boolean testIfOn(Light aLight)         { return true; }    // (1)
    boolean testIfOn(TubeLight aTubeLight) { return false; }   // (2)
    public static void main(String[] args) {

        TubeLight tubeLight = new TubeLight();
        Light     light     = new Light();

        OverloadResolution client = new OverloadResolution();
        System.out.println(client.testIfOn(tubeLight));// (3) ==> method at (2)
        System.out.println(client.testIfOn(light));    // (4) ==> method at (1)

    }
}
