package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
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
  public static SqlColumn<String> fullName = basCatClassTable.fullName;
  public static SqlColumn<String> isLeaf = basCatClassTable.isLeaf;
  public static SqlColumn<Integer> levelNum = basCatClassTable.levelNum;
  public static SqlColumn<String> parentCatClassCode = basCatClassTable.parentCatClassCode;
  public static SqlColumn<Integer> parentCatClassId = basCatClassTable.parentCatClassId;
  public static SqlColumn<String> parentCatClassName = basCatClassTable.parentCatClassName;
  public static SqlColumn<String> path = basCatClassTable.path;
  public static SqlColumn<Integer> sourceId = basCatClassTable.sourceId;
  public static SqlColumn<String> code = basCatClassTable.code;

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

    public final SqlColumn<String> fullName = column("full_name", JDBCType.VARCHAR);
    public final SqlColumn<String> isLeaf = column("is_leaf", JDBCType.VARCHAR);
    public final SqlColumn<Integer> levelNum = column("level_num", JDBCType.INTEGER);
    public final SqlColumn<String> parentCatClassCode =
        column("parent_cat_class_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> parentCatClassId =
        column("parent_cat_class_id", JDBCType.INTEGER);
    public final SqlColumn<String> parentCatClassName =
        column("parent_cat_class_name", JDBCType.VARCHAR);
    public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);
    public final SqlColumn<Integer> sourceId = column("source_id", JDBCType.INTEGER);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);

    public BasCatClassTable() {
      super("BasCatClass");
    }
  }
}
