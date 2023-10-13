package br.com.projetojava.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    //getters e setters
    /*
     * quando se quer buscar a info de um atributo, se usa um método GET apontando para o atributo, recuperando a informação;
     * toda vez que se quer atualizar ou inserir/definir valor para tributos privados de uma classe, se utiliza o método SET.
     * 
     * permite acessar atributos privados.
     */
    
}
