package net.codejava.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // mapeia a classe para o cliente da tabela
@Table(name="customer")//a classe tem o mesmo nome da tabela

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // indica que esse campo é a chave primária e seu valor é gerado automaticamente. 

    private Long id;
    private String name;
    private String email;
    private String address;

    protected Customer() {
    }

    protected Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    //id
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    //name
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    //email
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    //endereco
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
}
