public class OrderSeparated implements OrderState {
  private OrderSeparated() {
  };

  private static OrderSeparated instance = new OrderSeparated();

  public static OrderSeparated getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido separado";
  }

  public String openOrder(Order order) {
    return "Pedido não foi aberto";
  };

  public String payOrder(Order order) {
    return "Pedido não foi pago";
  };

  public String separateOrder(Order order) {
    return "Pedido não foi separado";
  };

  public String dispatchOrder(Order order) {
    order.setState(OrderDispatched.getInstance());
    return "Pedido despachado";
  };

  public String deliverOrder(Order order) {
    return "Pedido não foi entregue";
  };

  public String cancelOrder(Order order) {
    order.setState(OrderCancelled.getInstance());
    return "Pedido cancelado";
  };
}
