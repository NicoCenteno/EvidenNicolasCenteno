package es.nico.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

    public static void main(String[] args) {


        //leer el xml de configuracion

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //pedir un bean al contenedor

        Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);

        //usar el bean

        System.out.println(Antonio.getInforme());
        System.out.println(Antonio.getTareas());

        //cerrar el contexto

        contexto.close();


    }

}
