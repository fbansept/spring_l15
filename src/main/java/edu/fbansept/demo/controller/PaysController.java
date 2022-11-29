package edu.fbansept.demo.controller;

import edu.fbansept.demo.dao.PaysDao;
import edu.fbansept.demo.model.Pays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PaysController {

    @Autowired
    private PaysDao paysDao;

    @GetMapping("/pays/{id}")
    public Pays getPays(@PathVariable int id) {

        //Optional<Pays> optional = paysDao.findById(id);

//        if(optional.isPresent()) {
//            return optional.get();
//        } else {
//            return null;
//        }

       // return optional.orElse(null);

        return paysDao.findById(id).orElse(null);

    }

    @GetMapping("/liste-pays")
    public List<Pays> getPays() {

        return paysDao.findAll();

    }

    @PostMapping("/pays")
    public String ajoutPays(@RequestBody Pays pays) {
        paysDao.save(pays);
        return "OK";
    }

    @DeleteMapping("/pays/{id}")
    public boolean supprimePays(@PathVariable int id) {
        paysDao.deleteById(id);
        return true;
    }
}
