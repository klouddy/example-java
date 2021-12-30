create table SUBSCRIPTION
(
    id              bigint auto_increment not null,
    employee_number varchar2(30),
    method_id       bigint,
    subject_code    varchar2(60)
)
