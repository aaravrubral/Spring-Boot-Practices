package in.aarav.rubral.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aarav.rubral.entities.Product;
import in.aarav.rubral.exception.ProductNotFoundException;
import in.aarav.rubral.repo.ProductRepository;
import in.aarav.rubral.service.IProductService;

@Service
public class IProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;
	
	public Integer saveProduct(Product p) {
		/*p=repo.save(p);
		Integer id = p.getProdId();
		return id;*/
		return repo.save(p).getProdId();
	}

	@Override
	public Product findOneProduct(Integer id) {
		
		/*Optional<Product> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new ProductNotFoundException(id+"- product not found");
		} */
		return repo.findById(id).orElseThrow(
				           ()->new ProductNotFoundException(id+"- product not found"));
	}

	
	public List<Product> findAllProducts() {
		
		return repo.findAll();
	}

	
	public void deleteProduct(Integer id) {
		
		 repo.delete(findOneProduct(id));
	}

	/**
	 *  Given Id should not be null and id exist in DB then update
	 *  
	 */
	
	public void updateProduct(Product p) {
		if(null==p.getProdId() ||  ! repo.existsById(p.getProdId())) {
			throw new ProductNotFoundException(p.getProdCode()+ "not found");
		}else {
			repo.save(p);
		}
		
	}


}
