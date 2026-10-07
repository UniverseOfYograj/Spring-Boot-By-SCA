package in.yograj.repository;

import in.yograj.dto.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//@Transactional
public interface ProductRepository extends JpaRepository<Product,Integer> {
//jpa persist()--save() merge()--update
//3000+1000 // 4000-1000=3000 atomicity//acid


}
