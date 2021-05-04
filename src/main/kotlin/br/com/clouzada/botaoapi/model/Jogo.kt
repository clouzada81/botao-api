package br.com.clouzada.botaoapi.model

import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import java.util.*

import javax.persistence.*

@Entity
@Table(name = "jogo")
data class Jogo(

    @ManyToOne
    @JoinColumn(name = "time_casa_id")
    var timeCasa: Time,

    @ManyToOne
    @JoinColumn(name = "time_visitante_id")
    var timeVisitante: Time,

    @Temporal(TemporalType.TIMESTAMP)
    val data: Date = Calendar.getInstance(Locale("pt", "BR")).time
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id = 0L

    @ManyToOne
    @JoinColumn(name = "time_vencedor_id")
    var timeVencedor: Time? = null
    var pontosCasa = 0
    var pontosVisitante = 0
    var finalizado = 0

    @OneToMany(mappedBy = "jogo")
    var eventos = mutableListOf<Evento>()
        private set
}