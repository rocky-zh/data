package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 岗位表 实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasPostDynamicSqlSupport {

  public static BasPostTable basPostTable = new BasPostTable();
  public static SqlColumn<Long> id = basPostTable.id;
  public static SqlColumn<Long> deleted = basPostTable.deleted;
  public static SqlColumn<Date> createdAt = basPostTable.createdAt;
  public static SqlColumn<String> creatorCode = basPostTable.creatorCode;
  public static SqlColumn<String> creatorName = basPostTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basPostTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basPostTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basPostTable.modifierCode;
  public static SqlColumn<String> modifierName = basPostTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basPostTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basPostTable.version;
  public static SqlColumn<Long> postLeader = basPostTable.postLeader;
  public static SqlColumn<Integer> isBusRelated = basPostTable.isBusRelated;
  public static SqlColumn<String> remak = basPostTable.remak;
  public static SqlColumn<String> code = basPostTable.code;
  public static SqlColumn<String> name = basPostTable.name;
  public static SqlColumn<Long> entId = basPostTable.entId;
  public static SqlColumn<Long> depId = basPostTable.depId;
  public static SqlColumn<Integer> showOrder = basPostTable.showOrder;
  public static SqlColumn<Integer> isEnabled = basPostTable.isEnabled;

  public static final class BasPostTable extends SqlTable {
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

    public final SqlColumn<Long> postLeader = column("post_leader", JDBCType.BIGINT);
    public final SqlColumn<Integer> isBusRelated = column("is_bus_related", JDBCType.INTEGER);
    public final SqlColumn<String> remak = column("remak", JDBCType.VARCHAR);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> depId = column("dep_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);

    public BasPostTable() {
      super("BasPost");
    }
  }
}
