package zeplin.contract.com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//table annotation
public class Invoice {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    // add annotation for many to one
    private int invoiceNumber;
    private boolean pastDue;
    private boolean paid;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public boolean isPastDue() {
        return pastDue;
    }

    public boolean isPaid() {
        return paid;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", invoiceNumber=" + invoiceNumber +
                ", pastDue=" + pastDue +
                ", paid=" + paid +
                '}';
    }
}
