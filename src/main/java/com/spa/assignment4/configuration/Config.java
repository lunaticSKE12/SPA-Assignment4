package com.spa.assignment4.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
@ComponentScan(basePackages="com.spa.assignment4")
@IntegrationComponentScan(basePackages="com.spa.assignment4")
public class Config {
	
	@Bean
	public MessageChannel newInvoicesChannel() {
		return new DirectChannel();
	}
	
	@Bean
	public MessageChannel singleInvoicesChannel() {
		return new DirectChannel();
	}
	
	@Bean
	public MessageChannel filteredInvoicesChannel() {
		return new DirectChannel();
	}
	
	@Bean
	public MessageChannel foreignTransactions() {
		return new DirectChannel();
	}
	
	@Bean
	public MessageChannel localTransactions() {
		return new DirectChannel();
	}
	
	@Bean
	public MessageChannel bankingChannel() {
		return new DirectChannel();
	}
}
