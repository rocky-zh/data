package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * BOM商品定义主表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsBomHeadDynamicSqlSupport {

  public static BasGoodsBomHeadTable basGoodsBomHeadTable = new BasGoodsBomHeadTable();
  public static SqlColumn<Long> id = basGoodsBomHeadTable.id;
  public static SqlColumn<Long> deleted = basGoodsBomHeadTable.deleted;
  public static SqlColumn<Date> createdAt = basGoodsBomHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = basGoodsBomHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = basGoodsBomHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basGoodsBomHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basGoodsBomHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basGoodsBomHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = basGoodsBomHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basGoodsBomHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basGoodsBomHeadTable.version;
  public static SqlColumn<Long> inDepotId = basGoodsBomHeadTable.inDepotId;
  public static SqlColumn<String> inDepotName = basGoodsBomHeadTable.inDepotName;
  public static SqlColumn<String> name = basGoodsBomHeadTable.name;
  public static SqlColumn<String> searchWord = basGoodsBomHeadTable.searchWord;
  public static SqlColumn<Long> unitId = basGoodsBomHeadTable.unitId;
  public static SqlColumn<String> unitCode = basGoodsBomHeadTable.unitCode;
  public static SqlColumn<String> unitName = basGoodsBomHeadTable.unitName;
  public static SqlColumn<Long> orgOrgId = basGoodsBomHeadTable.orgOrgId;
  public static SqlColumn<String> orgOrgCode = basGoodsBomHeadTable.orgOrgCode;
  public static SqlColumn<String> orgOrgName = basGoodsBomHeadTable.orgOrgName;
  public static SqlColumn<Long> goodsProcId = basGoodsBomHeadTable.goodsProcId;
  public static SqlColumn<String> goodsProcCode = basGoodsBomHeadTable.goodsProcCode;
  public static SqlColumn<String> goodsProcName = basGoodsBomHeadTable.goodsProcName;
  public static SqlColumn<Integer> isEnabled = basGoodsBomHeadTable.isEnabled;
  public static SqlColumn<Integer> isDefault = basGoodsBomHeadTable.isDefault;
  public static SqlColumn<String> remark = basGoodsBomHeadTable.remark;
  public static SqlColumn<Long> entId = basGoodsBomHeadTable.entId;

  public static final class BasGoodsBomHeadTable extends SqlTable {
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

    public final SqlColumn<Long> inDepotId = column("in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> inDepotName = column("in_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitCode = column("unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsProcId = column("goods_proc_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsProcCode = column("goods_proc_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsProcName = column("goods_proc_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDefault = column("is_default", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public BasGoodsBomHeadTable() {
      super("BasGoodsBomHead");
    }
  }
}
