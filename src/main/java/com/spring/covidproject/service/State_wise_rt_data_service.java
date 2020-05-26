package com.spring.covidproject.service;

import java.util.List;

import com.spring.covidproject.Dao.DistictDailyDao;
import com.spring.covidproject.Dao.DistictWiseRealDataDao;
import com.spring.covidproject.Dao.HistoricalDataIndia;
import com.spring.covidproject.Dao.StateWiseDailyDAO;
import com.spring.covidproject.Dao.State_Wise_Realtime_Data;

public interface State_wise_rt_data_service {

	State_Wise_Realtime_Data getIndiaData(String name);

	List<HistoricalDataIndia> getHistoricalData();

	List<State_Wise_Realtime_Data> getStateWiseData();

	List<StateWiseDailyDAO> getStateDailyCases();

	List<StateWiseDailyDAO> getSingleStateDailyCases(String state);

	List<DistictWiseRealDataDao> getDistictRealData();

	List<DistictWiseRealDataDao> getSingleDistictRealCases(String state);

	List<DistictDailyDao> getDistictDailyData();

	List<DistictDailyDao> sinleGetDistictDailyCases(Integer state);

}
