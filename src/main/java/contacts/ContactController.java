package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by Maciej Cebula on 15.04.2017.
 */
@Controller
@RequestMapping("/home")
public class ContactController {
    private ContactRepository contactRepo;

    @Autowired
    public ContactController(ContactRepository contactRepo){
        this.contactRepo=contactRepo;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String home(Map<String,Object> model){
        List<Contact> contacts=contactRepo.findAll();
        model.put("Contacts",contacts);
        return "home";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String submit(Contact contact){
        contactRepo.save(contact);
        return "redirect:/home";
    }

}
