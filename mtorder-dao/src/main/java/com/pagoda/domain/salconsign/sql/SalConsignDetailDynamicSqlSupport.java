package com.pagoda.domain.salconsign.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsign.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 发货单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignDetailDynamicSqlSupport {

  public static SalConsignDetailTable salConsignDetailTable = new SalConsignDetailTable();
  public static SqlColumn<Long> id = salConsignDetailTable.id;
  public static SqlColumn<Long> deleted = salConsignDetailTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignDetailTable.version;
  public static SqlColumn<String> orderSeqno = salConsignDetailTable.orderSeqno;
  public static SqlColumn<Long> goodsId = salConsignDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = salConsignDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = salConsignDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = salConsignDetailTable.goodsSpec;
  public static SqlColumn<Long> salunitId = salConsignDetailTable.salunitId;
  public static SqlColumn<String> salUnitCode = salConsignDetailTable.salUnitCode;
  public static SqlColumn<String> salUnitName = salConsignDetailTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salUnitRate = salConsignDetailTable.salUnitRate;
  public static SqlColumn<Long> salConOutDepotId = salConsignDetailTable.salConOutDepotId;
  public static SqlColumn<String> salConOutDepotCode = salConsignDetailTable.salConOutDepotCode;
  public static SqlColumn<String> salConOutDepotName = salConsignDetailTable.salConOutDepotName;
  public static SqlColumn<java.math.BigDecimal> grossWeight = salConsignDetailTable.grossWeight;
  public static SqlColumn<java.math.BigDecimal> netWeight = salConsignDetailTable.netWeight;
  public static SqlColumn<java.math.BigDecimal> qty = salConsignDetailTable.qty;
  public static SqlColumn<java.math.BigDecimal> volume = salConsignDetailTable.volume;
  public static SqlColumn<java.math.BigDecimal> taxRate = salConsignDetailTable.taxRate;
  public static SqlColumn<java.math.BigDecimal> price = salConsignDetailTable.price;
  public static SqlColumn<java.math.BigDecimal> discountRate = salConsignDetailTable.discountRate;
  public static SqlColumn<java.math.BigDecimal> actualAmt = salConsignDetailTable.actualAmt;
  public static SqlColumn<java.math.BigDecimal> discountPrice = salConsignDetailTable.discountPrice;
  public static SqlColumn<java.math.BigDecimal> shippedPrice = salConsignDetailTable.shippedPrice;
  public static SqlColumn<Integer> shippedCount = salConsignDetailTable.shippedCount;

  public static final class SalConsignDetailTable extends SqlTable {
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

    public final SqlColumn<String> orderSeqno = column("order_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> salunitId = column("salunit_id", JDBCType.BIGINT);
    public final SqlColumn<String> salUnitCode = column("sal_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salUnitName = column("sal_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salUnitRate =
        column("sal_unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> salConOutDepotId = column("sal_con_out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> salConOutDepotCode =
        column("sal_con_out_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salConOutDepotName =
        column("sal_con_out_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> grossWeight =
        column("gross_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> netWeight = column("net_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> qty = column("qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> volume = column("volume", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> price = column("price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountRate =
        column("discount_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> actualAmt = column("actual_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountPrice =
        column("discount_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedPrice =
        column("shipped_price", JDBCType.DECIMAL);
    public final SqlColumn<Integer> shippedCount = column("shipped_count", JDBCType.INTEGER);

    public SalConsignDetailTable() {
      super("SalConsignDetail");
    }
  }
}
