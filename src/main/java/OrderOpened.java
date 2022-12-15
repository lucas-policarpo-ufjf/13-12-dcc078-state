public class OrderOpened implements OrderState {
  private OrderOpened() {
  };

  private static OrderOpened instance = new OrderOpened();

  public static OrderOpened getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido aberto";
  }

  public String openOrder(Order order) {
    return "Pedido não foi aberto";
  };

  public String payOrder(Order order) {
    order.setState(OrderPaid.getInstance());
    return "Pedido pago";
  };

  public String separateOrder(Order order) {
    return "Pedido não foi separado";
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
