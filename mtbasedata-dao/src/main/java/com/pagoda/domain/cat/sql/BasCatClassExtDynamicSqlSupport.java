package com.pagoda.domain.cat.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.cat.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 目录分类扩展表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatClassExtDynamicSqlSupport {

  public static BasCatClassExtTable basCatClassExtTable = new BasCatClassExtTable();
  public static SqlColumn<Long> id = basCatClassExtTable.id;
  public static SqlColumn<Long> deleted = basCatClassExtTable.deleted;
  public static SqlColumn<Date> createdAt = basCatClassExtTable.createdAt;
  public static SqlColumn<String> creatorCode = basCatClassExtTable.creatorCode;
  public static SqlColumn<String> creatorName = basCatClassExtTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basCatClassExtTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basCatClassExtTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basCatClassExtTable.modifierCode;
  public static SqlColumn<String> modifierName = basCatClassExtTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basCatClassExtTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basCatClassExtTable.version;
  public static SqlColumn<Long> childCatClassId = basCatClassExtTable.childCatClassId;
  public static SqlColumn<Integer> distance = basCatClassExtTable.distance;
  public static SqlColumn<Long> parentCatClassId = basCatClassExtTable.parentCatClassId;
  public static SqlColumn<Long> catId = basCatClassExtTable.catId;
  public static SqlColumn<Long> entId = basCatClassExtTable.entId;

  public static final class BasCatClassExtTable extends SqlTable {
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

    public final SqlColumn<Long> childCatClassId = column("child_cat_class_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> distance = column("distance", JDBCType.INTEGER);
    public final SqlColumn<Long> parentCatClassId = column("parent_cat_class_id", JDBCType.BIGINT);
    public final SqlColumn<Long> catId = column("cat_id", JDBCType.BIGINT);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public BasCatClassExtTable() {
      super("BasCatClassExt");
    }
  }
}
