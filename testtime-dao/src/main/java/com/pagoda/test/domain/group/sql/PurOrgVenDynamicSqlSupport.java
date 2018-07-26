package com.pagoda.test.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 供应商机构实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrgVenDynamicSqlSupport {

  public static PurOrgVenTable purOrgVenTable = new PurOrgVenTable();
  public static SqlColumn<Long> id = purOrgVenTable.id;
  public static SqlColumn<Long> deleted = purOrgVenTable.deleted;
  public static SqlColumn<Date> createdAt = purOrgVenTable.createdAt;
  public static SqlColumn<String> creatorCode = purOrgVenTable.creatorCode;
  public static SqlColumn<String> creatorName = purOrgVenTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = purOrgVenTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = purOrgVenTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = purOrgVenTable.modifierCode;
  public static SqlColumn<String> modifierName = purOrgVenTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = purOrgVenTable.modifierOrgCode;
  public static SqlColumn<Integer> version = purOrgVenTable.version;
  public static SqlColumn<String> venOrgCode = purOrgVenTable.venOrgCode;
  public static SqlColumn<String> venOrgName = purOrgVenTable.venOrgName;
  public static SqlColumn<Long> venOrgId = purOrgVenTable.venOrgId;
  public static SqlColumn<Long> orgOrgId = purOrgVenTable.orgOrgId;
  public static SqlColumn<String> orgOrgCode = purOrgVenTable.orgOrgCode;
  public static SqlColumn<String> orgOrgName = purOrgVenTable.orgOrgName;
  public static SqlColumn<Integer> isAllowOrder = purOrgVenTable.isAllowOrder;
  public static SqlColumn<Integer> isAllowRec = purOrgVenTable.isAllowRec;
  public static SqlColumn<Integer> isReturnable = purOrgVenTable.isReturnable;
  public static SqlColumn<Integer> isPausePay = purOrgVenTable.isPausePay;
  public static SqlColumn<Integer> isOrderCheck = purOrgVenTable.isOrderCheck;
  public static SqlColumn<Integer> isRecCheck = purOrgVenTable.isRecCheck;
  public static SqlColumn<Integer> isReturnCheck = purOrgVenTable.isReturnCheck;
  public static SqlColumn<Integer> isInvCheck = purOrgVenTable.isInvCheck;
  public static SqlColumn<Integer> settlementType = purOrgVenTable.settlementType;
  public static SqlColumn<String> remark = purOrgVenTable.remark;

  public static final class PurOrgVenTable extends SqlTable {
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

    public final SqlColumn<String> venOrgCode = column("ven_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> venOrgName = column("ven_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> venOrgId = column("ven_org_id", JDBCType.BIGINT);
    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isAllowOrder = column("is_allow_order", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAllowRec = column("is_allow_rec", JDBCType.INTEGER);
    public final SqlColumn<Integer> isReturnable = column("is_returnable", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPausePay = column("is_pause_pay", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOrderCheck = column("is_order_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> isRecCheck = column("is_rec_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> isReturnCheck = column("is_return_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> isInvCheck = column("is_inv_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> settlementType = column("settlement_type", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public PurOrgVenTable() {
      super("PurOrgVen");
    }
  }
}
