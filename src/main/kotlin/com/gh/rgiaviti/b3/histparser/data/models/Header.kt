package com.gh.rgiaviti.b3.histparser.data.models

import java.time.LocalDate

data class Header(
    val tipoRegistro: String,

    val nomeArquivo: String,

    val codigoOrigem: String,

    val dataGeracaoArquivo: LocalDate,

    val reservado: String
)
