package com.icici.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_det")

@NamedQuery(name = "order_like" , query = "Select e from Order e where e.orderName LIKE :orderName || '%'")
 
public class Order {

	@Id
	@Column(name = "order_id")
	private int orderId;

	@Column(name = "order_name")
	private String orderName;

	private double amount;

	private String status;
	
	
	@OneToMany(mappedBy = "order",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	List<OrderItem> items;
	
	
	@OneToOne
    @JoinColumn(name="payment_id")
    private Payment payment;
	
	
	
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
