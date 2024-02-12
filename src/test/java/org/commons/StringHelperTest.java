package org.commons;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {

    @ParameterizedTest
    @CsvFileSource(
            resources = "/unique_characters_test_cases.csv",
            numLinesToSkip = 1)
    void testGetUniqueCharacters(String input, String expected) {
        var helper = new StringHelper();
        var actual = helper.getUniqueCharacters(input.equals("null") ? null : input);
        assertEquals(expected.equals("null") ? null : expected, actual);
    }
}
