package com.pagoda.domain.prilimitmanage.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.prilimitmanage.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 限价单客户明细表(限价单为片区层级时,片区对应的客户)实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceLimitCusDetailDynamicSqlSupport {

  public static PriceLimitCusDetailTable priceLimitCusDetailTable = new PriceLimitCusDetailTable();
  public static SqlColumn<Long> id = priceLimitCusDetailTable.id;
  public static SqlColumn<Long> deleted = priceLimitCusDetailTable.deleted;
  public static SqlColumn<Date> createdAt = priceLimitCusDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = priceLimitCusDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = priceLimitCusDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceLimitCusDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceLimitCusDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceLimitCusDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = priceLimitCusDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceLimitCusDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceLimitCusDetailTable.version;
  public static SqlColumn<Long> entId = priceLimitCusDetailTable.entId;

  public static final class PriceLimitCusDetailTable extends SqlTable {
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

    public PriceLimitCusDetailTable() {
      super("PriceLimitCusDetail");
    }
  }
}
