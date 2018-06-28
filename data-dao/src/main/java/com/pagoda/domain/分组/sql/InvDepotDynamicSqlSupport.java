package com.pagoda.domain.分组.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.分组.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 库房定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class InvDepotDynamicSqlSupport {

  public static InvDepotTable invDepotTable = new InvDepotTable();
  public static SqlColumn<Long> id = invDepotTable.id;
  public static SqlColumn<Long> deleted = invDepotTable.deleted;
  public static SqlColumn<Date> createdAt = invDepotTable.createdAt;
  public static SqlColumn<String> creatorCode = invDepotTable.creatorCode;
  public static SqlColumn<String> creatorName = invDepotTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = invDepotTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = invDepotTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = invDepotTable.modifierCode;
  public static SqlColumn<String> modifierName = invDepotTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = invDepotTable.modifierOrgCode;
  public static SqlColumn<Integer> version = invDepotTable.version;
  public static SqlColumn<String> adCode = invDepotTable.adCode;
  public static SqlColumn<String> adLat = invDepotTable.adLat;
  public static SqlColumn<String> adLng = invDepotTable.adLng;
  public static SqlColumn<String> address = invDepotTable.address;
  public static SqlColumn<Long> balOrgId = invDepotTable.balOrgId;
  public static SqlColumn<String> currentPeriod = invDepotTable.currentPeriod;
  public static SqlColumn<Integer> depotCenterId = invDepotTable.depotCenterId;
  public static SqlColumn<Integer> isAllowInvOut = invDepotTable.isAllowInvOut;
  public static SqlColumn<Integer> isAllowPostReturn = invDepotTable.isAllowPostReturn;
  public static SqlColumn<Integer> isCheckByAdd = invDepotTable.isCheckByAdd;
  public static SqlColumn<Integer> isCheckByNegative = invDepotTable.isCheckByNegative;
  public static SqlColumn<Integer> isCheckByPost = invDepotTable.isCheckByPost;
  public static SqlColumn<Integer> isCheckInputNeedCheck = invDepotTable.isCheckInputNeedCheck;
  public static SqlColumn<Integer> isCheckQtyZero = invDepotTable.isCheckQtyZero;
  public static SqlColumn<Integer> isCheckShowFinQty = invDepotTable.isCheckShowFinQty;
  public static SqlColumn<Integer> isDualDepot = invDepotTable.isDualDepot;
  public static SqlColumn<Integer> isPickAllocation = invDepotTable.isPickAllocation;
  public static SqlColumn<Integer> isPostCheckAll = invDepotTable.isPostCheckAll;
  public static SqlColumn<Integer> isPostDaily = invDepotTable.isPostDaily;
  public static SqlColumn<Integer> isPostDailyDetail = invDepotTable.isPostDailyDetail;
  public static SqlColumn<Integer> isPurRecIn = invDepotTable.isPurRecIn;
  public static SqlColumn<Integer> isPurRetOut = invDepotTable.isPurRetOut;
  public static SqlColumn<Integer> isSalConIn = invDepotTable.isSalConIn;
  public static SqlColumn<Integer> isSalConOut = invDepotTable.isSalConOut;
  public static SqlColumn<Integer> isSalRetIn = invDepotTable.isSalRetIn;
  public static SqlColumn<Integer> isSalRetOut = invDepotTable.isSalRetOut;
  public static SqlColumn<Integer> isStoEnabled = invDepotTable.isStoEnabled;
  public static SqlColumn<Integer> isTurnExistNoPost = invDepotTable.isTurnExistNoPost;
  public static SqlColumn<Integer> manageType = invDepotTable.manageType;
  public static SqlColumn<Integer> measureType = invDepotTable.measureType;
  public static SqlColumn<Long> orgId = invDepotTable.orgId;
  public static SqlColumn<String> phone = invDepotTable.phone;
  public static SqlColumn<String> searchWord = invDepotTable.searchWord;
  public static SqlColumn<Integer> stoCurrentPeriod = invDepotTable.stoCurrentPeriod;
  public static SqlColumn<java.sql.Timestamp> turnDateTime = invDepotTable.turnDateTime;
  public static SqlColumn<String> turnUserCode = invDepotTable.turnUserCode;
  public static SqlColumn<String> turnUserName = invDepotTable.turnUserName;
  public static SqlColumn<java.sql.Timestamp> createDateTime = invDepotTable.createDateTime;
  public static SqlColumn<String> createOrgCode = invDepotTable.createOrgCode;
  public static SqlColumn<String> createUserCode = invDepotTable.createUserCode;
  public static SqlColumn<String> createUserName = invDepotTable.createUserName;
  public static SqlColumn<Integer> delId = invDepotTable.delId;
  public static SqlColumn<String> depotAddress = invDepotTable.depotAddress;
  public static SqlColumn<String> depotPhone = invDepotTable.depotPhone;
  public static SqlColumn<String> orgCode = invDepotTable.orgCode;
  public static SqlColumn<String> orgName = invDepotTable.orgName;
  public static SqlColumn<java.sql.Timestamp> updateDateTime = invDepotTable.updateDateTime;
  public static SqlColumn<String> updateOrgCode = invDepotTable.updateOrgCode;
  public static SqlColumn<String> updateUserCode = invDepotTable.updateUserCode;
  public static SqlColumn<String> updateUserName = invDepotTable.updateUserName;
  public static SqlColumn<String> code = invDepotTable.code;
  public static SqlColumn<Long> entId = invDepotTable.entId;
  public static SqlColumn<Integer> isEnabled = invDepotTable.isEnabled;
  public static SqlColumn<String> name = invDepotTable.name;

  public static final class InvDepotTable extends SqlTable {
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

    public final SqlColumn<String> adCode = column("ad_code", JDBCType.VARCHAR);
    public final SqlColumn<String> adLat = column("ad_lat", JDBCType.VARCHAR);
    public final SqlColumn<String> adLng = column("ad_lng", JDBCType.VARCHAR);
    public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);
    public final SqlColumn<Long> balOrgId = column("bal_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> currentPeriod = column("current_period", JDBCType.VARCHAR);
    public final SqlColumn<Integer> depotCenterId = column("depot_center_id", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAllowInvOut = column("is_allow_inv_out", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAllowPostReturn =
        column("is_allow_post_return", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCheckByAdd = column("is_check_by_add", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCheckByNegative =
        column("is_check_by_negative", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCheckByPost = column("is_check_by_post", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCheckInputNeedCheck =
        column("is_check_input_need_check", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCheckQtyZero = column("is_check_qty_zero", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCheckShowFinQty =
        column("is_check_show_fin_qty", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDualDepot = column("is_dual_depot", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPickAllocation =
        column("is_pick_allocation", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPostCheckAll = column("is_post_check_all", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPostDaily = column("is_post_daily", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPostDailyDetail =
        column("is_post_daily_detail", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPurRecIn = column("is_pur_rec_in", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPurRetOut = column("is_pur_ret_out", JDBCType.INTEGER);
    public final SqlColumn<Integer> isSalConIn = column("is_sal_con_in", JDBCType.INTEGER);
    public final SqlColumn<Integer> isSalConOut = column("is_sal_con_out", JDBCType.INTEGER);
    public final SqlColumn<Integer> isSalRetIn = column("is_sal_ret_in", JDBCType.INTEGER);
    public final SqlColumn<Integer> isSalRetOut = column("is_sal_ret_out", JDBCType.INTEGER);
    public final SqlColumn<Integer> isStoEnabled = column("is_sto_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isTurnExistNoPost =
        column("is_turn_exist_no_post", JDBCType.INTEGER);
    public final SqlColumn<Integer> manageType = column("manage_type", JDBCType.INTEGER);
    public final SqlColumn<Integer> measureType = column("measure_type", JDBCType.INTEGER);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);
    public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);
    public final SqlColumn<Integer> stoCurrentPeriod =
        column("sto_current_period", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Timestamp> turnDateTime =
        column("turn_date_time", JDBCType.TIMESTAMP);
    public final SqlColumn<String> turnUserCode = column("turn_user_code", JDBCType.VARCHAR);
    public final SqlColumn<String> turnUserName = column("turn_user_name", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> createDateTime =
        column("create_date_time", JDBCType.TIMESTAMP);
    public final SqlColumn<String> createOrgCode = column("create_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> createUserCode = column("create_user_code", JDBCType.VARCHAR);
    public final SqlColumn<String> createUserName = column("create_user_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> delId = column("del_id", JDBCType.INTEGER);
    public final SqlColumn<String> depotAddress = column("depot_address", JDBCType.VARCHAR);
    public final SqlColumn<String> depotPhone = column("depot_phone", JDBCType.VARCHAR);
    public final SqlColumn<String> orgCode = column("org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgName = column("org_name", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> updateDateTime =
        column("update_date_time", JDBCType.TIMESTAMP);
    public final SqlColumn<String> updateOrgCode = column("update_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> updateUserCode = column("update_user_code", JDBCType.VARCHAR);
    public final SqlColumn<String> updateUserName = column("update_user_name", JDBCType.VARCHAR);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

    public InvDepotTable() {
      super("InvDepot");
    }
  }
}
