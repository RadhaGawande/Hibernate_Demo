package com.hibernate.model;
import java.util.Date;
public class Product {
	//POJO Identity
			private int P1Code;
			private String P1Name;
			private double P1Price;
			private String P1Brand;
			private Date ManufacturingDate;
			public Product() {
				super();
				
			}
			public Product(int P1Code, String P1Name,String P1Brand, double P1Price,
					Date ManufacturingDate) {
				super();
				this.P1Code = P1Code;
				this.P1Name = P1Name;
				this.P1Brand = P1Brand;
				this.P1Price = P1Price;
				this.ManufacturingDate = ManufacturingDate;
			}
			public int getP1Code() {
			   return P1Code;
			}
			public String getP1Name() {
				return P1Name;
			}
			public void setP1Name(String p1Name) {
				P1Name = p1Name;
			}
			public double getP1Price() {
				return P1Price;
			}
			public void setP1Price(double p1Price) {
				P1Price = p1Price;
			}
			public String getP1Brand() {
				return P1Brand;
			}
			public void setP1Brand(String p1Brand) {
				P1Brand = p1Brand;
			}
			public Date getManufacturingDate() {
				return ManufacturingDate;
			}
			public void setManufacturingDate(Date manufacturingDate) {
				ManufacturingDate = manufacturingDate;
			}
			public void setP1Code(int p1Code) {
				P1Code = p1Code;
			}
			@Override
			public String toString() {
				return "Product [P1Code=" + P1Code + ", P1Name=" + P1Name
						+ ",P1Price=" + P1Price+ ", P1Brand=" + P1Brand + ", ManufacturingDate=" + ManufacturingDate
						+ "]";
			
	}
}
