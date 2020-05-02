package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springg {
    @RequestMapping("/spring")
    @ResponseBody
public String getString()
{
    return "m spring coded";
}
}
