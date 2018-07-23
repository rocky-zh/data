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
  public static SqlColumn<String> seqno = salConsignReturnHeadTable.seqno;
  public static SqlColumn<Long> entId = salConsignReturnHeadTable.entId;
  public static SqlColumn<Long> arrOrgId = salConsignReturnHeadTable.arrOrgId;
  public static SqlColumn<String> arrOrgCode = salConsignReturnHeadTable.arrOrgCode;
  public static SqlColumn<String> arrOrgName = salConsignReturnHeadTable.arrOrgName;
  public static SqlColumn<Long> cusOrgId = salConsignReturnHeadTable.cusOrgId;
  public static SqlColumn<String> cusOrgCode = salConsignReturnHeadTable.cusOrgCode;
  public static SqlColumn<String> cusOrgName = salConsignReturnHeadTable.cusOrgName;
  public static SqlColumn<Integer> returnType = salConsignReturnHeadTable.returnType;
  public static SqlColumn<java.util.Date> returnDate = salConsignReturnHeadTable.returnDate;
  public static SqlColumn<java.math.BigDecimal> returnQty = salConsignReturnHeadTable.returnQty;
  public static SqlColumn<String> transitLineNo = salConsignReturnHeadTable.transitLineNo;
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
  public static SqlColumn<Integer> printCount = salConsignReturnHeadTable.printCount;
  public static SqlColumn<String> auditorCode = salConsignReturnHeadTable.auditorCode;
  public static SqlColumn<String> auditorName = salConsignReturnHeadTable.auditorName;
  public static SqlColumn<java.util.Date> auditTime = salConsignReturnHeadTable.auditTime;
  public static SqlColumn<String> remark = salConsignReturnHeadTable.remark;
  public static SqlColumn<String> note = salConsignReturnHeadTable.note;

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

    public final SqlColumn<String> seqno = column("seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> arrOrgId = column("arr_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> arrOrgCode = column("arr_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> arrOrgName = column("arr_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> cusOrgCode = column("cus_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cusOrgName = column("cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> returnType = column("return_type", JDBCType.INTEGER);
    public final SqlColumn<java.util.Date> returnDate = column("return_date", JDBCType.DATE);
    public final SqlColumn<java.math.BigDecimal> returnQty = column("return_qty", JDBCType.DECIMAL);
    public final SqlColumn<String> transitLineNo = column("transit_line_no", JDBCType.VARCHAR);
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
    public final SqlColumn<Integer> printCount = column("print_count", JDBCType.INTEGER);
    public final SqlColumn<String> auditorCode = column("auditor_code", JDBCType.VARCHAR);
    public final SqlColumn<String> auditorName = column("auditor_name", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> auditTime = column("audit_time", JDBCType.DATE);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

    public SalConsignReturnHeadTable() {
      super("SalConsignReturnHead");
    }
  }
}
