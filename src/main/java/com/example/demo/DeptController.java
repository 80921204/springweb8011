package com.example.demo;


 
 
import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.dhc.ec.rpc.product.dao.ContractBasicDao;
import cn.com.dhc.ec.rpc.product.dao.ContractTermsDao;
import cn.com.dhc.ec.rpc.product.dao.EmployeeMapper;
import cn.com.dhc.ec.rpc.product.entity.ContractBasic;
import cn.com.dhc.ec.rpc.product.entity.ContractTerms;
import cn.com.dhc.ec.rpc.product.vo.ContractBasicVO;

@RestController
public class DeptController {

    

    @Autowired
    EmployeeMapper employeeMapper;


 

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
       return employeeMapper.getEmpById(id);
    }
    

	@GetMapping("/")
	public String  exec() {
		Employee employee=new Employee();
		employee.setEmail("bbb");
		employeeMapper.insertEmp(employee);
		System.out.println(employee.getId());
		return "8011";
	}
	
	 @Resource
	    private ContractBasicDao contractBasicDao;

	    @Resource
	    private ContractTermsDao contractTermsDao;
	
	 @RequestMapping(value = "/test.jhtml")
	 public @ResponseBody Object toShopcartList(@RequestBody ContractBasicVO contractBasicVO) {
		 
		 
		 ContractBasic contractBasic = new ContractBasic();
         BeanUtils.copyProperties(contractBasicVO,contractBasic);
         ContractTerms contractTerms = new ContractTerms();
         BeanUtils.copyProperties(contractBasicVO,contractTerms);

         int k =contractBasicDao.insertSelective(contractBasic);
         //外键赋值
         contractTerms.setContractBaseicId(contractBasic.getId());
         int i = contractTermsDao.insertSelective(contractTerms);
         if((k>1&&i>1))
             return 1;
         else
             return 0;
	 }
	 
	 
	 @RequestMapping(value = "/query.jhtml")
	 public @ResponseBody Object queryContract(@RequestBody ContractBasicVO contractBasicVO) {
		 List<ContractBasicVO> list = contractBasicDao.queryContractBasicVOByCooperationBasicId(1234L);
		 
		 return list;

	 }
	 
	 
	 
	 @RequestMapping(value = "/updateOrsave.jhtml")
	 public @ResponseBody Object update(@RequestBody ContractBasicVO contractBasicVO) {

		List<ContractBasic> queryContractBasicVOByCooperationBasicId = contractBasicDao.selectContractBasicByCooperationBasicId(contractBasicVO.getCooperationBasicId());
		if(queryContractBasicVOByCooperationBasicId!=null && queryContractBasicVOByCooperationBasicId.size()>0) {
			ContractBasic contractBasic = queryContractBasicVOByCooperationBasicId.get(0);
			BeanUtils.copyProperties(contractBasicVO, contractBasic, getNullPropertyNames(contractBasicVO));
			int k =contractBasicDao.updateByPrimaryKey(contractBasic);
			
			ContractTerms contractTerms = contractTermsDao.selectContractTermsByContractBaseicId(contractBasic.getId()).get(0);
			BeanUtils.copyProperties(contractBasicVO,contractTerms, getNullPropertyNames(contractBasicVO));
			 int i = contractTermsDao.updateByPrimaryKey(contractTerms);
			
			
			 if((k+i)>1)
	             return 1;
	         else
	             return 0;
			
		}else {
			 ContractBasic contractBasic = new ContractBasic();
	         BeanUtils.copyProperties(contractBasicVO,contractBasic);
	         ContractTerms contractTerms = new ContractTerms();
	         BeanUtils.copyProperties(contractBasicVO,contractTerms);

	         int k =contractBasicDao.insertSelective(contractBasic);
	         //外键赋值
	         contractTerms.setContractBaseicId(contractBasic.getId());
	         int i = contractTermsDao.insertSelective(contractTerms);
	         if((k+i)>1)
	             return 1;
	         else
	             return 0;
		}
 
		 
	 }
	 
	 public static String[] getNullPropertyNames(Object source) {
	        BeanWrapper src = new BeanWrapperImpl(source);
	        PropertyDescriptor[] pds = src.getPropertyDescriptors();
	 
	        Set<String> emptyNames = new HashSet<>();
	        for (PropertyDescriptor pd : pds) {
	            Object srcValue = src.getPropertyValue(pd.getName());
	            if (srcValue == null)
	                emptyNames.add(pd.getName());
	        }
	        return emptyNames.toArray(new String[emptyNames.size()]);
	    }

	 

	 d:\Program Files\Typora\resources\inspector\emulated_devices\emulated_devices_module.js
	 d:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-horizontal-default-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-horizontal-default-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-horizontal-keyboard-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-horizontal-keyboard-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-horizontal-navigation-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-horizontal-navigation-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-vertical-default-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-vertical-default-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-vertical-keyboard-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-vertical-keyboard-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-vertical-navigation-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5-vertical-navigation-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-horizontal-default-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-horizontal-default-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-horizontal-keyboard-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-horizontal-keyboard-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-horizontal-navigation-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-horizontal-navigation-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-vertical-default-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-vertical-default-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-vertical-keyboard-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-vertical-keyboard-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-vertical-navigation-1x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\google-nexus-5x-vertical-navigation-2x.png
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPad-landscape.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPad-portrait.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPhone5-landscape.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPhone5-portrait.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPhone6-landscape.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPhone6-portrait.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPhone6Plus-landscape.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\iPhone6Plus-portrait.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\Nexus5X-landscape.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\Nexus5X-portrait.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\Nexus6P-landscape.svg
	 *:\Program Files\Typora\resources\inspector\emulated_devices\Nexus6P-portrait.svg
	 *:\Program Files\Typora\resources\inspector\event_listeners\event_listeners_module.js
	 *:\Program Files\Typora\resources\inspector\extensions_test_runner\extensions_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\formatter\formatter_module.js
	 *:\Program Files\Typora\resources\inspector\formatter_worker.js
	 *:\Program Files\Typora\resources\inspector\har_importer\har_importer_module.js
	 *:\Program Files\Typora\resources\inspector\heap_profiler_test_runner\heap_profiler_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\heap_snapshot_model\heap_snapshot_model_module.js
	 *:\Program Files\Typora\resources\inspector\heap_snapshot_worker\heap_snapshot_worker_module.js
	 *:\Program Files\Typora\resources\inspector\heap_snapshot_worker.js
	 *:\Program Files\Typora\resources\inspector\help\help_module.js
	 *:\Program Files\Typora\resources\inspector\Images\accelerometer-back.svg
	 *:\Program Files\Typora\resources\inspector\Images\accelerometer-bottom.png
	 *:\Program Files\Typora\resources\inspector\Images\accelerometer-front.svg
	 *:\Program Files\Typora\resources\inspector\Images\accelerometer-left.png
	 *:\Program Files\Typora\resources\inspector\Images\accelerometer-right.png
	 *:\Program Files\Typora\resources\inspector\Images\accelerometer-top.png
	 *:\Program Files\Typora\resources\inspector\Images\audits_logo.svg
	 *:\Program Files\Typora\resources\inspector\Images\breakpoint.png
	 *:\Program Files\Typora\resources\inspector\Images\breakpointConditional.png
	 *:\Program Files\Typora\resources\inspector\Images\breakpointConditional_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\breakpoint_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\checker.png
	 *:\Program Files\Typora\resources\inspector\Images\chromeDisabledSelect.png
	 *:\Program Files\Typora\resources\inspector\Images\chromeDisabledSelect_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\chromeLeft.png
	 *:\Program Files\Typora\resources\inspector\Images\chromeMiddle.png
	 *:\Program Files\Typora\resources\inspector\Images\chromeRight.png
	 *:\Program Files\Typora\resources\inspector\Images\chromeSelect.png
	 *:\Program Files\Typora\resources\inspector\Images\chromeSelect_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\errorWave.png
	 *:\Program Files\Typora\resources\inspector\Images\errorWave_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\ic_info_black_18dp.svg
	 *:\Program Files\Typora\resources\inspector\Images\ic_warning_black_18dp.svg
	 *:\Program Files\Typora\resources\inspector\Images\largeIcons.png
	 *:\Program Files\Typora\resources\inspector\Images\largeIcons_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\mediumIcons.png
	 *:\Program Files\Typora\resources\inspector\Images\mediumIcons_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\navigationControls.png
	 *:\Program Files\Typora\resources\inspector\Images\navigationControls_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\nodeIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\popoverArrows.png
	 *:\Program Files\Typora\resources\inspector\Images\profileGroupIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\profileIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\profileSmallIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\radioDot.png
	 *:\Program Files\Typora\resources\inspector\Images\resizeDiagonal.png
	 *:\Program Files\Typora\resources\inspector\Images\resizeDiagonal_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\resizeHorizontal.png
	 *:\Program Files\Typora\resources\inspector\Images\resizeHorizontal_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\resizeVertical.png
	 *:\Program Files\Typora\resources\inspector\Images\resizeVertical_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\resourceCSSIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\resourceDocumentIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\resourceDocumentIconSmall.png
	 *:\Program Files\Typora\resources\inspector\Images\resourceJSIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\resourcePlainIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\resourcePlainIconSmall.png
	 *:\Program Files\Typora\resources\inspector\Images\resourcesTimeGraphIcon.png
	 *:\Program Files\Typora\resources\inspector\Images\searchNext.png
	 *:\Program Files\Typora\resources\inspector\Images\searchPrev.png
	 *:\Program Files\Typora\resources\inspector\Images\securityIcons.png
	 *:\Program Files\Typora\resources\inspector\Images\securityIcons_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\smallIcons.png
	 *:\Program Files\Typora\resources\inspector\Images\smallIcons_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\speech.png
	 *:\Program Files\Typora\resources\inspector\Images\toolbarResizerVertical.png
	 *:\Program Files\Typora\resources\inspector\Images\touchCursor.png
	 *:\Program Files\Typora\resources\inspector\Images\touchCursor_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\treeoutlineTriangles.png
	 *:\Program Files\Typora\resources\inspector\Images\treeoutlineTriangles_2x.png
	 *:\Program Files\Typora\resources\inspector\Images\whatsnew.png
	 *:\Program Files\Typora\resources\inspector\inline_editor\inline_editor_module.js
	 *:\Program Files\Typora\resources\inspector\inspector.html
	 *:\Program Files\Typora\resources\inspector\inspector.js
	 *:\Program Files\Typora\resources\inspector\InspectorBackendCommands.js
	 *:\Program Files\Typora\resources\inspector\integration_test_runner.html
	 *:\Program Files\Typora\resources\inspector\integration_test_runner.js
	 *:\Program Files\Typora\resources\inspector\javascript_metadata\javascript_metadata_module.js
	 *:\Program Files\Typora\resources\inspector\js_app.html
	 *:\Program Files\Typora\resources\inspector\js_app.js
	 *:\Program Files\Typora\resources\inspector\js_profiler\js_profiler_module.js
	 *:\Program Files\Typora\resources\inspector\layers\layers_module.js
	 *:\Program Files\Typora\resources\inspector\layers_test_runner\layers_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\layer_viewer\layer_viewer_module.js
	 *:\Program Files\Typora\resources\inspector\network\network_module.js
	 *:\Program Files\Typora\resources\inspector\network_test_runner\network_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\node_app.html
	 *:\Program Files\Typora\resources\inspector\node_app.js
	 *:\Program Files\Typora\resources\inspector\node_debugger\node_debugger_module.js
	 *:\Program Files\Typora\resources\inspector\object_ui\object_ui_module.js
	 *:\Program Files\Typora\resources\inspector\performance_monitor\performance_monitor_module.js
	 *:\Program Files\Typora\resources\inspector\performance_test_runner\performance_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\perf_ui\perf_ui_module.js
	 *:\Program Files\Typora\resources\inspector\product_registry_impl\product_registry_impl_module.js
	 *:\Program Files\Typora\resources\inspector\profiler\profiler_module.js
	 *:\Program Files\Typora\resources\inspector\protocol_monitor\protocol_monitor_module.js
	 *:\Program Files\Typora\resources\inspector\quick_open\quick_open_module.js
	 *:\Program Files\Typora\resources\inspector\resources\resources_module.js
	 *:\Program Files\Typora\resources\inspector\sdk_test_runner\sdk_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\search\search_module.js
	 *:\Program Files\Typora\resources\inspector\security\security_module.js
	 *:\Program Files\Typora\resources\inspector\security_test_runner\security_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\settings\settings_module.js
	 *:\Program Files\Typora\resources\inspector\shell.js
	 *:\Program Files\Typora\resources\inspector\snippets\snippets_module.js
	 *:\Program Files\Typora\resources\inspector\sources\sources_module.js
	 *:\Program Files\Typora\resources\inspector\sources_test_runner\sources_test_runner_module.js
	 *:\Program Files\Typora\resources\inspector\source_frame\source_frame_module.js
	 *:\Program Files\Typora\resources\inspector\SupportedCSSProperties.js
	 *:\Program Files\Typora\resources\inspector\Tests.js
	 *:\Program Files\Typora\resources\inspector\text_editor\text_editor_module.js
	 *:\Program Files\Typora\resources\inspector\timeline\timeline_module.js
	 *:\Program Files\Typora\resources\inspector\timeline_model\timeline_model_module.js
	 *:\Program Files\Typora\resources\inspector\toolbox.html
	 *:\Program Files\Typora\resources\inspector\toolbox.js
	 *:\Program Files\Typora\resources\inspector\worker_app.html
	 *:\Program Files\Typora\resources\inspector\worker_app.js
	 *:\Program Files\Typora\resources\inspector\workspace_diff\workspace_diff_module.js


}
