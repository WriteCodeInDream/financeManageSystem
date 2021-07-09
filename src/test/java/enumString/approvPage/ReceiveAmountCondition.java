package enumString.approvPage;

public enum ReceiveAmountCondition {
    // 收款查询条件
    SOURCE, // 来源
    CONTRACT_TYPE, // 主合同类型
    CONTRACT_NUMBER, // 主合同编号
    PROJECT_NAME, // 项目名称
    CONTRACT_AMOUNT_BEGIN, // 主合同金额左区间
    CONTRACT_AMOUNT_END, // 主合同金额右区间
    CURRENT_AMOUNT_BEGIN, // 本次开票结算收款金额左区间
    CURRENT_AMOUNT_END, // 本次开票结算收款金额右区间
    SETTLEMENT_NAME, // 收款方
    CURRENT_TIME_BEGIN, // 本次开票结算收款时间左区间
    CURRENT_TIME_END, // 本次开票结算收款时间右区间
    SETTLEMENT_TOTAL_BEGIN, // 累计结算金额左区间
    SETTLEMENT_TOTAL_END, // 累计结算金额右区间
    INVOICE_TOTAL_BEGIN, // 累计开票金额左区间
    INVOICE_TOTAL_END, // 累计开票金额右区间
    RECEIVE_TOTAL_BEGIN, // 累计收款金额左区间
    RECEIVE_TOTAL_END, // 累计收款金额右区间
    CREATE_DEPT, // 申请部门
    CREATE_NAME, // 申请人
    CREATE_TIME_BEGIN, // 提交时间开始
    CREATE_TIME_END, // 提交时间结束
}
