package cn.com.dhc.ec.rpc.product.vo;

import java.util.Date;
public class ContractBasicVO {

    /** 合同基本信息ID 2211*/
    private Long id ;
    /** 合作意向单编号 */
    private Long cooperationBasicId ;
    /** 供应商名称 */
    private String venderName ;
    /** 供应商编码 */
    private String venderCode ;
    /** 合作部门 */
    private String joinDept ;
    /** 主要品牌 */
    private String mainBrand ;
    /** 甲方 */
    private String firstParty ;
    /** 合作方式 */
    private Integer cooperationModes ;
    /** 合作区域 */
    private Integer cooperationArea ;
    /** 公司地址 */
    private String companyAddress ;
    /** 创建人 */
    private String createUser ;
    /** 创建时间 */
    private Date createDate ;
    /** 更新人 */
    private String modifyUser ;
    /** 更新时间 */
    private Date modifyDate ;

    /** 合同基本信息ID */
    public Long getId(){
        return this.id;
    }
    /** 合同基本信息ID */
    public void setId(Long id){
        this.id = id;
    }
    /** 合作意向单编号 */
    public Long getCooperationBasicId(){
        return this.cooperationBasicId;
    }
    /** 合作意向单编号 */
    public void setCooperationBasicId(Long cooperationBasicId){
        this.cooperationBasicId = cooperationBasicId;
    }
    /** 供应商名称 */
    public String getVenderName(){
        return this.venderName;
    }
    /** 供应商名称 */
    public void setVenderName(String venderName){
        this.venderName = venderName;
    }
    /** 供应商编码 */
    public String getVenderCode(){
        return this.venderCode;
    }
    /** 供应商编码 */
    public void setVenderCode(String venderCode){
        this.venderCode = venderCode;
    }
    /** 合作部门 */
    public String getJoinDept(){
        return this.joinDept;
    }
    /** 合作部门 */
    public void setJoinDept(String joinDept){
        this.joinDept = joinDept;
    }
    /** 主要品牌 */
    public String getMainBrand(){
        return this.mainBrand;
    }
    /** 主要品牌 */
    public void setMainBrand(String mainBrand){
        this.mainBrand = mainBrand;
    }
    /** 甲方 */
    public String getFirstParty(){
        return this.firstParty;
    }
    /** 甲方 */
    public void setFirstParty(String firstParty){
        this.firstParty = firstParty;
    }
    /** 合作方式 */
    public Integer getCooperationModes(){
        return this.cooperationModes;
    }
    /** 合作方式 */
    public void setCooperationModes(Integer cooperationModes){
        this.cooperationModes = cooperationModes;
    }
    /** 合作区域 */
    public Integer getCooperationArea(){
        return this.cooperationArea;
    }
    /** 合作区域 */
    public void setCooperationArea(Integer cooperationArea){
        this.cooperationArea = cooperationArea;
    }
    /** 公司地址 */
    public String getCompanyAddress(){
        return this.companyAddress;
    }
    /** 公司地址 */
    public void setCompanyAddress(String companyAddress){
        this.companyAddress = companyAddress;
    }
    /** 创建人 */
    public String getCreateUser(){
        return this.createUser;
    }
    /** 创建人 */
    public void setCreateUser(String createUser){
        this.createUser = createUser;
    }
    /** 创建时间 */
    public Date getCreateDate(){
        return this.createDate;
    }
    /** 创建时间 */
    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }
    /** 更新人 */
    public String getModifyUser(){
        return this.modifyUser;
    }
    /** 更新人 */
    public void setModifyUser(String modifyUser){
        this.modifyUser = modifyUser;
    }
    /** 更新时间 */
    public Date getModifyDate(){
        return this.modifyDate;
    }
    /** 更新时间 */
    public void setModifyDate(Date modifyDate){
        this.modifyDate = modifyDate;
    }












    /** 上年度销售（含税） */
    private String lastYearSalesIndTax ;
    /** 上年度销售毛利率(含税) */
    private String lastYearSalesGrossIndTax ;
    /** 上年度结算账期 */
    private String lastYearSettlementPaym ;
    /** 上年度目标返利第一坎(进货额百分比(含税)) */
    private String lastYearFirstTargetRebate ;
    /** 上年度目标返利第二坎(进货额百分比(含税)) */
    private String lastYearSecondTargetRebate ;
    /** 上年度目标返利第三坎(进货额百分比(含税)) */
    private String lastYearThirdlyTargetRebate ;
    /** 上年度目标返利第四坎(进货额百分比(含税)) */
    private String lastYearFourthlyTargetRebate ;
    /** 上年度不退换奖励 */
    private String lastYearNoReturnAward ;
    /** 上年度物流模式 */
    private String lastYearLogisticsMode ;
    /** 上年度仓储服务 */
    private String lastYearStoreService ;
    /** 上年度促销折扣(进货额百分比) */
    private String lastYearPromotionDiscount ;
    /** 上年度破损折扣(进货额百分比) */
    private String lastYearDamageDiscount ;
    /** 上年度堆头促销服务(元/档期) */
    private String lastYearDtPromotionService ;
    /** 上年度端架促销服务(元/档期) */
    private String lastYearDjPromotionService ;
    /** 上年度挂网促销服务(元/档期) */
    private String lastYearWcPromotionService ;
    /** 上年度形堆促销服务(元/档期) */
    private String lastYearXcPromotionService ;
    /** 上年度展示服务费(元/支/店) */
    private String lastYearExhibitionServiceFee ;
    /** 上年度市场推广服务费(元/支/店) */
    private String lastYearMarketPromServiceFee ;
    /** 上年度DM宣传(元/档期/单品） */
    private String lastYearDmPublicize ;
    /** 上年度汽球/汽柱/拱门(元/店) */
    private String lastYearQqQzGm ;
    /** 上年度促销服务费(元/月) */
    private String lastYearPromServiceFee ;
    /** 上年度促销基金(销售额百分比) */
    private String lastYearPromFund ;
    /** 上年度节庆折扣(进货额百分比) */
    private String lastYearFestivalDiscount ;
    /** 上年度信控额度固定金额 */
    private String lastYearCreditLimitFixedAmount ;
    /** 上年度信控额度动态金额(库存金额百分比) */
    private String lastYearCreditLimitDynamicAmount ;
    /** 上年度其他说明 */
    private String lastYearOtherInstruction ;
    /** 本年度销售（含税） */
    private String thisYearSalesIndTax ;
    /** 本年度销售毛利率(含税) */
    private String thisYearSalesGrossIndTax ;
    /** 本年度结算账期 */
    private String thisYearSettlementPaym ;
    /** 本年度目标返利第一坎(进货额百分比(含税)) */
    private String thisYearFirstTargetRebate ;
    /** 本年度目标返利第二坎(进货额百分比(含税)) */
    private String thisYearSecondTargetRebate ;
    /** 本年度目标返利第三坎(进货额百分比(含税)) */
    private String thisYearThirdlyTargetRebate ;
    /** 本年度目标返利第四坎(进货额百分比(含税)) */
    private String thisYearFourthlyTargetRebate ;
    /** 本年度不退换奖励 */
    private String thisYearNoReturnAward ;
    /** 本年度物流模式 */
    private String thisYearLogisticsMode ;
    /** 本年度仓储服务 */
    private String thisYearStoreService ;
    /** 本年度促销折扣(进货额百分比) */
    private String thisYearPromotionDiscount ;
    /** 本年度破损折扣(进货额百分比) */
    private String thisYearDamageDiscount ;
    /** 本年度堆头促销服务(元/档期) */
    private String thisYearDtPromotionService ;
    /** 本年度端架促销服务(元/档期) */
    private String thisYearDjPromotionService ;
    /** 本年度挂网促销服务(元/档期) */
    private String thisYearWcPromotionService ;
    /** 本年度形堆促销服务(元/档期) */
    private String thisYearXcPromotionService ;
    /** 本年度展示服务费(元/支/店) */
    private String thisYearExhibitionServiceFee ;
    /** 本年度市场推广服务费(元/支/店) */
    private String thisYearMarketPromServiceFee ;
    /** 本年度DM宣传(元/档期/单品） */
    private String thisYearDmPublicize ;
    /** 本年度汽球/汽柱/拱门(元/店) */
    private String thisYearQqQzGm ;
    /** 本年度促销服务费(元/月) */
    private String thisYearPromServiceFee ;
    /** 本年度促销基金(销售额百分比) */
    private String thisYearPromFund ;
    /** 本年度节庆折扣(进货额百分比) */
    private String thisYearFestivalDiscount ;
    /** 本年度信控额度固定金额 */
    private String thisYearCreditLimitFixedAmount ;
    /** 本年度信控额度动态金额(库存金额百分比) */
    private String thisYearCreditLimitDynamicAmount ;
    /** 本年度其他说明 */
    private String thisYearOtherInstruction ;







    /** 上年度销售（含税） */
    public String getLastYearSalesIndTax(){
        return this.lastYearSalesIndTax;
    }
    /** 上年度销售（含税） */
    public void setLastYearSalesIndTax(String lastYearSalesIndTax){
        this.lastYearSalesIndTax = lastYearSalesIndTax;
    }
    /** 上年度销售毛利率(含税) */
    public String getLastYearSalesGrossIndTax(){
        return this.lastYearSalesGrossIndTax;
    }
    /** 上年度销售毛利率(含税) */
    public void setLastYearSalesGrossIndTax(String lastYearSalesGrossIndTax){
        this.lastYearSalesGrossIndTax = lastYearSalesGrossIndTax;
    }
    /** 上年度结算账期 */
    public String getLastYearSettlementPaym(){
        return this.lastYearSettlementPaym;
    }
    /** 上年度结算账期 */
    public void setLastYearSettlementPaym(String lastYearSettlementPaym){
        this.lastYearSettlementPaym = lastYearSettlementPaym;
    }
    /** 上年度目标返利第一坎(进货额百分比(含税)) */
    public String getLastYearFirstTargetRebate(){
        return this.lastYearFirstTargetRebate;
    }
    /** 上年度目标返利第一坎(进货额百分比(含税)) */
    public void setLastYearFirstTargetRebate(String lastYearFirstTargetRebate){
        this.lastYearFirstTargetRebate = lastYearFirstTargetRebate;
    }
    /** 上年度目标返利第二坎(进货额百分比(含税)) */
    public String getLastYearSecondTargetRebate(){
        return this.lastYearSecondTargetRebate;
    }
    /** 上年度目标返利第二坎(进货额百分比(含税)) */
    public void setLastYearSecondTargetRebate(String lastYearSecondTargetRebate){
        this.lastYearSecondTargetRebate = lastYearSecondTargetRebate;
    }
    /** 上年度目标返利第三坎(进货额百分比(含税)) */
    public String getLastYearThirdlyTargetRebate(){
        return this.lastYearThirdlyTargetRebate;
    }
    /** 上年度目标返利第三坎(进货额百分比(含税)) */
    public void setLastYearThirdlyTargetRebate(String lastYearThirdlyTargetRebate){
        this.lastYearThirdlyTargetRebate = lastYearThirdlyTargetRebate;
    }
    /** 上年度目标返利第四坎(进货额百分比(含税)) */
    public String getLastYearFourthlyTargetRebate(){
        return this.lastYearFourthlyTargetRebate;
    }
    /** 上年度目标返利第四坎(进货额百分比(含税)) */
    public void setLastYearFourthlyTargetRebate(String lastYearFourthlyTargetRebate){
        this.lastYearFourthlyTargetRebate = lastYearFourthlyTargetRebate;
    }
    /** 上年度不退换奖励 */
    public String getLastYearNoReturnAward(){
        return this.lastYearNoReturnAward;
    }
    /** 上年度不退换奖励 */
    public void setLastYearNoReturnAward(String lastYearNoReturnAward){
        this.lastYearNoReturnAward = lastYearNoReturnAward;
    }
    /** 上年度物流模式 */
    public String getLastYearLogisticsMode(){
        return this.lastYearLogisticsMode;
    }
    /** 上年度物流模式 */
    public void setLastYearLogisticsMode(String lastYearLogisticsMode){
        this.lastYearLogisticsMode = lastYearLogisticsMode;
    }
    /** 上年度仓储服务 */
    public String getLastYearStoreService(){
        return this.lastYearStoreService;
    }
    /** 上年度仓储服务 */
    public void setLastYearStoreService(String lastYearStoreService){
        this.lastYearStoreService = lastYearStoreService;
    }
    /** 上年度促销折扣(进货额百分比) */
    public String getLastYearPromotionDiscount(){
        return this.lastYearPromotionDiscount;
    }
    /** 上年度促销折扣(进货额百分比) */
    public void setLastYearPromotionDiscount(String lastYearPromotionDiscount){
        this.lastYearPromotionDiscount = lastYearPromotionDiscount;
    }
    /** 上年度破损折扣(进货额百分比) */
    public String getLastYearDamageDiscount(){
        return this.lastYearDamageDiscount;
    }
    /** 上年度破损折扣(进货额百分比) */
    public void setLastYearDamageDiscount(String lastYearDamageDiscount){
        this.lastYearDamageDiscount = lastYearDamageDiscount;
    }
    /** 上年度堆头促销服务(元/档期) */
    public String getLastYearDtPromotionService(){
        return this.lastYearDtPromotionService;
    }
    /** 上年度堆头促销服务(元/档期) */
    public void setLastYearDtPromotionService(String lastYearDtPromotionService){
        this.lastYearDtPromotionService = lastYearDtPromotionService;
    }
    /** 上年度端架促销服务(元/档期) */
    public String getLastYearDjPromotionService(){
        return this.lastYearDjPromotionService;
    }
    /** 上年度端架促销服务(元/档期) */
    public void setLastYearDjPromotionService(String lastYearDjPromotionService){
        this.lastYearDjPromotionService = lastYearDjPromotionService;
    }
    /** 上年度挂网促销服务(元/档期) */
    public String getLastYearWcPromotionService(){
        return this.lastYearWcPromotionService;
    }
    /** 上年度挂网促销服务(元/档期) */
    public void setLastYearWcPromotionService(String lastYearWcPromotionService){
        this.lastYearWcPromotionService = lastYearWcPromotionService;
    }
    /** 上年度形堆促销服务(元/档期) */
    public String getLastYearXcPromotionService(){
        return this.lastYearXcPromotionService;
    }
    /** 上年度形堆促销服务(元/档期) */
    public void setLastYearXcPromotionService(String lastYearXcPromotionService){
        this.lastYearXcPromotionService = lastYearXcPromotionService;
    }
    /** 上年度展示服务费(元/支/店) */
    public String getLastYearExhibitionServiceFee(){
        return this.lastYearExhibitionServiceFee;
    }
    /** 上年度展示服务费(元/支/店) */
    public void setLastYearExhibitionServiceFee(String lastYearExhibitionServiceFee){
        this.lastYearExhibitionServiceFee = lastYearExhibitionServiceFee;
    }
    /** 上年度市场推广服务费(元/支/店) */
    public String getLastYearMarketPromServiceFee(){
        return this.lastYearMarketPromServiceFee;
    }
    /** 上年度市场推广服务费(元/支/店) */
    public void setLastYearMarketPromServiceFee(String lastYearMarketPromServiceFee){
        this.lastYearMarketPromServiceFee = lastYearMarketPromServiceFee;
    }
    /** 上年度DM宣传(元/档期/单品） */
    public String getLastYearDmPublicize(){
        return this.lastYearDmPublicize;
    }
    /** 上年度DM宣传(元/档期/单品） */
    public void setLastYearDmPublicize(String lastYearDmPublicize){
        this.lastYearDmPublicize = lastYearDmPublicize;
    }
    /** 上年度汽球/汽柱/拱门(元/店) */
    public String getLastYearQqQzGm(){
        return this.lastYearQqQzGm;
    }
    /** 上年度汽球/汽柱/拱门(元/店) */
    public void setLastYearQqQzGm(String lastYearQqQzGm){
        this.lastYearQqQzGm = lastYearQqQzGm;
    }
    /** 上年度促销服务费(元/月) */
    public String getLastYearPromServiceFee(){
        return this.lastYearPromServiceFee;
    }
    /** 上年度促销服务费(元/月) */
    public void setLastYearPromServiceFee(String lastYearPromServiceFee){
        this.lastYearPromServiceFee = lastYearPromServiceFee;
    }
    /** 上年度促销基金(销售额百分比) */
    public String getLastYearPromFund(){
        return this.lastYearPromFund;
    }
    /** 上年度促销基金(销售额百分比) */
    public void setLastYearPromFund(String lastYearPromFund){
        this.lastYearPromFund = lastYearPromFund;
    }
    /** 上年度节庆折扣(进货额百分比) */
    public String getLastYearFestivalDiscount(){
        return this.lastYearFestivalDiscount;
    }
    /** 上年度节庆折扣(进货额百分比) */
    public void setLastYearFestivalDiscount(String lastYearFestivalDiscount){
        this.lastYearFestivalDiscount = lastYearFestivalDiscount;
    }
    /** 上年度信控额度固定金额 */
    public String getLastYearCreditLimitFixedAmount(){
        return this.lastYearCreditLimitFixedAmount;
    }
    /** 上年度信控额度固定金额 */
    public void setLastYearCreditLimitFixedAmount(String lastYearCreditLimitFixedAmount){
        this.lastYearCreditLimitFixedAmount = lastYearCreditLimitFixedAmount;
    }
    /** 上年度信控额度动态金额(库存金额百分比) */
    public String getLastYearCreditLimitDynamicAmount(){
        return this.lastYearCreditLimitDynamicAmount;
    }
    /** 上年度信控额度动态金额(库存金额百分比) */
    public void setLastYearCreditLimitDynamicAmount(String lastYearCreditLimitDynamicAmount){
        this.lastYearCreditLimitDynamicAmount = lastYearCreditLimitDynamicAmount;
    }
    /** 上年度其他说明 */
    public String getLastYearOtherInstruction(){
        return this.lastYearOtherInstruction;
    }
    /** 上年度其他说明 */
    public void setLastYearOtherInstruction(String lastYearOtherInstruction){
        this.lastYearOtherInstruction = lastYearOtherInstruction;
    }
    /** 本年度销售（含税） */
    public String getThisYearSalesIndTax(){
        return this.thisYearSalesIndTax;
    }
    /** 本年度销售（含税） */
    public void setThisYearSalesIndTax(String thisYearSalesIndTax){
        this.thisYearSalesIndTax = thisYearSalesIndTax;
    }
    /** 本年度销售毛利率(含税) */
    public String getThisYearSalesGrossIndTax(){
        return this.thisYearSalesGrossIndTax;
    }
    /** 本年度销售毛利率(含税) */
    public void setThisYearSalesGrossIndTax(String thisYearSalesGrossIndTax){
        this.thisYearSalesGrossIndTax = thisYearSalesGrossIndTax;
    }
    /** 本年度结算账期 */
    public String getThisYearSettlementPaym(){
        return this.thisYearSettlementPaym;
    }
    /** 本年度结算账期 */
    public void setThisYearSettlementPaym(String thisYearSettlementPaym){
        this.thisYearSettlementPaym = thisYearSettlementPaym;
    }
    /** 本年度目标返利第一坎(进货额百分比(含税)) */
    public String getThisYearFirstTargetRebate(){
        return this.thisYearFirstTargetRebate;
    }
    /** 本年度目标返利第一坎(进货额百分比(含税)) */
    public void setThisYearFirstTargetRebate(String thisYearFirstTargetRebate){
        this.thisYearFirstTargetRebate = thisYearFirstTargetRebate;
    }
    /** 本年度目标返利第二坎(进货额百分比(含税)) */
    public String getThisYearSecondTargetRebate(){
        return this.thisYearSecondTargetRebate;
    }
    /** 本年度目标返利第二坎(进货额百分比(含税)) */
    public void setThisYearSecondTargetRebate(String thisYearSecondTargetRebate){
        this.thisYearSecondTargetRebate = thisYearSecondTargetRebate;
    }
    /** 本年度目标返利第三坎(进货额百分比(含税)) */
    public String getThisYearThirdlyTargetRebate(){
        return this.thisYearThirdlyTargetRebate;
    }
    /** 本年度目标返利第三坎(进货额百分比(含税)) */
    public void setThisYearThirdlyTargetRebate(String thisYearThirdlyTargetRebate){
        this.thisYearThirdlyTargetRebate = thisYearThirdlyTargetRebate;
    }
    /** 本年度目标返利第四坎(进货额百分比(含税)) */
    public String getThisYearFourthlyTargetRebate(){
        return this.thisYearFourthlyTargetRebate;
    }
    /** 本年度目标返利第四坎(进货额百分比(含税)) */
    public void setThisYearFourthlyTargetRebate(String thisYearFourthlyTargetRebate){
        this.thisYearFourthlyTargetRebate = thisYearFourthlyTargetRebate;
    }
    /** 本年度不退换奖励 */
    public String getThisYearNoReturnAward(){
        return this.thisYearNoReturnAward;
    }
    /** 本年度不退换奖励 */
    public void setThisYearNoReturnAward(String thisYearNoReturnAward){
        this.thisYearNoReturnAward = thisYearNoReturnAward;
    }
    /** 本年度物流模式 */
    public String getThisYearLogisticsMode(){
        return this.thisYearLogisticsMode;
    }
    /** 本年度物流模式 */
    public void setThisYearLogisticsMode(String thisYearLogisticsMode){
        this.thisYearLogisticsMode = thisYearLogisticsMode;
    }
    /** 本年度仓储服务 */
    public String getThisYearStoreService(){
        return this.thisYearStoreService;
    }
    /** 本年度仓储服务 */
    public void setThisYearStoreService(String thisYearStoreService){
        this.thisYearStoreService = thisYearStoreService;
    }
    /** 本年度促销折扣(进货额百分比) */
    public String getThisYearPromotionDiscount(){
        return this.thisYearPromotionDiscount;
    }
    /** 本年度促销折扣(进货额百分比) */
    public void setThisYearPromotionDiscount(String thisYearPromotionDiscount){
        this.thisYearPromotionDiscount = thisYearPromotionDiscount;
    }
    /** 本年度破损折扣(进货额百分比) */
    public String getThisYearDamageDiscount(){
        return this.thisYearDamageDiscount;
    }
    /** 本年度破损折扣(进货额百分比) */
    public void setThisYearDamageDiscount(String thisYearDamageDiscount){
        this.thisYearDamageDiscount = thisYearDamageDiscount;
    }
    /** 本年度堆头促销服务(元/档期) */
    public String getThisYearDtPromotionService(){
        return this.thisYearDtPromotionService;
    }
    /** 本年度堆头促销服务(元/档期) */
    public void setThisYearDtPromotionService(String thisYearDtPromotionService){
        this.thisYearDtPromotionService = thisYearDtPromotionService;
    }
    /** 本年度端架促销服务(元/档期) */
    public String getThisYearDjPromotionService(){
        return this.thisYearDjPromotionService;
    }
    /** 本年度端架促销服务(元/档期) */
    public void setThisYearDjPromotionService(String thisYearDjPromotionService){
        this.thisYearDjPromotionService = thisYearDjPromotionService;
    }
    /** 本年度挂网促销服务(元/档期) */
    public String getThisYearWcPromotionService(){
        return this.thisYearWcPromotionService;
    }
    /** 本年度挂网促销服务(元/档期) */
    public void setThisYearWcPromotionService(String thisYearWcPromotionService){
        this.thisYearWcPromotionService = thisYearWcPromotionService;
    }
    /** 本年度形堆促销服务(元/档期) */
    public String getThisYearXcPromotionService(){
        return this.thisYearXcPromotionService;
    }
    /** 本年度形堆促销服务(元/档期) */
    public void setThisYearXcPromotionService(String thisYearXcPromotionService){
        this.thisYearXcPromotionService = thisYearXcPromotionService;
    }
    /** 本年度展示服务费(元/支/店) */
    public String getThisYearExhibitionServiceFee(){
        return this.thisYearExhibitionServiceFee;
    }
    /** 本年度展示服务费(元/支/店) */
    public void setThisYearExhibitionServiceFee(String thisYearExhibitionServiceFee){
        this.thisYearExhibitionServiceFee = thisYearExhibitionServiceFee;
    }
    /** 本年度市场推广服务费(元/支/店) */
    public String getThisYearMarketPromServiceFee(){
        return this.thisYearMarketPromServiceFee;
    }
    /** 本年度市场推广服务费(元/支/店) */
    public void setThisYearMarketPromServiceFee(String thisYearMarketPromServiceFee){
        this.thisYearMarketPromServiceFee = thisYearMarketPromServiceFee;
    }
    /** 本年度DM宣传(元/档期/单品） */
    public String getThisYearDmPublicize(){
        return this.thisYearDmPublicize;
    }
    /** 本年度DM宣传(元/档期/单品） */
    public void setThisYearDmPublicize(String thisYearDmPublicize){
        this.thisYearDmPublicize = thisYearDmPublicize;
    }
    /** 本年度汽球/汽柱/拱门(元/店) */
    public String getThisYearQqQzGm(){
        return this.thisYearQqQzGm;
    }
    /** 本年度汽球/汽柱/拱门(元/店) */
    public void setThisYearQqQzGm(String thisYearQqQzGm){
        this.thisYearQqQzGm = thisYearQqQzGm;
    }
    /** 本年度促销服务费(元/月) */
    public String getThisYearPromServiceFee(){
        return this.thisYearPromServiceFee;
    }
    /** 本年度促销服务费(元/月) */
    public void setThisYearPromServiceFee(String thisYearPromServiceFee){
        this.thisYearPromServiceFee = thisYearPromServiceFee;
    }
    /** 本年度促销基金(销售额百分比) */
    public String getThisYearPromFund(){
        return this.thisYearPromFund;
    }
    /** 本年度促销基金(销售额百分比) */
    public void setThisYearPromFund(String thisYearPromFund){
        this.thisYearPromFund = thisYearPromFund;
    }
    /** 本年度节庆折扣(进货额百分比) */
    public String getThisYearFestivalDiscount(){
        return this.thisYearFestivalDiscount;
    }
    /** 本年度节庆折扣(进货额百分比) */
    public void setThisYearFestivalDiscount(String thisYearFestivalDiscount){
        this.thisYearFestivalDiscount = thisYearFestivalDiscount;
    }
    /** 本年度信控额度固定金额 */
    public String getThisYearCreditLimitFixedAmount(){
        return this.thisYearCreditLimitFixedAmount;
    }
    /** 本年度信控额度固定金额 */
    public void setThisYearCreditLimitFixedAmount(String thisYearCreditLimitFixedAmount){
        this.thisYearCreditLimitFixedAmount = thisYearCreditLimitFixedAmount;
    }
    /** 本年度信控额度动态金额(库存金额百分比) */
    public String getThisYearCreditLimitDynamicAmount(){
        return this.thisYearCreditLimitDynamicAmount;
    }
    /** 本年度信控额度动态金额(库存金额百分比) */
    public void setThisYearCreditLimitDynamicAmount(String thisYearCreditLimitDynamicAmount){
        this.thisYearCreditLimitDynamicAmount = thisYearCreditLimitDynamicAmount;
    }
    /** 本年度其他说明 */
    public String getThisYearOtherInstruction(){
        return this.thisYearOtherInstruction;
    }
    /** 本年度其他说明 */
    public void setThisYearOtherInstruction(String thisYearOtherInstruction){
        this.thisYearOtherInstruction = thisYearOtherInstruction;
    }
}
