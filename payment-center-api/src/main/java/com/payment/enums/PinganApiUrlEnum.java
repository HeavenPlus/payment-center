package com.payment.enums;

/**
 * @author Heaven
 * @date 2024/9/19 15:22
 */
public enum PinganApiUrlEnum {
    IFTRUSTQUERY("/V1.0/bedl/UnderLinkAcctListAndBsnQuery", "400103,托管账号查询","pinganApiService.ifTrustQuery"),
    CREATERELATIONSHIP("/V1.0/bedl/SubAcctMaintenance", "BEDL_C002,创建清分台账编码","pinganApiService.createRelationship"),
    UPDATERELATIONSHIP("/V1.0/bedl/SubAcctMaintenance", "BEDL_C002,修改清分台账编码","pinganApiService.updateRelationship"),
    QUERYRELATIONSHIP("/V1.0/bedl/PrimaryAcctRelationshipQuery", "BEDL_C001,查询智能账号信息 以及下属的清分台账编码","pinganApiService.queryRelationship"),
    QUERYREMAININGSUM("/V1.0/bedl/SubAccountBalanceQuery", "BEDL_C008,查询清分台账编码余额","pinganApiService.queryRemainingSum"),
    TRANSFERACCOUNTS("/V1.0/bedl/CorSingleTransfer", "BEDL_4004,转账","pinganApiService.transferAccounts"),
    SUBACCTBALANCEADJUST("/V1.0/bedl/SubAcctBalanceAdjust", "BEDL_C005,清分台账编码余额调整","pinganApiService.subAcctBalanceAdjust"),
    CORSINGLETRANSFERQUERY("/V1.0/bedl/CorSingleTransferQuery", "BEDL_4005,查询转账结果","pinganApiService.corSingleTransferQuery"),
    DOWNLOADFILE("V1.0/bedl/QueryInterfaceOfPDFReturnSingleFileOnSameDayNew", "查询电子回单","pinganApiService.downloadFile"),
    DOWNLOADFILEHOSITRY("V1.0/bedl/SameDayHistoryReceiptDataQuery", "查询历史电子回单-ELC009","pinganApiService.downloadFileHistory"),
    DOWNLOADFILEHOSITRYQUERYFILE("V1.0/bedl/SingleOrBatchReceiptPDFMergeDownloadNew", "查询历史电子回单-BEDL_ELCP10(需要搭配009一起才能使用)","pinganApiService.downloadFileHistory"),
    CORACCTBALANCEQUERY("V1.0/bedl/CorAcctBalanceQuery", "BEDL_4001,查询转账结果","pinganApiService.CorAcctBalanceQuery"),
    send("/", "通用发送接口","pinganApiService.send"),
    PRIMARY_ACCT_DETAIL_QUERY("/V1.0/bedl/PrimaryAcctDetialQuery", "BEDL_C006,智能清分台帐编码近期明细查询","pinganApiService.primaryAcctDetialQuery"),
    MAIN_TAINTRANSFER_COUNTERPARTY_WHITE_LIST("/V1.0/bedl/MaintainTransferCounterpartyWhiteList", "BEDL_C011,白名单维护","pinganApiService.maintainTransferCounterpartyWhiteList");

    private final String apiUrl;
    private final String text;
    private final String localUrl;

    PinganApiUrlEnum(String apiUrl, String text,String localUrl) {
        this.apiUrl = apiUrl;
        this.text = text;
        this.localUrl = localUrl;
    }
    public String getText() {
        return text;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public String getLocalUrl() {
        return localUrl;
    }
}
