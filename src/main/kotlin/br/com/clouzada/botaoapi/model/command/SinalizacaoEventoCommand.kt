package br.com.clouzada.botaoapi.model.command

import br.com.clouzada.botaoapi.model.Jogador
import br.com.clouzada.botaoapi.model.Jogo
import br.com.clouzada.botaoapi.model.enums.TipoEvento

class SinalizacaoEventoCommand(
    val jogo: Jogo,
    val jogador: Jogador,
    val tipoEvento: TipoEvento
)