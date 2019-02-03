package rait.bitweb.vote.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Builder
public class Vote {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String vote;
    @Getter
    @Setter
    private Timestamp dateCreated;
}
