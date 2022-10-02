package codewars

import org.junit.Test

class CountDigits {
    static int nbDig(int n, int d) {
        // your code here
        def list = new ArrayList()
        for (int i = 0; i <= n; i++) {
            list[i] = i * i
        }
        def count = list.join().split("").countBy { it }
        count.get(d as String)
    }

    @Test
    void basicTests() {
        assert nbDig(10, 1) == 4
        assert nbDig(5750, 0) == 4700
        assert nbDig(11011, 2) == 9481
        assert nbDig(12224, 8) == 7733
        assert nbDig(11549, 1) == 11905
        assert nbDig(14550, 7) == 8014
        assert nbDig(8304, 7) == 3927
        assert nbDig(10576, 9) == 7860
        assert nbDig(12526, 1) == 13558
        assert nbDig(7856, 4) == 7132
        assert nbDig(14956, 1) == 17267
    }
}
