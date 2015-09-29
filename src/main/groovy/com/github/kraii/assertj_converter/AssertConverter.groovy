package com.github.kraii.assertj_converter

class AssertConverter {
    static Source convertAssertions(Source testSource) {
        testSource.transformEachLine { String line ->
            line.replaceAll(/assertEquals\(\s*(\w+)\s*,\s*(\w+)\s*\)/, /assertThat($2).isEqualTo($1)/)
        }
    }
}
