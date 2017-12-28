import java.util.*;

public class DotCom{
	
	private ArrayList<String> locationCells;
	private String nome;
	
	public void setNome(String n){
		nome = n;
	}
	public String getNome(){
		return nome;
	}
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
	public String checkYourself(String userInput){
		String result = "correto";
		int index = locationCells.indexOf(userInput);
		if (index >=0 ){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result = "eliminar";
				System.out.println("Ora voce afundou "+nome+" :( ");
			}else{
				result = "errado";
			}//encerra o if
		}
		return result;
	}//encerra o medoto
}//encerra a classe