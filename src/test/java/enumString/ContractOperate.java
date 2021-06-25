package enumString;

public enum ContractOperate {
    // 主合同操作枚举

    VIEW_CONTRACT("查看主合同"),
    UPDATE_CONTRACT("编辑主合同"),
    DELETE_CONTRACT("删除主合同"),
    ADD_SETTLEMENT_AMOUNT("新增结算"),
    ADD_INVOICE_AMOUNT("新增开票"),
    ADD_RECEIVE_AMOUNT("新增收款"),
    ADD_COMPLETE_INFO("新增完工情况"),
    ADD_CONTRACT_BUDGET("新增合同预算"),
    VIEW_CONTRACT_BUDGET("查看合同预算"),
    EDIT_CONTRACT_BUDGET("编辑合同预算"),
    ADD_CONTRACT_PAYMENT("新增合同付款"),
    VIEW_CONTRACT_PAYMENT("查看合同付款"),
    VIEW_RELATIVE_CONTRACT("查看关联合同"),
    VIEW_RELATIVE_INFO("查看综合信息"),
    ;
    public String contractOperate;
    ContractOperate(String co){
        this.contractOperate = co;
    }


}
