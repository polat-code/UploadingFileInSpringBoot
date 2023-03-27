package com.example.uploadingfile.service.concretes;


import com.example.uploadingfile.model.DogPics;
import com.example.uploadingfile.repository.DogPicsRepository;
import com.example.uploadingfile.service.abstracts.DogPicsService;
import com.example.uploadingfile.util.CreateDogPicRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogPicsServiceImp  implements DogPicsService {

    @Autowired
    private DogPicsRepository dogPicsRepository;
    @Override
    public void saveDogPics(CreateDogPicRequest createDogPicRequest) {
        DogPics dogPics = new DogPics();
        try{
            dogPics.setTitle(createDogPicRequest.getTitle());
            dogPics.setImage(createDogPicRequest.getImage());
            System.out.println(dogPics.getTitle());
            System.out.println(dogPics.getImage());
            dogPicsRepository.save(dogPics);
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
