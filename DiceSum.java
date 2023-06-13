
package reviewcode;

public class DiceSum extends DieRoll {

    private DieRoll r2,r1;
    public DiceSum(DieRoll r1,
		   DieRoll r2) {
	super(0, 0, 0);
	this.r1=r1;
	this.r2=r2;
    }
    public RollResult makeRoll() {
	return r1.makeRoll().andThen(r2.makeRoll());
    }
    public String toString() {
	return r1.toString() + " & "+r2.toString();
    }

}
