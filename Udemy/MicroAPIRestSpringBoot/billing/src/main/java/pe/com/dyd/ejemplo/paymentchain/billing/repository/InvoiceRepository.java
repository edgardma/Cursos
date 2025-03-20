package pe.com.dyd.ejemplo.paymentchain.billing.repository;

import pe.com.dyd.ejemplo.paymentchain.billing.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    
}
