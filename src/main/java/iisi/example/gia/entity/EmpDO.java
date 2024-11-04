package iisi.example.gia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "emp2")
@Entity
@ToString
public class EmpDO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPNO")
    private Integer empno;

    @Column(name = "ENAME", length = 10)
    private String ename;

    @Column(name = "JOB", length = 9)
    private String job;

    @Column(name = "HIREDATE")
    private LocalDate hiredate;

    @Column(name = "SAL", precision = 7, scale = 2)
    private BigDecimal sal;

    @Column(name = "COMM", precision = 7, scale = 2)
    private BigDecimal comm;

    @ManyToOne
    @JoinColumn(name = "DEPTNO")
    private DeptDO deptDO;
}
