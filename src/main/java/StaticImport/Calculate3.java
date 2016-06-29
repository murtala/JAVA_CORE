package StaticImport;

import static java.lang.Math.sqrt; // Static method
import static java.lang.Math.PI;   // Static field
// Only specified static members are imported.
class Calculate3 {
  public static void main(String[] args) {
    double x = 10.0, y = 20.5;
    double squareroot = sqrt(x);
    double hypotenue = Math.hypot(x, y);
    double area = PI * y * y;
  }
}