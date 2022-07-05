package com.example.computadores;

import com.example.computadores.domain.Computador;
import com.example.computadores.repository.ComputadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ComputadoresApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputadoresApplication.class, args);
    }

}
