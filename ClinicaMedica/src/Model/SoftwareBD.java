package Model;

public class SoftwareBD 
{
    String hora[] = {"07h","08h","09h","10h","11h","12h","13h","14h","15h","16h","17h","18h","19h","20h","21h"};
    String minuto[] = {"00", "05","10","15","20","25","30","35","40","45","50","55"};
    String data[] = new String[5];
    String dia[] = new String[31];
    String mes[] = {"01","02","03","04","05","06","07","08","09","10","11","12"};
    String ano[] = {"2022","2023","2024"};
    String info[] = new String[6];
    String especialidade[] = {"Clinico-geral","Pneumologista", "Ginecologista", "Oftalmologista", "Pediatra", "Cardiologista", "Nutricionista", "Psicóloga", "Dermatologista", "Psiquiatra"};
    String medico[][] = {{"Yago Viana", "Clinico-geral"},{"Luiz Miguel Souza", "Pneumologista"},{"Laís Pires", "Ginecologista"},{"Marcelo Pinto", "Oftalmologista"},{"Bianca Monteiro", "Pediatra"},{"Kaique Farias", "Cardiologista"},{"Ana Carolina Ramos", "Nutricionista"},{"Maria Cecília Cunha", "Psicóloga"},{"Joaquim da Cruz", "Dermatologista"},{"Eloah Lima", "Psiquiatra"},{"Rodrigo Monteiro", "Clinico-geral"},{"Nicolas Gonçalves", "Clinico-geral"},{"Maysa Rocha", "Ginecologista"},{"Isadora Moraes", "Pediatra"},{"Thales Lopes", "Pediatra"}};
    
    public String[] getInfo()
    {
        return info;
    }

    public void setInfo(String info[])
    {
        this.info = info;
    }

    public String[] getEspecialidade()
    {
        return especialidade;
    }

    public String[][] getMedico()
    {
        return medico;
    }

    public String[] getDia()
    {
        return dia;
    }

    public String[] getMes()
    {
        return mes;
    }

    public String[] getAno()
    {
        return ano;
    }

    public String[] getHora()
    {
        return hora;
    }

    public String[] getMinuto()
    {
        return minuto;
    }

    public String[] getData()
    {
        return data;
    }

    public void setData(String data[])
    {
        this.data = data;
    }
}