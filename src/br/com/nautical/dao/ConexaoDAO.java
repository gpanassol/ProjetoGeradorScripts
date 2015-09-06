// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 06/09/2015 13:11:00
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ConexaoDAO.java

package br.com.nautical.dao;

import br.com.nautical.conexao.Conexao;
import br.com.nautical.entidade.Update;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConexaoDAO
{

    public ConexaoDAO(String url, String usuario, String senha)
    {
        conexao = new Conexao(url, usuario, senha);
        try
        {
            stmt = (Statement)conexao.getConn().createStatement();
        }
        catch(SQLException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public List listaUpdates()
    {
        List lista = new ArrayList();
        if(listaUpdate == null)
        {
            lista = listarUpdates();
            listaUpdate = lista;
        } else
        {
            return listaUpdate;
        }
        return lista;
    }

    public List listaVersoes()
    {
        List versoes = new ArrayList();
        if(listaVersoes == null)
        {
            versoes = listarVersoes();
            listaVersoes = versoes;
        } else
        {
            return listaVersoes;
        }
        return versoes;
    }

    private List listarUpdates()
    {
        List updates;
        logger.info("listarUpdates()*******************************");
        updates = new ArrayList();
        try
        {
            Update update;
            for(ResultSet rs = stmt.executeQuery("SELECT * FROM update_bd ORDER BY versao_bd"); rs.next(); updates.add(update))
            {
                update = new Update();
                update.setVersao_bd(rs.getString("versao_bd"));
                update.setSistema(rs.getString("sistema"));
                update.setCod_cliente_uc(rs.getString("cod_cliente_uc"));
                update.setScript_bd(rs.getString("script_bd"));
                update.setDt_liberacao(rs.getString("dt_liberacao"));
                update.setResponsavel(rs.getString("responsavel"));
                update.setScript_bd_unome(rs.getString("script_bd_unome"));
            }

        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        logger.info("Fechando conexao...");
        conexao.fecharConexao();
        logger.info("pronto");
       
        return updates;
    }

    private List listarVersoes()
    {
        logger.info("listarVersoes()*******************************");
        List versoes = new ArrayList();
        try
        {
            for(ResultSet rs = stmt.executeQuery("SELECT versao_bd FROM update_bd ORDER BY versao_bd"); rs.next(); versoes.add(rs.getString("versao_bd")));
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return versoes;
    }

    final Logger logger = LoggerFactory.getLogger("br/com/nautical/dao/ConexaoDAO");
    private Conexao conexao;
    private Statement stmt;
    private static List listaUpdate;
    private static List listaVersoes;
}
