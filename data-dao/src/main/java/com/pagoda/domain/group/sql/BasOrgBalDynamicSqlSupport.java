package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 结算机构明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgBalDynamicSqlSupport {

  public static BasOrgBalTable basOrgBalTable = new BasOrgBalTable();
  public static SqlColumn<Long> id = basOrgBalTable.id;
  public static SqlColumn<Long> deleted = basOrgBalTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgBalTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgBalTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgBalTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgBalTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgBalTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgBalTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgBalTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgBalTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgBalTable.version;
  public static SqlColumn<String> billAddress = basOrgBalTable.billAddress;
  public static SqlColumn<String> billName = basOrgBalTable.billName;
  public static SqlColumn<String> billTelephone = basOrgBalTable.billTelephone;
  public static SqlColumn<Integer> isDetailPrior = basOrgBalTable.isDetailPrior;
  public static SqlColumn<Integer> isGoodsPrior = basOrgBalTable.isGoodsPrior;
  public static SqlColumn<String> legalPerson = basOrgBalTable.legalPerson;
  public static SqlColumn<java.math.BigDecimal> maxBillAmt = basOrgBalTable.maxBillAmt;
  public static SqlColumn<Long> orgId = basOrgBalTable.orgId;
  public static SqlColumn<Integer> orgProperty = basOrgBalTable.orgProperty;
  public static SqlColumn<String> taxNumber = basOrgBalTable.taxNumber;
  public static SqlColumn<Boolean> active = basOrgBalTable.active;
  public static SqlColumn<Boolean> enabled = basOrgBalTable.enabled;

  public static final class BasOrgBalTable extends SqlTable {
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

    public final SqlColumn<String> billAddress = column("bill_address", JDBCType.VARCHAR);
    public final SqlColumn<String> billName = column("bill_name", JDBCType.VARCHAR);
    public final SqlColumn<String> billTelephone = column("bill_telephone", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isDetailPrior = column("is_detail_prior", JDBCType.INTEGER);
    public final SqlColumn<Integer> isGoodsPrior = column("is_goods_prior", JDBCType.INTEGER);
    public final SqlColumn<String> legalPerson = column("legal_person", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> maxBillAmt =
        column("max_bill_amt", JDBCType.DECIMAL);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> orgProperty = column("org_property", JDBCType.INTEGER);
    public final SqlColumn<String> taxNumber = column("tax_number", JDBCType.VARCHAR);
    public final SqlColumn<Boolean> active = column("active", JDBCType.BOOLEAN);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);

    public BasOrgBalTable() {
      super("BasOrgBal");
    }
  }
}
