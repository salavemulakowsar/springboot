package com.example.consumingrest;

import org.modelmapper.ModelMapper;

public class TestModelMapper {
	public static void main(String[] args) {
		
	
	ModelMapper modelMapper = new ModelMapper();
	Order order = new Order(new Customer(new Name("salavemula","kowsar")),
							new Address("new street", "new city"));
	
	OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class); 
	System.out.println(orderDTO.toString());

}
}
