package zeplin.contract.com.dao;

import org.springframework.data.repository.CrudRepository;
import zeplin.contract.com.domain.LineItemContract;

public interface LineItemContractRepository extends CrudRepository<LineItemContract, Integer> {
}
