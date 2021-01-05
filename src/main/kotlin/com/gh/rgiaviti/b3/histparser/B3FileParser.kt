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
                return listOf(this.parseFile(file))
            }
            file.isDirectory -> {
                this.parseDirectory(file)
            }
            else -> {
                throw NotFileOrDirectoryException("the argument file does not exist or it's not a directory or a file")
            }
        }
    }

    private fun parseDirectory(dir: File): List<Historico> {
        val historicoList = mutableListOf<Historico>()

        dir.listFiles()?.forEach { file ->
            historicoList.add(this.parseFile(file))
        }

        return historicoList
    }

    private fun parseFile(file: File): Historico {
        val historico = Historico()

        println("Parsing ${file.name}")

        file.forEachLine { line ->
            when (FileRecordTypeParser.fileTypeRecord(line)) {
                FileRecord.HEADER -> {
                    historico.header = HeaderParser.parse(line)
                }
                FileRecord.COTACAO_HISTORICO -> {
                    historico.addCotacaoHistorica(CotacaoHistoricoParser.parse(line))
                }
                FileRecord.TRAILER -> {
                    historico.trailer = TrailerParser.parse(line)
                }
            }
        }

        return historico
    }
}