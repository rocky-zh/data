package com.pagoda.domain.pridistribution.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.pridistribution.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 配送价调价单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustSalHeadDynamicSqlSupport {

  public static PriceAdjustSalHeadTable priceAdjustSalHeadTable = new PriceAdjustSalHeadTable();
  public static SqlColumn<Long> id = priceAdjustSalHeadTable.id;
  public static SqlColumn<Long> deleted = priceAdjustSalHeadTable.deleted;
  public static SqlColumn<Date> createdAt = priceAdjustSalHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = priceAdjustSalHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = priceAdjustSalHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceAdjustSalHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceAdjustSalHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceAdjustSalHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = priceAdjustSalHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceAdjustSalHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceAdjustSalHeadTable.version;
  public static SqlColumn<String> seqno = priceAdjustSalHeadTable.seqno;
  public static SqlColumn<Long> entId = priceAdjustSalHeadTable.entId;
  public static SqlColumn<String> priceCatName = priceAdjustSalHeadTable.priceCatName;
  public static SqlColumn<String> priceCatCode = priceAdjustSalHeadTable.priceCatCode;
  public static SqlColumn<Long> priceCatId = priceAdjustSalHeadTable.priceCatId;
  public static SqlColumn<Integer> status = priceAdjustSalHeadTable.status;
  public static SqlColumn<java.sql.Timestamp> entryTime = priceAdjustSalHeadTable.entryTime;
  public static SqlColumn<java.util.Date> effectDate = priceAdjustSalHeadTable.effectDate;
  public static SqlColumn<java.sql.Timestamp> auditTime = priceAdjustSalHeadTable.auditTime;
  public static SqlColumn<String> auditorCode = priceAdjustSalHeadTable.auditorCode;
  public static SqlColumn<String> auditorName = priceAdjustSalHeadTable.auditorName;
  public static SqlColumn<String> remark = priceAdjustSalHeadTable.remark;
  public static SqlColumn<String> note = priceAdjustSalHeadTable.note;

  public static final class PriceAdjustSalHeadTable extends SqlTable {
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
    public final SqlColumn<String> priceCatName = column("price_cat_name", JDBCType.VARCHAR);
    public final SqlColumn<String> priceCatCode = column("price_cat_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> priceCatId = column("price_cat_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);
    public final SqlColumn<java.sql.Timestamp> entryTime = column("entry_time", JDBCType.TIMESTAMP);
    public final SqlColumn<java.util.Date> effectDate = column("effect_date", JDBCType.DATE);
    public final SqlColumn<java.sql.Timestamp> auditTime = column("audit_time", JDBCType.TIMESTAMP);
    public final SqlColumn<String> auditorCode = column("auditor_code", JDBCType.VARCHAR);
    public final SqlColumn<String> auditorName = column("auditor_name", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

    public PriceAdjustSalHeadTable() {
      super("PriceAdjustSalHead");
    }
  }
}
