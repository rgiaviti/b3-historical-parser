package com.gh.rgiaviti.b3.histparser.data.enums

enum class CodigoBDI(
    private val codigo: String, private val descricao: String
) {
    COD_02("02", "LOTE PADRAO"),
    COD_05("05", "SANCIONADAS PELOS REGULAMENTOS BMFBOVESPA"),
    COD_06("06", "CONCORDATARIAS"),
    COD_07("07", "RECUPERACAO EXTRAJUDICIAL"),
    COD_08("08", "RECUPERAÇÃO JUDICIAL"),
    COD_09("09", "RAET - REGIME DE ADMINISTRACAO ESPECIAL TEMPORARIA"),
    COD_10("10", "DIREITOS E RECIBOS"),
    COD_11("11", "INTERVENCAO"),
    COD_12("12", "FUNDOS IMOBILIARIOS"),
    COD_14("14", "CERT.INVEST/TIT.DIV.PUBLICA"),
    COD_18("18", "OBRIGACÕES"),
    COD_22("22", "BÔNUS (PRIVADOS)"),
    COD_26("26", "APOLICES/BÔNUS/TITULOS PUBLICOS"),
    COD_32("32", "EXERCICIO DE OPCOES DE COMPRA DE INDICES"),
    COD_33("33", "EXERCICIO DE OPCOES DE VENDA DE INDICES"),
    COD_38("38", "EXERCICIO DE OPCOES DE COMPRA"),
    COD_42("42", "EXERCICIO DE OPCOES DE VENDA"),
    COD_46("46", "LEILAO DE NAO COTADOS"),
    COD_48("48", "LEILAO DE PRIVATIZACAO"),
    COD_49("49", "LEILAO DO FUNDO RECUPERACAO ECONOMICA ESPIRITO SANTO"),
    COD_50("50", "LEILAO"),
    COD_51("51", "LEILAO FINOR"),
    COD_52("52", "LEILAO FINAM"),
    COD_53("53", "LEILAO FISET"),
    COD_54("54", "LEILAO DE ACÕES EM MORA"),
    COD_56("56", "VENDAS POR ALVARA JUDICIAL"),
    COD_58("58", "OUTROS"),
    COD_60("60", "PERMUTA POR ACÕES"),
    COD_61("61", "META"),
    COD_62("62", "MERCADO A TERMO"),
    COD_66("66", "DEBENTURES COM DATA DE VENCIMENTO ATE 3 ANO"),
    COD_68("68", "DEBENTURES COM DATA DE VENCIMENTO MAIOR QUE 3 ANOS"),
    COD_70("70", "FUTURO COM RETENCAO DE GANHOS"),
    COD_71("71", "MERCADO DE FUTURO"),
    COD_74("74", "OPCOES DE COMPRA DE INDICES"),
    COD_75("75", "OPCOES DE VENDA DE INDICES"),
    COD_78("78", "OPCOES DE COMPRA"),
    COD_82("82", "OPCOES DE VENDA"),
    COD_83("83", "BOVESPAFIX"),
    COD_84("84", "SOMA FIX"),
    COD_90("90", "TERMO VISTA REGISTRADO"),
    COD_96("96", "MERCADO FRACIONARIO"),
    COD_99("99", "TOTAL GERAL"),
}