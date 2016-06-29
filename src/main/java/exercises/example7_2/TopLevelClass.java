package example7_2;

//Filename: TopLevelClass.java
//package express;

public class TopLevelClass {                          // (1)
 // ...
 public static class StaticMemberClass_1 {         // (2)
     // ...
     private interface StaticMemberInterface_1_1 { // (3)
         // ...
     }
     public static class StaticMemberClass_1_1
         implements StaticMemberInterface_1 {      // (4)
         // ...
     }
 }
 interface StaticMemberInterface_1
     extends StaticMemberClass_1.StaticMemberInterface_1_1 {        // (5)
     // ...
 }
}
class AnotherTopLevelClass
     implements TopLevelClass.StaticMemberInterface_1 {             // (6)

 TopLevelClass.StaticMemberClass_1.StaticMemberClass_1_1 objRef1 =
     new TopLevelClass.StaticMemberClass_1.StaticMemberClass_1_1(); // (7)

 //TopLevelClass.StaticMemberClass_1.StaticMemberInterface_1_1 ref; // (8)
 // ...
}
