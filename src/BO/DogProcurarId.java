package BO;

import java.util.Scanner;

import DAO.DadosCaoDAO;
import DAO.MaeDAO;
import DAO.PaiDAO;
import DTO.DadosCao;
import DTO.Mae;
import DTO.Pai;

public class DogProcurarId {

	public void FuncaoProcurar() {
		Scanner entrada = new Scanner(System.in);
		
		DadosCao dl = new DadosCao();
		DadosCaoDAO d = new DadosCaoDAO();
		
		Pai p = new Pai();
		PaiDAO Pdao = new PaiDAO();
		
		Mae m = new Mae();
		MaeDAO Mdao = new MaeDAO();
		
		int x ;	

		
		System.out.println("+-----------------------------------+");
		System.out.println("|   PROCURAR POR ID DO CACHORRO     |");
		System.out.println("+-----------------------------------+");
		
		System.out.print("Qual o numero MicroChip: ");
		x = entrada.nextInt();
		dl.setnMicroChip(x);
		p.setPk_pai(x);
		d.procurarPorCodigo(dl);
		Pdao.procurarPorCodigo(p);
		m.setPk_mae(x);
		Mdao.procurarPorCodigo(m);		
		
	}
}
