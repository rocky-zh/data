package com.pagoda.domain.salconsign.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsign.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 发货单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignHeadDynamicSqlSupport {

  public static SalConsignHeadTable salConsignHeadTable = new SalConsignHeadTable();
  public static SqlColumn<Long> id = salConsignHeadTable.id;
  public static SqlColumn<Long> deleted = salConsignHeadTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignHeadTable.version;
  public static SqlColumn<Long> orderId = salConsignHeadTable.orderId;
  public static SqlColumn<String> orderNo = salConsignHeadTable.orderNo;
  public static SqlColumn<String> waveNo = salConsignHeadTable.waveNo;
  public static SqlColumn<java.math.BigDecimal> tatalQty = salConsignHeadTable.tatalQty;
  public static SqlColumn<java.math.BigDecimal> totalAmt = salConsignHeadTable.totalAmt;
  public static SqlColumn<java.sql.Timestamp> entryDate = salConsignHeadTable.entryDate;
  public static SqlColumn<Integer> conStatus = salConsignHeadTable.conStatus;
  public static SqlColumn<Integer> printStatus = salConsignHeadTable.printStatus;
  public static SqlColumn<Integer> printCount = salConsignHeadTable.printCount;
  public static SqlColumn<String> seqno = salConsignHeadTable.seqno;
  public static SqlColumn<Long> entId = salConsignHeadTable.entId;
  public static SqlColumn<Long> conOrgId = salConsignHeadTable.conOrgId;
  public static SqlColumn<String> conOrgCode = salConsignHeadTable.conOrgCode;
  public static SqlColumn<String> conOrgName = salConsignHeadTable.conOrgName;
  public static SqlColumn<Long> cusOrgId = salConsignHeadTable.cusOrgId;
  public static SqlColumn<String> cusOrgCode = salConsignHeadTable.cusOrgCode;
  public static SqlColumn<String> cusOrgName = salConsignHeadTable.cusOrgName;
  public static SqlColumn<String> transitLineNo = salConsignHeadTable.transitLineNo;
  public static SqlColumn<java.math.BigDecimal> taxAmt = salConsignHeadTable.taxAmt;
  public static SqlColumn<java.math.BigDecimal> shippedQty = salConsignHeadTable.shippedQty;
  public static SqlColumn<java.math.BigDecimal> shippedAmt = salConsignHeadTable.shippedAmt;
  public static SqlColumn<java.util.Date> preArrivalDate = salConsignHeadTable.preArrivalDate;
  public static SqlColumn<String> remark = salConsignHeadTable.remark;

  public static final class SalConsignHeadTable extends SqlTable {
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
    public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);
    public final SqlColumn<String> waveNo = column("wave_no", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> tatalQty = column("tatal_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalAmt = column("total_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.sql.Timestamp> entryDate = column("entry_date", JDBCType.TIMESTAMP);
    public final SqlColumn<Integer> conStatus = column("con_status", JDBCType.INTEGER);
    public final SqlColumn<Integer> printStatus = column("print_status", JDBCType.INTEGER);
    public final SqlColumn<Integer> printCount = column("print_count", JDBCType.INTEGER);
    public final SqlColumn<String> seqno = column("seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> conOrgId = column("con_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> conOrgCode = column("con_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> conOrgName = column("con_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> cusOrgCode = column("cus_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cusOrgName = column("cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<String> transitLineNo = column("transit_line_no", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> taxAmt = column("tax_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedQty =
        column("shipped_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedAmt =
        column("shipped_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.util.Date> preArrivalDate =
        column("pre_arrival_date", JDBCType.DATE);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public SalConsignHeadTable() {
      super("SalConsignHead");
    }
  }
}
