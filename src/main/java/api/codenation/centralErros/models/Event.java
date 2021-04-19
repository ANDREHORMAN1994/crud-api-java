package api.codenation.centralErros.models;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @NotNull
    @Column
    private String log;

    @NotNull
    @Column
    private String description;

    @NotNull
    @Column
    private Integer quantity;

    @NotNull
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;

    @ManyToOne
    @JoinColumn(name = "origin_id")
    private Origin origin;

/*
    Level(error, warning, info),
    Descrição do Evento,
    LOG do Evento,
    ORIGEM(Sistema ou Serviço que originou o evento),
    DATA(Data do evento),
    QUANTIDADE(Quantidade de Eventos de mesmo tipo)
 */
}
