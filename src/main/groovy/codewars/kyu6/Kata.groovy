package codewars.kyu6

import org.junit.Test

/**
 * Simple transposition is a basic and simple cryptography technique.
 * We make 2 rows and put first a letter in the
 * Row 1, the second in the Row 2, third in Row 1 and so on until the end.
 * Then we put the text from Row 2 next to the Row 1 text and thats it.
 */

class Kata {
    static def simpleTransposition(text) {
        // Implement me!
        def array1 = new ArrayList();
        def array2 = new ArrayList();
        def array3 = text.split("")

        for (int i = 0; i < array3.size(); i++) {
            if (i % 2 == 0) {
                array1.add(array3[i])
            } else {
                array2.add(array3[i])
            }
        }
        return array1.join("") + array2.join("")
    }

    @Test
    void "Example Tests"() {
        assert simpleTransposition("Sample text") == "Sml etapetx"
        assert simpleTransposition("Simple transposition") == "Sml rnpstoipetasoiin"
    }
}
