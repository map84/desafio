package br.com.cielo.mapper.test;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import br.com.cielo.dto.LaunchResponse;
import br.com.cielo.dto.Summary;
import br.com.cielo.legado.dto.FilterLegado;
import br.com.cielo.resource.AccountResource;
import br.com.cielo.service.AccountService;

/**
 * @author Marcos Alves
 *
 */
@WebAppConfiguration
@ContextConfiguration("classpath:application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(value = AccountResource.class, secure = false)
public class AccountResourceTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private AccountService service;
 
    @Test
    public void testGetSuccess() throws Exception {
    	
    	FilterLegado filter = getFilter();
    	LaunchResponse response = getLaunchResponse();
    	
    	when(service.find(filter)).thenReturn(response);
    	
    	mockMvc.perform(get("/account/launch"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
        .andExpect(jsonPath("$.summary.pageSize", is(response.getSummary().getPageSize().intValue())))
        .andExpect(jsonPath("$.summary.totalElements", is(response.getSummary().getTotalElements().intValue())))
        .andExpect(jsonPath("$.summary.firstRegister", is(response.getSummary().getFirstRegister().intValue())))
        .andExpect(jsonPath("$.summary.totalAmount", is(response.getSummary().getTotalAmount().doubleValue())));
    	
    	verify(service, times(1)).find(filter);
		verifyZeroInteractions(service);
    }
    
    @Test
    public void testGetNotFound() throws Exception {
    	
    	FilterLegado filter = getFilter();
    	
    	when(service.find(filter)).thenReturn(getLaunchResponse());
    	
    	mockMvc.perform(get("/account/launch/12"))
        .andExpect(status().isNotFound());
    	
		verifyZeroInteractions(service);
    }
    
    public static FilterLegado getFilter() {
    	
    	FilterLegado filter = new FilterLegado(null, null, null);
    	return filter;
    }
    
    public static LaunchResponse getLaunchResponse() {
    	
    	LaunchResponse response = new  LaunchResponse();
    	response.setSummary(new Summary());
    	response.getSummary().setFirstRegister(0);
    	response.getSummary().setPageSize(25);
    	response.getSummary().setTotalElements(39);
    	response.getSummary().setTotalAmount(new BigDecimal("473320.37"));
    	
    	return response;
    }
}
