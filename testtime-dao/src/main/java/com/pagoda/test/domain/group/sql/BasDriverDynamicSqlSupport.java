package com.pagoda.test.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 司机定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasDriverDynamicSqlSupport {

  public static BasDriverTable basDriverTable = new BasDriverTable();
  public static SqlColumn<Long> id = basDriverTable.id;
  public static SqlColumn<Long> deleted = basDriverTable.deleted;
  public static SqlColumn<Date> createdAt = basDriverTable.createdAt;
  public static SqlColumn<String> creatorCode = basDriverTable.creatorCode;
  public static SqlColumn<String> creatorName = basDriverTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basDriverTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basDriverTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basDriverTable.modifierCode;
  public static SqlColumn<String> modifierName = basDriverTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basDriverTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basDriverTable.version;
  public static SqlColumn<String> code = basDriverTable.code;
  public static SqlColumn<String> name = basDriverTable.name;
  public static SqlColumn<String> mobile = basDriverTable.mobile;
  public static SqlColumn<String> shortNum = basDriverTable.shortNum;
  public static SqlColumn<String> plateNum = basDriverTable.plateNum;
  public static SqlColumn<java.math.BigDecimal> loadingWeight = basDriverTable.loadingWeight;
  public static SqlColumn<java.math.BigDecimal> loadingVolume = basDriverTable.loadingVolume;
  public static SqlColumn<String> payAcountNo = basDriverTable.payAcountNo;
  public static SqlColumn<String> registeBank = basDriverTable.registeBank;
  public static SqlColumn<String> driverIdNumber = basDriverTable.driverIdNumber;
  public static SqlColumn<String> conOrgCode = basDriverTable.conOrgCode;
  public static SqlColumn<String> conOrgName = basDriverTable.conOrgName;
  public static SqlColumn<Integer> enabled = basDriverTable.enabled;
  public static SqlColumn<String> remark = basDriverTable.remark;

  public static final class BasDriverTable extends SqlTable {
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

    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);
    public final SqlColumn<String> shortNum = column("short_num", JDBCType.VARCHAR);
    public final SqlColumn<String> plateNum = column("plate_num", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> loadingWeight =
        column("loading_weight", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> loadingVolume =
        column("loading_volume", JDBCType.DECIMAL);
    public final SqlColumn<String> payAcountNo = column("pay_acount_no", JDBCType.VARCHAR);
    public final SqlColumn<String> registeBank = column("registe_bank", JDBCType.VARCHAR);
    public final SqlColumn<String> driverIdNumber = column("driver_id_number", JDBCType.VARCHAR);
    public final SqlColumn<String> conOrgCode = column("con_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> conOrgName = column("con_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> enabled = column("enabled", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public BasDriverTable() {
      super("BasDriver");
    }
  }
}
