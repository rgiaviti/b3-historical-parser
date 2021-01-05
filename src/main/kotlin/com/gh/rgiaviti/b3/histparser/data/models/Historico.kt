package com.gh.rgiaviti.b3.histparser.data.models

class Historico {
    lateinit var header: Header
    var cotacoesHistoricas: MutableList<CotacaoHistorica> = mutableListOf()
    lateinit var trailer: Trailer

    fun addCotacaoHistorica(cotacaoHistorica: CotacaoHistorica) {
        this.cotacoesHistoricas.add(cotacaoHistorica)
    }
}
