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
  public static SqlColumn<Long> salUnitId = salConsignOutDetailTable.salUnitId;
  public static SqlColumn<Integer> shipSeq = salConsignOutDetailTable.shipSeq;
  public static SqlColumn<java.sql.Timestamp> consignTime = salConsignOutDetailTable.consignTime;
  public static SqlColumn<Long> consignerId = salConsignOutDetailTable.consignerId;
  public static SqlColumn<String> consignerName = salConsignOutDetailTable.consignerName;
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
    public final SqlColumn<Long> salUnitId = column("sal_unit_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> shipSeq = column("ship_seq", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Timestamp> consignTime =
        column("consign_time", JDBCType.TIMESTAMP);
    public final SqlColumn<Long> consignerId = column("consigner_id", JDBCType.BIGINT);
    public final SqlColumn<String> consignerName = column("consigner_name", JDBCType.VARCHAR);
    public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

    public SalConsignOutDetailTable() {
      super("SalConsignOutDetail");
    }
  }
}
