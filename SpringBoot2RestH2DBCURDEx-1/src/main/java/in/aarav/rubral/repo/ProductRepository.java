package in.aarav.rubral.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aarav.rubral.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
