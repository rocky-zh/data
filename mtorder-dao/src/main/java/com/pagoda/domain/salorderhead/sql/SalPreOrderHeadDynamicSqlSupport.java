package com.pagoda.domain.salorderhead.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salorderhead.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 销售预订单实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalPreOrderHeadDynamicSqlSupport {

  public static SalPreOrderHeadTable salPreOrderHeadTable = new SalPreOrderHeadTable();
  public static SqlColumn<Long> id = salPreOrderHeadTable.id;
  public static SqlColumn<Long> deleted = salPreOrderHeadTable.deleted;
  public static SqlColumn<Date> createdAt = salPreOrderHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = salPreOrderHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = salPreOrderHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salPreOrderHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salPreOrderHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salPreOrderHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = salPreOrderHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salPreOrderHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salPreOrderHeadTable.version;
  public static SqlColumn<Integer> preOrderType = salPreOrderHeadTable.preOrderType;
  public static SqlColumn<Integer> preOrderStatus = salPreOrderHeadTable.preOrderStatus;
  public static SqlColumn<Long> entId = salPreOrderHeadTable.entId;
  public static SqlColumn<String> seqno = salPreOrderHeadTable.seqno;
  public static SqlColumn<Long> conOrgId = salPreOrderHeadTable.conOrgId;
  public static SqlColumn<String> conOrgCode = salPreOrderHeadTable.conOrgCode;
  public static SqlColumn<String> conOrgName = salPreOrderHeadTable.conOrgName;
  public static SqlColumn<Long> cusOrgId = salPreOrderHeadTable.cusOrgId;
  public static SqlColumn<String> cusOrgCode = salPreOrderHeadTable.cusOrgCode;
  public static SqlColumn<String> cusOrgName = salPreOrderHeadTable.cusOrgName;
  public static SqlColumn<String> remark = salPreOrderHeadTable.remark;
  public static SqlColumn<java.sql.Timestamp> entryDate = salPreOrderHeadTable.entryDate;
  public static SqlColumn<java.math.BigDecimal> totalAmt = salPreOrderHeadTable.totalAmt;
  public static SqlColumn<java.math.BigDecimal> totalRequestQty =
      salPreOrderHeadTable.totalRequestQty;

  public static final class SalPreOrderHeadTable extends SqlTable {
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

    public final SqlColumn<Integer> preOrderType = column("pre_order_type", JDBCType.INTEGER);
    public final SqlColumn<Integer> preOrderStatus = column("pre_order_status", JDBCType.INTEGER);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<String> seqno = column("seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> conOrgId = column("con_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> conOrgCode = column("con_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> conOrgName = column("con_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> cusOrgCode = column("cus_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cusOrgName = column("cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> entryDate = column("entry_date", JDBCType.TIMESTAMP);
    public final SqlColumn<java.math.BigDecimal> totalAmt = column("total_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalRequestQty =
        column("total_request_qty", JDBCType.DECIMAL);

    public SalPreOrderHeadTable() {
      super("SalPreOrderHead");
    }
  }
}
