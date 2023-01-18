package com.greenart.firstproject.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.greenart.firstproject.entity.ProductInfoEntity;
import com.greenart.firstproject.entity.enums.AlcoholType;
import com.greenart.firstproject.vo.product.ProductVO;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfoEntity, Long>{
    public Page<ProductInfoEntity> findAll(Pageable pageable);
    public Page<ProductInfoEntity> findByType(AlcoholType type, Pageable pageable);
    public Page<ProductInfoEntity> findByName(String name, Pageable pageable);
    public List<ProductInfoEntity> findBySeq(Long seq); // 상품번호로 상품조회(상세페이지)
    // public Page<ProductVO> findByType(ProductVO)
    // @Query(value = "SELECT b FROM product_info b WHERE pi_name LIKE %:keyword%"
    // )
    // List<ProductInfoEntity> findAllSearch(String keyword);
    public List<ProductInfoEntity> findByNameContaining(String keyword);
}
