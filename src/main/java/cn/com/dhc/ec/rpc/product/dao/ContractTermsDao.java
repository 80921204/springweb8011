package cn.com.dhc.ec.rpc.product.dao;



import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.com.dhc.ec.rpc.product.entity.ContractBasic;
import cn.com.dhc.ec.rpc.product.entity.ContractTerms;

public interface ContractTermsDao {
//    long countByExample(ContractTermsExample example);
//
//    int deleteByExample(ContractTermsExample example);
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(ContractTerms record);

    int insertSelective(ContractTerms record);
    
    //根据“合同基本id”查询 “合同条款”  
    List<ContractTerms> selectContractTermsByContractBaseicId(Long contractBaseicId);
    //更新“合同条款”  
    int updateByPrimaryKey(ContractTerms record);
    
//    List<ContractTerms> selectByExample(ContractTermsExample example);
//
//    ContractTerms selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") ContractTerms record, @Param("example") ContractTermsExample example);
//
//    int updateByExample(@Param("record") ContractTerms record, @Param("example") ContractTermsExample example);
//
//    int updateByPrimaryKeySelective(ContractTerms record);
//
//    int updateByPrimaryKey(ContractTerms record);
}