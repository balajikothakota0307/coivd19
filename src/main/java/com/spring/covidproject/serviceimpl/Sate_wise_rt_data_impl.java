package com.spring.covidproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.covidproject.Dao.DistictDailyDao;
import com.spring.covidproject.Dao.DistictWiseRealDataDao;
import com.spring.covidproject.Dao.HistoricalDataIndia;
import com.spring.covidproject.Dao.StateWiseDailyDAO;
import com.spring.covidproject.Dao.State_Wise_Realtime_Data;
import com.spring.covidproject.entity.DistictDailyEntity;
import com.spring.covidproject.entity.DistictWiseRealDataEntity;
import com.spring.covidproject.entity.HistoricalDataIndiaDao;
import com.spring.covidproject.entity.StateWiseDailyCases;
import com.spring.covidproject.entity.State_wise_rt_data;
import com.spring.covidproject.repository.DistictDailyRepository;
import com.spring.covidproject.repository.DistictRealRepository;
import com.spring.covidproject.repository.HistoricalDataIndiaRepository;
import com.spring.covidproject.repository.StateWiseDailyRepository;
import com.spring.covidproject.repository.State_wise_data_repository;
import com.spring.covidproject.service.State_wise_rt_data_service;

@Service
public class Sate_wise_rt_data_impl implements State_wise_rt_data_service {

	@Autowired
	State_wise_data_repository state_wise_data_repository;

	@Autowired
	State_Wise_Realtime_Data state_Wise_Realtime_Data;

	@Autowired
	HistoricalDataIndiaRepository historicalDataIndiaRepository;

	@Autowired
	HistoricalDataIndia historicalDataIndia;

	@Autowired
	StateWiseDailyRepository stateWiseDailyRepository;

	@Autowired
	StateWiseDailyDAO stateWiseDailyDAO;

	@Autowired
	DistictRealRepository distictRealRepository;
	@Autowired
	DistictWiseRealDataDao distictWiseRealDataDao;

	@Autowired
	DistictDailyRepository distictDailyRepository;

	@Autowired
	DistictDailyDao distictDailyDao;

	List<HistoricalDataIndia> listHistory;

	@Override
	public State_Wise_Realtime_Data getIndiaData(String name) {
		// TODO Auto-generated method stub
		State_wise_rt_data state_Wise_rt_Data = state_wise_data_repository.findByCode(name);
		state_Wise_Realtime_Data = new State_Wise_Realtime_Data(state_Wise_rt_Data.getCode(),
				state_Wise_rt_Data.getActive_cases(), state_Wise_rt_Data.getDeaths(),
				state_Wise_rt_Data.getConfirmed_cases(), state_Wise_rt_Data.getNew_deaths(),
				state_Wise_rt_Data.getRecovered_cases(), state_Wise_rt_Data.getNew_confirmed_cases(),
				state_Wise_rt_Data.getNew_recovered_cases(), state_Wise_rt_Data.getLast_updated_time());
		return state_Wise_Realtime_Data;
	}

	@Override
	public List<HistoricalDataIndia> getHistoricalData() {
		// TODO Auto-generated method stub
		List<HistoricalDataIndiaDao> historicalDataIndiaDao = historicalDataIndiaRepository.findAll();
		listHistory = new ArrayList<HistoricalDataIndia>();
		for (HistoricalDataIndiaDao dao : historicalDataIndiaDao) {
			historicalDataIndia = new HistoricalDataIndia(dao.getDate_of_record(), dao.getDeaths(),
					dao.getTotal_deaths(), dao.getConfirmed_cases(), dao.getTotal_confirmed_cases(),
					dao.getRecovered_cases(), dao.getTotal_recoverd_cases());

			listHistory.add(historicalDataIndia);
		}

		return listHistory;
	}

	@Override
	public List<State_Wise_Realtime_Data> getStateWiseData() {
		// TODO Auto-generated method stub
		List<State_wise_rt_data> list_State_Wise_rt_Data = new ArrayList<State_wise_rt_data>();
		list_State_Wise_rt_Data = state_wise_data_repository.findAll();
		List<State_Wise_Realtime_Data> list_State_wise_rt_data = new ArrayList<State_Wise_Realtime_Data>();
		for (State_wise_rt_data data : list_State_Wise_rt_Data) {
			if (!data.getCode().equalsIgnoreCase("IN")) {
				state_Wise_Realtime_Data = new State_Wise_Realtime_Data(data.getCode(), data.getActive_cases(),
						data.getDeaths(), data.getConfirmed_cases(), data.getNew_deaths(), data.getRecovered_cases(),
						data.getNew_confirmed_cases(), data.getNew_recovered_cases(), data.getLast_updated_time());
				list_State_wise_rt_data.add(state_Wise_Realtime_Data);
			}
		}
		return list_State_wise_rt_data;
	}

