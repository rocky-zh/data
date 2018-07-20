package com.pagoda.domain.salorderhead.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salorderhead.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 销售订单明细来源商品数量表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrderDetailGoodsQtyDynamicSqlSupport {

  public static SalOrderDetailGoodsQtyTable salOrderDetailGoodsQtyTable =
      new SalOrderDetailGoodsQtyTable();
  public static SqlColumn<Long> id = salOrderDetailGoodsQtyTable.id;
  public static SqlColumn<Long> deleted = salOrderDetailGoodsQtyTable.deleted;
  public static SqlColumn<Date> createdAt = salOrderDetailGoodsQtyTable.createdAt;
  public static SqlColumn<String> creatorCode = salOrderDetailGoodsQtyTable.creatorCode;
  public static SqlColumn<String> creatorName = salOrderDetailGoodsQtyTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salOrderDetailGoodsQtyTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salOrderDetailGoodsQtyTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salOrderDetailGoodsQtyTable.modifierCode;
  public static SqlColumn<String> modifierName = salOrderDetailGoodsQtyTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salOrderDetailGoodsQtyTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salOrderDetailGoodsQtyTable.version;
  public static SqlColumn<Long> orderDetailId = salOrderDetailGoodsQtyTable.orderDetailId;
  public static SqlColumn<Long> sourceId = salOrderDetailGoodsQtyTable.sourceId;
  public static SqlColumn<String> sourceNo = salOrderDetailGoodsQtyTable.sourceNo;
  public static SqlColumn<Long> orderId = salOrderDetailGoodsQtyTable.orderId;
  public static SqlColumn<String> orderSeqno = salOrderDetailGoodsQtyTable.orderSeqno;
  public static SqlColumn<Long> entId = salOrderDetailGoodsQtyTable.entId;
  public static SqlColumn<Integer> sourceType = salOrderDetailGoodsQtyTable.sourceType;
  public static SqlColumn<java.math.BigDecimal> requestQty = salOrderDetailGoodsQtyTable.requestQty;
  public static SqlColumn<String> remark = salOrderDetailGoodsQtyTable.remark;

  public static final class SalOrderDetailGoodsQtyTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public final SqlColumn<Date> createdAt = column("created_at", JDBCType.DATE);
    public final SqlColumn<String> creatorCode = column("creator_code", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorName = column("creator_name", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorOrgCode = column("creator_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> lastModifiedAt = column("last_modified_at", JDBCType.DATE);
    public final SqlColumn<String> modifierName = column("modifier_name", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierCode = column("modifier_code", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierOrgCode = column("modifier_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

    public final SqlColumn<Long> orderDetailId = column("order_detail_id", JDBCType.BIGINT);
    public final SqlColumn<Long> sourceId = column("source_id", JDBCType.BIGINT);
    public final SqlColumn<String> sourceNo = column("source_no", JDBCType.VARCHAR);
    public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);
    public final SqlColumn<String> orderSeqno = column("order_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> requestQty =
        column("request_qty", JDBCType.DECIMAL);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public SalOrderDetailGoodsQtyTable() {
      super("SalOrderDetailGoodsQty");
    }
  }
}
