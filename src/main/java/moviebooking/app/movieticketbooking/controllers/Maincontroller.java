package moviebooking.app.movieticketbooking.controllers;

import moviebooking.app.movieticketbooking.entity.Dummy;
import moviebooking.app.movieticketbooking.repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class Response {

  public String message;
  public int code;

  public Response(String message, int code) {
    this.message = message;
    this.code = code;
  }
}

@RestController
public class Maincontroller {

  // @GetMapping("/")
  // public String helloWorld(){
  //     return "Hello World!";
  // }

  @Autowired
  private DummyRepository dummyRepository;

  // @GetMapping("/login")
  // public Response login(
  //     @RequestParam String username,
  //     @RequestParam String password
  // )
  // {
  //    String USERNAME = "Admin";
  //    String PASSWORD = "admin";

  //    if(username.equals(USERNAME) && password.equals(PASSWORD)){
  //         Response response = new Response("Login Successfully", 200);
  //         return response;
  //    }else{
  //         Response response = new Response("Failed Login", 400);
  //         return response;
  //    }

  // }

  @GetMapping("/")
  public String hello() {
    return "hello";
  }

  @GetMapping("/add")
  public Response add(@ModelAttribute Dummy user) {
    dummyRepository.save(user);
    return new Response("Succesfully Added", 200);
    // public Response add(){
    // Dummy user = new Dummy();
    // user.setId(3);
    // user.setAge(20);
    // user.setUser("Sowmya");

  }

  @GetMapping("/get")
  public Dummy get(@RequestParam int id) {
    Dummy user = dummyRepository.findById(id);
    return user;
  }
}
