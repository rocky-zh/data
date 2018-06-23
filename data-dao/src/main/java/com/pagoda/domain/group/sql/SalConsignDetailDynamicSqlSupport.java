package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * sal_consign_detail实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignDetailDynamicSqlSupport {

  public static SalConsignDetailTable salConsignDetailTable = new SalConsignDetailTable();
  public static SqlColumn<Long> id = salConsignDetailTable.id;
  public static SqlColumn<Long> deleted = salConsignDetailTable.deleted;
  public static SqlColumn<Boolean> enabled = salConsignDetailTable.enabled;
  public static SqlColumn<String> treePath = salConsignDetailTable.treePath;
  public static SqlColumn<Date> createdAt = salConsignDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignDetailTable.version;
  public static SqlColumn<Boolean> active = salConsignDetailTable.active;
  public static SqlColumn<java.math.BigDecimal> actualAmt = salConsignDetailTable.actualAmt;
  public static SqlColumn<Long> conId = salConsignDetailTable.conId;
  public static SqlColumn<String> conNo = salConsignDetailTable.conNo;
  public static SqlColumn<java.math.BigDecimal> discountPrice = salConsignDetailTable.discountPrice;
  public static SqlColumn<java.math.BigDecimal> discountRate = salConsignDetailTable.discountRate;
  public static SqlColumn<Boolean> enabled = salConsignDetailTable.enabled;
  public static SqlColumn<String> goodsCode = salConsignDetailTable.goodsCode;
  public static SqlColumn<Long> goodsId = salConsignDetailTable.goodsId;
  public static SqlColumn<String> goodsName = salConsignDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = salConsignDetailTable.goodsSpec;
  public static SqlColumn<java.math.BigDecimal> grossWeight = salConsignDetailTable.grossWeight;
  public static SqlColumn<java.math.BigDecimal> netWeight = salConsignDetailTable.netWeight;
  public static SqlColumn<Long> orderId = salConsignDetailTable.orderId;
  public static SqlColumn<String> orderNo = salConsignDetailTable.orderNo;
  public static SqlColumn<java.math.BigDecimal> price = salConsignDetailTable.price;
  public static SqlColumn<java.math.BigDecimal> qty = salConsignDetailTable.qty;
  public static SqlColumn<String> salConOutDepotCode = salConsignDetailTable.salConOutDepotCode;
  public static SqlColumn<Long> salConOutDepotId = salConsignDetailTable.salConOutDepotId;
  public static SqlColumn<String> salConOutDepotName = salConsignDetailTable.salConOutDepotName;
  public static SqlColumn<String> salUnitCode = salConsignDetailTable.salUnitCode;
  public static SqlColumn<Long> salUnitId = salConsignDetailTable.salUnitId;
  public static SqlColumn<String> salUnitName = salConsignDetailTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salUnitRate = salConsignDetailTable.salUnitRate;
  public static SqlColumn<java.math.BigDecimal> shippedAmt = salConsignDetailTable.shippedAmt;
  public static SqlColumn<Integer> shippedCount = salConsignDetailTable.shippedCount;
  public static SqlColumn<java.math.BigDecimal> shippedGrossWeight =
      salConsignDetailTable.shippedGrossWeight;
  public static SqlColumn<java.math.BigDecimal> shippedNetWeight =
      salConsignDetailTable.shippedNetWeight;
  public static SqlColumn<java.math.BigDecimal> shippedPrice = salConsignDetailTable.shippedPrice;
  public static SqlColumn<java.math.BigDecimal> shippedQty = salConsignDetailTable.shippedQty;
  public static SqlColumn<java.math.BigDecimal> shippedVolume = salConsignDetailTable.shippedVolume;
  public static SqlColumn<java.math.BigDecimal> taxAmt = salConsignDetailTable.taxAmt;
  public static SqlColumn<java.math.BigDecimal> taxRate = salConsignDetailTable.taxRate;
  public static SqlColumn<java.math.BigDecimal> totalAmt = salConsignDetailTable.totalAmt;
  public static SqlColumn<java.math.BigDecimal> volume = salConsignDetailTable.volume;

  public static final class SalConsignDetailTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public final SqlColumn<String> treePath = column("tree_path", JDBCType.VARCHAR);
    public final SqlColumn<Date> createdAt = column("created_at", JDBCType.DATE);
    public final SqlColumn<String> creatorCode = column("creator_code", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorName = column("creator_name", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorOrgCode = column("creator_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> lastModifiedAt = column("last_modified_at", JDBCType.DATE);
    public final SqlColumn<String> modifierName = column("modifier_name", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierCode = column("modifier_code", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierOrgCode = column("modifier_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

    public final SqlColumn<java.math.BigDecimal> actualAmt = column("actual_amt", JDBCType.DECIMAL);
    public final SqlColumn<Long> conId = column("con_id", JDBCType.BIGINT);
    public final SqlColumn<String> conNo = column("con_no", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> discountPrice =
        column("discount_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountRate =
        column("discount_rate", JDBCType.DECIMAL);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> grossWeight =
        column("gross_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> netWeight = column("net_weight", JDBCType.DECIMAL);
    public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);
    public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> price = column("price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> qty = column("qty", JDBCType.DECIMAL);
    public final SqlColumn<String> salConOutDepotCode =
        column("sal_con_out_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> salConOutDepotId = column("sal_con_out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> salConOutDepotName =
        column("sal_con_out_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<String> salUnitCode = column("sal_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> salUnitId = column("sal_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> salUnitName = column("sal_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salUnitRate =
        column("sal_unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedAmt =
        column("shipped_amt", JDBCType.DECIMAL);
    public final SqlColumn<Integer> shippedCount = column("shipped_count", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> shippedGrossWeight =
        column("shipped_gross_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedNetWeight =
        column("shipped_net_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedPrice =
        column("shipped_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedQty =
        column("shipped_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedVolume =
        column("shipped_volume", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxAmt = column("tax_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalAmt = column("total_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> volume = column("volume", JDBCType.DECIMAL);

    public SalConsignDetailTable() {
      super("SalConsignDetail");
    }
  }
}
