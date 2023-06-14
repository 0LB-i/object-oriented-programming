/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo2;

import java.util.ArrayList;

/**
 *
 * @author Paulo
 */
public class Hospital {

    ArrayList<Funcionario> funcionarios;

    public Hospital() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public void cadstrar() {
        int op = Entrada.leiaInt("Cadastrar\n1-Administrativo\n2-Médico");
        switch (op) {
            case 1:
                //Cadastrar Aqui um funcionário Administrativo
                //Usar os SETs parar isto
                String cpf = "";
                Administrativo adm = new Administrativo();
                adm.setID(Entrada.leiaInt("Administrativo\nID:"));
                adm.setNome(Entrada.leiaString("Administrativo\nNome:"));
                adm.setEndereco(Entrada.leiaString("Administrativo\nEndereço:"));
                do {
                    cpf = Entrada.leiaString("Administrativo\nCPF:");
                    if (!CPF.isCPF(cpf)) {
                        Entrada.escrever("CPF Inválio. Reigite");
                    }
                } while (!CPF.isCPF(cpf));
                adm.setCpf(new CPF(cpf));
                adm.setSetor(Entrada.leiaString("Administrativo\nSetor:"));
                adm.setSalario(Entrada.leiaDouble("Administrativo\nSalário:"));
                funcionarios.add(adm);
                Entrada.escrever("Registro Gravado");
                break;
            case 2:
                //Cadastrar Aqui um Médico
                //Usar os SETs parar isto. grave os daddos no objeto "medico" e ao concluir gravem no arrraylist               
                Medico medico = new Medico();
                //preencha os dados do médico.
                medico.setID(Entrada.leiaInt("Médico\nID:"));
                medico.setNome(Entrada.leiaString("Médico\nNome:"));
                medico.setEndereco(Entrada.leiaString("Médico\nEndereço:"));
                do {
                    cpf = Entrada.leiaString("Médico\nCPF:");
                    if (!CPF.isCPF(cpf)) {
                        Entrada.escrever("CPF Inválio. Reigite");
                    }
                } while (!CPF.isCPF(cpf));
                medico.setCpf(new CPF(cpf));
                String especialidade = Entrada.leiaString("Médico\n" + Especialidade.exibirLista());
                int horas = Entrada.leiaInt("Médico\nHoras:");
                medico.setEspecialidade(new Especialidade(especialidade, horas));
                medico.setSalario(Entrada.leiaDouble("Médico\nSalário:"));
                funcionarios.add(medico);
                Entrada.escrever("Registro Gravado");
                break;
        }
    }

    public void imprimirLista() {
        int op = Entrada.leiaInt("Listagee\n1-Por ID\n2-Completa");
        switch (op) {
            case 1:
                int id = Entrada.leiaInt("ID a ser pesquisado");
                boolean achou = false;
                for (Funcionario fun : funcionarios) {
                    if (fun instanceof Administrativo) {
                        if (fun.getID() == id) {
                            achou = true;
                            Administrativo adm = (Administrativo) fun;
                            System.out.println("LISTAGEM PARCIAL");
                            System.out.println("ID..........: " + adm.getID());
                            System.out.println("Nome........: " + adm.getNome());
                            System.out.println("Endereço....: " + adm.getEndereco());
                            System.out.println("CPF.........: " + adm.getCpf().imprimeCPF(adm.getCpf().getCpf()));
                            System.out.println("Salário.....: " + adm.getSalario());
                            System.out.println("Setor.......: " + adm.getSetor());
                            System.out.println("-----------------------------------");
                        }
                    }
                    if (fun instanceof Medico) {
                        if (fun.getID() == id) {
                            Medico medico = (Medico) fun;
                            achou = true;
                            System.out.println("LISTAGEM PARCIAL");
                            System.out.println("ID.........................: " + medico.getID());
                            System.out.println("Nome.......................: " + medico.getNome());
                            System.out.println("Endereço...................: " + medico.getEndereco());
                            System.out.println("CPF........................: " + medico.getCpf().imprimeCPF(medico.getCpf().getCpf()));
                            System.out.println("Salário....................: " + medico.getSalario());
                            System.out.println("Especialidade..............: " + medico.getEspecialidade().getEspecialidades());
                            System.out.println("Horas (na especialidadde)..: " + medico.getEspecialidade().getHoras());
                            System.out.println("-----------------------------------");
                        }
                    }
                }
                if(!achou){
                    Entrada.escrever("ID não localizado");
                }
                break;
            case 2:
                System.out.println("LISTAGEM COMPLETA");
                /*
                Percorra o arraylist e verifique se está em uma posição com um médico ou um administrativo.
                Se for um médico, imprimia seu dados. Se for um administrativo, os seus dados particulares.
                */
                for (Funcionario fun : funcionarios) {
                    if (fun instanceof Administrativo) {
                        Administrativo adm = (Administrativo) fun;
                        //É um funcionário Administratvivo
                        System.out.println("ID..........: " + adm.getID());
                        System.out.println("Nome........: " + adm.getNome());
                        System.out.println("Endereço....: " + adm.getEndereco());
                        System.out.println("CPF.........: " + adm.getCpf().imprimeCPF(adm.getCpf().getCpf()));
                        System.out.println("Salário.....: " + adm.getSalario());
                        System.out.println("Setor.......: " + adm.getSetor());
                        System.out.println("-----------------------------------");
                    }
                    if (fun instanceof Medico) {
                        Medico medico = (Medico) fun;
                        //É um médico
                        System.out.println("ID.........................: " + medico.getID());
                        System.out.println("Nome.......................: " + medico.getNome());
                        System.out.println("Endereço...................: " + medico.getEndereco());
                        System.out.println("CPF........................: " + medico.getCpf().imprimeCPF(medico.getCpf().getCpf()));
                        System.out.println("Salário....................: " + medico.getSalario());
                        System.out.println("Especialidade..............: " + medico.getEspecialidade().getEspecialidades());
                        System.out.println("Horas (na especialidadde)..: " + medico.getEspecialidade().getHoras());
                        System.out.println("-----------------------------------");
                    }
                }
                break;
        }
    }

    public void excluir() {
        int idUser = Entrada.leiaInt("ID a ser removida");
        int idLocal = 0;
        //Percorrer o arraylist.
        //Localize o id no Arraylist e se localizar, salve o id na variável idLocal
        for (Funcionario fun : funcionarios) {
            if (fun.getID() == idUser) {
                idLocal = idUser;
                break;
            }
        }
        if (idLocal != 0) {
            funcionarios.remove(idLocal);
            Entrada.escrever("Registro Excluído.");
        }else{
            Entrada.escrever("Registro não localizado.");
        }
    }

    public void atualizarRegistro() {
        int idUser = Entrada.leiaInt("ID a ser Atualizada");
        int pos = 0;
        for (int x = 0; x < funcionarios.size(); x++) {
            if (funcionarios.get(x).getID() == idUser) {
                pos = x;
                break;
            }
        }
        if (funcionarios.get(idUser) instanceof Administrativo) {
            Administrativo tmp = (Administrativo) funcionarios.get(idUser);
            //Atualiza os dados do administrativo. Grave as informações em tmp (siga os passos da inclusão)
            funcionarios.set(pos, tmp);//Vai atualizar o registro

        }
        if (funcionarios.get(idUser) instanceof Medico) {
            Medico tmp = (Medico) funcionarios.get(idUser);
            //Atualiza os dados do médico. Grave as informações em  tmp (siga os passos da inclusão)
            funcionarios.set(pos, tmp);//Vai atualizar o registro
        }
    }
}
