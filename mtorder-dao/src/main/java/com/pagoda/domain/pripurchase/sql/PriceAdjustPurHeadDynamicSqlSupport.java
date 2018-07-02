package com.pagoda.domain.pripurchase.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.pripurchase.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 采购调价单头实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustPurHeadDynamicSqlSupport {

  public static PriceAdjustPurHeadTable priceAdjustPurHeadTable = new PriceAdjustPurHeadTable();
  public static SqlColumn<Long> id = priceAdjustPurHeadTable.id;
  public static SqlColumn<Long> deleted = priceAdjustPurHeadTable.deleted;
  public static SqlColumn<Date> createdAt = priceAdjustPurHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = priceAdjustPurHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = priceAdjustPurHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceAdjustPurHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceAdjustPurHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceAdjustPurHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = priceAdjustPurHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceAdjustPurHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceAdjustPurHeadTable.version;
  public static SqlColumn<String> seqno = priceAdjustPurHeadTable.seqno;
  public static SqlColumn<Long> entId = priceAdjustPurHeadTable.entId;
  public static SqlColumn<Long> arrOrgId = priceAdjustPurHeadTable.arrOrgId;
  public static SqlColumn<String> arrOrgCode = priceAdjustPurHeadTable.arrOrgCode;
  public static SqlColumn<String> arrOrgName = priceAdjustPurHeadTable.arrOrgName;
  public static SqlColumn<Long> venOrgId = priceAdjustPurHeadTable.venOrgId;
  public static SqlColumn<String> venOrgCode = priceAdjustPurHeadTable.venOrgCode;
  public static SqlColumn<Integer> status = priceAdjustPurHeadTable.status;
  public static SqlColumn<java.sql.Timestamp> entryTime = priceAdjustPurHeadTable.entryTime;
  public static SqlColumn<java.util.Date> effectDate = priceAdjustPurHeadTable.effectDate;
  public static SqlColumn<String> auditorCode = priceAdjustPurHeadTable.auditorCode;
  public static SqlColumn<String> auditorName = priceAdjustPurHeadTable.auditorName;
  public static SqlColumn<String> remark = priceAdjustPurHeadTable.remark;
  public static SqlColumn<java.sql.Timestamp> auditTime = priceAdjustPurHeadTable.auditTime;
  public static SqlColumn<String> note = priceAdjustPurHeadTable.note;

  public static final class PriceAdjustPurHeadTable extends SqlTable {
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

    public final SqlColumn<String> seqno = column("seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> arrOrgId = column("arr_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> arrOrgCode = column("arr_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> arrOrgName = column("arr_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> venOrgId = column("ven_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> venOrgCode = column("ven_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Timestamp> entryTime = column("entry_time", JDBCType.TIMESTAMP);
    public final SqlColumn<java.util.Date> effectDate = column("effect_date", JDBCType.DATE);
    public final SqlColumn<String> auditorCode = column("auditor_code", JDBCType.VARCHAR);
    public final SqlColumn<String> auditorName = column("auditor_name", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<java.sql.Timestamp> auditTime = column("audit_time", JDBCType.TIMESTAMP);
    public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

    public PriceAdjustPurHeadTable() {
      super("PriceAdjustPurHead");
    }
  }
}
