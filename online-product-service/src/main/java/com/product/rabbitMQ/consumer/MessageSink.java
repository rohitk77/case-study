package com.product.rabbitMQ.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

import com.product.model.OrderConfirm;
import com.product.model.Product;
import com.product.service.ProductService;

@EnableBinding(Sink.class)
public class MessageSink {

	@Autowired
	private ProductService productservice;
	private final String SUCCESS = "SUCCESS";

	public MessageSink() {
	}

	@ServiceActivator(inputChannel = Sink.INPUT)
	public void loggerSink(OrderConfirm orderConfirm) {
		
		if(orderConfirm != null && SUCCESS.equals(orderConfirm.getOrderstatus())){
			
			Product product = productservice.getProductById(orderConfirm.getProductId());
			
			if(product != null)
			{
				int originalStock = product.getStock();
				product.setStock(originalStock - orderConfirm.getQuantity());
				
				productservice.updateProduct(product);
			}
		}

	}

}
