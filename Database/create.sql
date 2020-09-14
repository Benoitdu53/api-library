create table library.author
(
    id        int auto_increment
        primary key,
    firstName varchar(50) not null,
    lastName  varchar(50) not null
);

create table library.categorie
(
    id    int auto_increment
        primary key,
    label varchar(25) not null
);

create table library.book
(
    id           int          not null
        primary key,
    title        varchar(100) not null,
    pubDate      date         null,
    page         int          not null,
    synopsis     text         not null,
    cover        varchar(200) not null,
    author_id    int          not null,
    categorie_id int          not null,
    pub_date     datetime     null,
    constraint author_book_fk
        foreign key (author_id) references library.author (id),
    constraint categorie_book_fk
        foreign key (categorie_id) references library.categorie (id)
);

create table library.library
(
    id        int auto_increment
        primary key,
    nom       varchar(100) not null,
    adress    varchar(100) not null,
    phoneNum  varchar(20)  not null,
    email     varchar(100) not null,
    phone_num varchar(255) null
);

create table library.copy
(
    id         int auto_increment
        primary key,
    number     int         not null,
    format     varchar(20) not null,
    book_id    int         not null,
    library_id int         not null,
    constraint book_copy_fk
        foreign key (book_id) references library.book (id),
    constraint library_copy_fk
        foreign key (library_id) references library.library (id)
);

create table library.user
(
    id          int auto_increment
        primary key,
    firstName   varchar(50)  not null,
    lastName    varchar(50)  not null,
    adress      varchar(100) not null,
    postalCode  varchar(6)   not null,
    city        varchar(50)  not null,
    email       varchar(100) not null,
    password    varchar(200) not null,
    first_name  varchar(255) null,
    last_name   varchar(255) null,
    postal_code varchar(255) null
);

create table library.emprunt
(
    id           int auto_increment
        primary key,
    empruntDate  date                 not null,
    returnDate   date                 not null,
    isExtended   tinyint(1) default 0 not null,
    user_id      int                  not null,
    copy_id      int                  not null,
    emprunt_date datetime             null,
    is_extended  bit                  null,
    return_date  datetime             null,
    constraint copy_emprunt_fk
        foreign key (copy_id) references library.copy (id),
    constraint user_emprunt_fk
        foreign key (user_id) references library.user (id)
);
