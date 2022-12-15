public class Order {
  private String productName;
  private Float totalPrice;
  private OrderState state;

  public Order() {
    this.state = OrderOpened.getInstance();
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Float getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
  }

  public OrderState getState() {
    return state;
  }

  public void setState(OrderState state) {
    this.state = state;
  }

  public String openOrder() {
    return this.state.openOrder(this);
  }

  public String payOrder() {
    return this.state.payOrder(this);
  }

  public String separateOrder() {
    return this.state.separateOrder(this);
  }

  public String dispatchOrder() {
    return this.state.dispatchOrder(this);
  }

  public String deliverOrder() {
    return this.state.deliverOrder(this);
  }

  public String cancelOrder() {
    return this.state.cancelOrder(this);
  }
}
