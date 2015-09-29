package com.github.kraii.assertj_converter

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includeFields = true, includes = 'text') // Hmm sure
@ToString(includeFields = true, includes = 'text')
class Source {
    private String text

    Source() {
        this("")
    }

    Source(String text) {
        this.text = text
    }

    Source addLine(String line) {
        text += line + "\n"
        this
    }

    Source transformEachLine(def closure) {
        String transformedText = ""
        text.eachLine { line ->
            transformedText += closure(line) + "\n"
        }
        new Source(transformedText)
    }
}
