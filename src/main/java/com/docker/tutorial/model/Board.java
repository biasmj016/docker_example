package com.docker.tutorial.model;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "BOARD")
public class Board {

    @Id
    @Column("BOARD_SEQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column("TITLE")
    private String title;

    @Column("CONTENT")
    private String content;

    @Column("AUTHOR")
    private String author;

    @CreatedDate
    @Column("REG_DATE")
    private LocalDateTime regDate;

    @LastModifiedBy
    @Column("MOD_DATE")
    private LocalDateTime modDate;

}