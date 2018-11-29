package explore.restful.ws.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import explore.restful.ws.model.response.ExploreResponse;
import explore.restful.ws.model.response.ResponseCode;
import explore.restful.ws.model.response.ResponseStatus;

@ControllerAdvice
public class ExploreExceptionHandler {
	
	@ExceptionHandler(value=ExploreServiceException.class)
	public ResponseEntity<Object> handleMoveOutServiceException(ExploreServiceException ex, WebRequest request){
		
		ExploreResponse moResponse = new ExploreResponse(
										ResponseStatus.ERROR.getStatus(), 
										ResponseCode.CODE_1001.getCode(), 
										ex.getData());
		
		return new ResponseEntity<>(moResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
