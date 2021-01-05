package com.gh.rgiaviti.b3.histparser.data.positions

enum class HeaderPositions(
    val startPos: Int,
    val endPos: Int,
    val descricao: String
) {
    TIPO_REGISTRO(0, 2, "TIPO DE REGISTRO"),
    NOME_ARQUIVO(2, 15, "NOME DO ARQUIVO"),
    CODIGO_ORIGEM(15, 23, "CÓDIGO DA ORIGEM"),
    DATA_GERACAO_ARQUIVO(23, 31, "DATA DE GERAÇÃO DO ARQUIVO"),
    RESERVA(31, 245, "CAMPO RESERVADO");
}