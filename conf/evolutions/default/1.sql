# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table member (
  id                        bigint not null,
  name                      varchar(255),
  email                     varchar(255),
  constraint pk_member primary key (id))
;

create table posts (
  id                        integer not null,
  title                     varchar(255),
  body                      TEXT,
  constraint pk_posts primary key (id))
;

create sequence member_seq;

create sequence posts_seq;




# --- !Downs

drop table if exists member cascade;

drop table if exists posts cascade;

drop sequence if exists member_seq;

drop sequence if exists posts_seq;

