package es.nico.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

    @Override
    public String getInformeFinanciero() {
        return "Presentación de informe financiero de trimestre 1";
    }
}
