package de.adorsys.xs2a.adapter.model;

import javax.annotation.Generated;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

@Generated("xs2a-codegen")
public class BulkPaymentInitiationJsonTO {
  private Boolean batchBookingPreferred;

  private AccountReferenceTO debtorAccount;

  private LocalDate requestedExecutionDate;

  private OffsetDateTime requestedExecutionTime;

  private List<PaymentInitiationBulkElementJsonTO> payments;

  public Boolean getBatchBookingPreferred() {
    return batchBookingPreferred;
  }

  public void setBatchBookingPreferred(Boolean batchBookingPreferred) {
    this.batchBookingPreferred = batchBookingPreferred;
  }

  public AccountReferenceTO getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(AccountReferenceTO debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public LocalDate getRequestedExecutionDate() {
    return requestedExecutionDate;
  }

  public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }

  public OffsetDateTime getRequestedExecutionTime() {
    return requestedExecutionTime;
  }

  public void setRequestedExecutionTime(OffsetDateTime requestedExecutionTime) {
    this.requestedExecutionTime = requestedExecutionTime;
  }

  public List<PaymentInitiationBulkElementJsonTO> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentInitiationBulkElementJsonTO> payments) {
    this.payments = payments;
  }
}
