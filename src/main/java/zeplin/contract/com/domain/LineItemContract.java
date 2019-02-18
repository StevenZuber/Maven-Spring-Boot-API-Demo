package zeplin.contract.com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
//table annotation
public class LineItemContract {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    // add annotation
    private int invoiceNumber;
    private String service;
    private String site;
    private Date receivedDate;
    private Date expirationDate;
    private Double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getService() {
        return service;
    }

    public String getSite() {
        return site;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LineItemContract{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", invoiceNumber=" + invoiceNumber +
                ", service='" + service + '\'' +
                ", site='" + site + '\'' +
                ", receivedDate=" + receivedDate +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                '}';
    }
}
