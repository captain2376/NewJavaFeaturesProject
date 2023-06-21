package cgg.streamsoperations;

public class Product {
	
		private String productName;
		private int productPrice;
		public Product(String productName, int productPrice) {
			super();
			this.productName = productName;
			this.productPrice = productPrice;
		}
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getProductName() {
			return productName;
		}
		public int getProductPrice() {
			return productPrice;
		}
		@Override
		public String toString() {
			return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
		}
		
		
}
