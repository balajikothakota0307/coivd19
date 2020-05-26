package com.spring.covidproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.covidproject.Dao.DistictDailyDao;
import com.spring.covidproject.Dao.DistictWiseRealDataDao;
import com.spring.covidproject.Dao.HistoricalDataIndia;
import com.spring.covidproject.Dao.HistoricalDataIndiaRecoreds;
import com.spring.covidproject.Dao.ResponseDailyStateDAO;
import com.spring.covidproject.Dao.ResposeDistictDataDao;
import com.spring.covidproject.Dao.ResposeDistictRealDao;
import com.spring.covidproject.Dao.Respose_Realtime_state;
import com.spring.covidproject.Dao.StateWiseDailyDAO;
import com.spring.covidproject.Dao.State_Wise_Realtime_Data;
import com.spring.covidproject.service.State_wise_rt_data_service;

@RestController
@RequestMapping(value = "/covidindia")
public class CovidRestController {

	@Autowired
	private Respose_Realtime_state respose_Realtime_state;

	@Autowired
	private State_wise_rt_data_service state_wise_rt_data_service;
	
	@Autowired
	private HistoricalDataIndiaRecoreds historicalDataIndiaRecoreds;
	@Autowired
	private ResponseDailyStateDAO responseDailyStateDAO;
	@Autowired
	private ResposeDistictRealDao resposeDistictRealDao;
	@Autowired
	private ResposeDistictDataDao resposeDistictDataDao;
	
	private List<State_Wise_Realtime_Data> list_State_Wise_Realtime_Data;

	@RequestMapping(value = "/GetRealtimeIndiaCases/code={country}", method = RequestMethod.GET)
	public ResponseEntity<Respose_Realtime_state> indiaCases(@PathVariable("country") String country) {
		try {
		list_State_Wise_Realtime_Data =new ArrayList<State_Wise_Realtime_Data>();
		State_Wise_Realtime_Data state_Wise_Realtime_Data = state_wise_rt_data_service.getIndiaData(country);
		respose_Realtime_state.setStatus("OK");
		list_State_Wise_Realtime_Data.add(state_Wise_Realtime_Data);
		respose_Realtime_state.setData(list_State_Wise_Realtime_Data);
		return new ResponseEntity<>(respose_Realtime_state, HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			respose_Realtime_state.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(respose_Realtime_state,HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		
	}
	
	@RequestMapping(value="/GetHistoricalCasesIndia",method = RequestMethod.GET)
	public ResponseEntity<HistoricalDataIndiaRecoreds> indiaHistoryData(){
		try {
		System.out.println("hi balaji");
		List<HistoricalDataIndia> historicalDataIndia=state_wise_rt_data_service.getHistoricalData();
		historicalDataIndiaRecoreds.setStatus("OK");
		historicalDataIndiaRecoreds.setRecords(historicalDataIndia);
		return new ResponseEntity<> (historicalDataIndiaRecoreds,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			historicalDataIndiaRecoreds.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(historicalDataIndiaRecoreds,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/GetSateCases",method = RequestMethod.GET)
	public ResponseEntity<Respose_Realtime_state> stateWiseCases(){
		try {
			System.out.println("hi");
			List<State_Wise_Realtime_Data> list_State_Wise_Realtime_Data=state_wise_rt_data_service.getStateWiseData();
			respose_Realtime_state.setStatus("OK");
			respose_Realtime_state.setData(list_State_Wise_Realtime_Data);
			return new ResponseEntity<> (respose_Realtime_state,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			respose_Realtime_state.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(respose_Realtime_state,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value="/GetSateDailyCases",method = RequestMethod.GET)
	public ResponseEntity<ResponseDailyStateDAO> stateWiseDailyData(){
		try {
		List<StateWiseDailyDAO> listStateWiseDailyDAO=state_wise_rt_data_service.getStateDailyCases();
		responseDailyStateDAO.setStatus("OK");
		responseDailyStateDAO.setData(listStateWiseDailyDAO);
		return new ResponseEntity<> (responseDailyStateDAO,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			responseDailyStateDAO.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(responseDailyStateDAO,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/GetSingleStateDailyCases/code={state}",method = RequestMethod.GET)
	public ResponseEntity<ResponseDailyStateDAO> sinleStateWiseDailyData(@PathVariable("state") String state){
		try {
			List<StateWiseDailyDAO> listStateWiseDailyDAO=state_wise_rt_data_service.getSingleStateDailyCases(state);
			responseDailyStateDAO.setStatus("OK");
			responseDailyStateDAO.setData(listStateWiseDailyDAO);
			return new ResponseEntity<> (responseDailyStateDAO,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			responseDailyStateDAO.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(responseDailyStateDAO,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value="/GetDistictCases",method = RequestMethod.GET)
	public ResponseEntity<ResposeDistictRealDao> disctictCases(){
		try {
		List<DistictWiseRealDataDao> listDistictWiseRealDataDao=state_wise_rt_data_service.getDistictRealData();
		resposeDistictRealDao.setStatus("OK");
		resposeDistictRealDao.setData(listDistictWiseRealDataDao);
		return new ResponseEntity<> (resposeDistictRealDao,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resposeDistictRealDao.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(resposeDistictRealDao,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/GetDistictCases/code={state}",method = RequestMethod.GET)
	public ResponseEntity<ResposeDistictRealDao> sinleGetDistictCases(@PathVariable("state") String state){
		try {
			List<DistictWiseRealDataDao> listStateWiseDailyDAO=state_wise_rt_data_service.getSingleDistictRealCases(state);
			resposeDistictRealDao.setStatus("OK");
			resposeDistictRealDao.setData(listStateWiseDailyDAO);
			return new ResponseEntity<> (resposeDistictRealDao,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resposeDistictRealDao.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(resposeDistictRealDao,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value="/GetDistictDailyCases",method = RequestMethod.GET)
	public ResponseEntity<ResposeDistictDataDao> getdisctictDailyCases(){
		try {
		List<DistictDailyDao> listDistictDailyDao=state_wise_rt_data_service.getDistictDailyData();
		resposeDistictDataDao.setStatus("OK");
		resposeDistictDataDao.setData(listDistictDailyDao);
		return new ResponseEntity<> (resposeDistictDataDao,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resposeDistictDataDao.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(resposeDistictDataDao,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/GetDistictDailyCases/code={state}",method = RequestMethod.GET)
	public ResponseEntity<ResposeDistictDataDao> sinleGetDistictDailyCases(@PathVariable("state") Integer state){
		try {
			List<DistictDailyDao> listDistictDailyDao=state_wise_rt_data_service.sinleGetDistictDailyCases(state);
			resposeDistictDataDao.setStatus("OK");
			resposeDistictDataDao.setData(listDistictDailyDao);
			return new ResponseEntity<> (resposeDistictDataDao,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resposeDistictRealDao.setStatus("throwing exception while getting data from server"+e.getStackTrace());
			return new ResponseEntity<>(resposeDistictDataDao,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	

}
