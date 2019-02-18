package zeplin.contract.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zeplin.contract.com.dao.ServiceAgreementRepository;
import zeplin.contract.com.domain.ServiceAgreement;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceAgreementService {

    @Autowired
    ServiceAgreementRepository serviceAgreementRepository;

    public List<ServiceAgreement> getAllServiceAgreementContracts() {
        List<ServiceAgreement> serviceAgreements = new ArrayList<ServiceAgreement>();
        serviceAgreementRepository.findAll().forEach(serviceAgreement -> serviceAgreements.add(serviceAgreement));
        return serviceAgreements;
        }

    public ServiceAgreement getServiceAgreementContractById(int id) {
            return serviceAgreementRepository.findById(id).get();
        }
}
