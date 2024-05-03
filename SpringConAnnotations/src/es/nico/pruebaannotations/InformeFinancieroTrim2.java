package es.nico.pruebaannotations;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentación de informe catastrofico del trimestre 2";
    }
}
