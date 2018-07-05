package com.pagoda.domain.ent.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.ent.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 企业参数表[包含1.weburl 用于图片跟链接2.bas_goodsva实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SysEntParamDynamicSqlSupport {

  public static SysEntParamTable sysEntParamTable = new SysEntParamTable();
  public static SqlColumn<Long> id = sysEntParamTable.id;
  public static SqlColumn<Long> deleted = sysEntParamTable.deleted;
  public static SqlColumn<Date> createdAt = sysEntParamTable.createdAt;
  public static SqlColumn<String> creatorCode = sysEntParamTable.creatorCode;
  public static SqlColumn<String> creatorName = sysEntParamTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = sysEntParamTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = sysEntParamTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = sysEntParamTable.modifierCode;
  public static SqlColumn<String> modifierName = sysEntParamTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = sysEntParamTable.modifierOrgCode;
  public static SqlColumn<Integer> version = sysEntParamTable.version;
  public static SqlColumn<String> paramCode = sysEntParamTable.paramCode;
  public static SqlColumn<String> paramName = sysEntParamTable.paramName;
  public static SqlColumn<String> paramValue = sysEntParamTable.paramValue;
  public static SqlColumn<Long> entId = sysEntParamTable.entId;

  public static final class SysEntParamTable extends SqlTable {
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

    public final SqlColumn<String> paramCode = column("param_code", JDBCType.VARCHAR);
    public final SqlColumn<String> paramName = column("param_name", JDBCType.VARCHAR);
    public final SqlColumn<String> paramValue = column("param_value", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public SysEntParamTable() {
      super("SysEntParam");
    }
  }
}
