package entities;
import exception.MovimentoInvalidoException;

public class Robo {
	private String color;
	private int [] coord = new int[2];
	
	public Robo(String color) {
		this.setColor(color);
		this.getCoord()[0] = 0;
		this.getCoord()[1] = 0;
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
			if(this.coord[1] >= 0) {
				this.coord[1] += 1;
			}
			else {
				throw new MovimentoInvalidoException("up");
			}
		}
		else if(mov.equals("down")) {
			if(this.coord[1] > 0) {
				this.coord[1] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("down");
			}
		}
		else if(mov.equals("right")) {
			if(this.coord[0] >= 0) {
				this.coord[0] += 1;
			}
			else {
				throw new MovimentoInvalidoException("right");
			}
		}
		else if(mov.equals("left")) {
			if(this.coord[0] > 0) {
				this.coord[0] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("left");
			}
		}
	}
	
	public void Mover(int mov) throws MovimentoInvalidoException{
		if(mov == 1) {
			if(this.coord[1] >= 0) {
				this.coord[1] += 1;
			}
			else {
				throw new MovimentoInvalidoException("up");
			}
		}
		else if(mov == 2) {
			if(this.coord[1] > 0) {
				this.coord[1] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("down");
			}
		}
		else if(mov == 3) {
			if(this.coord[1] >= 0) {
				this.coord[1] += 1;
			}
			else {
				throw new MovimentoInvalidoException("right");
			}
		}
		else if(mov == 4) {
			if(this.coord[1] > 0) {
				this.coord[1] -= 1;
			}
			else {
				throw new MovimentoInvalidoException("left");
			}
		}
	}
	
	
	public boolean isFoodFound(int[] food) {
		if(this.coord[0] == food[0] && this.coord[1] == food[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
