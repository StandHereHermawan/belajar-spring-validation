package ariefbelajarteknologi.belajarspringvalidation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import ariefbelajarteknologi.belajarspringvalidation.helper.StringHelper;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return stringHelper.isPalindrome(value);
    }
}
