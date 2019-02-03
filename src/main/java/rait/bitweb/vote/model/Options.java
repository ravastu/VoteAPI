package rait.bitweb.vote.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Options {
    @Getter @Setter
    private String[] options;
}
