package com.ssafy.product.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.product.model.ProductDto;

@Mapper
public interface ProductMapper {

	List<ProductDto> listProduct() throws SQLException;

}
