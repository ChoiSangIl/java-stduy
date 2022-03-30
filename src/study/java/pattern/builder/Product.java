package study.java.pattern.builder;

public class Product {
	private long id;
	private String name;
	private int price;
	private String desc;
	
	public Product(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.price = builder.price;
		this.desc = builder.desc;
	}
	
	public static class Builder {
		private long id;
		private String name;
		private int price;
		private String desc = "default desc...";
		
		public Builder(long id) {
			this.id = id;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder price(int price) {
			this.price = price;
			return this;
		}
		
		public Builder desc(String desc) {
			this.desc = desc;
			return this;
		}
		
		public Product build() {
			return new Product(this);
		}
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + "]";
	}
	
}