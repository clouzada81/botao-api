package br.com.clouzada.botaoapi.model

import br.com.clouzada.botaoapi.model.enums.Posicao
import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*
import kotlin.jvm.Transient

@Entity
@Table(name = "jogador")
data class Jogador(
    val nome: String,
    val numeroCamisa: Int,
    val posicao: Posicao
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id = 0L
    var avatar = ""
        get() {
            if (field  == null || field .isEmpty()) {
                return "letras/" + nome.substring(0, 1).toLowerCase() + ".jpg"
            }
            return field
        }

    @ManyToOne
    @JoinColumn(name = "time_id")
    @JsonBackReference
    var time: Time? = null

    fun nomeResumido(): String {
        if (nome.indexOf(" ") > 0) {
            return nome.substring(0, 1) + ". " + nome.substring(nome.lastIndexOf(" ") + 1)
        }
        return this.nome
    }

}