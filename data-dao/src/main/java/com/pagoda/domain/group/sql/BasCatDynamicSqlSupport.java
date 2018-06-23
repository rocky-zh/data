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
  public static SqlColumn<Long> deleted1 = basCatTable.deleted1;
  public static SqlColumn<Boolean> enabled1 = basCatTable.enabled1;
  public static SqlColumn<String> isDefault = basCatTable.isDefault;
  public static SqlColumn<String> isMulti = basCatTable.isMulti;
  public static SqlColumn<String> remark = basCatTable.remark;
  public static SqlColumn<Integer> showOrder = basCatTable.showOrder;
  public static SqlColumn<Integer> tableId = basCatTable.tableId;
  public static SqlColumn<String> code = basCatTable.code;

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

    public final SqlColumn<Long> deleted1 = column("deleted1", JDBCType.BIGINT);
    public final SqlColumn<Boolean> enabled1 = column("enabled1", JDBCType.BOOLEAN);
    public final SqlColumn<String> isDefault = column("is_default", JDBCType.VARCHAR);
    public final SqlColumn<String> isMulti = column("is_multi", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);
    public final SqlColumn<Integer> tableId = column("table_id", JDBCType.INTEGER);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);

    public BasCatTable() {
      super("BasCat");
    }
  }
}
