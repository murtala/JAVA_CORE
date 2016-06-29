package exercises.example7_1;

class TLC {                    // (1) Top level class

    static class SMC {/*...*/} // (2) Static member class

    interface SMI {/*...*/}    // (3) Static member interface

    class NSMC {/*...*/}       // (4) Non-static member (inner) class

    void nsm() {
        class NSLC {/*...*/}   // (5) Local (inner) class in non-static context
    }

    static void sm() {
        class SLC {/*...*/}    // (6) Local (inner) class in static context
    }

    SMC nsf = new SMC()
            {/*...*/};     // (7) Annonymous (inner) class in non-static context

    static SMI sf = new SMI()
            {/*...*/};     // (8) Annonymous (inner) class in static context
}
