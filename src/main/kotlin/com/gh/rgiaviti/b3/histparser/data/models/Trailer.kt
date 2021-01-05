package com.gh.rgiaviti.b3.histparser.data.models

import java.time.LocalDate

data class Trailer(
    val tipoRegistro: String,

    val nomeArquivo: String,

    val codigoOrigem: String,

    val dataGeracaoArquivo: LocalDate,

    val totalRegistros: Long,

    val reservado: String
)
