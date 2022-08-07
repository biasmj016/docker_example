package com.docker.tutorial.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @Column("POST_ID")
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