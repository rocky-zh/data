package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 目录定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatDynamicSqlSupport {

  public static BasCatTable basCatTable = new BasCatTable();
  public static SqlColumn<Long> id = basCatTable.id;
  public static SqlColumn<Long> deleted = basCatTable.deleted;
  public static SqlColumn<String> treePath = basCatTable.treePath;
  public static SqlColumn<Date> createdAt = basCatTable.createdAt;
  public static SqlColumn<String> creatorCode = basCatTable.creatorCode;
  public static SqlColumn<String> creatorName = basCatTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basCatTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basCatTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basCatTable.modifierCode;
  public static SqlColumn<String> modifierName = basCatTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basCatTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basCatTable.version;
  public static SqlColumn<Long> entId = basCatTable.entId;
  public static SqlColumn<String> isDefault = basCatTable.isDefault;
  public static SqlColumn<String> isEnabled = basCatTable.isEnabled;
  public static SqlColumn<String> isMulti = basCatTable.isMulti;
  public static SqlColumn<String> remark = basCatTable.remark;
  public static SqlColumn<String> searchWord = basCatTable.searchWord;
  public static SqlColumn<Integer> showOrder = basCatTable.showOrder;
  public static SqlColumn<Integer> tableId = basCatTable.tableId;
  public static SqlColumn<Boolean> active = basCatTable.active;
  public static SqlColumn<String> code = basCatTable.code;
  public static SqlColumn<Boolean> enabled = basCatTable.enabled;
  public static SqlColumn<String> name = basCatTable.name;

  public static final class BasCatTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public final SqlColumn<String> treePath = column("tree_path", JDBCType.VARCHAR);
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
    public final SqlColumn<String> isDefault = column("is_default", JDBCType.VARCHAR);
    public final SqlColumn<String> isEnabled = column("is_enabled", JDBCType.VARCHAR);
    public final SqlColumn<String> isMulti = column("is_multi", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);
    public final SqlColumn<Integer> tableId = column("table_id", JDBCType.INTEGER);
    public final SqlColumn<Boolean> active = column("active", JDBCType.BOOLEAN);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

    public BasCatTable() {
      super("BasCat");
    }
  }
}
