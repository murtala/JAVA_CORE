package EnhancedForLoop;

import java.util.*;

public class EnhancedForLoop {

  public static void main(String[] args) {

{
int[] ageInfo = {12, 30, 45, 55};
int sumAge = 0;
for (int i = 0; i < ageInfo.length; i++)
    sumAge += ageInfo[i];
    }
}

{
int[] ageInfo = {12, 30, 45, 55};
int sumAge = 0;
for (int element : ageInfo)
    sumAge += element;
}

{
Collection nameList = new ArrayList();
nameList.add("Tom");
nameList.add("Dick");
nameList.add("Harry");
for (Iterator it = nameList.iterator();
     it.hasNext(); ) {
    Object element = it.next();
    if (element instanceof String) {
        String name = (String) element;
        //...
    }
}
}

{
Collection nameList = new ArrayList();
nameList.add("Tom");
nameList.add("Dick");
nameList.add("Harry");
for (Object element : nameList) {
    if (element instanceof String) {
        String name = (String) element;
        //...
    }
}
}

{
Collection<String> nameList =
           new ArrayList<String>();
nameList.add("Tom");
nameList.add("Dick");
nameList.add("Harry");
for (Iterator<String> it = nameList.iterator();
     it.hasNext(); ) {
     String name = it.next();
     //...
}
}

{
Collection<String> nameList =
           new ArrayList<String>();
nameList.add("Tom");
nameList.add("Dick");
nameList.add("Harry");
for (String name : nameList) {
     //...
}
}
}
