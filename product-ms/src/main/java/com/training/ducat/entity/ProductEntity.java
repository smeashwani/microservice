package com.training.ducat.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Entity(name = "Product")
@Data
public class ProductEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@Column(name = "description")
	private String desc;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ProductBrandEntity> brand;
}
