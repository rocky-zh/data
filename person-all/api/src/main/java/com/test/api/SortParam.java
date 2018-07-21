package com.test.api;

import lombok.Data;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 排序参数
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
public class SortParam extends Sort {
  public static final String FAKE_PROPERTY = "$null$";
  public static final Sort.Order FAKE_ORDER = new OrderParam();

  private List<OrderParam> orders;

  public SortParam() {
    super(FAKE_ORDER);
  }

  public SortParam(List<OrderParam> orders) {
    super(FAKE_ORDER);
    this.orders = orders;
  }

  public SortParam(OrderParam... orders) {
    this(Arrays.asList(orders));
  }

  public SortParam setOrders(List<OrderParam> orders) {
    this.orders = orders;
    return new SortParam(orders);
  }

  /**
   * Returns the order registered for the given property.
   *
   * @param property
   * @return
   */
  @Override
  public Order getOrderFor(String property) {
    for (Order order : this) {
      if (order.getProperty().equals(property)) {
        return order;
      }
    }
    return null;
  }

  @Override
  public Iterator<Order> iterator() {
    ArrayList<Order> these = new ArrayList<Order>(this.orders);
    return these.iterator();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof SortParam)) {
      return false;
    }

    SortParam that = (SortParam) obj;

    return this.orders.equals(that.orders);
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + orders.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return StringUtils.collectionToCommaDelimitedString(orders);
  }

  public String serializeString() {
    if (orders == null || orders.size() == 0) {
      return "";
    }
    StringBuilder buf = new StringBuilder();
    orders
        .stream()
        .forEach(
            o ->
                buf.append(o.getProperty())
                    .append(":")
                    .append(o.getDirection().toString())
                    .append(","));
    String str = buf.substring(0, buf.length() - 1);
    return str;
  }

  public static SortParam deserializeString(String value) {
    String[] parts = value.split(",");
    List<OrderParam> orders = new ArrayList<>(parts.length);
    for (String part : parts) {
      String[] params = part.split(":");
      OrderParam o = new OrderParam(params[1], params[0]);
      orders.add(o);
    }
    return new SortParam(orders);
  }

  @Data
  public static class OrderParam extends Order {
    private static final boolean DEFAULT_IGNORE_CASE = false;

    private Direction direction;
    private String property;
    private boolean ignoreCase;
    private NullHandling nullHandling;

    public OrderParam() {
      super(FAKE_PROPERTY);
    }

    public OrderParam(String direction, String property) {
      this(Direction.fromString(direction), property);
    }

    public OrderParam(Direction direction, String property) {
      this(direction, property, DEFAULT_IGNORE_CASE, null);
    }

    public OrderParam(Direction direction, String property, NullHandling nullHandlingHint) {
      this(direction, property, DEFAULT_IGNORE_CASE, nullHandlingHint);
    }

    public OrderParam(
        Direction direction, String property, boolean ignoreCase, NullHandling nullHandling) {
      super(FAKE_PROPERTY);
      this.direction = direction == null ? DEFAULT_DIRECTION : direction;
      this.property = property;
      this.ignoreCase = ignoreCase;
      this.nullHandling = nullHandling == null ? NullHandling.NATIVE : nullHandling;
    }

    public OrderParam setDirection(String direction) {
      this.direction = Direction.fromString(direction);
      return this;
    }

    /**
     * Returns whether sorting for this property shall be ascending.
     *
     * @return
     */
    @Override
    public boolean isAscending() {
      return this.direction.isAscending();
    }

    /**
     * Returns whether sorting for this property shall be descending.
     *
     * @return
     */
    @Override
    public boolean isDescending() {
      return this.direction.isDescending();
    }
  }
}
