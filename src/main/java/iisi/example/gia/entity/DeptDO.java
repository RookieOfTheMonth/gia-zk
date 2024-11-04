package iisi.example.gia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Table(name = "dept2")
@Entity
public class DeptDO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPTNO")
    private Integer deptno;

    @Column(name = "DNAME", length = 14)
    private String dname;

    @Column(name = "LOC", length = 13)
    private String loc;

    @OneToMany(mappedBy = "deptDO", cascade = CascadeType.REMOVE)
    private List<EmpDO> empDOs;
}
