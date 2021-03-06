package zeplin.contract.com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zeplin.contract.com.service.ServiceOrderService;

@RestController
@RequestMapping(value = "/contracts/serviceOrders")
public class ServiceOrderController {

    @Autowired
    ServiceOrderService serviceOrderService;


    @RequestMapping(value = ("/"), method = RequestMethod.GET)
    public String getAllServiceOrderContracts(){
        return "Hello service orders!!";
    }
    @RequestMapping(value = ("/{id}"), method = RequestMethod.GET)
    public String getServiceOrderContractById(@PathVariable("id") int id){
        return "Hello single service order!!";
    }
}
