package br.com.clouzada.botaoapi.model.repository

import br.com.clouzada.botaoapi.model.Evento
import org.springframework.data.repository.CrudRepository

interface EventoRepository : CrudRepository<Evento, Long> {
}