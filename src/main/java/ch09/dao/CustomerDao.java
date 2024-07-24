package ch09.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import ch09.dto.CustomerDto;

// mapper : java method - sql
public interface CustomerDao {
	

	@Select("select custid ,name, address, phone from customer")
	List<CustomerDto> listCustomer();
	

	@Select("select custid ,name, address, phone from customer where custid= #{custid}")
	CustomerDto detailCustomer (int custid);
	
	
	@Insert("insert into customer (custid ,name, address, phone) values ( #{custid }, #{name}, #{address}, #{phone} )")
	int insertCustomer(CustomerDto customerDto);
	
	
	
	@Update("update book "
			+ "		     set name = #{publisher},"
			+ "		      address = #{price} "
			+ "				phone = #{phone}"
			+ "		 where custid = #{custid}")
	int updateBook(CustomerDto customerDto);
	
	@Delete("delete from customer "
			+ "		 where custid = #{custid}")
	int deleteCustomer(int custid);
}