package es.nico.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

    public static void main(String[] args) {
        //leer el xml de configuracion

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //pedir un bean al contenedor

        Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);

        Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);

        // apuntan al mismo objeto en memoria?
        if (Antonio==Lucia) {

            System.out.println("Apuntan al mismo lugar en memoria");
            System.out.println(Antonio + "\n" + Lucia);
        } else {

            System.out.println("No apuntan al mismo lugar en memoria");
            System.out.println(Antonio + "\n" + Lucia);
        }

        // cerrar el contexto

        contexto.close();

    }

}
