package br.com.clouzada.botaoapi.service

import br.com.clouzada.botaoapi.model.Evento

interface EventoService {
    fun listar(): List<Evento>
    fun buscar(id: Long): Evento
    fun inserir(evento: Evento): Evento
    fun alterar(evento: Evento): Evento
    fun excluir(id: Long)
    fun excluir(evento: Evento)
}