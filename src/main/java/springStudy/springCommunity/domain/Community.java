package springStudy.springCommunity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity @Setter @Getter
public class Community {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "community_id")
    private Long id;

    private String communityTitle;

    private String communityContent;

    private String communityWriter;

    private LocalDateTime communityDate;
}


