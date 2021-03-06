package zeplin.contract.com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zeplin.contract.com.service.ServiceAgreementService;

@RestController
@RequestMapping(value = "/contracts/serviceAgreements")
public class ServiceAgreementController {

    @Autowired
    ServiceAgreementService serviceAgreementService;


    @RequestMapping(value = ("/"), method = RequestMethod.GET)
    public String getAllServiceAgreementContracts(){
        return "Hello service agreements!!";
    }
    @RequestMapping(value = ("{id}"), method = RequestMethod.GET)
    public String getServiceAgreementContractById(@PathVariable("id") int id){
        return "Hello single service agreement!!";
    }

}
