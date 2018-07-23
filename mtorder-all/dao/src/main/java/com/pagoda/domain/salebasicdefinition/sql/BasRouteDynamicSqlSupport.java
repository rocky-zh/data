package com.pagoda.domain.salebasicdefinition.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salebasicdefinition.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 配送线路定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasRouteDynamicSqlSupport {

  public static BasRouteTable basRouteTable = new BasRouteTable();
  public static SqlColumn<Long> id = basRouteTable.id;
  public static SqlColumn<Long> deleted = basRouteTable.deleted;
  public static SqlColumn<Date> createdAt = basRouteTable.createdAt;
  public static SqlColumn<String> creatorCode = basRouteTable.creatorCode;
  public static SqlColumn<String> creatorName = basRouteTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basRouteTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basRouteTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basRouteTable.modifierCode;
  public static SqlColumn<String> modifierName = basRouteTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basRouteTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basRouteTable.version;
  public static SqlColumn<Integer> waveNum = basRouteTable.waveNum;
  public static SqlColumn<String> sendPlace = basRouteTable.sendPlace;
  public static SqlColumn<String> receivePlace = basRouteTable.receivePlace;
  public static SqlColumn<String> transMode = basRouteTable.transMode;
  public static SqlColumn<String> code = basRouteTable.code;
  public static SqlColumn<String> name = basRouteTable.name;
  public static SqlColumn<Long> conOrgId = basRouteTable.conOrgId;
  public static SqlColumn<String> conOrgCode = basRouteTable.conOrgCode;
  public static SqlColumn<String> conOrgName = basRouteTable.conOrgName;
  public static SqlColumn<Integer> enabled = basRouteTable.enabled;
  public static SqlColumn<Long> entId = basRouteTable.entId;

  public static final class BasRouteTable extends SqlTable {
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

    public final SqlColumn<Integer> waveNum = column("wave_num", JDBCType.INTEGER);
    public final SqlColumn<String> sendPlace = column("send_place", JDBCType.VARCHAR);
    public final SqlColumn<String> receivePlace = column("receive_place", JDBCType.VARCHAR);
    public final SqlColumn<String> transMode = column("trans_mode", JDBCType.VARCHAR);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<Long> conOrgId = column("con_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> conOrgCode = column("con_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> conOrgName = column("con_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> enabled = column("enabled", JDBCType.INTEGER);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public BasRouteTable() {
      super("BasRoute");
    }
  }
}
