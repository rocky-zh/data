package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 往来单位-机构明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgOrgDynamicSqlSupport {

  public static BasOrgOrgTable basOrgOrgTable = new BasOrgOrgTable();
  public static SqlColumn<Long> id = basOrgOrgTable.id;
  public static SqlColumn<Long> deleted = basOrgOrgTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgOrgTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgOrgTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgOrgTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgOrgTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgOrgTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgOrgTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgOrgTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgOrgTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgOrgTable.version;
  public static SqlColumn<Long> dualDepotId = basOrgOrgTable.dualDepotId;
  public static SqlColumn<Long> dualOrgId = basOrgOrgTable.dualOrgId;
  public static SqlColumn<Integer> isOrgTaxRate = basOrgOrgTable.isOrgTaxRate;
  public static SqlColumn<Integer> isOrgEnabled = basOrgOrgTable.isOrgEnabled;
  public static SqlColumn<Integer> isUsedWms = basOrgOrgTable.isUsedWms;
  public static SqlColumn<Long> orgId = basOrgOrgTable.orgId;
  public static SqlColumn<Long> salConOutDepotId = basOrgOrgTable.salConOutDepotId;
  public static SqlColumn<Long> salRetInDepotId = basOrgOrgTable.salRetInDepotId;
  public static SqlColumn<Long> purRecInDepotId = basOrgOrgTable.purRecInDepotId;
  public static SqlColumn<Long> purRetOutDepotId = basOrgOrgTable.purRetOutDepotId;

  public static final class BasOrgOrgTable extends SqlTable {
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

    public final SqlColumn<Long> dualDepotId = column("dual_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> dualOrgId = column("dual_org_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isOrgTaxRate = column("is_org_tax_rate", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOrgEnabled = column("is_org_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isUsedWms = column("is_used_wms", JDBCType.INTEGER);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);
    public final SqlColumn<Long> salConOutDepotId = column("sal_con_out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> salRetInDepotId = column("sal_ret_in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> purRecInDepotId = column("pur_rec_in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> purRetOutDepotId = column("pur_ret_out_depot_id", JDBCType.BIGINT);

    public BasOrgOrgTable() {
      super("BasOrgOrg");
    }
  }
}
