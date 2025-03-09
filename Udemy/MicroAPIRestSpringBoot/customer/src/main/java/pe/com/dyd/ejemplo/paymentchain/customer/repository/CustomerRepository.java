package pe.com.dyd.ejemplo.paymentchain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.dyd.ejemplo.paymentchain.customer.entities.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    
    
}
