package shopping;

public class ItemDetail {
	private Item item;
	private int amount;

	public ItemDetail() {
	}

	public ItemDetail(Item item, int amount) {
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
