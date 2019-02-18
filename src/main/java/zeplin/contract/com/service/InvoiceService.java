package zeplin.contract.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zeplin.contract.com.dao.InvoiceRepository;
import zeplin.contract.com.domain.Invoice;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        List<Invoice> invoices = new ArrayList<Invoice>();
        invoiceRepository.findAll().forEach(invoice -> invoices.add(invoice));
        return invoices;
    }

    public Invoice getInvoiceById(int id) {
        return invoiceRepository.findById(id).get();
    }
}

