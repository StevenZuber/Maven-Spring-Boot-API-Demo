package zeplin.contract.com.dao;

import org.springframework.data.repository.CrudRepository;
import zeplin.contract.com.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}
