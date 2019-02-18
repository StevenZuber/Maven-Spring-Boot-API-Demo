package zeplin.contract.com.dao;

import org.springframework.data.repository.CrudRepository;
import zeplin.contract.com.domain.ServiceAgreement;

public interface ServiceAgreementRepository extends CrudRepository<ServiceAgreement, Integer> {
}
