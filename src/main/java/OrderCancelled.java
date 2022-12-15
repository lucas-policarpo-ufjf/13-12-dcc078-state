public class OrderCancelled implements OrderState {
  private OrderCancelled() {
  };

  private static OrderCancelled instance = new OrderCancelled();

  public static OrderCancelled getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido cancelado";
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
    return "Pedido não foi despachado";
  };

  public String deliverOrder(Order order) {
    return "Pedido não foi entregue";
  };

  public String cancelOrder(Order order) {
    return "Pedido não foi cancelado";
  };
}
