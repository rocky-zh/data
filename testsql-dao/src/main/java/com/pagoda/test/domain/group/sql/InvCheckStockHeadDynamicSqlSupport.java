package com.pagoda.test.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 盘点单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class InvCheckStockHeadDynamicSqlSupport {

  public static InvCheckStockHeadTable invCheckStockHeadTable = new InvCheckStockHeadTable();
  public static SqlColumn<Long> id = invCheckStockHeadTable.id;
  public static SqlColumn<Long> deleted = invCheckStockHeadTable.deleted;
  public static SqlColumn<Date> createdAt = invCheckStockHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = invCheckStockHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = invCheckStockHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = invCheckStockHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = invCheckStockHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = invCheckStockHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = invCheckStockHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = invCheckStockHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = invCheckStockHeadTable.version;
  public static SqlColumn<Boolean> active = invCheckStockHeadTable.active;
  public static SqlColumn<java.sql.Timestamp> adjustDate = invCheckStockHeadTable.adjustDate;
  public static SqlColumn<String> adjustUserId = invCheckStockHeadTable.adjustUserId;
  public static SqlColumn<java.util.Date> billDate = invCheckStockHeadTable.billDate;
  public static SqlColumn<Long> billNo = invCheckStockHeadTable.billNo;
  public static SqlColumn<String> billType = invCheckStockHeadTable.billType;
  public static SqlColumn<Long> checkQty = invCheckStockHeadTable.checkQty;
  public static SqlColumn<Integer> checkStatus = invCheckStockHeadTable.checkStatus;
  public static SqlColumn<Integer> checkType = invCheckStockHeadTable.checkType;
  public static SqlColumn<String> depotCode = invCheckStockHeadTable.depotCode;
  public static SqlColumn<Long> depotId = invCheckStockHeadTable.depotId;
  public static SqlColumn<String> depotName = invCheckStockHeadTable.depotName;
  public static SqlColumn<Boolean> enabled = invCheckStockHeadTable.enabled;
  public static SqlColumn<Long> entId = invCheckStockHeadTable.entId;
  public static SqlColumn<Long> periodNo = invCheckStockHeadTable.periodNo;
  public static SqlColumn<String> remark = invCheckStockHeadTable.remark;
  public static SqlColumn<Boolean> ioLimit = invCheckStockHeadTable.ioLimit;

  public static final class InvCheckStockHeadTable extends SqlTable {
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

    public final SqlColumn<Boolean> active = column("active", JDBCType.BOOLEAN);
    public final SqlColumn<java.sql.Timestamp> adjustDate =
        column("adjust_date", JDBCType.TIMESTAMP);
    public final SqlColumn<String> adjustUserId = column("adjust_user_id", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> billDate = column("bill_date", JDBCType.DATE);
    public final SqlColumn<Long> billNo = column("bill_no", JDBCType.BIGINT);
    public final SqlColumn<String> billType = column("bill_type", JDBCType.VARCHAR);
    public final SqlColumn<Long> checkQty = column("check_qty", JDBCType.BIGINT);
    public final SqlColumn<Integer> checkStatus = column("check_status", JDBCType.INTEGER);
    public final SqlColumn<Integer> checkType = column("check_type", JDBCType.INTEGER);
    public final SqlColumn<String> depotCode = column("depot_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> depotId = column("depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> depotName = column("depot_name", JDBCType.VARCHAR);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> periodNo = column("period_no", JDBCType.BIGINT);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Boolean> ioLimit = column("io_limit", JDBCType.BOOLEAN);

    public InvCheckStockHeadTable() {
      super("InvCheckStockHead");
    }
  }
}
