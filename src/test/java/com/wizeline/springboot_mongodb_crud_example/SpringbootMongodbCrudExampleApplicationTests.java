package com.wizeline.springboot_mongodb_crud_example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMongodbCrudExampleApplicationTests {

    private final String HOST = "127.0.0.1";
    private final int PORT = 27107;

    @Test
    void contextLoads() {
    }

//    @Test
//    void testConectionMongoDB() {
//            boolean conecto = false;
//        MongoClient mongo = crearConexion();
// 
//        if (mongo != null) {
//            System.out.println("Lista de bases de datos: ");
//            printDatabases(mongo);
//            conecto = true;
// 
//        } else {
//            System.out.println("Error: Conexión no establecida");
//        }
//        
//
//        assertEquals(true, conecto);
//    }
//    
//      private static MongoClient crearConexion() {
//        MongoClient mongo = null;
//        try {
//            mongo = new MongoClient("192.168.1.4", 27017);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
// 
//        return mongo;
//    }


//private static void printDatabases(MongoClient mongo) {
//        List dbs = mongo.getDatabaseNames();
//        for (Object db : dbs) {
//            System.out.println(" - " + db);
//        }
//    }}
}