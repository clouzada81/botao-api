package br.com.clouzada.botaoapi.service.impl

import br.com.clouzada.botaoapi.exception.BotaoNotFoundException
import br.com.clouzada.botaoapi.model.Jogador
import br.com.clouzada.botaoapi.model.repository.JogadorRepository
import br.com.clouzada.botaoapi.service.JogadorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JogadorServiceImpl @Autowired constructor(
    private val jogadorRepository: JogadorRepository
) : JogadorService {

    override fun listar(): List<Jogador> {
        return this.jogadorRepository.findAll().toList()
    }

    override fun buscar(id: Long): Jogador {
        val oJogador = this.jogadorRepository.findById(id)
        if (!oJogador.isPresent) {
            throw BotaoNotFoundException("O Jogador com ID $id não foi encontrado")
        }

        return oJogador.get()
    }

    override fun inserir(jogador: Jogador): Jogador {
        return this.jogadorRepository.save(jogador)
    }

    override fun alterar(jogador: Jogador): Jogador {
        return this.jogadorRepository.save(jogador)
    }

    override fun excluir(id: Long) {
        excluir(buscar(id))
    }

    override fun excluir(jogador: Jogador) {
        this.jogadorRepository.delete(jogador)
    }
}
