package com.pagoda.domain.purapplyorder.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.purapplyorder.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 采购请购单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurApplyHeadDynamicSqlSupport {

  public static PurApplyHeadTable purApplyHeadTable = new PurApplyHeadTable();
  public static SqlColumn<Long> id = purApplyHeadTable.id;
  public static SqlColumn<Long> deleted = purApplyHeadTable.deleted;
  public static SqlColumn<Date> createdAt = purApplyHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = purApplyHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = purApplyHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = purApplyHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = purApplyHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = purApplyHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = purApplyHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = purApplyHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = purApplyHeadTable.version;
  public static SqlColumn<String> seqno = purApplyHeadTable.seqno;
  public static SqlColumn<Long> entId = purApplyHeadTable.entId;
  public static SqlColumn<Integer> sourceType = purApplyHeadTable.sourceType;
  public static SqlColumn<Long> applyOrgId = purApplyHeadTable.applyOrgId;
  public static SqlColumn<String> applyOrgCode = purApplyHeadTable.applyOrgCode;
  public static SqlColumn<String> applyOrgName = purApplyHeadTable.applyOrgName;
  public static SqlColumn<Long> arrOrgId = purApplyHeadTable.arrOrgId;
  public static SqlColumn<String> arrOrgCode = purApplyHeadTable.arrOrgCode;
  public static SqlColumn<String> arrOrgName = purApplyHeadTable.arrOrgName;
  public static SqlColumn<java.util.Date> planRecDate = purApplyHeadTable.planRecDate;
  public static SqlColumn<String> auditorCode = purApplyHeadTable.auditorCode;
  public static SqlColumn<String> auditorName = purApplyHeadTable.auditorName;
  public static SqlColumn<java.sql.Timestamp> auditTime = purApplyHeadTable.auditTime;
  public static SqlColumn<Integer> applyStatus = purApplyHeadTable.applyStatus;
  public static SqlColumn<Integer> calType = purApplyHeadTable.calType;
  public static SqlColumn<java.math.BigDecimal> calPurRate = purApplyHeadTable.calPurRate;

  public static final class PurApplyHeadTable extends SqlTable {
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
    public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);
    public final SqlColumn<Long> applyOrgId = column("apply_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> applyOrgCode = column("apply_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> applyOrgName = column("apply_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> arrOrgId = column("arr_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> arrOrgCode = column("arr_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> arrOrgName = column("arr_org_name", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> planRecDate = column("plan_rec_date", JDBCType.DATE);
    public final SqlColumn<String> auditorCode = column("auditor_code", JDBCType.VARCHAR);
    public final SqlColumn<String> auditorName = column("auditor_name", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> auditTime = column("audit_time", JDBCType.TIMESTAMP);
    public final SqlColumn<Integer> applyStatus = column("apply_status", JDBCType.INTEGER);
    public final SqlColumn<Integer> calType = column("cal_type", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> calPurRate =
        column("cal_pur_rate", JDBCType.DECIMAL);

    public PurApplyHeadTable() {
      super("PurApplyHead");
    }
  }
}
