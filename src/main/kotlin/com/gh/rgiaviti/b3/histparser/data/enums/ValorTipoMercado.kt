package com.gh.rgiaviti.b3.histparser.data.enums

enum class ValorTipoMercado(private val codigo: String, private val descricao: String) {
    VISTA("010", "VISTA"),
    EXE_OPCAO_COMPRA("012", "EXERCÍCIO DE OPÇÕES DE COMPRA"),
    EXE_OPCAO_VENDA("013", "EXERCÍCIO DE OPÇÕES DE VENDA"),
    LEILAO("017", "LEILÃO"),
    FRACIONARIO("020", "FRACIONÁRIO"),
    TERMO("030", "TERMO"),
    FUT_RET_GANHO("050", "FUTURO COM RETENÇÃO DE GANHO"),
    FUT_MOV_CONTINUA("060", "FUTURO COM MOVIMENTAÇÃO CONTÍNUA"),
    OPCAO_COMPRA("070", "OPÇÕES DE COMPRA"),
    OPCAO_VENDA("080", "OPÇÕES DE VENDA");
}