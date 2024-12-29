package pl.edu.vistula.firstrestapispring.product.domain;

//klasa reprezentująca podmiot
//działań głównego pakietu (product )

public class Product {

    private long id;
    private String name;

    public Product(String name){ this.name=name; }

    public Long getId(){return id;}

    public String getName(){return name;}

    public void setId(long id){ this.id=id; }

    public void setName(String name){ this.name=name; }
}
