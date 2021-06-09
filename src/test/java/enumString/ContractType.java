package enumString;

public enum ContractType {
    // 主合同类型枚举

    MAIN_TYPE("主合同"),
    SUB_TYPE("分包合同"),
    PURCHASES_TYPE("采购合同"),
    RENT_TYPE("租赁合同"),
    QUERY_TYPE("咨询合同"),
    OTHER_TYPE("其他合同"),
    ;
    public String contractType;
    ContractType(String value){
        this.contractType = value;
    }
}
