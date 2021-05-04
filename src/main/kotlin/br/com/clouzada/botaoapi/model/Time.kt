package br.com.clouzada.botaoapi.model

import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import javax.persistence.*

@Entity
@Table(name = "time")
data class Time(
    var nome: String,
    var sigla: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id = 0L

    var distintivo: String? = ""
        get() {
            if (field == null || field == "") {
                return "letras/" + nome.substring(0, 1).toLowerCase() + ".jpg";
            }
            return field;
        }

    @OneToMany(mappedBy = "time", orphanRemoval = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    var jogadores = mutableListOf<Jogador>()
        private set
}