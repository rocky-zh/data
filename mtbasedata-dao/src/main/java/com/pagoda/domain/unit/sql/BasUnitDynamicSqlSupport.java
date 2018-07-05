package com.pagoda.domain.unit.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.unit.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 计量单位定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasUnitDynamicSqlSupport {

  public static BasUnitTable basUnitTable = new BasUnitTable();
  public static SqlColumn<Long> id = basUnitTable.id;
  public static SqlColumn<Long> deleted = basUnitTable.deleted;
  public static SqlColumn<Date> createdAt = basUnitTable.createdAt;
  public static SqlColumn<String> creatorCode = basUnitTable.creatorCode;
  public static SqlColumn<String> creatorName = basUnitTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basUnitTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basUnitTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basUnitTable.modifierCode;
  public static SqlColumn<String> modifierName = basUnitTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basUnitTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basUnitTable.version;
  public static SqlColumn<String> code = basUnitTable.code;
  public static SqlColumn<String> name = basUnitTable.name;
  public static SqlColumn<Long> entId = basUnitTable.entId;
  public static SqlColumn<Integer> isEnabled = basUnitTable.isEnabled;
  public static SqlColumn<String> searchWord = basUnitTable.searchWord;
  public static SqlColumn<Integer> showOrder = basUnitTable.showOrder;

  public static final class BasUnitTable extends SqlTable {
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
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);

    public BasUnitTable() {
      super("BasUnit");
    }
  }
}
