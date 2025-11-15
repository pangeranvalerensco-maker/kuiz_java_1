package com.kuiz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.kuiz.demo.model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MahasiswaController {

    @GetMapping("/mahasiswa")
    public String tampilkanDataMahasiswa(Model model) {
 
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        listMahasiswa.add(new Mahasiswa("Budi", 20));
        listMahasiswa.add(new Mahasiswa("Ani", 22));
        listMahasiswa.add(new Mahasiswa("Candra", 21));

        model.addAttribute("dataMahasiswa", listMahasiswa);

        return "mahasiswa";
    }
}