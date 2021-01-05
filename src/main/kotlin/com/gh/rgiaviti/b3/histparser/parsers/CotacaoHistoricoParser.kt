package com.gh.rgiaviti.b3.histparser.parsers

import com.gh.rgiaviti.b3.histparser.data.models.CotacaoHistorica
import com.gh.rgiaviti.b3.histparser.data.models.Precos
import com.gh.rgiaviti.b3.histparser.data.positions.CotacaoHistoricaPositions.*
import com.gh.rgiaviti.b3.histparser.data.positions.PrecosPositions.*
import com.gh.rgiaviti.b3.histparser.exceptions.LineIsBlankException

object CotacaoHistoricoParser : AbstractParser() {

    fun parse(line: String): CotacaoHistorica {
        if (line.isBlank()) {
            throw LineIsBlankException("the line is blank when trying to parse 'cotação histórica'")
        }

        return CotacaoHistorica(
            tipoRegistro = line.substring(TIPO_REGISTRO.startPos, TIPO_REGISTRO.endPos).trim(),
            dataPregao = this.toLocaDate(line.substring(DATA_PREGAO.startPos, DATA_PREGAO.endPos).trim()),
            codigoBDI = line.substring(CODIGO_BDI.startPos, CODIGO_BDI.endPos).trim(),
            ticker = line.substring(TICKER.startPos, TICKER.endPos).trim(),
            tipoMercado = line.substring(TIPO_MERCADO.startPos, TIPO_MERCADO.endPos).trim(),
            nomeResumidoEmpresa = line.substring(NOME_RESUMIDO_EMPRESA.startPos, NOME_RESUMIDO_EMPRESA.endPos).trim(),
            especificacaoPapel = line.substring(ESPECIFICACAO_PAPEL.startPos, ESPECIFICACAO_PAPEL.endPos).trim(),
            prazoDiasMercadoTermo = line.substring(PRAZO_DIA_TERMO.startPos, PRAZO_DIA_TERMO.endPos).trim(),
            moedaReferencia = line.substring(MOEDA_REFERENCIA.startPos, MOEDA_REFERENCIA.endPos).trim(),
            precos = this.parsePrecos(line),
            numeroNegociosEfetuados = line.substring(TOTAL_NEGOCIACOES.startPos, TOTAL_NEGOCIACOES.endPos).trim().toLong(),
            quantidadeTotalTitulosNegociados = line.substring(QUANTIDADE_TITULOS_NEGOCIADOS.startPos, QUANTIDADE_TITULOS_NEGOCIADOS.endPos).trim().toLong(),
            volumeTotalTitulosNegociados = line.substring(VOLUME_TOTAL_TITULOS_NEGOCIADOS.startPos, VOLUME_TOTAL_TITULOS_NEGOCIADOS.endPos).trim().toLong(),
            precoExercicioOpcoesOuTermo = toBigDecimal(line.substring(PRECO_EXE_OPCOES_OU_VLR_TERMO.startPos, PRECO_EXE_OPCOES_OU_VLR_TERMO.endPos).trim()),
            indicadorCorrecaoPrecos = line.substring(INDICADOR_CORRECAO_PRECOS_EXE.startPos, INDICADOR_CORRECAO_PRECOS_EXE.endPos).trim().toInt(),
            dataVencimentoOpcoesOuTermo = this.toLocaDate(line.substring(DATA_VENCIMENTO_OPCOES_TERMO.startPos, DATA_VENCIMENTO_OPCOES_TERMO.endPos).trim()),
            fatorCotacaoPapel = line.substring(FATOR_COTACAO_PAPEL.startPos, FATOR_COTACAO_PAPEL.endPos).trim().toInt(),
            precoPontosOpcoesDolar = this.toBigDecimal(line.substring(PRECO_EXE_PTS_OPCS_REF_DOLAR_TERMO.startPos, PRECO_EXE_PTS_OPCS_REF_DOLAR_TERMO.endPos).trim()),
            codigoIsin = line.substring(CODIGO_ISIN_PAPEL.startPos, CODIGO_ISIN_PAPEL.endPos).trim(),
            numeroDistribuicaoPapel = line.substring(NUMERO_DISTRIBUICAO_PAPEL.startPos, NUMERO_DISTRIBUICAO_PAPEL.endPos).trim()
        )
    }

    private fun parsePrecos(line: String): Precos {
        return Precos(
            precoAbertura = this.toBigDecimal(line.substring(PRECO_ABERTURA.startPos, PRECO_ABERTURA.endPos).trim()),
            precoMaximo = this.toBigDecimal(line.substring(PRECO_MAXIMO.startPos, PRECO_MAXIMO.endPos).trim()),
            precoMinimo = this.toBigDecimal(line.substring(PRECO_MINIMO.startPos, PRECO_MINIMO.endPos).trim()),
            precoMedio = this.toBigDecimal(line.substring(PRECO_MEDIO.startPos, PRECO_MEDIO.endPos).trim()),
            precoFechamento = this.toBigDecimal(line.substring(PRECO_FECHAMENTO.startPos, PRECO_FECHAMENTO.endPos).trim()),
            precoMelhorOfertaCompra = this.toBigDecimal(line.substring(PRECO_MELHOR_OFERTA_COMPRA.startPos, PRECO_MELHOR_OFERTA_COMPRA.endPos).trim()),
            precoMelhorOfertaVenda = this.toBigDecimal(line.substring(PRECO_MELHOR_OFERTA_VENDA.startPos, PRECO_MELHOR_OFERTA_VENDA.endPos).trim())
        )
    }
}