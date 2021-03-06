package com.training.ducat.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.ducat.model.ProductDTO;

@FeignClient(value = "PRODUCT-DETAIL-MS")
public interface ProductDetailTemplate {

	@GetMapping("v1/product-detail/{id}")
	ProductDTO getDetail(@PathVariable long id);

}
