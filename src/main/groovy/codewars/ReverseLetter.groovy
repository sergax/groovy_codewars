package codewars

import org.junit.Test

class ReverseLetter {
    static def reverseLetter(string) {
        // Implement me! :)
        string.replaceAll("[^A-Za-z]", "").reverse()

    }

    @Test
    void "Example Tests"() {
        assert reverseLetter("krishan") == "nahsirk"
        assert reverseLetter("ultr53o?n") == "nortlu"
        assert reverseLetter("ab23c") == "cba"
        assert reverseLetter("krish21an") == "nahsirk"
    }
}
