package org.commons;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringHelper {

    /**
     * Returns a string consisting of unique characters from the given input string,
     * maintaining their original order of appearance. Duplicate characters in the
     * input string are removed, ensuring that each character appears only once in
     * the resulting string.
     * <p>
     * This method is particularly useful for filtering out duplicate characters from
     * a string to achieve a representation with unique characters only. It leverages
     * a {@code LinkedHashSet} to preserve the order of characters while eliminating duplicates.
     *
     * @param input The string from which duplicate characters are to be removed.
     *              If the string is {@code null} or empty, the method will return an empty string.
     * @return A new string containing only the unique characters from the input string,
     * in the order they first appeared. If the input is {@code null} or empty,
     * an empty string is returned.
     */
    public String getUniqueCharacters(String input) {
        if (Objects.isNull(input)) {
            return "";
        }

        var set = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }

        return set.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
