package com.gh.rgiaviti.b3.histparser.data.models

import java.math.BigDecimal

data class Precos(
    val precoAbertura: BigDecimal,

    val precoMaximo: BigDecimal,

    val precoMinimo: BigDecimal,

    val precoMedio: BigDecimal,

    val precoFechamento: BigDecimal,

    val precoMelhorOfertaCompra: BigDecimal,

    val precoMelhorOfertaVenda: BigDecimal,
)
