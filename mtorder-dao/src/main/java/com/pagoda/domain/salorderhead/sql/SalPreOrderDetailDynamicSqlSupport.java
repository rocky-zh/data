package com.pagoda.domain.salorderhead.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salorderhead.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 销售预订单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalPreOrderDetailDynamicSqlSupport {

  public static SalPreOrderDetailTable salPreOrderDetailTable = new SalPreOrderDetailTable();
  public static SqlColumn<Long> id = salPreOrderDetailTable.id;
  public static SqlColumn<Long> deleted = salPreOrderDetailTable.deleted;
  public static SqlColumn<Date> createdAt = salPreOrderDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = salPreOrderDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = salPreOrderDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salPreOrderDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salPreOrderDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salPreOrderDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = salPreOrderDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salPreOrderDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salPreOrderDetailTable.version;
  public static SqlColumn<Long> preOrderId = salPreOrderDetailTable.preOrderId;
  public static SqlColumn<String> preOrderSeqno = salPreOrderDetailTable.preOrderSeqno;
  public static SqlColumn<java.math.BigDecimal> prePlanQty = salPreOrderDetailTable.prePlanQty;
  public static SqlColumn<java.math.BigDecimal> auditQty = salPreOrderDetailTable.auditQty;
  public static SqlColumn<java.math.BigDecimal> invQty = salPreOrderDetailTable.invQty;
  public static SqlColumn<Integer> detailStatus = salPreOrderDetailTable.detailStatus;
  public static SqlColumn<Long> areaId = salPreOrderDetailTable.areaId;
  public static SqlColumn<String> areaCode = salPreOrderDetailTable.areaCode;
  public static SqlColumn<String> areaName = salPreOrderDetailTable.areaName;
  public static SqlColumn<Long> entId = salPreOrderDetailTable.entId;
  public static SqlColumn<Long> goodsVarId = salPreOrderDetailTable.goodsVarId;
  public static SqlColumn<String> goodsVarName = salPreOrderDetailTable.goodsVarName;
  public static SqlColumn<Long> goodsId = salPreOrderDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = salPreOrderDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = salPreOrderDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = salPreOrderDetailTable.goodsSpec;
  public static SqlColumn<Long> salUnitid = salPreOrderDetailTable.salUnitid;
  public static SqlColumn<String> salUnitCode = salPreOrderDetailTable.salUnitCode;
  public static SqlColumn<String> salUnitName = salPreOrderDetailTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salUnitRate = salPreOrderDetailTable.salUnitRate;
  public static SqlColumn<Long> basUnitId = salPreOrderDetailTable.basUnitId;
  public static SqlColumn<String> basUnitCode = salPreOrderDetailTable.basUnitCode;
  public static SqlColumn<String> basUnitName = salPreOrderDetailTable.basUnitName;
  public static SqlColumn<java.math.BigDecimal> maxOrderQty = salPreOrderDetailTable.maxOrderQty;
  public static SqlColumn<java.math.BigDecimal> minOrderQty = salPreOrderDetailTable.minOrderQty;
  public static SqlColumn<java.math.BigDecimal> price = salPreOrderDetailTable.price;
  public static SqlColumn<java.math.BigDecimal> totalAmt = salPreOrderDetailTable.totalAmt;
  public static SqlColumn<java.util.Date> preArrivalDate = salPreOrderDetailTable.preArrivalDate;
  public static SqlColumn<String> remark = salPreOrderDetailTable.remark;

  public static final class SalPreOrderDetailTable extends SqlTable {
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

    public final SqlColumn<Long> preOrderId = column("pre_order_id", JDBCType.BIGINT);
    public final SqlColumn<String> preOrderSeqno = column("pre_order_seqno", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> prePlanQty =
        column("pre_plan_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> auditQty = column("audit_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> invQty = column("inv_qty", JDBCType.DECIMAL);
    public final SqlColumn<Integer> detailStatus = column("detail_status", JDBCType.INTEGER);
    public final SqlColumn<Long> areaId = column("area_id", JDBCType.BIGINT);
    public final SqlColumn<String> areaCode = column("area_code", JDBCType.VARCHAR);
    public final SqlColumn<String> areaName = column("area_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsVarId = column("goods_var_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsVarName = column("goods_var_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> salUnitid = column("sal_unitid", JDBCType.BIGINT);
    public final SqlColumn<String> salUnitCode = column("sal_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salUnitName = column("sal_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salUnitRate =
        column("sal_unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> basUnitId = column("bas_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> basUnitCode = column("bas_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> basUnitName = column("bas_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> maxOrderQty =
        column("max_order_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> minOrderQty =
        column("min_order_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> price = column("price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> totalAmt = column("total_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.util.Date> preArrivalDate =
        column("pre_arrival_date", JDBCType.DATE);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public SalPreOrderDetailTable() {
      super("SalPreOrderDetail");
    }
  }
}
