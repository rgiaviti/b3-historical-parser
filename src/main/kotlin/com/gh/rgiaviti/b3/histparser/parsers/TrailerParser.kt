package com.gh.rgiaviti.b3.histparser.parsers

import com.gh.rgiaviti.b3.histparser.data.models.Trailer
import com.gh.rgiaviti.b3.histparser.data.positions.TrailerPositions.*
import com.gh.rgiaviti.b3.histparser.exceptions.LineIsBlankException

object TrailerParser : AbstractParser() {

    fun parse(line: String): Trailer {
        if (line.isBlank()) {
            throw LineIsBlankException("the line is blank when trying to parse 'cotação histórica'")
        }

        return Trailer(
            tipoRegistro = line.substring(TIPO_REGISTRO.startPos, TIPO_REGISTRO.endPos).trim(),
            nomeArquivo = line.substring(NOME_ARQUIVO.startPos, NOME_ARQUIVO.endPos).trim(),
            codigoOrigem = line.substring(CODIGO_ORIGEM.startPos, CODIGO_ORIGEM.endPos).trim(),
            dataGeracaoArquivo = this.toLocaDate(line.substring(DATA_GERACAO_ARQUIVO.startPos, DATA_GERACAO_ARQUIVO.endPos).trim()),
            totalRegistros = line.substring(TOTAL_REGISTROS.startPos, TOTAL_REGISTROS.endPos).toLong(),
            reservado = line.substring(RESERVA.startPos, RESERVA.endPos).trim()
        )
    }
}