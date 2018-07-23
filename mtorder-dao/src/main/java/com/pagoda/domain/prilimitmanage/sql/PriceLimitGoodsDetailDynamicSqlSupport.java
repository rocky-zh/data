package com.pagoda.domain.prilimitmanage.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.prilimitmanage.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 限价单商品明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceLimitGoodsDetailDynamicSqlSupport {

  public static PriceLimitGoodsDetailTable priceLimitGoodsDetailTable =
      new PriceLimitGoodsDetailTable();
  public static SqlColumn<Long> id = priceLimitGoodsDetailTable.id;
  public static SqlColumn<Long> deleted = priceLimitGoodsDetailTable.deleted;
  public static SqlColumn<Date> createdAt = priceLimitGoodsDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = priceLimitGoodsDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = priceLimitGoodsDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceLimitGoodsDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceLimitGoodsDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceLimitGoodsDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = priceLimitGoodsDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceLimitGoodsDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceLimitGoodsDetailTable.version;
  public static SqlColumn<Long> entId = priceLimitGoodsDetailTable.entId;

  public static final class PriceLimitGoodsDetailTable extends SqlTable {
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

    public PriceLimitGoodsDetailTable() {
      super("PriceLimitGoodsDetail");
    }
  }
}
