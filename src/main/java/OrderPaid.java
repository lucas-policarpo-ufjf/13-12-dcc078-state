public class OrderPaid implements OrderState {
  private OrderPaid() {
  };

  private static OrderPaid instance = new OrderPaid();

  public static OrderPaid getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido pago";
  }

  public String openOrder(Order order) {
    return "Pedido não foi aberto";
  };

  public String payOrder(Order order) {
    return "Pedido não foi pago";
  };

  public String separateOrder(Order order) {
    order.setState(OrderSeparated.getInstance());
    return "Pedido separado";
  };

  public String dispatchOrder(Order order) {
    return "Pedido não foi despachado";
  };

  public String deliverOrder(Order order) {
    return "Pedido não foi entregue";
  };

  public String cancelOrder(Order order) {
    order.setState(OrderCancelled.getInstance());
    return "Pedido cancelado";
  };
}
