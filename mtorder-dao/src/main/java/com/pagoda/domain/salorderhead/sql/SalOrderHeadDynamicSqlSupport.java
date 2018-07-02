package com.pagoda.domain.salorderhead.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salorderhead.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 销售订单实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrderHeadDynamicSqlSupport {

  public static SalOrderHeadTable salOrderHeadTable = new SalOrderHeadTable();
  public static SqlColumn<Long> id = salOrderHeadTable.id;
  public static SqlColumn<Long> deleted = salOrderHeadTable.deleted;
  public static SqlColumn<Date> createdAt = salOrderHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = salOrderHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = salOrderHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salOrderHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salOrderHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salOrderHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = salOrderHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salOrderHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salOrderHeadTable.version;
  public static SqlColumn<Long> entId = salOrderHeadTable.entId;
  public static SqlColumn<String> seqno = salOrderHeadTable.seqno;
  public static SqlColumn<Long> conOrgId = salOrderHeadTable.conOrgId;
  public static SqlColumn<String> conOrgCode = salOrderHeadTable.conOrgCode;
  public static SqlColumn<String> conOrgName = salOrderHeadTable.conOrgName;
  public static SqlColumn<Long> cusOrgId = salOrderHeadTable.cusOrgId;
  public static SqlColumn<String> cusOrgCode = salOrderHeadTable.cusOrgCode;
  public static SqlColumn<String> cusOrgName = salOrderHeadTable.cusOrgName;
  public static SqlColumn<java.util.Date> preArrivalDate = salOrderHeadTable.preArrivalDate;
  public static SqlColumn<String> transitLineNo = salOrderHeadTable.transitLineNo;
  public static SqlColumn<java.math.BigDecimal> totalAmt = salOrderHeadTable.totalAmt;
  public static SqlColumn<java.math.BigDecimal> goodsAmt = salOrderHeadTable.goodsAmt;
  public static SqlColumn<java.math.BigDecimal> taxAmt = salOrderHeadTable.taxAmt;
  public static SqlColumn<java.math.BigDecimal> totalRequestQty = salOrderHeadTable.totalRequestQty;
  public static SqlColumn<Integer> orderType = salOrderHeadTable.orderType;
  public static SqlColumn<Integer> inputMode = salOrderHeadTable.inputMode;
  public static SqlColumn<Integer> orderStatus = salOrderHeadTable.orderStatus;
  public static SqlColumn<Integer> isFinish = salOrderHeadTable.isFinish;
  public static SqlColumn<String> remark = salOrderHeadTable.remark;
  public static SqlColumn<java.sql.Timestamp> entryDate = salOrderHeadTable.entryDate;

  public static final class SalOrderHeadTable extends SqlTable {
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

    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<String> seqno = column("seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> conOrgId = column("con_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> conOrgCode = column("con_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> conOrgName = column("con_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> cusOrgCode = column("cus_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cusOrgName = column("cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> preArrivalDate =
        column("pre_arrival_date", JDBCType.DATE);
    public final SqlColumn<String> transitLineNo = column("transit_line_no", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> totalAmt = column("total_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> goodsAmt = column("goods_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxAmt = column("tax_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalRequestQty =
        column("total_request_qty", JDBCType.DECIMAL);
    public final SqlColumn<Integer> orderType = column("order_type", JDBCType.INTEGER);
    public final SqlColumn<Integer> inputMode = column("input_mode", JDBCType.INTEGER);
    public final SqlColumn<Integer> orderStatus = column("order_status", JDBCType.INTEGER);
    public final SqlColumn<Integer> isFinish = column("is_finish", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> entryDate = column("entry_date", JDBCType.TIMESTAMP);

    public SalOrderHeadTable() {
      super("SalOrderHead");
    }
  }
}
