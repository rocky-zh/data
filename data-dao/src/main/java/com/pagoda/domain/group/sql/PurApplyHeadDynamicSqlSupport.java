package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 采购请购单表头实体表定义
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
  public static SqlColumn<String> applyNo = purApplyHeadTable.applyNo;
  public static SqlColumn<String> applyOrgCode = purApplyHeadTable.applyOrgCode;
  public static SqlColumn<Integer> applyOrgId = purApplyHeadTable.applyOrgId;
  public static SqlColumn<String> applyOrgName = purApplyHeadTable.applyOrgName;
  public static SqlColumn<Integer> applyStatus = purApplyHeadTable.applyStatus;
  public static SqlColumn<Double> calPurRate = purApplyHeadTable.calPurRate;
  public static SqlColumn<Integer> calType = purApplyHeadTable.calType;
  public static SqlColumn<String> checkUserCode = purApplyHeadTable.checkUserCode;
  public static SqlColumn<Integer> checkUserId = purApplyHeadTable.checkUserId;
  public static SqlColumn<String> checkUserName = purApplyHeadTable.checkUserName;
  public static SqlColumn<java.sql.Timestamp> checkdatetime = purApplyHeadTable.checkdatetime;
  public static SqlColumn<Integer> delId = purApplyHeadTable.delId;
  public static SqlColumn<java.sql.Timestamp> planRecDate = purApplyHeadTable.planRecDate;
  public static SqlColumn<String> recOrgCode = purApplyHeadTable.recOrgCode;
  public static SqlColumn<Integer> recOrgId = purApplyHeadTable.recOrgId;
  public static SqlColumn<String> recOrgName = purApplyHeadTable.recOrgName;
  public static SqlColumn<Integer> sourceType = purApplyHeadTable.sourceType;
  public static SqlColumn<Boolean> active = purApplyHeadTable.active;

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

    public final SqlColumn<String> applyNo = column("apply_no", JDBCType.VARCHAR);
    public final SqlColumn<String> applyOrgCode = column("apply_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> applyOrgId = column("apply_org_id", JDBCType.INTEGER);
    public final SqlColumn<String> applyOrgName = column("apply_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> applyStatus = column("apply_status", JDBCType.INTEGER);
    public final SqlColumn<Double> calPurRate = column("cal_pur_rate", JDBCType.DOUBLE);
    public final SqlColumn<Integer> calType = column("cal_type", JDBCType.INTEGER);
    public final SqlColumn<String> checkUserCode = column("check_user_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> checkUserId = column("check_user_id", JDBCType.INTEGER);
    public final SqlColumn<String> checkUserName = column("check_user_name", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> checkdatetime =
        column("checkdatetime", JDBCType.TIMESTAMP);
    public final SqlColumn<Integer> delId = column("del_id", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Timestamp> planRecDate =
        column("plan_rec_date", JDBCType.TIMESTAMP);
    public final SqlColumn<String> recOrgCode = column("rec_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> recOrgId = column("rec_org_id", JDBCType.INTEGER);
    public final SqlColumn<String> recOrgName = column("rec_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);
    public final SqlColumn<Boolean> active = column("active", JDBCType.BOOLEAN);

    public PurApplyHeadTable() {
      super("PurApplyHead");
    }
  }
}
