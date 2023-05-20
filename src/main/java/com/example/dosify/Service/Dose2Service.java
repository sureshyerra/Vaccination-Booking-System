package com.example.dosify.Service;

import com.example.dosify.Enum.VaccineType;
import com.example.dosify.Model.Dose2;
import com.example.dosify.Model.User;

public interface Dose2Service {
    public Dose2 createDose2(User user, VaccineType vaccineType);
}
