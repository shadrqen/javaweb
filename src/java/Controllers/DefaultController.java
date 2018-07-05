
package Controllers;

 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response){
        String name = "Shadrack";
//        model.addAttribute("hello", name);
        return "index";
    }
}
