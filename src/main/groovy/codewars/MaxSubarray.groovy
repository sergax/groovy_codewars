package codewars

import org.junit.Test

class MaxSubarray {
    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        // your code here
        def initialHeight = upSpeed
        def countDays = 1
        while (initialHeight < desiredHeight) {
            initialHeight += upSpeed - downSpeed
            countDays++
        }
        return countDays
    }

    @Test
    void basicTests() {
        assert growingPlant(100, 10, 910) == 10
        assert growingPlant(10, 9, 4) == 1
        assert growingPlant(5, 2, 5) == 1
        assert growingPlant(5, 2, 6) == 2
    }
}
