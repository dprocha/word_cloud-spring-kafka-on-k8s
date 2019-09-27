package io.pivotal.demo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.gemfire.mapping.annotation.Region

@Region(name = "Words_Count")
class WordCount {

    @Id
    var word: String? = null
    var wordCount: Long = 0

    override fun toString(): String {
        return "WordCount{" +
                "word='" + word + '\''.toString() +
                ", count=" + wordCount +
                '}'.toString()
    }

    constructor() {}

    constructor(word: String, count: Long) {
        this.word = word
        this.wordCount = count
    }
}
