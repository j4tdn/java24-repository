package bean;

public class ItemDetail {
	private Item item;
	private int amount;

	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Item item, int amount) {
		super();
		this.item = item;
		this.amount = amount;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", amount=" + amount + "]";
	}

}
