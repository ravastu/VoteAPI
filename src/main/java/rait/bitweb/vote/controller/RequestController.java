package rait.bitweb.vote.controller;

import org.springframework.web.bind.annotation.*;
import rait.bitweb.vote.model.Options;
import rait.bitweb.vote.model.Vote;

import java.sql.Timestamp;

@RestController
@ResponseBody
public class RequestController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/vote")
    public Vote vote(@RequestParam(value="vote", defaultValue="World") String vote){
//        return (1L, vote, new Timestamp(System.currentTimeMillis()));
        return Vote.builder()
                .id(1L)
                .vote(vote)
                .dateCreated(new Timestamp(System.currentTimeMillis()))
                .build();
    }

    @RequestMapping("/options")
    public Options options(){
        String[] o = {"Cat", "Dog"};
        return Options.builder().options(o).build();
    }
}
