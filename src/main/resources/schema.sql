DROP TABLE If Exists emp2;
DROP TABLE If Exists dept2;

CREATE TABLE dept2
(
    deptno INT auto_increment,
    dname  VARCHAR(14),
    loc    VARCHAR(13),
    CONSTRAINT dept2_primary_key PRIMARY KEY (deptno)
);



CREATE TABLE emp2
(
    empno    INT AUTO_INCREMENT ,
    ename    VARCHAR(10),
    job      VARCHAR(9),
    hiredate DATE,
    sal      DECIMAL(7, 2),
    comm     DECIMAL(7, 2),
    deptno   INT                NOT NULL,
    CONSTRAINT emp2_empno_pk PRIMARY KEY (empno),
    CONSTRAINT emp2_deptno_fk FOREIGN KEY (deptno) REFERENCES dept2 (deptno)
);