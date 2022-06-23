//package br.com.kafka.ApplicationExceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@ControllerAdvice
//public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
//
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity handlerException(Exception e) {
//		log.info("Long mostra ->");
//
//		DefaultError erro = new DefaultError(HttpStatus.BAD_GATEWAY.value(), "Erro ao processar sua requisição");
//
//		return new ResponseEntity(erro, HttpStatus.BAD_GATEWAY);
//	}
//}