	@Override
	public List<StateWiseDailyDAO> getStateDailyCases() {
		// TODO Auto-generated method stub
		List<StateWiseDailyCases> listSateWiseDaily = new ArrayList<StateWiseDailyCases>();
		listSateWiseDaily = stateWiseDailyRepository.findAll();
		List<StateWiseDailyDAO> listStateWiseDailyDAO = new ArrayList<StateWiseDailyDAO>();
		for (StateWiseDailyCases cases : listSateWiseDaily) {
			stateWiseDailyDAO = new StateWiseDailyDAO(cases.getState_code(), cases.getActive_cases(), cases.getDeaths(),
					cases.getConfirmed_cases(), cases.getNew_deaths(), cases.getRecovered_cases(),
					cases.getNew_confirmed_cases(), cases.getNew_recovered_cases(), cases.getDate());
			listStateWiseDailyDAO.add(stateWiseDailyDAO);
		}
		return listStateWiseDailyDAO;
	}

	@Override
	public List<StateWiseDailyDAO> getSingleStateDailyCases(String state) {
		// TODO Auto-generated method stub
		List<StateWiseDailyCases> listSateWiseDaily = new ArrayList<StateWiseDailyCases>();
		listSateWiseDaily = stateWiseDailyRepository.findAll();
		List<StateWiseDailyDAO> listStateWiseDailyDAO = new ArrayList<StateWiseDailyDAO>();
		for (StateWiseDailyCases cases : listSateWiseDaily) {
			if (cases.getState_code().equalsIgnoreCase(state)) {
				stateWiseDailyDAO = new StateWiseDailyDAO(cases.getState_code(), cases.getActive_cases(),
						cases.getDeaths(), cases.getConfirmed_cases(), cases.getNew_deaths(),
						cases.getRecovered_cases(), cases.getNew_confirmed_cases(), cases.getNew_recovered_cases(),
						cases.getDate());
				listStateWiseDailyDAO.add(stateWiseDailyDAO);
			}
		}
		return listStateWiseDailyDAO;
	}

	@Override
	public List<DistictWiseRealDataDao> getDistictRealData() {
		// TODO Auto-generated method stub
		List<DistictWiseRealDataDao> listDistictWiseRealDataDao = new ArrayList<DistictWiseRealDataDao>();
		List<DistictWiseRealDataEntity> listDistictWiseRealDataEntity = distictRealRepository.findAll();
		for (DistictWiseRealDataEntity distict : listDistictWiseRealDataEntity) {
			distictWiseRealDataDao = new DistictWiseRealDataDao(distict.getState_code(), distict.getDistrict(),
					distict.getNotes(), distict.getActive_cases(), distict.getConfirmed_cases(),
					distict.getRecoverd_cases(), distict.getNew_confirmed_cases(), distict.getDeaths(),
					distict.getLast_update_time());
			listDistictWiseRealDataDao.add(distictWiseRealDataDao);

		}

		return listDistictWiseRealDataDao;
	}

	@Override
	public List<DistictWiseRealDataDao> getSingleDistictRealCases(String state) {
		// TODO Auto-generated method stub
		List<DistictWiseRealDataDao> listDistictWiseRealDataDao = new ArrayList<DistictWiseRealDataDao>();
		List<DistictWiseRealDataEntity> listDistictWiseRealDataEntity = new ArrayList<DistictWiseRealDataEntity>();
		listDistictWiseRealDataEntity = distictRealRepository.findByCode(state);
		for (DistictWiseRealDataEntity distict : listDistictWiseRealDataEntity) {
			distictWiseRealDataDao = new DistictWiseRealDataDao(distict.getState_code(), distict.getDistrict(),
					distict.getNotes(), distict.getActive_cases(), distict.getConfirmed_cases(),
					distict.getRecoverd_cases(), distict.getNew_confirmed_cases(), distict.getDeaths(),
					distict.getLast_update_time());
			listDistictWiseRealDataDao.add(distictWiseRealDataDao);

		}

		return listDistictWiseRealDataDao;
	}

	@Override
	public List<DistictDailyDao> getDistictDailyData() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		List<DistictDailyDao> listDistictWiseRealDataDao = new ArrayList<DistictDailyDao>();
		List<DistictDailyEntity> listDistictDailyEntity = distictDailyRepository.findAll();
		for (DistictDailyEntity daily : listDistictDailyEntity) {
			distictDailyDao = new DistictDailyDao(daily.getID(), daily.getCode(), daily.getDistrict_name(),
					daily.getNotes(), daily.getActive_cases(), daily.getDeaths(), daily.getConfirmed_cases(),
					daily.getRecovered_cases(), daily.getNew_confirmed_cases(), daily.getDate());
			listDistictWiseRealDataDao.add(distictDailyDao);

		}
		return listDistictWiseRealDataDao;
	}

	@Override
	public List<DistictDailyDao> sinleGetDistictDailyCases(Integer state) {
		// TODO Auto-generated method stub
		List<DistictDailyDao> listDistictWiseRealDataDao = new ArrayList<DistictDailyDao>();
		List<DistictDailyEntity> listDistictDailyEntity = distictDailyRepository.findByCode(state);
		for (DistictDailyEntity daily : listDistictDailyEntity) {
			distictDailyDao = new DistictDailyDao(daily.getID(), daily.getCode(), daily.getDistrict_name(),
					daily.getNotes(), daily.getActive_cases(), daily.getDeaths(), daily.getConfirmed_cases(),
					daily.getRecovered_cases(), daily.getNew_confirmed_cases(), daily.getDate());
			listDistictWiseRealDataDao.add(distictDailyDao);

		}
		return listDistictWiseRealDataDao;
	}

}
