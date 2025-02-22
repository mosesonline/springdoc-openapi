package test.org.springdoc.api.app165;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bnasslahsen
 */
@RestController
@RequestMapping("/api")
public class HelloController {

	@Operation(description = "I want here some custom config")
	@GetMapping("/sample1/{springdoc}")
	public ResponseEntity sample1(@PathVariable(name = "#{T(org.springdoc.core.Constants).SPRINGDOC_PREFIX}") String id) {
		throw new UnsupportedOperationException("the body is not relevant now");
	}

	@Operation(description = "I want here another some custom config")
	@GetMapping("/sample2")
	public ResponseEntity sample2(@RequestParam(defaultValue = "#{{}}") List<String> value) {
		throw new UnsupportedOperationException("the body is not relevant now");
	}

	@Operation(description = "I want here another some custom config")
	@GetMapping("/sample3")
	public ResponseEntity sample3(@RequestParam(defaultValue = "#{T(org.springdoc.core.Constants).DEFAULT_SWAGGER_UI_PATH}") String id) {
		throw new UnsupportedOperationException("the body is not relevant now");
	}
}
