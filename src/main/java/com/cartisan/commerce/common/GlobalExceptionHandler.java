package com.cartisan.commerce.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final String DEFAULT_ERROR_VIEW = "globalerror";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
        ModelAndView view = new ModelAndView();
        view.addObject("exception", e);
        view.addObject("url", request.getRequestURL());

        view.setViewName(DEFAULT_ERROR_VIEW);

        return view;
    }

    @ExceptionHandler(value = ApiException.class)
    @ResponseBody
    public ErrorInfo<String> apiErrorHandler(HttpServletRequest request, ApiException e) {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("Some Data");
        r.setUrl(request.getRequestURL().toString());

        return r;
    }
}
