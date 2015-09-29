package com.github.kraii.assertj_converter

import org.junit.Test

import static org.assertj.core.api.Assertions.assertThat

class SourceTest {

    @Test
    void equals() {
        assertThat(new Source("1")).isEqualTo(new Source("1"))
        assertThat(new Source("2")).isNotEqualTo(new Source("1"))
    }
}
