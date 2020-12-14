package de.aclue.demotesting.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class Order {

	private final String content;
	
	private final Customer customer;
	
}
