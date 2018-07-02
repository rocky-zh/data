package com.pagoda.domain.salorderhead.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salorderhead.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 销售订单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrderDetailDynamicSqlSupport {

  public static SalOrderDetailTable salOrderDetailTable = new SalOrderDetailTable();
  public static SqlColumn<Long> id = salOrderDetailTable.id;
  public static SqlColumn<Long> deleted = salOrderDetailTable.deleted;
  public static SqlColumn<Date> createdAt = salOrderDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = salOrderDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = salOrderDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salOrderDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salOrderDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salOrderDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = salOrderDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salOrderDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salOrderDetailTable.version;
  public static SqlColumn<Long> orderId = salOrderDetailTable.orderId;
  public static SqlColumn<String> orderSeqno = salOrderDetailTable.orderSeqno;
  public static SqlColumn<Long> entId = salOrderDetailTable.entId;
  public static SqlColumn<Long> goodsVarId = salOrderDetailTable.goodsVarId;
  public static SqlColumn<String> goodsVarName = salOrderDetailTable.goodsVarName;
  public static SqlColumn<Long> goodsId = salOrderDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = salOrderDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = salOrderDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = salOrderDetailTable.goodsSpec;
  public static SqlColumn<Long> salUnitid = salOrderDetailTable.salUnitid;
  public static SqlColumn<String> salUnitCode = salOrderDetailTable.salUnitCode;
  public static SqlColumn<String> salUnitName = salOrderDetailTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salUnitRate = salOrderDetailTable.salUnitRate;
  public static SqlColumn<java.math.BigDecimal> requestQty = salOrderDetailTable.requestQty;
  public static SqlColumn<java.math.BigDecimal> maxOrderQty = salOrderDetailTable.maxOrderQty;
  public static SqlColumn<java.math.BigDecimal> minOrderQty = salOrderDetailTable.minOrderQty;
  public static SqlColumn<java.math.BigDecimal> price = salOrderDetailTable.price;
  public static SqlColumn<java.math.BigDecimal> discountPrice = salOrderDetailTable.discountPrice;
  public static SqlColumn<java.math.BigDecimal> discountRate = salOrderDetailTable.discountRate;
  public static SqlColumn<java.math.BigDecimal> discountAmt = salOrderDetailTable.discountAmt;
  public static SqlColumn<java.math.BigDecimal> taxRate = salOrderDetailTable.taxRate;
  public static SqlColumn<java.math.BigDecimal> taxAmt = salOrderDetailTable.taxAmt;
  public static SqlColumn<java.math.BigDecimal> goodsAmt = salOrderDetailTable.goodsAmt;
  public static SqlColumn<java.math.BigDecimal> totalAmt = salOrderDetailTable.totalAmt;
  public static SqlColumn<String> remark = salOrderDetailTable.remark;
  public static SqlColumn<Integer> sourceType = salOrderDetailTable.sourceType;
  public static SqlColumn<Long> sourceId = salOrderDetailTable.sourceId;
  public static SqlColumn<String> sourceNo = salOrderDetailTable.sourceNo;

  public static final class SalOrderDetailTable extends SqlTable {
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

    public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);
    public final SqlColumn<String> orderSeqno = column("order_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsVarId = column("goods_var_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsVarName = column("goods_var_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> salUnitid = column("sal_unitid", JDBCType.BIGINT);
    public final SqlColumn<String> salUnitCode = column("sal_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salUnitName = column("sal_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salUnitRate =
        column("sal_unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> requestQty =
        column("request_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> maxOrderQty =
        column("max_order_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> minOrderQty =
        column("min_order_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> price = column("price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountPrice =
        column("discount_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountRate =
        column("discount_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountAmt =
        column("discount_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxAmt = column("tax_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> goodsAmt = column("goods_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalAmt = column("total_amt", JDBCType.DECIMAL);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);
    public final SqlColumn<Long> sourceId = column("source_id", JDBCType.BIGINT);
    public final SqlColumn<String> sourceNo = column("source_no", JDBCType.VARCHAR);

    public SalOrderDetailTable() {
      super("SalOrderDetail");
    }
  }
}
