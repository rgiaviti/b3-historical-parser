package com.gh.rgiaviti.b3.histparser.parsers

import com.gh.rgiaviti.b3.histparser.enums.FileRecord
import com.gh.rgiaviti.b3.histparser.exceptions.FileTypeRecordNotRecognizedException
import com.gh.rgiaviti.b3.histparser.exceptions.LineIsBlankException

object FileRecordTypeParser {
    private const val HEADER_VALUE = "00"
    private const val COTACAO_HISTORICO_VALUE = "01"
    private const val TRAILER = "99"

    private const val TYPE_RECORD_START_POS = 0
    private const val TYPE_RECORD_END_POD = 2

    fun fileTypeRecord(line: String): FileRecord {
        if (line.isBlank()) {
            throw LineIsBlankException("the line is blank when trying to resolve which type record is the line")
        }

        return when (val lineValue = line.substring(TYPE_RECORD_START_POS, TYPE_RECORD_END_POD)) {
            HEADER_VALUE -> {
                FileRecord.HEADER
            }
            COTACAO_HISTORICO_VALUE -> {
                FileRecord.COTACAO_HISTORICO
            }
            TRAILER -> {
                FileRecord.TRAILER
            }
            else -> {
                throw FileTypeRecordNotRecognizedException("the value $lineValue is not recognized when parsing the type record of file")
            }
        }
    }
}