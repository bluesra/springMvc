package com.jss.ishare.controller;

import com.jss.ishare.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by apple on 6/9/15.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                                  @RequestParam(value = "count", defaultValue = "20") int count) {

        List<Spittle> spittles = new ArrayList<Spittle>();
        for(long i = 1; i < 20; i++) {
            spittles.add(new Spittle(i,"spittle " + i, new Date(), i*1.2, i*4.5));
        }

        return spittles;

    }

//    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
//    public String spittle(@PathVariable("spittleId") long spittle, Model model) {
//        model.addAttribute( new Spittle(spittle, "spittle " + spittle, new Date(), spittle * 1.2, spittle * 4.5));
//        return "spittle";
//    }

    @RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
    public String spittle(
            @PathVariable("spittleId") long spittleId,
            Map model) {
        model.put("spittle1", new Spittle(spittleId, "spittle " + spittleId, new Date(), spittleId * 1.2, spittleId * 4.5));
        return "spittle";

    }

    @RequestMapping(method=RequestMethod.POST)
    public String saveSpittle(SpittleForm form, Model model) throws Exception {
        System.out.println(form.getMessage());
        return "redirect:/spittles";
    }

}
