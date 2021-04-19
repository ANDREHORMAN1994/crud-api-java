package api.codenation.centralErros.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Origin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @NotNull
    @Column
    private String name;

    @OneToMany(mappedBy = "origin")
    @JsonIgnore
    private List<Event> eventList;

//    ORIGEM(Sistema ou Serviço que originou o evento),
}
