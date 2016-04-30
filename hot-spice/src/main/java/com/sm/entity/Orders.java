package com.sm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="order_id", columnDefinition="int", nullable=false)
	private int orderId; 
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="order_status_code")
	private int orderStatusCode;
	
	@Column(name="order_placed_date")
	private Date orderPlacedDate;
	
	@Column(name="order_amount")
	private double orderAmount;
	
	@Embedded
	AuditDetails audit;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="order_id")
	Set<OrderDetails> orderDetails = new HashSet<OrderDetails>();
	
	public Orders() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getOrderStatusCode() {
		return orderStatusCode;
	}

	public void setOrderStatusCode(int orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}

	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}

	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public AuditDetails getAudit() {
		return audit;
	}

	public void setAudit(AuditDetails audit) {
		this.audit = audit;
	}
	
	public Set<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", userId=" + userId + ", orderStatusCode=" + orderStatusCode
				+ ", orderPlacedDate=" + orderPlacedDate + ", orderAmount=" + orderAmount + ", audit=" + audit + "]";
	}
	
}
