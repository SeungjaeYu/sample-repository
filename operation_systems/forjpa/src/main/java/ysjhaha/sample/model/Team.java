package ysjhaha.sample.model;

import javax.persistence.*;

@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @Column(name = "TEAM_ID", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "TEAM_NAME", nullable = true, length =  500)
    private String teamName;



}
