package br.com.cielo.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.cielo.dto.ErrorResponse;
import br.com.cielo.dto.LaunchResponse;
import br.com.cielo.dto.Status;
import br.com.cielo.legado.dto.FilterLegado;
import br.com.cielo.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * @author Marcos Alves
 *
 */
@Controller
@RequestMapping(value = "/account")
@Api(value = "/account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AccountResource {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountResource.class);
	
	@Autowired
	private AccountService service;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/launch", method = RequestMethod.GET)
	@ApiOperation(value = "Extrato de lancamento em conta", response = LaunchResponse.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = LaunchResponse.class),
			@ApiResponse(code = 404, message = "NotFound", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "Error", response = ErrorResponse.class) })
	public ResponseEntity<?> find(@RequestParam(name="status", required=false) Status status, 
			@RequestParam(name="description", required=false) String description,
			@RequestParam(name="id", required=false) String id) throws Exception {
		
		LOGGER.debug("get - INICIO");
		
		FilterLegado params = new FilterLegado(id, status != null ? status.name() : null, description);
		LaunchResponse response = service.find(params);
		
		LOGGER.debug("get - FIM");

		return ResponseEntity.ok(response);
	}
}
