package codewars.kyu78

import org.junit.Test

class SplitStrings {
    static List<String> solution(String str) {
        // Implement me! :)
        def list = []
        def split = str.split("").toList()
        if (split == [""]) return new ArrayList<String>()
        for (int i = 0; i < split.size(); i += 2) {
            if (split[i + 1] == null) {
                list.add(split[i] + "_")
            } else {
                list.add(split[i] + split[i + 1])
            }
        }
        return list
    }

    @Test
    void "Sample Tests"() {
        assert solution("asdfadsf") == ["as", "df", "ad", "sf"]
        assert solution("asdfads") == ["as", "df", "ad", "s_"]
        assert solution("") == []
        assert solution("x") == ["x_"]
    }
}
