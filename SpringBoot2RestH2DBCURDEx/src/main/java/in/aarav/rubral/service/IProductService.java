package in.aarav.rubral.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.aarav.rubral.entities.Product;

@Service
public interface IProductService {

	Integer saveProduct(Product p);
	Product findOneProduct(Integer id);
	List<Product >findAllProducts();
	void deleteProduct(Integer id);
	void updateProduct(Product p);
}
