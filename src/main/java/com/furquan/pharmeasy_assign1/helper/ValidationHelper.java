/**
 * 
 */
package com.furquan.pharmeasy_assign1.helper;

import java.text.MessageFormat;

import javax.xml.soap.MessageFactory;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author furquan.ahmed
 *
 */
@Service
public class ValidationHelper {

    public static String getErrors(BindingResult results) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (Object object : results.getAllErrors()) {
            if (object instanceof FieldError) {
                FieldError fieldError = (FieldError) object;
                sb.append(MessageFormat.format("{0}. {2} {1}\n", counter++, fieldError.getDefaultMessage(), fieldError.getField()));
            }
        }
        return sb.toString();
    }
}
