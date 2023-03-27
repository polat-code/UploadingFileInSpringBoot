package com.example.uploadingfile.service.abstracts;

import com.example.uploadingfile.util.CreateDogPicRequest;
import org.springframework.stereotype.Service;

@Service
public interface DogPicsService {

    public void saveDogPics(CreateDogPicRequest createDogPicRequest);
}
