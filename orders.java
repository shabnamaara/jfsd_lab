package com.klef.jfsd.exam.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class orders {
	@Id
	@Column(name="ordersid")
	long ordersid;
	@Column(name="productname")
	String productname;
	@Column(name="quantity")
	long quantity;
	@Column(name="orderdate")
	Date orderdate;
	@Column(name="customername")
	String customername;
	public long getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(long ordersid) {
		this.ordersid = ordersid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Override
	public String toString() {
		return "orders [ordersid=" + ordersid + ", productname=" + productname + ", quantity=" + quantity
				+ ", orderdate=" + orderdate + ", customername=" + customername + "]";
	}
}
