//package co.simplon.p25.api.repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import co.simplon.p25.api.entities.Customer;
//
//public interface CustomerRepository
//	extends JpaRepository<Customer, Long> {
//
//    boolean existsByContactEmail(String string);
//
//    boolean existsByCustomerName(String string);
//
//    @Query(value = "SELECT nextval('customers_customer_number_seq')", nativeQuery = true)
//    public int getNextValMySequence();
//
//}