package com.toyo.operation.history.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toyo.operation.history.model.KpiOthersModel;
import com.toyo.operation.history.model.ProductionSummary;
import com.toyo.operation.history.model.SynthesisStatusModel;



@RequestMapping(value="/api/v1")
@RestController

public class OperationHistoryController {

	
	public OperationHistoryController()
	{
		super();
	}
		
	
	
	@SuppressWarnings("nls")
    @RequestMapping(value = "/productionHistory", method = RequestMethod.GET)
    public ProductionSummary getProductionHistory(@RequestParam(value="q", defaultValue="daily/weekly/monthly/yearly:date:time") String q)
    {		
		return null;
    }
	
	@SuppressWarnings("nls")
    @RequestMapping(value = "/operationHistoryForToyo", method = RequestMethod.GET)
    public String getOperationHistoryForToyo()
    {
        return "productionStatusId"  + (new Date());
    }
	
	@SuppressWarnings("nls")
    @RequestMapping(value = "/operationHistoryFromToyo", method = RequestMethod.POST)
    public String postOperationHistoryFromToyo()
    {
        return "productionStatusId"  + (new Date());
    }
	
	@SuppressWarnings("nls")
    @RequestMapping(value = "/rawMaterialAndEnergyTrend", method = RequestMethod.GET)
    public KpiOthersModel getRawMaterialAndEnergyTrend()
    {
        return null;
    } 
		
}
