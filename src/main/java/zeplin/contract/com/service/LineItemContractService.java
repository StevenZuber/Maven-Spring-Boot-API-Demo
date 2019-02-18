package zeplin.contract.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zeplin.contract.com.dao.LineItemContractRepository;
import zeplin.contract.com.domain.LineItemContract;

import java.util.ArrayList;
import java.util.List;

@Service
public class LineItemContractService {

    @Autowired
    LineItemContractRepository lineItemContractRepository;

    public List<LineItemContract> getAllLineItemContracts() {
        List<LineItemContract> lineItemContracts = new ArrayList<LineItemContract>();
        lineItemContractRepository.findAll().forEach(lineItemContract -> lineItemContracts.add(lineItemContract));
        return lineItemContracts;
    }

    public LineItemContract getLineItemContractById(int id) {
        return lineItemContractRepository.findById(id).get();
    }

}
