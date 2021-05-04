package br.com.clouzada.botaoapi.exception

class BotaoNotFoundException(private val mensagem: String) : RuntimeException(mensagem)