package Controller;

import View.Marcador;
import Model.SoftwareBD;

public class MarcarConsulta 
{
    public static void main(String[] args)
    {
        Marcador marcar = new Marcador();
        SoftwareBD acesso = new SoftwareBD();
        acesso.setInfo(marcar.infoConsulta(acesso.getInfo(), acesso.getMedico(), acesso.getEspecialidade()));
        acesso.setData(marcar.dataConsulta(acesso.getData(), acesso.getDia(), acesso.getMes(), acesso.getAno(), acesso.getHora(), acesso.getMinuto()));
        marcar.consultaMarcada(acesso.getData(), acesso.getInfo());
    }
}