package com.AddCart1.SpringEcom06.repo;

import com.AddCart1.SpringEcom06.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
