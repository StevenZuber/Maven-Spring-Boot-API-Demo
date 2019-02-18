package zeplin.contract.com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zeplin.contract.com.service.InvoiceService;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;


    @RequestMapping(value = ("/"), method = RequestMethod.GET)
    public String getAllInvoices(){
        return "Hello invoices!!";
    }
    @RequestMapping(value = ("/{id}"), method = RequestMethod.GET)
    public String getInvoiceById(){
        return "Hello single invoice!!";
    }
}
