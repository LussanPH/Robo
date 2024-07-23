package entities;
import exception.MovimentoInvalidoException;

public class Robo {
	protected String color;/**mudei para protected por causa da herança */
	protected int [] coord = new int[2];
	/**O this só é necessário quando tem variáveis com o mesmo nome, só no python que é preciso dele toda vez q chamar a variavel */
	public Robo(String color) {
		setColor(color);
		getCoord()[0] = 0;
		getCoord()[1] = 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int [] getCoord() {
		return coord;
	}

	public void setCoord(int [] coord) {
		this.coord = coord;
	}
	
	public void Mover(String mov) throws MovimentoInvalidoException{
		if(mov.equals("up")) {
			if(coord[1] >= 0) {
				coord[1] += 1;
			}
			else {
				throw new MovimentoInvalidoException("up");
			}
		}
		else if(mov.equals("down")) {
			if(coord[1] > 0) {
				coord[1] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("down");
			}
		}
		else if(mov.equals("right")) {
			if(coord[0] >= 0) {
				coord[0] += 1;
			}
			else {
				throw new MovimentoInvalidoException("right");
			}
		}
		else if(mov.equals("left")) {
			if(coord[0] > 0) {
				coord[0] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("left");
			}
		}
        else{/**Para quando o usuario não utilizar nenhuma das opções */
            throw new MovimentoInvalidoException();
        }
	}
	
	public void Mover(int mov) throws MovimentoInvalidoException{
		if(mov == 1) {
			if(coord[1] >= 0) {
				coord[1] += 1;
			}
			else {
				throw new MovimentoInvalidoException("up");
			}
		}
		else if(mov == 2) {
			if(coord[1] > 0) {
				coord[1] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("down");
			}
		}
		else if(mov == 3) {
			if(coord[0] >= 0) {
				coord[0] += 1;
			}
			else {
				throw new MovimentoInvalidoException("right");
			}
		}
		else if(mov == 4) {
			if(coord[0] > 0) {
				coord[0] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("left");
			}
		}
        else{/**Para quando o usuario não utilizar nenhuma das opções */
            throw new MovimentoInvalidoException();
        }
	}
	
	
	public boolean isFoodFound(int[] food) {
		if(coord[0] == food[0] && coord[1] == food[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
