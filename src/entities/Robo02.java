package entities;

public class Robo02 extends Robo{
    public Robo02(String color){
        super(color);
    }

    public int Mover2(int mov){
		if(mov == 1) {
			if(coord[1] >= 0 && coord[1] < 10) {
				coord[1] += 1;
                return 1;
			}
		}
		else if(mov == 2) {
			if(coord[1] > 0) {
				coord[1] -= 1;
                return 1;
			}
		}
		else if(mov == 3) {
			if(coord[0] >= 0) {
				coord[0] += 1;
                return 1;
			}
		}
		else{
			if(coord[0] > 0) {
				coord[0] -= 1;
                return 1;
			}
		}
        return 0;
	}
}
