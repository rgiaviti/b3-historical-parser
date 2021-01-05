package com.gh.rgiaviti.b3.histparser.data.models

import java.math.BigDecimal
import java.time.LocalDate

data class CotacaoHistorica(
    val tipoRegistro: String,

    val dataPregao: LocalDate,

    val codigoBDI: String,

    val ticker: String,

    val tipoMercado: String,

    val nomeResumidoEmpresa: String,

    val especificacaoPapel: String,

    val prazoDiasMercadoTermo: String,

    val moedaReferencia: String,

    val precos: Precos,

    val numeroNegociosEfetuados: Long,

    val quantidadeTotalTitulosNegociados: Long,

    val volumeTotalTitulosNegociados: Long,

    val precoExercicioOpcoesOuTermo: BigDecimal,

    val indicadorCorrecaoPrecos: Int,

    val dataVencimentoOpcoesOuTermo: LocalDate,

    val fatorCotacaoPapel: Int,

    val precoPontosOpcoesDolar: BigDecimal,

    val codigoIsin: String,

    val numeroDistribuicaoPapel: String
)
