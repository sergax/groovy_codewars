package codewars.kyu78

import org.junit.Test

class CharactersCount {
    static def count(string) {
        // Implement me! :)
        if (string == "") return new HashMap()
        def map = new HashMap()
        def array = string.split("")
        for (i in 0..<array.size()) {
            if (map.containsKey(array[i])) {
                def value = map.get(array[i])
                map.put(array[i], 1 + value)
            } else {
                map.put(array[i], 1)
            }
        }
        return map
    }

    static def count2(string) {
        // Implement me! :)
        string.iterator().countBy{it}
    }

    @Test
    void "Example Tests"() {
        assert count('aba') == ['a': 2, 'b': 1]
        assert count('') == [:]

        assert count2('aba') == ['a': 2, 'b': 1]
        assert count2('') == [:]
    }
}
