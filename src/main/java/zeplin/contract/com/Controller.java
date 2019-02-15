package zeplin.contract.com;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String helloWorld(){
        return "http://localhost:8080/all for all contracts\n" +
                "http://localhost:8080//{id} for a specific contract\n" +
                "http://localhost:8080/lineItems for all line item contracts\n" +
                "http://localhost:8080/serviceOrders for all service order contracts\n" +
                "http://localhost:8080/serviceAgreements for all service agreements";
    }
    @RequestMapping(value = ("/all"), method = RequestMethod.GET)
    public String getAllContracts(){
        return "Hello all contracts!!";
    }
    @RequestMapping(value = ("/{id}"), method = RequestMethod.GET)
    public String getSingleContract(){
        return "Hello single contract!!";
    }
    @RequestMapping(value = ("/lineItems"), method = RequestMethod.GET)
    public String getAllLineItemContracts(){
        return "Hello line item contracts!!";
    }
    @RequestMapping(value = ("/serviceOrders"), method = RequestMethod.GET)
    public String getAllServiceOrderContracts(){
        return "Hello service orders!!";
    }
    @RequestMapping(value = ("/serviceAgreements"), method = RequestMethod.GET)
    public String getAllServiceAgreementContracts(){
        return "Hello service agreements!!";
    }



}
