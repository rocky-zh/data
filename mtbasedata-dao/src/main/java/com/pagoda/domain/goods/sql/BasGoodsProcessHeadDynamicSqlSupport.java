package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 生产工艺定义主表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsProcessHeadDynamicSqlSupport {

  public static BasGoodsProcessHeadTable basGoodsProcessHeadTable = new BasGoodsProcessHeadTable();
  public static SqlColumn<Long> id = basGoodsProcessHeadTable.id;
  public static SqlColumn<Long> deleted = basGoodsProcessHeadTable.deleted;
  public static SqlColumn<Date> createdAt = basGoodsProcessHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = basGoodsProcessHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = basGoodsProcessHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basGoodsProcessHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basGoodsProcessHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basGoodsProcessHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = basGoodsProcessHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basGoodsProcessHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basGoodsProcessHeadTable.version;
  public static SqlColumn<Long> orgOrgId = basGoodsProcessHeadTable.orgOrgId;
  public static SqlColumn<String> orgOrgCode = basGoodsProcessHeadTable.orgOrgCode;
  public static SqlColumn<String> orgOrgName = basGoodsProcessHeadTable.orgOrgName;
  public static SqlColumn<Integer> isDefault = basGoodsProcessHeadTable.isDefault;
  public static SqlColumn<Integer> rankNum = basGoodsProcessHeadTable.rankNum;
  public static SqlColumn<String> code = basGoodsProcessHeadTable.code;
  public static SqlColumn<String> name = basGoodsProcessHeadTable.name;
  public static SqlColumn<Integer> isEnabled = basGoodsProcessHeadTable.isEnabled;
  public static SqlColumn<String> remark = basGoodsProcessHeadTable.remark;
  public static SqlColumn<Long> entId = basGoodsProcessHeadTable.entId;

  public static final class BasGoodsProcessHeadTable extends SqlTable {
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

    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isDefault = column("is_default", JDBCType.INTEGER);
    public final SqlColumn<Integer> rankNum = column("rank_num", JDBCType.INTEGER);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public BasGoodsProcessHeadTable() {
      super("BasGoodsProcessHead");
    }
  }
}
