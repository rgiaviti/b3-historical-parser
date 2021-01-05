package com.gh.rgiaviti.b3.histparser.data.positions

enum class HeaderPositions(
    val startPos: Int,
    val endPos: Int,
    val descricao: String
) {
    TIPO_REGISTRO(0, 2, "Tipo de Registro"),
    NOME_ARQUIVO(2, 15, "Nome do Arquivo"),
    CODIGO_ORIGEM(15, 23, "Código da Origem"),
    DATA_GERACAO_ARQUIVO(23, 31, "Data do Geração do Arquivo"),
    RESERVA(31, 245, "Campo Reservado");
}