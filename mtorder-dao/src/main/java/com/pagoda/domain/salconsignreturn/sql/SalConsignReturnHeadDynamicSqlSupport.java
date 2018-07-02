package com.pagoda.domain.salconsignreturn.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsignreturn.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 退货单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignReturnHeadDynamicSqlSupport {

  public static SalConsignReturnHeadTable salConsignReturnHeadTable =
      new SalConsignReturnHeadTable();
  public static SqlColumn<Long> id = salConsignReturnHeadTable.id;
  public static SqlColumn<Long> deleted = salConsignReturnHeadTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignReturnHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignReturnHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignReturnHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignReturnHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignReturnHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignReturnHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignReturnHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignReturnHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignReturnHeadTable.version;
  public static SqlColumn<Integer> returnType = salConsignReturnHeadTable.returnType;
  public static SqlColumn<java.sql.Timestamp> returnDate = salConsignReturnHeadTable.returnDate;
  public static SqlColumn<java.math.BigDecimal> returnQty = salConsignReturnHeadTable.returnQty;
  public static SqlColumn<java.math.BigDecimal> stockinQty = salConsignReturnHeadTable.stockinQty;
  public static SqlColumn<java.math.BigDecimal> stockinGrossWeight =
      salConsignReturnHeadTable.stockinGrossWeight;
  public static SqlColumn<java.math.BigDecimal> stockinNetWeight =
      salConsignReturnHeadTable.stockinNetWeight;
  public static SqlColumn<java.math.BigDecimal> totalTaxAmt = salConsignReturnHeadTable.totalTaxAmt;
  public static SqlColumn<java.math.BigDecimal> totalReturnAmt =
      salConsignReturnHeadTable.totalReturnAmt;
  public static SqlColumn<java.math.BigDecimal> totalStockinAmt =
      salConsignReturnHeadTable.totalStockinAmt;
  public static SqlColumn<Integer> status = salConsignReturnHeadTable.status;

  public static final class SalConsignReturnHeadTable extends SqlTable {
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

    public final SqlColumn<Integer> returnType = column("return_type", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Timestamp> returnDate =
        column("return_date", JDBCType.TIMESTAMP);
    public final SqlColumn<java.math.BigDecimal> returnQty = column("return_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> stockinQty =
        column("stockin_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> stockinGrossWeight =
        column("stockin_gross_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> stockinNetWeight =
        column("stockin_net_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalTaxAmt =
        column("total_tax_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalReturnAmt =
        column("total_return_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalStockinAmt =
        column("total_stockin_amt", JDBCType.DECIMAL);
    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

    public SalConsignReturnHeadTable() {
      super("SalConsignReturnHead");
    }
  }
}
