package br.com.clouzada.botaoapi.model.command

import br.com.clouzada.botaoapi.model.Jogador
import br.com.clouzada.botaoapi.model.Time

class EscalcaoCommand(
    var time: Time,
    var jogador: Jogador
)