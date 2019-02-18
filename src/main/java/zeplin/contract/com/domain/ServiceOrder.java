package zeplin.contract.com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
//table annotation
public class ServiceOrder {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    // add annotation
    private int invoiceNumber;
    private String description;
    private Date receivedDate;
    private Date expirationDate;
    private Double hourlyRate;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return "ServiceOrder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", invoiceNumber=" + invoiceNumber +
                ", description='" + description + '\'' +
                ", receivedDate=" + receivedDate +
                ", expirationDate=" + expirationDate +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}

