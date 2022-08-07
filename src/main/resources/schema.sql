create table BOARD
(
    BOARD_SEQ BIGINT auto_increment,
    TITLE     VARCHAR(255),
    CONTENT   VARCHAR(255),
    AUTHOR    VARCHAR(255),
    REG_DATE  DATETIME2,
    MOD_DATE  DATETIME,
    constraint BOARD_PK
        primary key (BOARD_SEQ)
);