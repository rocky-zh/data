package com.pagoda.domain.purorder.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.purorder.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 采购订单头表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrderHeadDynamicSqlSupport {

  public static PurOrderHeadTable purOrderHeadTable = new PurOrderHeadTable();
  public static SqlColumn<Long> id = purOrderHeadTable.id;
  public static SqlColumn<Long> deleted = purOrderHeadTable.deleted;
  public static SqlColumn<Date> createdAt = purOrderHeadTable.createdAt;
  public static SqlColumn<String> creatorCode = purOrderHeadTable.creatorCode;
  public static SqlColumn<String> creatorName = purOrderHeadTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = purOrderHeadTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = purOrderHeadTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = purOrderHeadTable.modifierCode;
  public static SqlColumn<String> modifierName = purOrderHeadTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = purOrderHeadTable.modifierOrgCode;
  public static SqlColumn<Integer> version = purOrderHeadTable.version;
  public static SqlColumn<Long> entId = purOrderHeadTable.entId;
  public static SqlColumn<String> seqno = purOrderHeadTable.seqno;
  public static SqlColumn<Long> venOrgId = purOrderHeadTable.venOrgId;
  public static SqlColumn<String> venOrgCode = purOrderHeadTable.venOrgCode;
  public static SqlColumn<String> venOrgName = purOrderHeadTable.venOrgName;
  public static SqlColumn<Integer> venComfirmStatus = purOrderHeadTable.venComfirmStatus;
  public static SqlColumn<String> venComfirmUserCode = purOrderHeadTable.venComfirmUserCode;
  public static SqlColumn<String> venComfirmUserName = purOrderHeadTable.venComfirmUserName;
  public static SqlColumn<Integer> orderStatus = purOrderHeadTable.orderStatus;
  public static SqlColumn<java.util.Date> planRecDate = purOrderHeadTable.planRecDate;
  public static SqlColumn<String> auditorCode = purOrderHeadTable.auditorCode;
  public static SqlColumn<String> auditorName = purOrderHeadTable.auditorName;
  public static SqlColumn<java.util.Date> auditTime = purOrderHeadTable.auditTime;
  public static SqlColumn<Integer> bpmnStatus = purOrderHeadTable.bpmnStatus;
  public static SqlColumn<String> bpmnRemark = purOrderHeadTable.bpmnRemark;

  public static final class PurOrderHeadTable extends SqlTable {
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

    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<String> seqno = column("seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> venOrgId = column("ven_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> venOrgCode = column("ven_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> venOrgName = column("ven_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> venComfirmStatus =
        column("ven_comfirm_status", JDBCType.INTEGER);
    public final SqlColumn<String> venComfirmUserCode =
        column("ven_comfirm_user_code", JDBCType.VARCHAR);
    public final SqlColumn<String> venComfirmUserName =
        column("ven_comfirm_user_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> orderStatus = column("order_status", JDBCType.INTEGER);
    public final SqlColumn<java.util.Date> planRecDate = column("plan_rec_date", JDBCType.DATE);
    public final SqlColumn<String> auditorCode = column("auditor_code", JDBCType.VARCHAR);
    public final SqlColumn<String> auditorName = column("auditor_name", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> auditTime = column("audit_time", JDBCType.DATE);
    public final SqlColumn<Integer> bpmnStatus = column("bpmn_status", JDBCType.INTEGER);
    public final SqlColumn<String> bpmnRemark = column("bpmn_remark", JDBCType.VARCHAR);

    public PurOrderHeadTable() {
      super("PurOrderHead");
    }
  }
}
