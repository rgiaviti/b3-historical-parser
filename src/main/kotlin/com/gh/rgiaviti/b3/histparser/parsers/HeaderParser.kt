package com.gh.rgiaviti.b3.histparser.parsers

import com.gh.rgiaviti.b3.histparser.data.models.Header
import com.gh.rgiaviti.b3.histparser.data.positions.HeaderPositions.*
import com.gh.rgiaviti.b3.histparser.exceptions.LineIsBlankException

object HeaderParser : AbstractParser() {

    fun parse(line: String): Header {
        if (line.isBlank()) {
            throw LineIsBlankException("the line is blank when trying to parse 'header'")
        }

        return Header(
            tipoRegistro = line.substring(TIPO_REGISTRO.startPos, TIPO_REGISTRO.endPos).trim(),
            nomeArquivo = line.substring(NOME_ARQUIVO.startPos, NOME_ARQUIVO.endPos).trim(),
            codigoOrigem = line.substring(CODIGO_ORIGEM.startPos, CODIGO_ORIGEM.endPos).trim(),
            dataGeracaoArquivo = toLocaDate(line.substring(DATA_GERACAO_ARQUIVO.startPos, DATA_GERACAO_ARQUIVO.endPos).trim()),
            reservado = line.substring(RESERVA.startPos, RESERVA.endPos).trim()
        )
    }
}