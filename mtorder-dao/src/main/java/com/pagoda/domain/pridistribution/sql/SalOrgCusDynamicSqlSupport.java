package com.pagoda.domain.pridistribution.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.pridistribution.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * sal_org_cus实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrgCusDynamicSqlSupport {

  public static SalOrgCusTable salOrgCusTable = new SalOrgCusTable();
  public static SqlColumn<Long> id = salOrgCusTable.id;
  public static SqlColumn<Long> deleted = salOrgCusTable.deleted;
  public static SqlColumn<Date> createdAt = salOrgCusTable.createdAt;
  public static SqlColumn<String> creatorCode = salOrgCusTable.creatorCode;
  public static SqlColumn<String> creatorName = salOrgCusTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salOrgCusTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salOrgCusTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salOrgCusTable.modifierCode;
  public static SqlColumn<String> modifierName = salOrgCusTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salOrgCusTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salOrgCusTable.version;
  public static SqlColumn<Long> balCusOrgId = salOrgCusTable.balCusOrgId;
  public static SqlColumn<String> balCusOrgName = salOrgCusTable.balCusOrgName;
  public static SqlColumn<String> dualOrgName = salOrgCusTable.dualOrgName;
  public static SqlColumn<Integer> isPickAutoRec = salOrgCusTable.isPickAutoRec;
  public static SqlColumn<Integer> isPickLimitCon = salOrgCusTable.isPickLimitCon;
  public static SqlColumn<Integer> billType = salOrgCusTable.billType;
  public static SqlColumn<Integer> isStoBackPrice = salOrgCusTable.isStoBackPrice;
  public static SqlColumn<Integer> isCreateBill = salOrgCusTable.isCreateBill;
  public static SqlColumn<Integer> isDefaultCon = salOrgCusTable.isDefaultCon;
  public static SqlColumn<Integer> isDefaultAllot = salOrgCusTable.isDefaultAllot;
  public static SqlColumn<Long> cusOrgId = salOrgCusTable.cusOrgId;
  public static SqlColumn<String> cusOrgCode = salOrgCusTable.cusOrgCode;
  public static SqlColumn<String> cusOrgName = salOrgCusTable.cusOrgName;
  public static SqlColumn<Long> orgOrgId = salOrgCusTable.orgOrgId;
  public static SqlColumn<String> orgOrgCode = salOrgCusTable.orgOrgCode;
  public static SqlColumn<String> orgOrgName = salOrgCusTable.orgOrgName;
  public static SqlColumn<Long> balOrgId = salOrgCusTable.balOrgId;
  public static SqlColumn<String> balOrgName = salOrgCusTable.balOrgName;
  public static SqlColumn<Long> priceCatId = salOrgCusTable.priceCatId;
  public static SqlColumn<String> priceCatCode = salOrgCusTable.priceCatCode;
  public static SqlColumn<String> priceCatName = salOrgCusTable.priceCatName;
  public static SqlColumn<Integer> isEnabled = salOrgCusTable.isEnabled;

  public static final class SalOrgCusTable extends SqlTable {
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

    public final SqlColumn<Long> balCusOrgId = column("bal_cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> balCusOrgName = column("bal_cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<String> dualOrgName = column("dual_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isPickAutoRec = column("is_pick_auto_rec", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPickLimitCon = column("is_pick_limit_con", JDBCType.INTEGER);
    public final SqlColumn<Integer> billType = column("bill_type", JDBCType.INTEGER);
    public final SqlColumn<Integer> isStoBackPrice = column("is_sto_back_price", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCreateBill = column("is_create_bill", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDefaultCon = column("is_default_con", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDefaultAllot = column("is_default_allot", JDBCType.INTEGER);
    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> cusOrgCode = column("cus_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cusOrgName = column("cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> balOrgId = column("bal_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> balOrgName = column("bal_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> priceCatId = column("price_cat_id", JDBCType.BIGINT);
    public final SqlColumn<String> priceCatCode = column("price_cat_code", JDBCType.VARCHAR);
    public final SqlColumn<String> priceCatName = column("price_cat_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);

    public SalOrgCusTable() {
      super("SalOrgCus");
    }
  }
}
