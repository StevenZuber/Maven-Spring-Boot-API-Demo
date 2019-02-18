package zeplin.contract.com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zeplin.contract.com.service.LineItemContractService;

@RestController
@RequestMapping(value = "/contracts/lineItems")
public class LineItemContractController {

    @Autowired
    LineItemContractService lineItemContractService;


    @RequestMapping(value = ("/"), method = RequestMethod.GET)
    public String getAllLineItemContracts(){
        return "Hello line item contracts!!";
    }
    @RequestMapping(value = ("{id}"), method = RequestMethod.GET)
    public String getLineItemContractById(@PathVariable("id") int id){
        return "Hello single line item contract!!";
    }
}
