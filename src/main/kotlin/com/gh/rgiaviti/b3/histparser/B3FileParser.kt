package com.gh.rgiaviti.b3.histparser

import com.gh.rgiaviti.b3.histparser.data.models.Historico
import com.gh.rgiaviti.b3.histparser.enums.FileRecord
import com.gh.rgiaviti.b3.histparser.exceptions.NotFileOrDirectoryException
import com.gh.rgiaviti.b3.histparser.parsers.CotacaoHistoricoParser
import com.gh.rgiaviti.b3.histparser.parsers.FileRecordTypeParser
import com.gh.rgiaviti.b3.histparser.parsers.HeaderParser
import com.gh.rgiaviti.b3.histparser.parsers.TrailerParser
import java.io.File

object B3FileParser {

    fun parse(file: File): List<Historico> {
        return when {
            file.isFile -> {
                this.parseFile(file)
            }
            file.isDirectory -> {
                this.parseDirectory(file)
            }
            else -> {
                throw NotFileOrDirectoryException("the argument file does not exist or it's not a directory or a file")
            }
        }
    }

    private fun parseDirectory(file: File): List<Historico> {
        return emptyList()
    }

    private fun parseFile(file: File): List<Historico> {
        file.forEachLine { line ->
            when (FileRecordTypeParser.fileTypeRecord(line)) {
                FileRecord.HEADER -> {
                    val header = HeaderParser.parse(line)
                }
                FileRecord.COTACAO_HISTORICO -> {
                    val cotacaoHistorica = CotacaoHistoricoParser.parse(line)
                }
                FileRecord.TRAILER -> {
                    val trailer = TrailerParser.parse(line)
                }
            }
        }

        return emptyList()
    }
}