package zeplin.contract.com.api;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String listEndpoints(){
        return "http://localhost:8080/contracts for all contracts\n" +
                "http://localhost:8080/contracts/lineItems for all line item contracts\n" +
                "http://localhost:8080/contracts/lineItems/{id} for a specific line item contract\n" +
                "http://localhost:8080/contracts/serviceOrders for all service order contracts\n" +
                "http://localhost:8080/contracts/serviceOrders/{id} for a specific service order contract\n" +
                "http://localhost:8080/contracts/serviceAgreements for all service agreement contracts\n" +
                "http://localhost:8080/contracts/serviceAgreements/{id} for a specific agreement contract\n" +
                "http://localhost:8080/invoices for all invoices\n" +
                "http://localhost:8080/invoices/{id} for a specific invoice";
    }
    @RequestMapping(value = ("/contracts"), method = RequestMethod.GET)
    public String getAllContracts(){
        return "Hello all contracts!!";
    }

}
