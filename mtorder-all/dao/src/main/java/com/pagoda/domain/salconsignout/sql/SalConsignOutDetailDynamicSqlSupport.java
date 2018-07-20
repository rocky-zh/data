package com.pagoda.domain.salconsignout.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsignout.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 发货出库单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignOutDetailDynamicSqlSupport {

  public static SalConsignOutDetailTable salConsignOutDetailTable = new SalConsignOutDetailTable();
  public static SqlColumn<Long> id = salConsignOutDetailTable.id;
  public static SqlColumn<Long> deleted = salConsignOutDetailTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignOutDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignOutDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignOutDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignOutDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignOutDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignOutDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignOutDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignOutDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignOutDetailTable.version;
  public static SqlColumn<Long> stockoutId = salConsignOutDetailTable.stockoutId;
  public static SqlColumn<String> stockoutSeqno = salConsignOutDetailTable.stockoutSeqno;
  public static SqlColumn<Long> conId = salConsignOutDetailTable.conId;
  public static SqlColumn<String> conSeqno = salConsignOutDetailTable.conSeqno;
  public static SqlColumn<Long> orderId = salConsignOutDetailTable.orderId;
  public static SqlColumn<String> orderSeqno = salConsignOutDetailTable.orderSeqno;
  public static SqlColumn<Long> entId = salConsignOutDetailTable.entId;
  public static SqlColumn<Long> goodsId = salConsignOutDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = salConsignOutDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = salConsignOutDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = salConsignOutDetailTable.goodsSpec;
  public static SqlColumn<Long> salUnitId = salConsignOutDetailTable.salUnitId;
  public static SqlColumn<String> salUnitCode = salConsignOutDetailTable.salUnitCode;
  public static SqlColumn<String> salUnitName = salConsignOutDetailTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salUnitRate = salConsignOutDetailTable.salUnitRate;
  public static SqlColumn<Long> salConOutDepotId = salConsignOutDetailTable.salConOutDepotId;
  public static SqlColumn<String> salConOutDepotCode = salConsignOutDetailTable.salConOutDepotCode;
  public static SqlColumn<String> salConOutDepotName = salConsignOutDetailTable.salConOutDepotName;
  public static SqlColumn<java.math.BigDecimal> shippedQty = salConsignOutDetailTable.shippedQty;
  public static SqlColumn<java.math.BigDecimal> shippedNetWeight =
      salConsignOutDetailTable.shippedNetWeight;
  public static SqlColumn<java.math.BigDecimal> shippedGrossWeight =
      salConsignOutDetailTable.shippedGrossWeight;
  public static SqlColumn<java.math.BigDecimal> shippedVolume =
      salConsignOutDetailTable.shippedVolume;
  public static SqlColumn<java.math.BigDecimal> shippedPrice =
      salConsignOutDetailTable.shippedPrice;
  public static SqlColumn<java.math.BigDecimal> shippedAmt = salConsignOutDetailTable.shippedAmt;
  public static SqlColumn<java.math.BigDecimal> taxRate = salConsignOutDetailTable.taxRate;
  public static SqlColumn<java.math.BigDecimal> taxAmt = salConsignOutDetailTable.taxAmt;
  public static SqlColumn<Integer> shipSeq = salConsignOutDetailTable.shipSeq;
  public static SqlColumn<java.util.Date> consignTime = salConsignOutDetailTable.consignTime;
  public static SqlColumn<Long> consignerId = salConsignOutDetailTable.consignerId;
  public static SqlColumn<String> consignerName = salConsignOutDetailTable.consignerName;
  public static SqlColumn<Integer> stockoutStatus = salConsignOutDetailTable.stockoutStatus;
  public static SqlColumn<java.util.Date> auditTime = salConsignOutDetailTable.auditTime;
  public static SqlColumn<String> auditorCode = salConsignOutDetailTable.auditorCode;
  public static SqlColumn<String> auditorName = salConsignOutDetailTable.auditorName;
  public static SqlColumn<String> remark = salConsignOutDetailTable.remark;
  public static SqlColumn<String> note = salConsignOutDetailTable.note;

  public static final class SalConsignOutDetailTable extends SqlTable {
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
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
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
    public final SqlColumn<java.math.BigDecimal> shippedPrice =
        column("shipped_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> shippedAmt =
        column("shipped_amt", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxAmt = column("tax_amt", JDBCType.DECIMAL);
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

    public SalConsignOutDetailTable() {
      super("SalConsignOutDetail");
    }
  }
}
