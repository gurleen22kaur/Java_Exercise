package com.ttn.MVC;

import org.springframework.ui.Model;
import org.springframework.web.*;
import com.sun.tracing.dtrace.ProviderAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

//Question1

public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}

//Question2
/*@RequestMapping("/multi")
public class StudentController extends MultiActionController {

    @RequestMapping("/model")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView=new ModelAndView("index");

        return modelAndView;
    }

    @RequestMapping("/dummy")
    public void dummy_show(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("Hello");
    }*/


/*

//Question 4 and 5
@Controller
public class StudentController{

    @RequestMapping("/annotation")
    @ResponseBody
    public String annotationDemo()
    {
        return "Demonstrating Annotation";
    }

    @RequestMapping("/test")
        public ModelAndView test(){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("index");
            modelAndView.addObject("msg","Gurleen");
            modelAndView.addObject("msg1","Kaur");
            return modelAndView;
        }
}
*/

//Question 3
/*
@Controller
public class StudentController
{
    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}*/

//Question 6

/*
@Controller
@RequestMapping("/name")
public class StudentController{
    String firstName;
    String lastName;

    @RequestMapping("/names/{firstName}/{lastName}")
    @ResponseBody
    public ModelAndView returnName(@PathVariable("firstName") String firstName, @PathVariable ("lastName") String lastName)
    {
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("first",firstName+" "+lastName );
        return modelAndView;
    }

}
*/


//Question7
/*
@Controller
@RequestMapping("/path")
public class StudentController{
    @RequestMapping("/name/{firstName}/{lastName}")
    @ResponseBody
    String returnCountryAndState(@PathVariable Map<String, String> requestMap) {
        return requestMap.get("firstName") + " " + requestMap.get("lastName");
    }

}*/


//Question 8
/*@Controller
public class StudentController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("form");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam String firstName,
                      @RequestParam String lastName) {
        return firstName + " " +lastName;

    }
}*/

//Question9
/*@Controller
public class StudentController {
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(StudentCo studentCo) {
        return studentCo.getFirstName() + " " + studentCo.getLastName();
    }
}*/



//Question 10
/*
@Controller
@RequestMapping("/dummy")
public class StudentController {
    @ModelAttribute
    void addingObject1(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }

    @RequestMapping("/form")
    ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView("form");
        return modelAndView;
    }

    @RequestMapping("/index")
    ModelAndView test1(){
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }
}
*/
