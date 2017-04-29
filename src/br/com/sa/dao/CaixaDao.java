package br.com.sa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.gam.dataBase.dao.DataBase;
import br.com.gam.empresa.entity.Empresa;
import br.com.sa.entity.Caixa;

public class CaixaDao {
	private static CaixaDao caixaDao;
	
	private CaixaDao(){}
	
	public static CaixaDao getInstance(){
		if (caixaDao == null){
			caixaDao = new CaixaDao();
		}
		return caixaDao;
	}
	
	public Caixa buscarCaixas(Connection conn, Empresa empresa)
			throws Exception{
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT ");
		sql.append("    cd_caixa_plastica cdCaixaPlastica, ");
		sql.append("    id_caixa idCaixa ");
		sql.append("FROM ");
		sql.append("    prddm.dc_wms_caixa_plastica ");
		sql.append("WHERE ");
		sql.append("    cd_tipo_caixa_plastica = 2 ");
		sql.append("AND cd_empresa = ? ");
		sql.append("AND id_situacao = 'A' ");
		
		try{
			ps = conn.prepareStatement(sql.toString());
			ps.setInt(1, );
		}catch(Exception e){
			throw new Exception(e);
		}finally{
			DataBase.freeResource(ps, rs);
		}
		
	}

}
