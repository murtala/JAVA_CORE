package io.scanner;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
	public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("../java/src/main/java/io/scanner/xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
                s.useDelimiter(",\\s*");
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
