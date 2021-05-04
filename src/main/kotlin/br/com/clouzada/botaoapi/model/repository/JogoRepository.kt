package br.com.clouzada.botaoapi.model.repository

import br.com.clouzada.botaoapi.model.Jogo
import org.springframework.data.repository.CrudRepository

interface JogoRepository : CrudRepository<Jogo, Long> {
}