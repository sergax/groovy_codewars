package codewars.kyu78

import org.junit.Test

/**
 * Count the number of occurrences of each character and return it as a (list of tuples) in order of appearance.
 * For empty output return (an empty list).
 Consult the solution set-up for the exact data structure implementation depending on your language.
 Example:

 Kata.orderedCount("abracadabra") == [['a', 5], ['b', 2], ['r', 2], ['c', 1], ['d', 1]]
 */

class Characters {
    static def orderedCount(input) {
        // Implement me! :)
        input.iterator()
                .countBy { it }
                .collect { [it.key, it.value] }

    }

    @Test
    void "Example Tests"() {
        assert orderedCount('abracadabra') == [['a', 5], ['b', 2], ['r', 2], ['c', 1], ['d', 1]]
        assert orderedCount('Code Wars') == [['C', 1], ['o', 1], ['d', 1], ['e', 1], [' ', 1], ['W', 1], ['a', 1], ['r', 1], ['s', 1]]
    }

}
