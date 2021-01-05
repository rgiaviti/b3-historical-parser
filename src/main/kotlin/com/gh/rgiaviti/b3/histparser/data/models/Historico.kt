package com.gh.rgiaviti.b3.histparser.data.models

data class Historico(
    val header: Header,

    val cotacaoHistorica: CotacaoHistorica,

    val trailer: Trailer
)
