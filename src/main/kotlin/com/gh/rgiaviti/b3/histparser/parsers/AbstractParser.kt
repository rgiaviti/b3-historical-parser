package com.gh.rgiaviti.b3.histparser.parsers

import java.math.BigDecimal
import java.time.LocalDate
import java.time.format.DateTimeFormatter

abstract class AbstractParser {

    companion object {
        private const val DEFAULT_PARSER_DATE_FORMAT = "yyyyMMdd"
    }

    protected fun toLocaDate(date: String, format: String = DEFAULT_PARSER_DATE_FORMAT): LocalDate {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(format))
    }

    protected fun toBigDecimal(value: String): BigDecimal {
        return BigDecimal(value.toInt() / 100)
    }
}