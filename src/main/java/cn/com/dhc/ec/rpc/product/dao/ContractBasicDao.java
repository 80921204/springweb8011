package cn.com.dhc.ec.rpc.product.dao;



import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.com.dhc.ec.rpc.product.entity.ContractBasic;
import cn.com.dhc.ec.rpc.product.vo.ContractBasicVO;

public interface ContractBasicDao {
//    long countByExample(ContractBasicExample example);
//
//    int deleteByExample(ContractBasicExample example);
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(ContractBasic record);

    int insertSelective(ContractBasic record);
    //根据“合作意向单编号”查询 “合同基本信息” 和“合同条款”
    List<ContractBasicVO> queryContractBasicVOByCooperationBasicId(Long CooperationBasicId);
    
  //根据“合作意向单编号”查询 “合同基本信息西”  
    List<ContractBasic> selectContractBasicByCooperationBasicId(Long CooperationBasicId);
    
    int updateByPrimaryKey(ContractBasic record);
    
//    List<ContractBasic> selectByExample(ContractBasicExample example);
//
//    ContractBasic selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") ContractBasic record, @Param("example") ContractBasicExample example);
//
//    int updateByExample(@Param("record") ContractBasic record, @Param("example") ContractBasicExample example);
//
//    int updateByPrimaryKeySelective(ContractBasic record);
//
//    int updateByPrimaryKey(ContractBasic record);
}