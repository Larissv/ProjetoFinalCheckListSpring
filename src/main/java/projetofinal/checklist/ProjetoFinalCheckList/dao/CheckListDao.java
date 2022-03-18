package projetofinal.checklist.ProjetoFinalCheckList.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckListEntity;

@Repository
public interface CheckListDao extends JpaRepository<CheckListEntity, Integer> {

//    @Query(value = "select * from checklist(id, saidaRetorno, dataC, hora, placa, motorista, km, tracao, calibragemPneu, estepe, " +
//            "freioDianteiro, freioTraseiro, balanceamento, limpezaRadiador, oleoMotor, filtroOleo, paraChoqueDianteiro, " +
//            "paraChoqueTraseiro, placasCaminhao, cintoSeguranca, pedais, aberturaPortas);", nativeQuery = true)
//    List<CheckList> getAllChecklists(@NonNull final List<CheckList>);
//


//    static CheckList cadastrarCheckList(CheckList checkList) {
//        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
//            PreparedStatement stm =
//                    connection.prepareStatement("INSERT INTO CHECKLIST (saidaRetorno, data_hora_sistema, dataC, " +
//                                                        "hora, placa, motorista, km, tracao, calibragemPneu, estepe, " +
//                                                        "freioDianteiro, freioTraseiro, balanceamento, limpezaRadiador, " +
//                                                        "oleoMotor, filtroOleo, paraChoqueDianteiro, paraChoqueTraseiro," +
//                                                        "placasCaminhao, cintoSeguranca, pedais, aberturaPortas)" +
//                                                        " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?," +
//                                                        "?, ?, ?, ?, ?, ?) RETURNING ID");
//            stm.setString(1, checkList.getSaidaRetorno());
//            stm.setObject(2, LocalDateTime.now());
//            stm.setString(3, checkList.getDataC());
//            stm.setString(4, checkList.getHora());
//            stm.setString(5, checkList.getPlaca());
//            stm.setString(6, checkList.getMotorista());
//            stm.setInt(7, checkList.getKm());
//            stm.setString(8, checkList.getTracao());
//            stm.setString(9, checkList.getCalibragemPneu());
//            stm.setString(10, checkList.getEstepe());
//            stm.setString(11, checkList.getFreioDianteiro());
//            stm.setString(12, checkList.getFreioTraseiro());
//            stm.setString(13, checkList.getBalanceamento());
//            stm.setString(14, checkList.getLimpezaRadiador());
//            stm.setString(15, checkList.getOleoMotor());
//            stm.setString(16, checkList.getFiltroOleo());
//            stm.setString(17, checkList.getParaChoqueDianteiro());
//            stm.setString(18, checkList.getParaChoqueTraseiro());
//            stm.setString(19, checkList.getPlacasCaminhao());
//            stm.setString(20, checkList.getCintoSeguranca());
//            stm.setString(21, checkList.getPedais());
//            stm.setString(22, checkList.getAberturaPortas());
//            stm.execute();
//
//            ResultSet rst = stm.getResultSet();
//            while (rst.next()) {
//                int id = rst.getInt("ID");
//                checkList.setId(id);
//            }
//            return checkList;
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new IllegalStateException("Erro ao inserir o checklist");
//        }
//    }
//
//    public List<CheckList> listaTodosCheckLists() {
//        List<CheckList> checkLists = new ArrayList<>();
//        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
//            PreparedStatement stm = connection.prepareStatement("SELECT id, saidaRetorno, dataC, hora, placa, " +
//                                                                        "motorista, km, tracao, calibragemPneu, " +
//                                                                        "estepe, freioDianteiro, freioTraseiro, " +
//                                                                        "balanceamento, limpezaRadiador, oleoMotor, " +
//                                                                        "filtroOleo, paraChoqueDianteiro, " +
//                                                                        "paraChoqueTraseiro, placasCaminhao, " +
//                                                                        "cintoSeguranca, pedais, aberturaPortas FROM " +
//                                                                        "CHECKLIST");
//            stm.executeQuery();
//            ResultSet rst = stm.getResultSet();
//            while (rst.next()) {
//                CheckList checkList = createCheckListFromResultSet(rst);
//                checkLists.add(checkList);
//            }
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return checkLists;
//    }
//
//    public CheckList getCheckListId(final int id) {
//        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
//            PreparedStatement stm = connection.prepareStatement("SELECT id, saidaRetorno, dataC, hora, placa, " +
//                                                                        "motorista, km, tracao, calibragemPneu, " +
//                                                                        "estepe, freioDianteiro, freioTraseiro, " +
//                                                                        "balanceamento, limpezaRadiador, oleoMotor, " +
//                                                                        "filtroOleo, paraChoqueDianteiro, " +
//                                                                        "paraChoqueTraseiro, placasCaminhao, " +
//                                                                        "cintoSeguranca, pedais, aberturaPortas " +
//                                                                        "FROM CHECKLIST WHERE id = ?");
//            stm.setInt(1, id);
//            stm.executeQuery();
//            ResultSet rst = stm.getResultSet();
//           if (rst.next()) {
//               return createCheckListFromResultSet(rst);
//            } else {
//               throw new IllegalStateException("Checklist não encontrado");
//           }
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new IllegalStateException("Erro ao buscar checklist");
//        }
//    }
//
//    public void removeCheckList(int id) {
//        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
//            PreparedStatement stm = connection.prepareStatement("DELETE FROM CHECKLIST WHERE " +
//                                                                        "ID = ?");
//            stm.setInt(1, id);
//            stm.execute();
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    static CheckList createCheckListFromResultSet(final ResultSet rst) throws SQLException {
//        int id = rst.getInt("id");
//        String saidaRetorno = rst.getString("saidaRetorno");
//        String dataC = rst.getString("dataC");
//        String hora = rst.getString("hora");
//        String placa = rst.getString("placa");
//        String motorista = rst.getString("motorista");
//        Integer km = rst.getInt("km");
//        String tracao = rst.getString("tracao");
//        String calibragemPneu = rst.getString("calibragemPneu");
//        String estepe = rst.getString("estepe");
//        String freioDianteiro = rst.getString("freioDianteiro");
//        String freioTraseiro = rst.getString("freioTraseiro");
//        String balanceamento = rst.getString("balanceamento");
//        String limpezaRadiador = rst.getString("limpezaRadiador");
//        String oleoMotor = rst.getString("oleoMotor");
//        String filtroOleo = rst.getString("filtroOleo");
//        String paraChoqueDianteiro = rst.getString("paraChoqueDianteiro");
//        String paraChoqueTraseiro = rst.getString("paraChoqueTraseiro");
//        String placasCaminhao = rst.getString("placasCaminhao");
//        String cintoSeguranca = rst.getString("cintoSeguranca");
//        String pedais = rst.getString("pedais");
//        String aberturaPortas = rst.getString("aberturaPortas");
//
//        return new CheckList(id, saidaRetorno, dataC, hora, placa, motorista, km,
//                             tracao, calibragemPneu, estepe, freioDianteiro, freioTraseiro, balanceamento,
//                             limpezaRadiador, oleoMotor, filtroOleo, paraChoqueDianteiro, paraChoqueTraseiro,
//                             placasCaminhao, cintoSeguranca, pedais, aberturaPortas);
//    }
}
