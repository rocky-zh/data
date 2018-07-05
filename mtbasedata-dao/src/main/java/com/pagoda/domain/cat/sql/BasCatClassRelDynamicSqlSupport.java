package com.pagoda.domain.cat.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.cat.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 目录分类关系表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatClassRelDynamicSqlSupport {

  public static BasCatClassRelTable basCatClassRelTable = new BasCatClassRelTable();
  public static SqlColumn<Long> id = basCatClassRelTable.id;
  public static SqlColumn<Long> deleted = basCatClassRelTable.deleted;
  public static SqlColumn<Date> createdAt = basCatClassRelTable.createdAt;
  public static SqlColumn<String> creatorCode = basCatClassRelTable.creatorCode;
  public static SqlColumn<String> creatorName = basCatClassRelTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basCatClassRelTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basCatClassRelTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basCatClassRelTable.modifierCode;
  public static SqlColumn<String> modifierName = basCatClassRelTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basCatClassRelTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basCatClassRelTable.version;
  public static SqlColumn<Long> objId = basCatClassRelTable.objId;
  public static SqlColumn<String> objCode = basCatClassRelTable.objCode;
  public static SqlColumn<String> objName = basCatClassRelTable.objName;
  public static SqlColumn<Long> catClassId = basCatClassRelTable.catClassId;
  public static SqlColumn<String> catClassCode = basCatClassRelTable.catClassCode;
  public static SqlColumn<String> catClassName = basCatClassRelTable.catClassName;
  public static SqlColumn<Long> uniqueId = basCatClassRelTable.uniqueId;
  public static SqlColumn<Long> entId = basCatClassRelTable.entId;
  public static SqlColumn<String> path = basCatClassRelTable.path;
  public static SqlColumn<Long> catId = basCatClassRelTable.catId;
  public static SqlColumn<Long> tableId = basCatClassRelTable.tableId;

  public static final class BasCatClassRelTable extends SqlTable {
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

    public final SqlColumn<Long> objId = column("obj_id", JDBCType.BIGINT);
    public final SqlColumn<String> objCode = column("obj_code", JDBCType.VARCHAR);
    public final SqlColumn<String> objName = column("obj_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> catClassId = column("cat_class_id", JDBCType.BIGINT);
    public final SqlColumn<String> catClassCode = column("cat_class_code", JDBCType.VARCHAR);
    public final SqlColumn<String> catClassName = column("cat_class_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> uniqueId = column("unique_id", JDBCType.BIGINT);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);
    public final SqlColumn<Long> catId = column("cat_id", JDBCType.BIGINT);
    public final SqlColumn<Long> tableId = column("table_id", JDBCType.BIGINT);

    public BasCatClassRelTable() {
      super("BasCatClassRel");
    }
  }
}
