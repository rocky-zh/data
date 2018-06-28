package com.pagoda.domain.分组.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.分组.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 目录分类表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatClassDynamicSqlSupport {

  public static BasCatClassTable basCatClassTable = new BasCatClassTable();
  public static SqlColumn<Long> id = basCatClassTable.id;
  public static SqlColumn<Long> deleted = basCatClassTable.deleted;
  public static SqlColumn<String> treePath = basCatClassTable.treePath;
  public static SqlColumn<Date> createdAt = basCatClassTable.createdAt;
  public static SqlColumn<String> creatorCode = basCatClassTable.creatorCode;
  public static SqlColumn<String> creatorName = basCatClassTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basCatClassTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basCatClassTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basCatClassTable.modifierCode;
  public static SqlColumn<String> modifierName = basCatClassTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basCatClassTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basCatClassTable.version;
  public static SqlColumn<Long> catId = basCatClassTable.catId;
  public static SqlColumn<String> code = basCatClassTable.code;
  public static SqlColumn<Long> entId = basCatClassTable.entId;
  public static SqlColumn<String> fullName = basCatClassTable.fullName;
  public static SqlColumn<Integer> isEnabled = basCatClassTable.isEnabled;
  public static SqlColumn<Integer> isLeaf = basCatClassTable.isLeaf;
  public static SqlColumn<Integer> levelNum = basCatClassTable.levelNum;
  public static SqlColumn<String> name = basCatClassTable.name;
  public static SqlColumn<String> parentCatClassCode = basCatClassTable.parentCatClassCode;
  public static SqlColumn<Long> parentCatClassId = basCatClassTable.parentCatClassId;
  public static SqlColumn<String> parentCatClassName = basCatClassTable.parentCatClassName;
  public static SqlColumn<String> path = basCatClassTable.path;
  public static SqlColumn<String> remark = basCatClassTable.remark;
  public static SqlColumn<Integer> showOrder = basCatClassTable.showOrder;
  public static SqlColumn<Long> sourceId = basCatClassTable.sourceId;
  public static SqlColumn<Integer> tableId = basCatClassTable.tableId;

  public static final class BasCatClassTable extends SqlTable {
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

    public final SqlColumn<Long> catId = column("cat_id", JDBCType.BIGINT);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<String> fullName = column("full_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isLeaf = column("is_leaf", JDBCType.INTEGER);
    public final SqlColumn<Integer> levelNum = column("level_num", JDBCType.INTEGER);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<String> parentCatClassCode =
        column("parent_cat_class_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> parentCatClassId = column("parent_cat_class_id", JDBCType.BIGINT);
    public final SqlColumn<String> parentCatClassName =
        column("parent_cat_class_name", JDBCType.VARCHAR);
    public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);
    public final SqlColumn<Long> sourceId = column("source_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> tableId = column("table_id", JDBCType.INTEGER);

    public BasCatClassTable() {
      super("BasCatClass");
    }
  }
}
