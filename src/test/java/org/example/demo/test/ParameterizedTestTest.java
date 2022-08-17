package org.example.demo.test;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParameterizedTestTest {

    @ParameterizedTest
    @ValueSource(strings = { "aa", "bb", "cc" })
    public void testStringSize(String word) {
        assertThat(word.length()).isEqualTo(2);
    }
}

