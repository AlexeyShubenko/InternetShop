package com.shop;


import com.shop.config.AppConfig;
import com.shop.config.DbConfig;
import com.shop.mvc.domain.Product;
import com.shop.mvc.domain.sport.Ball;
import com.shop.mvc.domain.sport.Racket;
import com.shop.mvc.domain.sport.SportProduct;
import com.shop.mvc.domain.technical.Computer;
import com.shop.mvc.domain.technical.MobilePhone;
import com.shop.mvc.domain.technical.TechnicalProduct;
import org.hibernate.SessionFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Start {

    static int n,m;
    static int number;
    static int maxNumber = Integer.MIN_VALUE;



    public static void main(String[] args) {

//        Product product1 = new Product("Ukraine","пенал",12,"good toy");
//        Product product2 = new Product("Germany","beer",20,"good beer");
//        Product product3 = new Product("China","spinner",60," not bad spinner");

        Product laptop = new Computer("Austria","Laptop2",45000,"good laptop",
                "MAC","Intel", 22.5, 8,1000,"red",2.4,2700, "NVIDIA GEFORCE GTX",true);
        Product samsung = new MobilePhone("Chine","Nokia",1500,"telephone",
                "Android","AMD", 5.5, 4,64,"silver",5.5,
                4700,2,13);

        Product ball = new Ball("Japan", "Racket 3000",250,"recket for table tennis",
                "Professional",153.5,"leather");
        Product racket = new Racket("America", "Ball",300,"ball for football",
                "Professional",50d,"professional","professional",13d);

        SessionFactory sessionFactory =
                (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager em = sessionFactory.createEntityManager();

        em.getTransaction().begin();

        em.persist(laptop);
        em.persist(samsung);
        em.persist(ball);
        em.persist(racket);

        em.getTransaction().commit();

        em.close();
        sessionFactory.close();

    }




}
