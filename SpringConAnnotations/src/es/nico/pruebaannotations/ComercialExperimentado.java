package es.nico.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

    // ejecucion de codigo despues de creacion del bean

    @PostConstruct
    public void ejecutaDespuesCreacion() {

        System.out.println("Ejecutado tras creación de Bean");

    }

    // ejecucion de codigo despues de apagado contenedor Spring

    @PreDestroy
    public void ejecutaAntesDestruccion(){

        System.out.println("Ejecutando antes de la destrucción");

    }


    /*@Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

   /* @Autowired
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    } */

    @Override
    public String getTareas() {
        return "Vender, vender y vender más!";
    }

    @Override
    public String getInforme() {
        //return "Informe generado por el comercial";
        return nuevoInforme.getInformeFinanciero();
    }

    @Autowired
    @Qualifier("informeFinancieroTrim2") //bean id que debe utilizar
    private CreacionInformeFinanciero nuevoInforme;

}
