package com.pagoda.domain.salconsignout.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsignout.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 发货出库单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignOutHeadDynamicSqlSupport {

  public static SalConsignOutHeadTable salConsignOutHeadTable = new SalConsignOutHeadTable();
  public static SqlColumn<Long> id = salConsignOutHeadTable.id;
  public static SqlColumn<Long> deleted = salConsignOutHeadTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignOutHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignOutHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignOutHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignOutHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignOutHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignOutHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignOutHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignOutHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignOutHeadTable.version;
  public static SqlColumn<String> seqno = salConsignOutHeadTable.seqno;
  public static SqlColumn<Long> entId = salConsignOutHeadTable.entId;
  public static SqlColumn<Long> conId = salConsignOutHeadTable.conId;
  public static SqlColumn<String> conSeqno = salConsignOutHeadTable.conSeqno;
  public static SqlColumn<java.util.Date> preArrivalDate = salConsignOutHeadTable.preArrivalDate;
  public static SqlColumn<Long> conOrgId = salConsignOutHeadTable.conOrgId;
  public static SqlColumn<String> conOrgCode = salConsignOutHeadTable.conOrgCode;
  public static SqlColumn<String> conOrgName = salConsignOutHeadTable.conOrgName;
  public static SqlColumn<Long> cusOrgId = salConsignOutHeadTable.cusOrgId;
  public static SqlColumn<String> cusOrgCode = salConsignOutHeadTable.cusOrgCode;
  public static SqlColumn<String> cusOrgName = salConsignOutHeadTable.cusOrgName;
  public static SqlColumn<String> transitLineNo = salConsignOutHeadTable.transitLineNo;
  public static SqlColumn<java.math.BigDecimal> shippedQty = salConsignOutHeadTable.shippedQty;
  public static SqlColumn<java.math.BigDecimal> shippedGrossWeight =
      salConsignOutHeadTable.shippedGrossWeight;
  public static SqlColumn<java.math.BigDecimal> shippedNetWeight =
      salConsignOutHeadTable.shippedNetWeight;
  public static SqlColumn<java.math.BigDecimal> shippedVolume =
      salConsignOutHeadTable.shippedVolume;
  public static SqlColumn<java.math.BigDecimal> shippedAmt = salConsignOutHeadTable.shippedAmt;
  public static SqlColumn<java.math.BigDecimal> taxAmt = salConsignOutHeadTable.taxAmt;
  public static SqlColumn<Integer> stockoutStatus = salConsignOutHeadTable.stockoutStatus;
  public static SqlColumn<String> auditorCode = salConsignOutHeadTable.auditorCode;
  public static SqlColumn<String> auditorName = salConsignOutHeadTable.auditorName;
  public static SqlColumn<java.sql.Timestamp> auditTime = salConsignOutHeadTable.auditTime;
  public static SqlColumn<String> remark = salConsignOutHeadTable.remark;
  public static SqlColumn<String> confirmUserCode = salConsignOutHeadTable.confirmUserCode;
  public static SqlColumn<String> confirmUserName = salConsignOutHeadTable.confirmUserName;
  public static SqlColumn<java.sql.Timestamp> confirmTime = salConsignOutHeadTable.confirmTime;

  public static final class SalConsignOutHeadTable extends SqlTable {
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
    public final SqlColumn<Long> conId = column("con_id", JDBCType.BIGINT);
    public final SqlColumn<String> conSeqno = column("con_seqno", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> preArrivalDate =
        column("pre_arrival_date", JDBCType.DATE);
    public final SqlColumn<Long> conOrgId = column("con_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> conOrgCode = column("con_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> conOrgName = column("con_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> cusOrgCode = column("cus_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cusOrgName = column("cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<String> transitLineNo = column("transit_line_no", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> shippedQty =
        column("shipped_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedGrossWeight =
        column("shipped_gross_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedNetWeight =
        column("shipped_net_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedVolume =
        column("shipped_volume", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedAmt =
        column("shipped_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxAmt = column("tax_amt", JDBCType.DECIMAL);
    public final SqlColumn<Integer> stockoutStatus = column("stockout_status", JDBCType.INTEGER);
    public final SqlColumn<String> auditorCode = column("auditor_code", JDBCType.VARCHAR);
    public final SqlColumn<String> auditorName = column("auditor_name", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> auditTime = column("audit_time", JDBCType.TIMESTAMP);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> confirmUserCode = column("confirm_user_code", JDBCType.VARCHAR);
    public final SqlColumn<String> confirmUserName = column("confirm_user_name", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> confirmTime =
        column("confirm_time", JDBCType.TIMESTAMP);

    public SalConsignOutHeadTable() {
      super("SalConsignOutHead");
    }
  }
}
