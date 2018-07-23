package com.pagoda.domain.salconsignout.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsignout.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 发货出库异常记录表(每次出库异常插入新记录)实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignOutExceptionLogDynamicSqlSupport {

  public static SalConsignOutExceptionLogTable salConsignOutExceptionLogTable =
      new SalConsignOutExceptionLogTable();
  public static SqlColumn<Long> id = salConsignOutExceptionLogTable.id;
  public static SqlColumn<Long> deleted = salConsignOutExceptionLogTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignOutExceptionLogTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignOutExceptionLogTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignOutExceptionLogTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignOutExceptionLogTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignOutExceptionLogTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignOutExceptionLogTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignOutExceptionLogTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignOutExceptionLogTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignOutExceptionLogTable.version;
  public static SqlColumn<Long> stockoutId = salConsignOutExceptionLogTable.stockoutId;
  public static SqlColumn<String> stockoutSeqno = salConsignOutExceptionLogTable.stockoutSeqno;
  public static SqlColumn<Long> conId = salConsignOutExceptionLogTable.conId;
  public static SqlColumn<String> conSeqno = salConsignOutExceptionLogTable.conSeqno;
  public static SqlColumn<Long> orderId = salConsignOutExceptionLogTable.orderId;
  public static SqlColumn<String> orderSeqno = salConsignOutExceptionLogTable.orderSeqno;
  public static SqlColumn<Long> entId = salConsignOutExceptionLogTable.entId;
  public static SqlColumn<Long> goodsId = salConsignOutExceptionLogTable.goodsId;
  public static SqlColumn<String> goodsCode = salConsignOutExceptionLogTable.goodsCode;
  public static SqlColumn<String> goodsSpec = salConsignOutExceptionLogTable.goodsSpec;
  public static SqlColumn<Long> salUnitId = salConsignOutExceptionLogTable.salUnitId;
  public static SqlColumn<String> salUnitCode = salConsignOutExceptionLogTable.salUnitCode;
  public static SqlColumn<String> salUnitName = salConsignOutExceptionLogTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salUnitRate =
      salConsignOutExceptionLogTable.salUnitRate;
  public static SqlColumn<Long> salConOutDepotId = salConsignOutExceptionLogTable.salConOutDepotId;
  public static SqlColumn<String> salConOutDepotCode =
      salConsignOutExceptionLogTable.salConOutDepotCode;
  public static SqlColumn<String> salConOutDepotName =
      salConsignOutExceptionLogTable.salConOutDepotName;
  public static SqlColumn<java.math.BigDecimal> shippedQty =
      salConsignOutExceptionLogTable.shippedQty;
  public static SqlColumn<java.math.BigDecimal> shippedNetWeight =
      salConsignOutExceptionLogTable.shippedNetWeight;
  public static SqlColumn<java.math.BigDecimal> shippedGrossWeight =
      salConsignOutExceptionLogTable.shippedGrossWeight;
  public static SqlColumn<java.math.BigDecimal> shippedVolume =
      salConsignOutExceptionLogTable.shippedVolume;
  public static SqlColumn<java.math.BigDecimal> price = salConsignOutExceptionLogTable.price;
  public static SqlColumn<java.math.BigDecimal> amount = salConsignOutExceptionLogTable.amount;
  public static SqlColumn<Integer> shipSeq = salConsignOutExceptionLogTable.shipSeq;
  public static SqlColumn<java.util.Date> consignTime = salConsignOutExceptionLogTable.consignTime;
  public static SqlColumn<Long> consignerId = salConsignOutExceptionLogTable.consignerId;
  public static SqlColumn<String> consignerName = salConsignOutExceptionLogTable.consignerName;
  public static SqlColumn<Integer> stockoutStatus = salConsignOutExceptionLogTable.stockoutStatus;
  public static SqlColumn<java.util.Date> auditTime = salConsignOutExceptionLogTable.auditTime;
  public static SqlColumn<String> auditorCode = salConsignOutExceptionLogTable.auditorCode;
  public static SqlColumn<String> auditorName = salConsignOutExceptionLogTable.auditorName;
  public static SqlColumn<String> remark = salConsignOutExceptionLogTable.remark;
  public static SqlColumn<String> note = salConsignOutExceptionLogTable.note;

  public static final class SalConsignOutExceptionLogTable extends SqlTable {
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

    public final SqlColumn<Long> stockoutId = column("stockout_id", JDBCType.BIGINT);
    public final SqlColumn<String> stockoutSeqno = column("stockout_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> conId = column("con_id", JDBCType.BIGINT);
    public final SqlColumn<String> conSeqno = column("con_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);
    public final SqlColumn<String> orderSeqno = column("order_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> salUnitId = column("sal_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> salUnitCode = column("sal_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salUnitName = column("sal_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salUnitRate =
        column("sal_unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> salConOutDepotId = column("sal_con_out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> salConOutDepotCode =
        column("sal_con_out_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salConOutDepotName =
        column("sal_con_out_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> shippedQty =
        column("shipped_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedNetWeight =
        column("shipped_net_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedGrossWeight =
        column("shipped_gross_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedVolume =
        column("shipped_volume", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> price = column("price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> amount = column("amount", JDBCType.DECIMAL);
    public final SqlColumn<Integer> shipSeq = column("ship_seq", JDBCType.INTEGER);
    public final SqlColumn<java.util.Date> consignTime = column("consign_time", JDBCType.DATE);
    public final SqlColumn<Long> consignerId = column("consigner_id", JDBCType.BIGINT);
    public final SqlColumn<String> consignerName = column("consigner_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> stockoutStatus = column("stockout_status", JDBCType.INTEGER);
    public final SqlColumn<java.util.Date> auditTime = column("audit_time", JDBCType.DATE);
    public final SqlColumn<String> auditorCode = column("auditor_code", JDBCType.VARCHAR);
    public final SqlColumn<String> auditorName = column("auditor_name", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

    public SalConsignOutExceptionLogTable() {
      super("SalConsignOutExceptionLog");
    }
  }
}
