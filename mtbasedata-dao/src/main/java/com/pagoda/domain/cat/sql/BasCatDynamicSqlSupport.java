package com.pagoda.domain.cat.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.cat.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 目录定义1-level：tableid 包含：机构，供应商，客户，库房2-level: 实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatDynamicSqlSupport {

  public static BasCatTable basCatTable = new BasCatTable();
  public static SqlColumn<Long> id = basCatTable.id;
  public static SqlColumn<Long> deleted = basCatTable.deleted;
  public static SqlColumn<Date> createdAt = basCatTable.createdAt;
  public static SqlColumn<String> creatorCode = basCatTable.creatorCode;
  public static SqlColumn<String> creatorName = basCatTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basCatTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basCatTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basCatTable.modifierCode;
  public static SqlColumn<String> modifierName = basCatTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basCatTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basCatTable.version;
  public static SqlColumn<String> code = basCatTable.code;
  public static SqlColumn<String> name = basCatTable.name;
  public static SqlColumn<Long> entId = basCatTable.entId;
  public static SqlColumn<Long> tableId = basCatTable.tableId;
  public static SqlColumn<Integer> isEnabled = basCatTable.isEnabled;
  public static SqlColumn<Integer> isDefault = basCatTable.isDefault;
  public static SqlColumn<Integer> isMulti = basCatTable.isMulti;
  public static SqlColumn<Integer> showOrder = basCatTable.showOrder;
  public static SqlColumn<String> remark = basCatTable.remark;
  public static SqlColumn<String> searchWord = basCatTable.searchWord;

  public static final class BasCatTable extends SqlTable {
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
    public final SqlColumn<Long> tableId = column("table_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDefault = column("is_default", JDBCType.INTEGER);
    public final SqlColumn<Integer> isMulti = column("is_multi", JDBCType.INTEGER);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);

    public BasCatTable() {
      super("BasCat");
    }
  }
}
