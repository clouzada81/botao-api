package br.com.clouzada.botaoapi.model.repository

import br.com.clouzada.botaoapi.model.Time
import org.springframework.data.repository.CrudRepository

interface TimeRepository : CrudRepository<Time, Long> {
}