package br.com.clouzada.botaoapi.model.repository

import br.com.clouzada.botaoapi.model.Jogador
import org.springframework.data.repository.CrudRepository

interface JogadorRepository : CrudRepository<Jogador, Long> {
}