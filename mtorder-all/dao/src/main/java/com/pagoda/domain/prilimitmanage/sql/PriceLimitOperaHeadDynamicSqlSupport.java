package com.pagoda.domain.prilimitmanage.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.prilimitmanage.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 运营限价单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceLimitOperaHeadDynamicSqlSupport {

  public static PriceLimitOperaHeadTable priceLimitOperaHeadTable = new PriceLimitOperaHeadTable();
  public static SqlColumn<Long> id = priceLimitOperaHeadTable.id;
  public static SqlColumn<Long> deleted = priceLimitOperaHeadTable.deleted;
  public static SqlColumn<Date> createdAt = priceLimitOperaHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = priceLimitOperaHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = priceLimitOperaHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceLimitOperaHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceLimitOperaHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceLimitOperaHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = priceLimitOperaHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceLimitOperaHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceLimitOperaHeadTable.version;
  public static SqlColumn<Long> entId = priceLimitOperaHeadTable.entId;

  public static final class PriceLimitOperaHeadTable extends SqlTable {
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

    public PriceLimitOperaHeadTable() {
      super("PriceLimitOperaHead");
    }
  }
}
