package com.lhf.aop.dao;

/**
 * @ClassName: ProductDao
 * @Description:
 * @Author: liuhefei
 * @Date: 2018/12/4
 **/
import com.lhf.aop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Long> {
     public Product findById(Long id);
}

