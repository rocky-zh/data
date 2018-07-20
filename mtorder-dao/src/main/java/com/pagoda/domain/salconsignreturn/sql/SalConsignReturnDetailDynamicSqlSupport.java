package com.pagoda.domain.salconsignreturn.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsignreturn.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 退货单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignReturnDetailDynamicSqlSupport {

  public static SalConsignReturnDetailTable salConsignReturnDetailTable =
      new SalConsignReturnDetailTable();
  public static SqlColumn<Long> id = salConsignReturnDetailTable.id;
  public static SqlColumn<Long> deleted = salConsignReturnDetailTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignReturnDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignReturnDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignReturnDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignReturnDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignReturnDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignReturnDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignReturnDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignReturnDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignReturnDetailTable.version;
  public static SqlColumn<Long> returnId = salConsignReturnDetailTable.returnId;
  public static SqlColumn<String> returnSeqno = salConsignReturnDetailTable.returnSeqno;
  public static SqlColumn<Long> entId = salConsignReturnDetailTable.entId;
  public static SqlColumn<Long> goodsId = salConsignReturnDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = salConsignReturnDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = salConsignReturnDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = salConsignReturnDetailTable.goodsSpec;
  public static SqlColumn<Long> salUnitId = salConsignReturnDetailTable.salUnitId;
  public static SqlColumn<String> salUnitCode = salConsignReturnDetailTable.salUnitCode;
  public static SqlColumn<String> salUnitName = salConsignReturnDetailTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salRate = salConsignReturnDetailTable.salRate;
  public static SqlColumn<Long> salRetInDepotId = salConsignReturnDetailTable.salRetInDepotId;
  public static SqlColumn<String> salRetInDepotCode = salConsignReturnDetailTable.salRetInDepotCode;
  public static SqlColumn<String> salRetInDepotName = salConsignReturnDetailTable.salRetInDepotName;
  public static SqlColumn<java.math.BigDecimal> returnQty = salConsignReturnDetailTable.returnQty;
  public static SqlColumn<java.math.BigDecimal> stockinQty = salConsignReturnDetailTable.stockinQty;
  public static SqlColumn<java.math.BigDecimal> stockinNetWeight =
      salConsignReturnDetailTable.stockinNetWeight;
  public static SqlColumn<java.math.BigDecimal> stockinGrossWeight =
      salConsignReturnDetailTable.stockinGrossWeight;
  public static SqlColumn<java.math.BigDecimal> price = salConsignReturnDetailTable.price;
  public static SqlColumn<java.math.BigDecimal> returnPrice =
      salConsignReturnDetailTable.returnPrice;
  public static SqlColumn<java.math.BigDecimal> taxRate = salConsignReturnDetailTable.taxRate;
  public static SqlColumn<java.math.BigDecimal> taxAmt = salConsignReturnDetailTable.taxAmt;
  public static SqlColumn<java.math.BigDecimal> totalReturnAmt =
      salConsignReturnDetailTable.totalReturnAmt;
  public static SqlColumn<java.math.BigDecimal> totalStockinAmt =
      salConsignReturnDetailTable.totalStockinAmt;
  public static SqlColumn<String> remark = salConsignReturnDetailTable.remark;

  public static final class SalConsignReturnDetailTable extends SqlTable {
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

    public final SqlColumn<Long> returnId = column("return_id", JDBCType.BIGINT);
    public final SqlColumn<String> returnSeqno = column("return_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> salUnitId = column("sal_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> salUnitCode = column("sal_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salUnitName = column("sal_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salRate = column("sal_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> salRetInDepotId = column("sal_ret_in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> salRetInDepotCode =
        column("sal_ret_in_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salRetInDepotName =
        column("sal_ret_in_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> returnQty = column("return_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> stockinQty =
        column("stockin_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> stockinNetWeight =
        column("stockin_net_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> stockinGrossWeight =
        column("stockin_gross_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> price = column("price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> returnPrice =
        column("return_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxAmt = column("tax_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalReturnAmt =
        column("total_return_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalStockinAmt =
        column("total_stockin_amt", JDBCType.DECIMAL);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public SalConsignReturnDetailTable() {
      super("SalConsignReturnDetail");
    }
  }
}
