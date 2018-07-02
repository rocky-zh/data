package com.pagoda.domain.pridistribution.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.pridistribution.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 价格目录头表(配送价格)实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceCatalogSalHeadDynamicSqlSupport {

  public static PriceCatalogSalHeadTable priceCatalogSalHeadTable = new PriceCatalogSalHeadTable();
  public static SqlColumn<Long> id = priceCatalogSalHeadTable.id;
  public static SqlColumn<Long> deleted = priceCatalogSalHeadTable.deleted;
  public static SqlColumn<Date> createdAt = priceCatalogSalHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = priceCatalogSalHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = priceCatalogSalHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceCatalogSalHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceCatalogSalHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceCatalogSalHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = priceCatalogSalHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceCatalogSalHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceCatalogSalHeadTable.version;
  public static SqlColumn<String> code = priceCatalogSalHeadTable.code;
  public static SqlColumn<String> name = priceCatalogSalHeadTable.name;
  public static SqlColumn<Long> balOrgOrgId = priceCatalogSalHeadTable.balOrgOrgId;
  public static SqlColumn<String> balOrgOrgCode = priceCatalogSalHeadTable.balOrgOrgCode;
  public static SqlColumn<String> balOrgOrgName = priceCatalogSalHeadTable.balOrgOrgName;
  public static SqlColumn<Long> entId = priceCatalogSalHeadTable.entId;
  public static SqlColumn<Integer> isEnable = priceCatalogSalHeadTable.isEnable;
  public static SqlColumn<Integer> isUsed = priceCatalogSalHeadTable.isUsed;
  public static SqlColumn<String> remark = priceCatalogSalHeadTable.remark;

  public static final class PriceCatalogSalHeadTable extends SqlTable {
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

    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<Long> balOrgOrgId = column("bal_org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> balOrgOrgCode = column("bal_org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> balOrgOrgName = column("bal_org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isEnable = column("is_enable", JDBCType.INTEGER);
    public final SqlColumn<Integer> isUsed = column("is_used", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public PriceCatalogSalHeadTable() {
      super("PriceCatalogSalHead");
    }
  }
}
