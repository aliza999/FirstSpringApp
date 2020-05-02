package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springg {
    @RequestMapping("/spring")
public String getString()
{
    return "Spring";
}
}
