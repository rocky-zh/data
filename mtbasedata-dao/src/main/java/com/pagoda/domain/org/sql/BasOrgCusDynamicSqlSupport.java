package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 往来单位-012 客户明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgCusDynamicSqlSupport {

  public static BasOrgCusTable basOrgCusTable = new BasOrgCusTable();
  public static SqlColumn<Long> id = basOrgCusTable.id;
  public static SqlColumn<Long> deleted = basOrgCusTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgCusTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgCusTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgCusTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgCusTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgCusTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgCusTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgCusTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgCusTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgCusTable.version;
  public static SqlColumn<java.math.BigDecimal> invLimitAmt = basOrgCusTable.invLimitAmt;
  public static SqlColumn<Integer> isInvLimitAmt = basOrgCusTable.isInvLimitAmt;
  public static SqlColumn<Integer> checkMinAmt = basOrgCusTable.checkMinAmt;
  public static SqlColumn<Integer> isOrderCheck = basOrgCusTable.isOrderCheck;
  public static SqlColumn<Integer> isReturnCheck = basOrgCusTable.isReturnCheck;
  public static SqlColumn<Integer> returnDealType = basOrgCusTable.returnDealType;
  public static SqlColumn<Integer> isModifyPrice = basOrgCusTable.isModifyPrice;
  public static SqlColumn<Integer> isModifyCheck = basOrgCusTable.isModifyCheck;
  public static SqlColumn<Integer> isCusInv = basOrgCusTable.isCusInv;
  public static SqlColumn<Integer> isAllotCheck = basOrgCusTable.isAllotCheck;
  public static SqlColumn<Integer> isClosed = basOrgCusTable.isClosed;
  public static SqlColumn<Integer> isOrderPaused = basOrgCusTable.isOrderPaused;
  public static SqlColumn<String> shopOwnerName = basOrgCusTable.shopOwnerName;
  public static SqlColumn<String> shopOwnerPhone = basOrgCusTable.shopOwnerPhone;
  public static SqlColumn<java.util.Date> openingDate = basOrgCusTable.openingDate;
  public static SqlColumn<Integer> isOuterLeague = basOrgCusTable.isOuterLeague;
  public static SqlColumn<Integer> isAutoRecIn = basOrgCusTable.isAutoRecIn;
  public static SqlColumn<Integer> enabledStatus = basOrgCusTable.enabledStatus;
  public static SqlColumn<Long> salConInDepotId = basOrgCusTable.salConInDepotId;
  public static SqlColumn<Long> salRetOutDepotId = basOrgCusTable.salRetOutDepotId;
  public static SqlColumn<Long> orgId = basOrgCusTable.orgId;

  public static final class BasOrgCusTable extends SqlTable {
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

    public final SqlColumn<java.math.BigDecimal> invLimitAmt =
        column("inv_limit_amt", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isInvLimitAmt = column("is_inv_limit_amt", JDBCType.INTEGER);
    public final SqlColumn<Integer> checkMinAmt = column("check_min_amt", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOrderCheck = column("is_order_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> isReturnCheck = column("is_return_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> returnDealType = column("return_deal_type", JDBCType.INTEGER);
    public final SqlColumn<Integer> isModifyPrice = column("is_modify_price", JDBCType.INTEGER);
    public final SqlColumn<Integer> isModifyCheck = column("is_modify_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCusInv = column("is_cus_inv", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAllotCheck = column("is_allot_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> isClosed = column("is_closed", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOrderPaused = column("is_order_paused", JDBCType.INTEGER);
    public final SqlColumn<String> shopOwnerName = column("shop_owner_name", JDBCType.VARCHAR);
    public final SqlColumn<String> shopOwnerPhone = column("shop_owner_phone", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> openingDate = column("opening_date", JDBCType.DATE);
    public final SqlColumn<Integer> isOuterLeague = column("is_outer_league", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAutoRecIn = column("is_auto_rec_in", JDBCType.INTEGER);
    public final SqlColumn<Integer> enabledStatus = column("enabled_status", JDBCType.INTEGER);
    public final SqlColumn<Long> salConInDepotId = column("sal_con_in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> salRetOutDepotId = column("sal_ret_out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);

    public BasOrgCusTable() {
      super("BasOrgCus");
    }
  }
}
