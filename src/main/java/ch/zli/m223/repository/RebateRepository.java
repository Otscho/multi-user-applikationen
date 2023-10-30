package ch.zli.m223.repository;

import ch.zli.m223.model.Rebate;
import ch.zli.m223.model.impl.RebateImpl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RebateRepository extends JpaRepository<RebateImpl, Long> {
    public default Rebate addRebate(Integer rebate) {
        return save(new RebateImpl(rebate));
    }
}
