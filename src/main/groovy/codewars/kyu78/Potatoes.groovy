package codewars.kyu78

import org.junit.Test

class Potatoes {
    static int potatoes(int p0, int w0, int p1) {
        w0 * Math.round(100 - p0)/Math.round(100 - p1)
    }

    private static void dotest(int p0, int w0, int p1, int expected) {
        equals(expected, potatoes(p0, w0, p1));
    }

    @Test
    public void test() {
        dotest(82, 127, 80, 114);
        dotest(93, 129, 91, 100);
    }
}
