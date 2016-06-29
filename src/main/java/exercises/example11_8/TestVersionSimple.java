package exercises.example11_8;

import java.util.*;

public class TestVersionSimple {
    public static void main(String[] args) {
        (new TestVersionSimple()).test();
    }

    protected Object makeVersion(int a, int b, int c) {
        return new SimpleVNO(a, b, c);
    }

    protected void test() {
        // Three individual version numbers.
        Object latest  = makeVersion(9,1,1);                    // (1)
        Object inShops = makeVersion(9,1,1);                    // (2)
        Object older   = makeVersion(6,6,6);                    // (3)

        // An array of version numbers.
        Object[] versions = {                                   // (4)
            makeVersion( 3,49, 1), makeVersion( 8,19,81),
            makeVersion( 2,48,28), makeVersion(10,23,78),
            makeVersion( 9, 1, 1)};

        // An array of downloads.
        Integer[] downloads = {                                 // (5)
            new Integer(245), new Integer(786),
            new Integer(54), new Integer(1010),
            new Integer(123)};
        // Various tests.
        System.out.println("Test object reference and value equality:");
        System.out.println("    latest: " + latest + ", inShops: " + inShops
                + ", older: " + older);
        System.out.println("    latest == inShops: " +
                    (latest == inShops));                       // (6)
        System.out.println("    latest.equals(inShops): " +
                    (latest.equals(inShops)));                  // (7)
        System.out.println("    latest == older: " +
                    (latest == older));                         // (8)
        System.out.println("    latest.equals(older): " +
                    (latest.equals(older)));                    // (9)

        Object searchKey = inShops;
        System.out.println("Search key: " + searchKey);         // (10)

        System.out.print("Array: ");
        for (int i = 0; i < versions.length; i++)               // (11)
            System.out.print(versions[i] + " ");
        boolean found = false;
        for (int i = 0; i < versions.length && !found; i++)
            found  = searchKey.equals(versions[i]);             // (12)
        System.out.println("\n    Search key found in array: "
                + found);                                       // (13)

        List vnoList = Arrays.asList(versions);                 // (14)
        System.out.println("List: " + vnoList);
        System.out.println("    Search key contained in list: " +
                    vnoList.contains(searchKey));               // (15)

        Map versionStatistics = new HashMap();                  // (16)
        for (int i = 0; i < versions.length; i++)               // (17)
            versionStatistics.put(versions[i], downloads[i]);
        System.out.println("Map: " + versionStatistics);        // (18)
        System.out.println("    Hash code for keys in the map:");
        for (int i = 0; i < versions.length; i++)               // (19)
            System.out.println("        " + versions[i] + ": "
                    + versions[i].hashCode());
        System.out.println("    Search key " + searchKey
                + " has hash code: " + searchKey.hashCode());   // (20)
        System.out.println("    Map contains search key: " +
            versionStatistics.containsKey(searchKey));          // (21)

        System.out.println("Sorted list:\n\t"
                + (new TreeSet(vnoList)));                      // (22)
        System.out.println("Sorted map:\n\t"
                + (new TreeMap(versionStatistics)));            // (23)

        System.out.println("List before sorting: " + vnoList);  // (24)
        Collections.sort(vnoList);
        System.out.println("List after sorting:  " + vnoList);
        System.out.println("Binary search in list:");           // (25)
        int resultIndex = Collections.binarySearch(vnoList, searchKey);
        System.out.println("\tKey: " + searchKey +
                           "\tKey index: " + resultIndex);
    }
    
    
    public class SimpleVNO {
        // Does not override equals() or hashCode().

        private int release;
        private int revision;
        private int patch;

        public SimpleVNO(int release, int revision, int patch) {
            this.release  = release;
            this.revision = revision;
            this.patch    = patch;
        }

        public String toString() {
            return "(" + release + "." + revision + "." + patch + ")";
        }
    }

}
