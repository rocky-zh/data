package com.pagoda.domain.salebasicdefinition.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salebasicdefinition.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 按客户维度进行配送订单、退货、货款等方面的控制实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrderControlDynamicSqlSupport {

  public static SalOrderControlTable salOrderControlTable = new SalOrderControlTable();
  public static SqlColumn<Long> id = salOrderControlTable.id;
  public static SqlColumn<Long> deleted = salOrderControlTable.deleted;
  public static SqlColumn<Date> createdAt = salOrderControlTable.createdAt;
  public static SqlColumn<String> creatorCode = salOrderControlTable.creatorCode;
  public static SqlColumn<String> creatorName = salOrderControlTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salOrderControlTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salOrderControlTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salOrderControlTable.modifierCode;
  public static SqlColumn<String> modifierName = salOrderControlTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salOrderControlTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salOrderControlTable.version;
  public static SqlColumn<Long> cusOrgId = salOrderControlTable.cusOrgId;
  public static SqlColumn<String> cusOrgCode = salOrderControlTable.cusOrgCode;
  public static SqlColumn<String> cusOrgName = salOrderControlTable.cusOrgName;
  public static SqlColumn<Integer> isCtrlDep = salOrderControlTable.isCtrlDep;
  public static SqlColumn<Integer> beforeDays = salOrderControlTable.beforeDays;
  public static SqlColumn<Integer> allowPosGapD = salOrderControlTable.allowPosGapD;
  public static SqlColumn<Integer> allowPosGapM = salOrderControlTable.allowPosGapM;
  public static SqlColumn<Integer> isDepInput = salOrderControlTable.isDepInput;
  public static SqlColumn<Integer> isAccnt = salOrderControlTable.isAccnt;
  public static SqlColumn<Integer> isDuty = salOrderControlTable.isDuty;
  public static SqlColumn<Integer> isVrfyTrans = salOrderControlTable.isVrfyTrans;
  public static SqlColumn<Integer> isDistCyc = salOrderControlTable.isDistCyc;
  public static SqlColumn<Integer> isMustSell = salOrderControlTable.isMustSell;
  public static SqlColumn<Integer> isRouteSplit = salOrderControlTable.isRouteSplit;
  public static SqlColumn<Integer> isSafetyStock = salOrderControlTable.isSafetyStock;
  public static SqlColumn<java.math.BigDecimal> safetyStockMultiple =
      salOrderControlTable.safetyStockMultiple;
  public static SqlColumn<Integer> isExeBatchPolicy = salOrderControlTable.isExeBatchPolicy;
  public static SqlColumn<Integer> isOneOrder = salOrderControlTable.isOneOrder;
  public static SqlColumn<java.util.Date> beginOrderTime = salOrderControlTable.beginOrderTime;
  public static SqlColumn<java.util.Date> endOrderTime = salOrderControlTable.endOrderTime;
  public static SqlColumn<Integer> isCtrlReturn = salOrderControlTable.isCtrlReturn;
  public static SqlColumn<java.util.Date> beginReturnTime = salOrderControlTable.beginReturnTime;
  public static SqlColumn<java.util.Date> endReturnTime = salOrderControlTable.endReturnTime;
  public static SqlColumn<Integer> isEnabled = salOrderControlTable.isEnabled;
  public static SqlColumn<String> remark = salOrderControlTable.remark;
  public static SqlColumn<Long> entId = salOrderControlTable.entId;

  public static final class SalOrderControlTable extends SqlTable {
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

    public final SqlColumn<Long> cusOrgId = column("cus_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> cusOrgCode = column("cus_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cusOrgName = column("cus_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isCtrlDep = column("is_ctrl_dep", JDBCType.INTEGER);
    public final SqlColumn<Integer> beforeDays = column("before_days", JDBCType.INTEGER);
    public final SqlColumn<Integer> allowPosGapD = column("allow_pos_gap_d", JDBCType.INTEGER);
    public final SqlColumn<Integer> allowPosGapM = column("allow_pos_gap_m", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDepInput = column("is_dep_input", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAccnt = column("is_accnt", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDuty = column("is_duty", JDBCType.INTEGER);
    public final SqlColumn<Integer> isVrfyTrans = column("is_vrfy_trans", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDistCyc = column("is_dist_cyc", JDBCType.INTEGER);
    public final SqlColumn<Integer> isMustSell = column("is_must_sell", JDBCType.INTEGER);
    public final SqlColumn<Integer> isRouteSplit = column("is_route_split", JDBCType.INTEGER);
    public final SqlColumn<Integer> isSafetyStock = column("is_safety_stock", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> safetyStockMultiple =
        column("safety_stock_multiple", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isExeBatchPolicy =
        column("is_exe_batch_policy", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOneOrder = column("is_one_order", JDBCType.INTEGER);
    public final SqlColumn<java.util.Date> beginOrderTime =
        column("begin_order_time", JDBCType.DATE);
    public final SqlColumn<java.util.Date> endOrderTime = column("end_order_time", JDBCType.DATE);
    public final SqlColumn<Integer> isCtrlReturn = column("is_ctrl_return", JDBCType.INTEGER);
    public final SqlColumn<java.util.Date> beginReturnTime =
        column("begin_return_time", JDBCType.DATE);
    public final SqlColumn<java.util.Date> endReturnTime = column("end_return_time", JDBCType.DATE);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public SalOrderControlTable() {
      super("SalOrderControl");
    }
  }
}
