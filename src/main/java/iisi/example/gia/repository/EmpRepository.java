package iisi.example.gia.repository;

import iisi.example.gia.entity.EmpDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepository extends JpaRepository<EmpDO, Integer> {
}
