package com.example.springintroduction;
import com.example.springintroduction.services.DateCalc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
  /*@GetMapping("/first-mapping")
  public String firstMapping(){
    return "<b>Hello World<b>";
  }

  @GetMapping("/second-mapping")
  public String secondMapping(){
    return "This is the second mapping";
  }

  @GetMapping("/")
  public String index(){
    return "Welcome to my Spring Application";
  }

  @GetMapping("/parameter")
  public String parameter(@RequestParam String input){
    //For this to work:
    //localhost:8080/parameter?input=HelloWorld
    return input + " " + "end of string";
  }

   */


  @GetMapping("/greeting")
  public String greeting(){
    return "Greetings, have a nice day";
  }

  @GetMapping("/parameter")
  public String echo(@RequestParam String input){
    String yourString = "<p>Dette er din string^^</p>";
    return "<h>" + input + "</h>" + " " + yourString;

  }

  @GetMapping("/erdetfredag")
  public String erDetFredag(){
    DateCalc dateCalc = new DateCalc();

    int date = dateCalc.erDetFredag();
    String dagenIdag = "";
    if(date == 1){
      dagenIdag = "Det er mandag";
    }else if(date == 2){
      dagenIdag = "Det er tirsdag";
    }else if(date == 3){
      dagenIdag = "Det er onsdag";
    }else if(date == 4){
      dagenIdag = "Det er torsdag";
    }else if(date == 5){
      dagenIdag = "DET ER FREDAG MINE GUTTER";
    }
    return dagenIdag;
  }

}
