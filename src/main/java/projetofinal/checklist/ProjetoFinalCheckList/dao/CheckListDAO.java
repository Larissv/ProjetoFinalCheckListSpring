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

    public CheckList cadastrarCheckList(CheckList checkList) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO CHECKLIST (saidaRetorno, dataC, " +
                    "hora, placa, motorista, km, tracao, calibragemPneu, estepe, freioDianteiro," +
                    "freioTraseiro, balanceamento, limpezaRadiador, oleoMotor, filtroOleo," +
                    "paraChoqueDianteiro, paraChoqueTraseiro, placasCaminhao, cintoSeguranca, " +
                    "pedais, aberturaPortas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?," +
                    "?, ?, ?, ?, ?, ?) RETURNING ID");
            stm.setString(1, checkList.getSaidaRetorno());
            stm.setString(2, checkList.getDataC());
            stm.setString(3, checkList.getHora());
            stm.setString(4, checkList.getPlaca());
            stm.setString(5, checkList.getMotorista());
            stm.setString(6, checkList.getKm());
            stm.setString(7, checkList.getTracao());
            stm.setString(8, checkList.getCalibragemPneu());
            stm.setString(9, checkList.getEstepe());
            stm.setString(10, checkList.getFreioDianteiro());
            stm.setString(11, checkList.getFreioTraseiro());
            stm.setString(12, checkList.getBalanceamento());
            stm.setString(13, checkList.getLimpezaRadiador());
            stm.setString(14, checkList.getOleoMotor());
            stm.setString(15, checkList.getFiltroOleo());
            stm.setString(16, checkList.getParaChoqueDianteiro());
            stm.setString(17, checkList.getParaChoqueTraseiro());
            stm.setString(18, checkList.getPlacasCaminhao());
            stm.setString(19, checkList.getCintoSeguranca());
            stm.setString(20, checkList.getPedais());
            stm.setString(21, checkList.getAberturaPortas());
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
            PreparedStatement stm = connection.prepareStatement("SELECT id, saidaRetorno, dataC, hora, placa, " +
                    "motorista, km, tracao, calibragemPneu, estepe, freioDianteiro, freioTraseiro, " +
                    "balanceamento, limpezaRadiador, oleoMotor, filtroOleo, paraChoqueDianteiro, " +
                    "paraChoqueTraseiro, placasCaminhao, cintoSeguranca, pedais, aberturaPortas FROM CHECKLIST");
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                int id = rst.getInt("id");
                String saidaRetorno = rst.getString("saidaRetorno");
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

                CheckList checkList = new CheckList(id, saidaRetorno, dataC, hora, placa, motorista, km,
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
            PreparedStatement stm = connection.prepareStatement("SELECT id, saidaRetorno, dataC, hora, placa, " +
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
                String saidaRetorno = rst.getString("saidaRetorno");
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

                checkList = new CheckList(idCheckList, saidaRetorno, dataC, hora, placa, motorista, km,
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

    public void removeCheckList(int id) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("DELETE FROM CHECKLIST WHERE " +
                    "ID = ?");
            stm.setInt(1, id);
            stm.execute();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
