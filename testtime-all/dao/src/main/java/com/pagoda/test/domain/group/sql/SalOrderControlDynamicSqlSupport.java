package com.pagoda.test.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.group.*;
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
  public static SqlColumn<Integer> isCtrlDepInput = salOrderControlTable.isCtrlDepInput;
  public static SqlColumn<Integer> isCtrlAccnt = salOrderControlTable.isCtrlAccnt;
  public static SqlColumn<Integer> isCtrlDuty = salOrderControlTable.isCtrlDuty;
  public static SqlColumn<Integer> isCtrlVrfyTrans = salOrderControlTable.isCtrlVrfyTrans;
  public static SqlColumn<Integer> isCtrlDistCyc = salOrderControlTable.isCtrlDistCyc;
  public static SqlColumn<Integer> isCtrlMustSell = salOrderControlTable.isCtrlMustSell;
  public static SqlColumn<Integer> isCtrlRouteSplit = salOrderControlTable.isCtrlRouteSplit;
  public static SqlColumn<Integer> isCtrlSafetyStock = salOrderControlTable.isCtrlSafetyStock;
  public static SqlColumn<java.math.BigDecimal> allowSafetyStockTimes =
      salOrderControlTable.allowSafetyStockTimes;
  public static SqlColumn<Integer> isCtrlExeBatchPolicy = salOrderControlTable.isCtrlExeBatchPolicy;
  public static SqlColumn<Integer> isCtrlOneOrder = salOrderControlTable.isCtrlOneOrder;
  public static SqlColumn<java.sql.Time> placeOrderTime = salOrderControlTable.placeOrderTime;
  public static SqlColumn<java.sql.Timestamp> placeOrderTime2 =
      salOrderControlTable.placeOrderTime2;
  public static SqlColumn<Integer> isCtrlReturn = salOrderControlTable.isCtrlReturn;
  public static SqlColumn<java.sql.Time> returnGoodsTime1 = salOrderControlTable.returnGoodsTime1;
  public static SqlColumn<java.sql.Time> returnGoodsTime2 = salOrderControlTable.returnGoodsTime2;
  public static SqlColumn<Integer> enabled = salOrderControlTable.enabled;
  public static SqlColumn<String> remark = salOrderControlTable.remark;

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
    public final SqlColumn<Integer> isCtrlDepInput = column("is_ctrl_dep_input", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlAccnt = column("is_ctrl_accnt", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlDuty = column("is_ctrl_duty", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlVrfyTrans =
        column("is_ctrl_vrfy_trans", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlDistCyc = column("is_ctrl_dist_cyc", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlMustSell = column("is_ctrl_must_sell", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlRouteSplit =
        column("is_ctrl_route_split", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlSafetyStock =
        column("is_ctrl_safety_stock", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> allowSafetyStockTimes =
        column("allow_safety_stock_times", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isCtrlExeBatchPolicy =
        column("is_ctrl_exe_batch_policy", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCtrlOneOrder = column("is_ctrl_one_order", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Time> placeOrderTime =
        column("place_order_time", JDBCType.TIME);
    public final SqlColumn<java.sql.Timestamp> placeOrderTime2 =
        column("place_order_time2", JDBCType.TIMESTAMP);
    public final SqlColumn<Integer> isCtrlReturn = column("is_ctrl_return", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Time> returnGoodsTime1 =
        column("return_goods_time1", JDBCType.TIME);
    public final SqlColumn<java.sql.Time> returnGoodsTime2 =
        column("return_goods_time2", JDBCType.TIME);
    public final SqlColumn<Integer> enabled = column("enabled", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public SalOrderControlTable() {
      super("SalOrderControl");
    }
  }
}
