package com.gh.rgiaviti.b3.histparser.data.enums

enum class IndiceCorrecaoContrato(
    private val codigo: String,
    private val sigla: String,
    private val descricao: String
) {
    USD("1", "US$", "CORREÇÃO PELA TAXA DO DÓLAR"),
    TJLP("2", "TJLP", "CORREÇÃO PELA TJLP"),
    IGPM("8", "IGPM", "CORREÇÃO PELO IGP-M - OPÇÕES PROTEGIDAS"),
    URV("9", "URV", "CORREÇÃO PELA URV");
}