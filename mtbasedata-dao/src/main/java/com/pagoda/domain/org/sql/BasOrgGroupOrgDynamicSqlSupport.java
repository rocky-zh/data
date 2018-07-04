package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 往来单位-虚拟机构组对应机构实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGroupOrgDynamicSqlSupport {

  public static BasOrgGroupOrgTable basOrgGroupOrgTable = new BasOrgGroupOrgTable();
  public static SqlColumn<Long> id = basOrgGroupOrgTable.id;
  public static SqlColumn<Long> deleted = basOrgGroupOrgTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgGroupOrgTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgGroupOrgTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgGroupOrgTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgGroupOrgTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgGroupOrgTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgGroupOrgTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgGroupOrgTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgGroupOrgTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgGroupOrgTable.version;
  public static SqlColumn<Long> orgGroupId = basOrgGroupOrgTable.orgGroupId;
  public static SqlColumn<String> orgGroupCode = basOrgGroupOrgTable.orgGroupCode;
  public static SqlColumn<String> orgGroupName = basOrgGroupOrgTable.orgGroupName;
  public static SqlColumn<Long> entId = basOrgGroupOrgTable.entId;
  public static SqlColumn<Long> orgOrgId = basOrgGroupOrgTable.orgOrgId;
  public static SqlColumn<String> orgOrgCode = basOrgGroupOrgTable.orgOrgCode;
  public static SqlColumn<String> orgOrgName = basOrgGroupOrgTable.orgOrgName;
  public static SqlColumn<Integer> showOrder = basOrgGroupOrgTable.showOrder;

  public static final class BasOrgGroupOrgTable extends SqlTable {
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

    public final SqlColumn<Long> orgGroupId = column("org_group_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgGroupCode = column("org_group_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgGroupName = column("org_group_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);

    public BasOrgGroupOrgTable() {
      super("BasOrgGroupOrg");
    }
  }
}
