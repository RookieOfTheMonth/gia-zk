package iisi.example.gia.vm;

import iisi.example.gia.entity.EmpDO;
import iisi.example.gia.service.EmpService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import java.util.List;

@VariableResolver(DelegatingVariableResolver.class)
@Getter
@Setter
@Slf4j
public class HelloVM {

    @WireVariable("empServiceImpl")
    private EmpService empService;

    private String empno;

    private List<EmpDO> empDOList;

    private EmpDO selectItem;

    @NotifyChange({"empDOList","empno"})
    @Command
    public void submit() {
        log.info("empno: {}", empno);
        List<EmpDO> all = empService.getAll();
        empDOList = all;
        log.info("all: {}", all);
    }
}
