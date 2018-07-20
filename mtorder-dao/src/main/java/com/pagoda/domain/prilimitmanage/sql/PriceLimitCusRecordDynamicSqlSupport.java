package com.pagoda.domain.prilimitmanage.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.prilimitmanage.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 客户商品限价结果表(对客户零售价限制最终结果)实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceLimitCusRecordDynamicSqlSupport {

  public static PriceLimitCusRecordTable priceLimitCusRecordTable = new PriceLimitCusRecordTable();
  public static SqlColumn<Long> id = priceLimitCusRecordTable.id;
  public static SqlColumn<Long> deleted = priceLimitCusRecordTable.deleted;
  public static SqlColumn<Date> createdAt = priceLimitCusRecordTable.createdAt;
  public static SqlColumn<String> creatorCode = priceLimitCusRecordTable.creatorCode;
  public static SqlColumn<String> creatorName = priceLimitCusRecordTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceLimitCusRecordTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceLimitCusRecordTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceLimitCusRecordTable.modifierCode;
  public static SqlColumn<String> modifierName = priceLimitCusRecordTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceLimitCusRecordTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceLimitCusRecordTable.version;
  public static SqlColumn<Long> cusOrgId = priceLimitCusRecordTable.cusOrgId;

  public static final class PriceLimitCusRecordTable extends SqlTable {
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

    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);

    public PriceLimitCusRecordTable() {
      super("PriceLimitCusRecord");
    }
  }
}
