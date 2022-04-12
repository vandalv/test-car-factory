package com.project.equipment.controller;
import com.project.equipment.entity.Equipment;
import com.project.equipment.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/equipment")
public class equipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/")
    public Object saveEquipment()
    {
        Random ran = new Random();
        long idGenerator = ran.nextInt(999999) + 100000;
        List<String> equpmentNameList = new ArrayList<>();
        equpmentNameList.add("Door Handle Decor");
        equpmentNameList.add("Mirror Cover");
        equpmentNameList.add("Fluid Extractor");
        equpmentNameList.add("Remote Control");
        equpmentNameList.add("Universal Fasteners");
        int index = (int)(Math.random() * equpmentNameList.size());
        Equipment equipment = new Equipment(idGenerator, (String) equpmentNameList.get(index));
//        List<Equipment> equipmentList = new ArrayList<>();
//        for(int i = 0; i < 4; i++){
//            index = (int)(Math.random() * equpmentNameList.size());
//            equipmentList.add(new Equipment(idGenerator, (String) equpmentNameList.get(index)));
//        }
        return equipment;
    }



}
