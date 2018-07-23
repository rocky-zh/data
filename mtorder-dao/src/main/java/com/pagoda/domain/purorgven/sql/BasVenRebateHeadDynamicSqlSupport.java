package com.pagoda.domain.purorgven.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.purorgven.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 供应商返利头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasVenRebateHeadDynamicSqlSupport {

  public static BasVenRebateHeadTable basVenRebateHeadTable = new BasVenRebateHeadTable();
  public static SqlColumn<Long> id = basVenRebateHeadTable.id;
  public static SqlColumn<Long> deleted = basVenRebateHeadTable.deleted;
  public static SqlColumn<Date> createdAt = basVenRebateHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = basVenRebateHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = basVenRebateHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basVenRebateHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basVenRebateHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basVenRebateHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = basVenRebateHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basVenRebateHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basVenRebateHeadTable.version;
  public static SqlColumn<String> no = basVenRebateHeadTable.no;
  public static SqlColumn<Long> balOrgId = basVenRebateHeadTable.balOrgId;
  public static SqlColumn<String> balOrgCode = basVenRebateHeadTable.balOrgCode;
  public static SqlColumn<String> balOrgName = basVenRebateHeadTable.balOrgName;
  public static SqlColumn<Long> venOrgId = basVenRebateHeadTable.venOrgId;
  public static SqlColumn<String> venOrgCode = basVenRebateHeadTable.venOrgCode;
  public static SqlColumn<String> venOrgName = basVenRebateHeadTable.venOrgName;
  public static SqlColumn<Integer> status = basVenRebateHeadTable.status;
  public static SqlColumn<Integer> rebateMode = basVenRebateHeadTable.rebateMode;
  public static SqlColumn<java.math.BigDecimal> rebateRate = basVenRebateHeadTable.rebateRate;
  public static SqlColumn<java.util.Date> effectDate = basVenRebateHeadTable.effectDate;
  public static SqlColumn<java.util.Date> expiryDate = basVenRebateHeadTable.expiryDate;
  public static SqlColumn<Integer> isAllEffect = basVenRebateHeadTable.isAllEffect;
  public static SqlColumn<java.util.Date> beginDate = basVenRebateHeadTable.beginDate;
  public static SqlColumn<java.util.Date> endDate = basVenRebateHeadTable.endDate;
  public static SqlColumn<String> remark = basVenRebateHeadTable.remark;
  public static SqlColumn<Long> entId = basVenRebateHeadTable.entId;

  public static final class BasVenRebateHeadTable extends SqlTable {
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

    public final SqlColumn<String> no = column("no", JDBCType.VARCHAR);
    public final SqlColumn<Long> balOrgId = column("bal_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> balOrgCode = column("bal_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> balOrgName = column("bal_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> venOrgId = column("ven_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> venOrgCode = column("ven_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> venOrgName = column("ven_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);
    public final SqlColumn<Integer> rebateMode = column("rebate_mode", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> rebateRate =
        column("rebate_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.util.Date> effectDate = column("effect_date", JDBCType.DATE);
    public final SqlColumn<java.util.Date> expiryDate = column("expiry_date", JDBCType.DATE);
    public final SqlColumn<Integer> isAllEffect = column("is_all_effect", JDBCType.INTEGER);
    public final SqlColumn<java.util.Date> beginDate = column("begin_date", JDBCType.DATE);
    public final SqlColumn<java.util.Date> endDate = column("end_date", JDBCType.DATE);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public BasVenRebateHeadTable() {
      super("BasVenRebateHead");
    }
  }
}
