package View;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Marcador 
{

    public String[] infoConsulta(String[] info, String medico[][], String[] especialidade)
    {
        ArrayList<String> medicodisp = new ArrayList<String>();
        String opsexo[] = {"Masculino", "Feminino"};
        int sexo;
        info[0] = JOptionPane.showInputDialog(null, "Nome do paciente: ", "Marcação de consulta", JOptionPane.QUESTION_MESSAGE);
        info[1] = JOptionPane.showInputDialog(null, "Nome do convênio médico: ", "Marcação de consulta", JOptionPane.QUESTION_MESSAGE);
        sexo = JOptionPane.showOptionDialog(null, "Gênero do paciente: ", "Marcação de consulta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opsexo, opsexo[0]);
        if(sexo == JOptionPane.YES_OPTION)
        {
            info[2] = "Masculino";
        }
        else if(sexo == JOptionPane.NO_OPTION)
        {
            info[2] = "Feminino";
        }
        info[3] = JOptionPane.showInputDialog(null, "Idade: " , "Marcação de consulta", JOptionPane.QUESTION_MESSAGE);
        info[4] = (String) JOptionPane.showInputDialog(null,"Especialidade","Marcação de consulta",JOptionPane.QUESTION_MESSAGE, null,especialidade,especialidade[0]);
        for(int b = 0; b<medico.length;b++)
        {
            if(info[4].equalsIgnoreCase(medico[b][1]))
            {
                medicodisp.add(medico[b][0]);
            }
        }
        Object[] exibmed = medicodisp.toArray();
        info[5] = (String) JOptionPane.showInputDialog(null,"Profissionais disponíveis","Marcação de consulta",JOptionPane.QUESTION_MESSAGE, null,exibmed,exibmed[0]);
        return info;
    }
        
    public String[] dataConsulta(String data[], String dia[], String mes[], String[] ano, String hora[], String minuto[])
    {
        data[0] = (String) JOptionPane.showInputDialog(null,"Ano da consulta","Marcação de consulta",JOptionPane.QUESTION_MESSAGE, null, ano, ano[0]);
        data[1] = (String) JOptionPane.showInputDialog(null,"Mês da consulta","Marcação de consulta",JOptionPane.QUESTION_MESSAGE, null, mes, mes[0]);
        int espaco = 0;
        if(data[1].equals("04") || data[1].equals("06") || data[1].equals("09") || data[1].equals("11"))
        {
            for(int cont = 1;cont<=30;cont++)
            {
                if(cont<=9)
                {
                    dia[espaco] = "0" + Integer.toString(cont);
                }
                else
                {
                    dia[espaco] = Integer.toString(cont);
                }
                    espaco++;
            }
        }
        else if(data[1].equals("02"))
        {
            for(int cont = 1;cont<=28;cont++)
            {
                if(cont<=9)
                {
                    dia[espaco] = "0" + Integer.toString(cont);
                }
                else
                {
                    dia[espaco] = Integer.toString(cont);
                }
                    espaco++;
            }     
        }
        else
        {
            for(int cont = 1;cont<=31;cont++)
            {
                if(cont<=9)
                {
                    dia[espaco] = "0" + Integer.toString(cont);
                }
                else
                {
                    dia[espaco] = Integer.toString(cont);
                }
                    System.out.println(dia[espaco]);
                    espaco++;
            }
        }
        data[2] = (String) JOptionPane.showInputDialog(null,"Dia da consulta","Marcação de consulta",JOptionPane.QUESTION_MESSAGE, null, dia, dia[0]);
        data[3] = (String) JOptionPane.showInputDialog(null, "Horas da consulta", "Marcação de consulta", JOptionPane.QUESTION_MESSAGE,null, hora, hora[0]);
        data[4] = (String) JOptionPane.showInputDialog(null, "Minutos da consulta", "Marcação de consulta", JOptionPane.QUESTION_MESSAGE, null, minuto, minuto[0]);
        return data;
    }

    public void consultaMarcada(String data[], String info[])
    {
        JOptionPane.showMessageDialog(null, "Consulta marcada!\nPaciente: " + info[0] + "\nConvênio médico: " + info[1] + "\nEspecialidade: " + info[4] + "\nProfissional: " + info[5] + "\nData: " + data[2] + "/" + data[1] + "/" + data[0] + "\nHorário: " + data[3] + data[4], "Marcação de consulta", JOptionPane.INFORMATION_MESSAGE);
    }
}