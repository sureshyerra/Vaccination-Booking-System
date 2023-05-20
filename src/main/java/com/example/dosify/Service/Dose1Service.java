package com.example.dosify.Service;

import com.example.dosify.Enum.VaccineType;
import com.example.dosify.Model.Dose1;
import com.example.dosify.Model.User;

public interface Dose1Service {

    public Dose1 createDose1(User user, VaccineType vaccineType);
}
