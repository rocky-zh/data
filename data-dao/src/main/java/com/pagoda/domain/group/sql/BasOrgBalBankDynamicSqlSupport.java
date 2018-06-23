package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 结算机构开户行表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgBalBankDynamicSqlSupport {

  public static BasOrgBalBankTable basOrgBalBankTable = new BasOrgBalBankTable();
  public static SqlColumn<Long> id = basOrgBalBankTable.id;
  public static SqlColumn<Long> deleted = basOrgBalBankTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgBalBankTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgBalBankTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgBalBankTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgBalBankTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgBalBankTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgBalBankTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgBalBankTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgBalBankTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgBalBankTable.version;
  public static SqlColumn<String> accountName = basOrgBalBankTable.accountName;
  public static SqlColumn<String> bank = basOrgBalBankTable.bank;
  public static SqlColumn<String> bankAccountNo = basOrgBalBankTable.bankAccountNo;
  public static SqlColumn<String> cityCode = basOrgBalBankTable.cityCode;
  public static SqlColumn<String> cityName = basOrgBalBankTable.cityName;
  public static SqlColumn<String> provinceCode = basOrgBalBankTable.provinceCode;
  public static SqlColumn<String> provinceName = basOrgBalBankTable.provinceName;
  public static SqlColumn<String> registerBank = basOrgBalBankTable.registerBank;
  public static SqlColumn<Boolean> active = basOrgBalBankTable.active;

  public static final class BasOrgBalBankTable extends SqlTable {
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

    public final SqlColumn<String> accountName = column("account_name", JDBCType.VARCHAR);
    public final SqlColumn<String> bank = column("bank", JDBCType.VARCHAR);
    public final SqlColumn<String> bankAccountNo = column("bank_account_no", JDBCType.VARCHAR);
    public final SqlColumn<String> cityCode = column("city_code", JDBCType.VARCHAR);
    public final SqlColumn<String> cityName = column("city_name", JDBCType.VARCHAR);
    public final SqlColumn<String> provinceCode = column("province_code", JDBCType.VARCHAR);
    public final SqlColumn<String> provinceName = column("province_name", JDBCType.VARCHAR);
    public final SqlColumn<String> registerBank = column("register_bank", JDBCType.VARCHAR);
    public final SqlColumn<Boolean> active = column("active", JDBCType.BOOLEAN);

    public BasOrgBalBankTable() {
      super("BasOrgBalBank");
    }
  }
}
