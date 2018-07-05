package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 往来单位-01 主表定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgDynamicSqlSupport {

  public static BasOrgTable basOrgTable = new BasOrgTable();
  public static SqlColumn<Long> id = basOrgTable.id;
  public static SqlColumn<Long> deleted = basOrgTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgTable.version;
  public static SqlColumn<Integer> isCus = basOrgTable.isCus;
  public static SqlColumn<Integer> isOrg = basOrgTable.isOrg;
  public static SqlColumn<Integer> isVen = basOrgTable.isVen;
  public static SqlColumn<Integer> isOut = basOrgTable.isOut;
  public static SqlColumn<Integer> isDep = basOrgTable.isDep;
  public static SqlColumn<String> depCode = basOrgTable.depCode;
  public static SqlColumn<Long> depId = basOrgTable.depId;
  public static SqlColumn<String> depName = basOrgTable.depName;
  public static SqlColumn<Integer> isBal = basOrgTable.isBal;
  public static SqlColumn<Integer> isOrgGroup = basOrgTable.isOrgGroup;
  public static SqlColumn<Long> balOrgId = basOrgTable.balOrgId;
  public static SqlColumn<String> balOrgName = basOrgTable.balOrgName;
  public static SqlColumn<String> registerAddress = basOrgTable.registerAddress;
  public static SqlColumn<String> address = basOrgTable.address;
  public static SqlColumn<String> contactPerson = basOrgTable.contactPerson;
  public static SqlColumn<String> telephone = basOrgTable.telephone;
  public static SqlColumn<String> mobilephone = basOrgTable.mobilephone;
  public static SqlColumn<String> email = basOrgTable.email;
  public static SqlColumn<String> code = basOrgTable.code;
  public static SqlColumn<String> name = basOrgTable.name;
  public static SqlColumn<Long> entId = basOrgTable.entId;
  public static SqlColumn<Integer> isEnabled = basOrgTable.isEnabled;
  public static SqlColumn<String> remark = basOrgTable.remark;
  public static SqlColumn<String> searchWord = basOrgTable.searchWord;
  public static SqlColumn<Integer> showOrder = basOrgTable.showOrder;

  public static final class BasOrgTable extends SqlTable {
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

    public final SqlColumn<Integer> isCus = column("is_cus", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOrg = column("is_org", JDBCType.INTEGER);
    public final SqlColumn<Integer> isVen = column("is_ven", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOut = column("is_out", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDep = column("is_dep", JDBCType.INTEGER);
    public final SqlColumn<String> depCode = column("dep_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> depId = column("dep_id", JDBCType.BIGINT);
    public final SqlColumn<String> depName = column("dep_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isBal = column("is_bal", JDBCType.INTEGER);
    public final SqlColumn<Integer> isOrgGroup = column("is_org_group", JDBCType.INTEGER);
    public final SqlColumn<Long> balOrgId = column("bal_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> balOrgName = column("bal_org_name", JDBCType.VARCHAR);
    public final SqlColumn<String> registerAddress = column("register_address", JDBCType.VARCHAR);
    public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);
    public final SqlColumn<String> contactPerson = column("contact_person", JDBCType.VARCHAR);
    public final SqlColumn<String> telephone = column("telephone", JDBCType.VARCHAR);
    public final SqlColumn<String> mobilephone = column("mobilephone", JDBCType.VARCHAR);
    public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);
    public final SqlColumn<Integer> showOrder = column("show_order", JDBCType.INTEGER);

    public BasOrgTable() {
      super("BasOrg");
    }
  }
}
