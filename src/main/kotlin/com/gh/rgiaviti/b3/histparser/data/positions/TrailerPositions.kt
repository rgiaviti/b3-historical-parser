package com.gh.rgiaviti.b3.histparser.data.positions

enum class TrailerPositions(
    val startPos: Int,
    val endPos: Int,
    val descricao: String
) {
    TIPO_REGISTRO(0, 2, "TIPO DE REGISTRO"),
    NOME_ARQUIVO(2, 15, "NOME DO ARQUIVO"),
    CODIGO_ORIGEM(15, 23, "CÓDIGO DE ORIGEM"),
    DATA_GERACAO_ARQUIVO(23, 31, "DATA GERAÇÃO ARQUIVO"),
    TOTAL_REGISTROS(31, 42, "TOTAL DE REGISTROS - INCLUI HEADER E TRAILER"),
    RESERVA(42, 245, "CAMPO RESERVADO");
}