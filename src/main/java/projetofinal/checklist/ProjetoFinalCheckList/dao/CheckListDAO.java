package projetofinal.checklist.ProjetoFinalCheckList.dao;

import projetofinal.checklist.ProjetoFinalCheckList.connection.ConnectionFactory;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CheckListDAO {

    public CheckList responderCheckList(CheckList checkList) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO CHECKLIST (saida, retorno, dataC, " +
                    "hora, placa, motorista, km, tracao, calibragemPneu, estepe, freioDianteiro," +
                    "freioTraseiro, balanceamento, limpezaRadiador, oleoMotor, filtroOleo," +
                    "paraChoqueDianteiro, paraChoqueTraseiro, placasCaminhao, cintoSeguranca, " +
                    "pedais, aberturaPortas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?," +
                    "?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, checkList.getSaida());
            stm.setString(2, checkList.getRetorno());
            stm.setString(3, checkList.getDataC());
            stm.setString(4, checkList.getHora());
            stm.setString(5, checkList.getPlaca());
            stm.setString(6, checkList.getMotorista());
            stm.setString(7, checkList.getKm());
            stm.setString(8, checkList.getTracao());
            stm.setString(9, checkList.getCalibragemPneu());
            stm.setString(10, checkList.getEstepe());
            stm.setString(11, checkList.getFreioDianteiro());
            stm.setString(12, checkList.getFreioTraseiro());
            stm.setString(13, checkList.getBalanceamento());
            stm.setString(14, checkList.getLimpezaRadiador());
            stm.setString(15, checkList.getOleoMotor());
            stm.setString(16, checkList.getFiltroOleo());
            stm.setString(17, checkList.getParaChoqueDianteiro());
            stm.setString(18, checkList.getParaChoqueTraseiro());
            stm.setString(19, checkList.getPlacasCaminhao());
            stm.setString(20, checkList.getCintoSeguranca());
            stm.setString(21, checkList.getPedais());
            stm.setString(22, checkList.getAberturaPortas());
            stm.execute();

            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                int id = rst.getInt("ID");
                checkList.setId(id);
            }
            return checkList;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CheckList> listaTodosCheckLists() {
        List<CheckList> checkLists = new ArrayList<>();
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("SELECT id, saida, retorno, dataC, hora, placa, " +
                    "motorista, km, tracao, calibragemPneu, estepe, freioDianteiro, freioTraseiro, " +
                    "balanceamento, limpezaRadiador, oleoMotor, filtroOleo, paraChoqueDianteiro, " +
                    "paraChoqueTraseiro, placasCaminhao, cintoSeguranca, pedais, aberturaPortas FROM CHECKLIST");
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                int id = rst.getInt("id");
                String saida = rst.getString("saida");
                String retorno = rst.getString("retorno");
                String dataC = rst.getString("dataC");
                String hora = rst.getString("hora");
                String placa = rst.getString("placa");
                String motorista = rst.getString("motorista");
                String km = rst.getString("km");
                String tracao = rst.getString("tracao");
                String calibragemPneu = rst.getString("calibragemPneu");
                String estepe = rst.getString("estepe");
                String freioDianteiro = rst.getString("freioDianteiro");
                String freioTraseiro = rst.getString("freioTraseiro");
                String balanceamento = rst.getString("balanceamento");
                String limpezaRadiador = rst.getString("limpezaRadiador");
                String oleoMotor = rst.getString("oleoMotor");
                String filtroOleo = rst.getString("filtroOleo");
                String paraChoqueDianteiro = rst.getString("paraChoqueDianteiro");
                String paraChoqueTraseiro = rst.getString("paraChoqueTraseiro");
                String placasCaminhao = rst.getString("placasCaminhao");
                String cintoSeguranca = rst.getString("cintoSeguranca");
                String pedais = rst.getString("pedais");
                String aberturaPortas = rst.getString("aberturaPortas");

                CheckList checkList = new CheckList(id, saida, retorno, dataC, hora, placa, motorista, km,
                        tracao, calibragemPneu, estepe, freioDianteiro, freioTraseiro, balanceamento,
                        limpezaRadiador, oleoMotor, filtroOleo, paraChoqueDianteiro, paraChoqueTraseiro,
                        placasCaminhao, cintoSeguranca, pedais, aberturaPortas);
                checkLists.add(checkList);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return checkLists;
    }

    public CheckList getCheckListId(int id) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("SELECT id, saida, retorno, dataC, hora, placa, " +
                    "motorista, km, tracao, calibragemPneu, estepe, freioDianteiro, freioTraseiro, " +
                    "balanceamento, limpezaRadiador, oleoMotor, filtroOleo, paraChoqueDianteiro, " +
                    "paraChoqueTraseiro, placasCaminhao, cintoSeguranca, pedais, aberturaPortas " +
                    "FROM CHECKLIST WHERE id = ?");
            stm.setInt(1, id);
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            CheckList checkList = null;
            while (rst.next()) {
                int idCheckList = rst.getInt("id");
                String saida = rst.getString("saida");
                String retorno = rst.getString("retorno");
                String dataC = rst.getString("dataC");
                String hora = rst.getString("hora");
                String placa = rst.getString("placa");
                String motorista = rst.getString("motorista");
                String km = rst.getString("km");
                String tracao = rst.getString("tracao");
                String calibragemPneu = rst.getString("calibragemPneu");
                String estepe = rst.getString("estepe");
                String freioDianteiro = rst.getString("freioDianteiro");
                String freioTraseiro = rst.getString("freioTraseiro");
                String balanceamento = rst.getString("balanceamento");
                String limpezaRadiador = rst.getString("limpezaRadiador");
                String oleoMotor = rst.getString("oleoMotor");
                String filtroOleo = rst.getString("filtroOleo");
                String paraChoqueDianteiro = rst.getString("paraChoqueDianteiro");
                String paraChoqueTraseiro = rst.getString("paraChoqueTraseiro");
                String placasCaminhao = rst.getString("placasCaminhao");
                String cintoSeguranca = rst.getString("cintoSeguranca");
                String pedais = rst.getString("pedais");
                String aberturaPortas = rst.getString("aberturaPortas");

                checkList = new CheckList(idCheckList, saida, retorno, dataC, hora, placa, motorista, km,
                        tracao, calibragemPneu, estepe, freioDianteiro, freioTraseiro, balanceamento,
                        limpezaRadiador, oleoMotor, filtroOleo, paraChoqueDianteiro, paraChoqueTraseiro,
                        placasCaminhao, cintoSeguranca, pedais, aberturaPortas);
            }
            return checkList;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
