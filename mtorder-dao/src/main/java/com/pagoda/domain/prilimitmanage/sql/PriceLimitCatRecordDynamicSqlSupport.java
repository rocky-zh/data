package com.pagoda.domain.prilimitmanage.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.prilimitmanage.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 层级商品限价结果表(对层级价格限制最终结果)实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceLimitCatRecordDynamicSqlSupport {

  public static PriceLimitCatRecordTable priceLimitCatRecordTable = new PriceLimitCatRecordTable();
  public static SqlColumn<Long> id = priceLimitCatRecordTable.id;
  public static SqlColumn<Long> deleted = priceLimitCatRecordTable.deleted;
  public static SqlColumn<Date> createdAt = priceLimitCatRecordTable.createdAt;
  public static SqlColumn<String> creatorCode = priceLimitCatRecordTable.creatorCode;
  public static SqlColumn<String> creatorName = priceLimitCatRecordTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceLimitCatRecordTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceLimitCatRecordTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceLimitCatRecordTable.modifierCode;
  public static SqlColumn<String> modifierName = priceLimitCatRecordTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceLimitCatRecordTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceLimitCatRecordTable.version;
  public static SqlColumn<Long> entId = priceLimitCatRecordTable.entId;

  public static final class PriceLimitCatRecordTable extends SqlTable {
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

    public PriceLimitCatRecordTable() {
      super("PriceLimitCatRecord");
    }
  }
}
