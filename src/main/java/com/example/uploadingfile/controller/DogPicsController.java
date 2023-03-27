package com.example.uploadingfile.controller;

import com.example.uploadingfile.service.abstracts.DogPicsService;
import com.example.uploadingfile.util.CreateDogPicRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class DogPicsController {

    @Autowired
    private DogPicsService dogPicsService;
    @PostMapping("/photos/add")
    public void addPhoto(@RequestParam("image") MultipartFile file) {
        CreateDogPicRequest createDogPicRequest = new CreateDogPicRequest();
        Long user_id = 10023L;
        try{

            File output_file = new File("./images/sequence.png" );
            InputStream inputStream = file.getInputStream();
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            ImageIO.write(bufferedImage,"png",output_file);


        }catch (Exception e) {
            System.out.println(e);
        }

    }

    @GetMapping("/hello/{name}")
    public ModelAndView showHelloWorldPage(@PathVariable String name) {
        ModelAndView modelAndView = new ModelAndView("hello-name");

        modelAndView.addObject("name",name);

        return modelAndView;
    }
}
