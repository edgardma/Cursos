package pe.com.dyd.ejemplo.paymentchain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.dyd.ejemplo.paymentchain.customer.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    
}
