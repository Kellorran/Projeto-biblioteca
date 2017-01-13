/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gambiarras;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Admin;
import model.bean.Pessoa;

/**
 *
 * @author Kellorran
 */
public class Gamb {

    public static void createTable() {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conextion.prepareStatement("CREATE TABLE Admin_tb(\n"
                    + "    cod_admin int auto_increment,\n"
                    + "    rg_admin varchar(15),\n"
                    + "    senha_adm varchar (25),\n"
                    + "    PRIMARY KEY(cod_admin),\n"
                    + "    CONSTRAINT fk_admin_pessoa FOREIGN KEY (rg_admin) REFERENCES Pessoa_tb (rg)\n"
                    + ");");
            stmt.executeUpdate();

            stmt = conextion.prepareStatement("CREATE TABLE Usuario_tb(\n"
                    + "    matricula int AUTO_INCREMENT,\n"
                    + "    quant_livros_locados int,\n"
                    + "    rg_usuario varchar(15),\n"
                    + "    cod_admin INT,\n"
                    + "    PRIMARY KEY(matricula),\n"
                    + "    CONSTRAINT fk_usuario_pessoa FOREIGN KEY (rg_usuario) REFERENCES Pessoa_tb (rg),\n"
                    + "    CONSTRAINT fk_usuario_admin FOREIGN KEY (cod_admin) REFERENCES Admin_tb (cod_admin)\n"
                    + ");");
            stmt.executeUpdate();

            stmt = conextion.prepareStatement("CREATE TABLE Pessoa_tb(\n"
                    + "    nome varchar(30),\n"
                    + "    rg varchar(15),\n"
                    + "    endereco varchar(40),\n"
                    + "    senha varchar(30),\n"
                    + "    email varchar(30),\n"
                    + "    PRIMARY KEY(rg)\n"
                    + ");");
            stmt.executeUpdate();

            stmt = conextion.prepareStatement("CREATE TABLE Professor_tb(\n"
                    + "    disciplina varchar(20),\n"
                    + "    matricula_prof int,\n"
                    + "    rg_prof varchar(15),\n"
                    + "    PRIMARY KEY(matricula_prof),\n"
                    + "    CONSTRAINT fk_professor_usuario FOREIGN KEY (matricula_prof) REFERENCES usuario_tb (matricula),\n"
                    + "    CONSTRAINT fk_professor_pessoa FOREIGN KEY (rg_prof) REFERENCES Usuario_tb (rg_usuario)\n"
                    + ");");
            stmt.executeUpdate();

            stmt = conextion.prepareStatement("CREATE TABLE Livro_tb(\n"
                    + "    titulo varchar(30),\n"
                    + "    autor varchar(30),\n"
                    + "    materia_relacionada varchar(15),\n"
                    + "    genero varchar(20),\n"
                    + "    estado_do_livro varchar(20),\n"
                    + "    codigo int AUTO_INCREMENT,\n"
                    + "    isbn varchar(15),\n"
                    + "    statuss int,\n"
                    + "    matricula int,\n"
                    + "    quant_livros int,\n"
                    + "    PRIMARY KEY(codigo),\n"
                    + "    CONSTRAINT fk_livro_usuario FOREIGN KEY (matricula) REFERENCES Usuario_tb (matricula)\n"
                    + "\n"
                    + ");");
            stmt.executeUpdate();

            stmt = conextion.prepareStatement("CREATE TABLE Livrinhu_tb(\n"
                    + "    nome_professor varchar(30),\n"
                    + "    disciplina_professor varchar(30),\n"
                    + "    codigo int auto_increment,\n"
                    + "    matricula_aluno int,\n"
                    + "    matricula_prof_livrinhu int,\n"
                    + "    PRIMARY KEY (codigo),\n"
                    + "    CONSTRAINT fk_livrinhu_livros FOREIGN KEY (codigo) REFERENCES Livro_tb (codigo),\n"
                    + "    CONSTRAINT fk_livrinhu_aluno FOREIGN KEY (matricula_aluno) REFERENCES Aluno_tb (matricula_aluno),    \n"
                    + "    CONSTRAINT fk_livrinhu_prof FOREIGN KEY (matricula_prof_livrinhu) REFERENCES Professor_tb (matricula_prof) \n"
                    + ");");
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
    }

    public static void dropTables() {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conextion.prepareStatement("DROP TABLE Pessoa_tb;");
            stmt.executeUpdate();
            stmt = conextion.prepareStatement("DROP TABLE Admin_tb;;");
            stmt.executeUpdate();
            stmt = conextion.prepareStatement("DROP TABLE Usuario_tb;;");
            stmt.executeUpdate();
            stmt = conextion.prepareStatement("DROP TABLE Aluno_tb;;");
            stmt.executeUpdate();
            stmt = conextion.prepareStatement("DROP TABLE Professor_tb;;");
            stmt.executeUpdate();
            stmt = conextion.prepareStatement("DROP TABLE Livro_tb;;");
            stmt.executeUpdate();
            stmt = conextion.prepareStatement("DROP TABLE Livrinhu_tb;;");
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        
    }

    public static void reseta(){
        dropTables();


    }

}
