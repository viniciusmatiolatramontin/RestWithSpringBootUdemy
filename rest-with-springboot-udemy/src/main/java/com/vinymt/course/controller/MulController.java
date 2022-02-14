package com.vinymt.course.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinymt.course.converters.MathConverter;
import com.vinymt.course.exception.ExceptionThrowing;

@RestController
public class MulController {
	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		ExceptionThrowing.throwExceptionIfNotNumericTwoParam(numberOne, numberTwo);
		
		Double multiplication = MathConverter.convertToDouble(numberOne) * MathConverter.convertToDouble(numberTwo);
		return multiplication;
	}
}
