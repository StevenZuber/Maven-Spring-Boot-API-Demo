package zeplin.contract.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zeplin.contract.com.dao.ServiceOrderRepository;
import zeplin.contract.com.domain.ServiceOrder;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceOrderService {
    @Autowired
    ServiceOrderRepository serviceOrderRepository;

    public List<ServiceOrder> getAllServiceOrderContracts() {
        List<ServiceOrder> serviceOrders = new ArrayList<ServiceOrder>();
        serviceOrderRepository.findAll().forEach(serviceOrder -> serviceOrders.add(serviceOrder));
        return serviceOrders;
    }

    public ServiceOrder getServiceOrderContractById(int id) {
        return serviceOrderRepository.findById(id).get();
    }
}
