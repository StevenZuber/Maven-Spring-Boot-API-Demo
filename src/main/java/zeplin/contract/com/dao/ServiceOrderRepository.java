package zeplin.contract.com.dao;

import org.springframework.data.repository.CrudRepository;
import zeplin.contract.com.domain.ServiceOrder;

public interface ServiceOrderRepository extends CrudRepository<ServiceOrder, Integer> {
}
