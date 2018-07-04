package com.pagoda.domain.ven.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.ven.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 供应商返利到货机构明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasVenRebateOrgDetailDynamicSqlSupport {

  public static BasVenRebateOrgDetailTable basVenRebateOrgDetailTable =
      new BasVenRebateOrgDetailTable();
  public static SqlColumn<Long> id = basVenRebateOrgDetailTable.id;
  public static SqlColumn<Long> deleted = basVenRebateOrgDetailTable.deleted;
  public static SqlColumn<Date> createdAt = basVenRebateOrgDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = basVenRebateOrgDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = basVenRebateOrgDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basVenRebateOrgDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basVenRebateOrgDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basVenRebateOrgDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = basVenRebateOrgDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basVenRebateOrgDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basVenRebateOrgDetailTable.version;
  public static SqlColumn<Long> rebateId = basVenRebateOrgDetailTable.rebateId;
  public static SqlColumn<String> rebateNo = basVenRebateOrgDetailTable.rebateNo;
  public static SqlColumn<Long> arrOrgId = basVenRebateOrgDetailTable.arrOrgId;
  public static SqlColumn<String> arrOrgCode = basVenRebateOrgDetailTable.arrOrgCode;
  public static SqlColumn<String> arrOrgName = basVenRebateOrgDetailTable.arrOrgName;
  public static SqlColumn<Long> entId = basVenRebateOrgDetailTable.entId;
  public static SqlColumn<java.util.Date> effectDate = basVenRebateOrgDetailTable.effectDate;
  public static SqlColumn<java.util.Date> expiryDate = basVenRebateOrgDetailTable.expiryDate;
  public static SqlColumn<Integer> status = basVenRebateOrgDetailTable.status;
  public static SqlColumn<String> remark = basVenRebateOrgDetailTable.remark;

  public static final class BasVenRebateOrgDetailTable extends SqlTable {
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

    public final SqlColumn<Long> rebateId = column("rebate_id", JDBCType.BIGINT);
    public final SqlColumn<String> rebateNo = column("rebate_no", JDBCType.VARCHAR);
    public final SqlColumn<Long> arrOrgId = column("arr_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> arrOrgCode = column("arr_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> arrOrgName = column("arr_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<java.util.Date> effectDate = column("effect_date", JDBCType.DATE);
    public final SqlColumn<java.util.Date> expiryDate = column("expiry_date", JDBCType.DATE);
    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public BasVenRebateOrgDetailTable() {
      super("BasVenRebateOrgDetail");
    }
  }
}
