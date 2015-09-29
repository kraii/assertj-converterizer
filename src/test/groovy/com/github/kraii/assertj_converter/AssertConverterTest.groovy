package com.github.kraii.assertj_converter

import org.junit.Test

import static com.github.kraii.assertj_converter.AssertConverter.convertAssertions
import static org.assertj.core.api.Assertions.assertThat

class AssertConverterTest {
    @Test
    void converts_assertEquals() {
        Source source = new Source().addLine("assertEquals(42, x);")

        Source convertedSource = convertAssertions(source)

        assertThat(convertedSource).isEqualTo(new Source().addLine("assertThat(x).isEqualTo(42);"))
    }
}
