# --- First database schema

# --- !Ups

create table orden (
  id                        bigint not null,
 descripcion                      varchar(400),
total                      varchar(400),
mesa                      varchar(400),

  constraint pk_orden primary key (id))
;

create sequence orden_seq start with 1000;


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists orden;


SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists orden_seq;

